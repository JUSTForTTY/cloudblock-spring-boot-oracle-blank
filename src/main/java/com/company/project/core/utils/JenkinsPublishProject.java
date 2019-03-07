package com.company.project.core.utils;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.CsysMenuPageViewBiz;
import com.company.project.biz.CsysPageBiz;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.model.JenkinsPublish;
import com.company.project.model.JenkinsStatus;
import com.offbytwo.jenkins.JenkinsServer;

@RestController
@RequestMapping("/jenkins")
public class JenkinsPublishProject {
	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private AuthUtils authUtils;


	private static JenkinsServer jenkins;

	// 发布项目接口
	@PostMapping("/publish")
	public Result buildComponent(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody JenkinsPublish jenkinsPublish) {

		// 发布状态初始化

		Map<String, String> param = new HashMap<>();

		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);
		}
		/*---------------------------end 授权验证------------------------*/
		try {

			jenkins = new JenkinsServer(new URI(jenkinsPublish.getJenkinsUrl()), jenkinsPublish.getJenkinsUsername(),
					jenkinsPublish.getJenkinsPassword());
			logger.info("jenkins是否运行：" + jenkins.isRunning());
			// 判断jenkins是否running
			if (jenkins.isRunning()) {
				// 获取jenkins构建脚本
				// String jobXml = jenkins.getJobXml("jobName");
				// 修改构建脚本
				// jenkins.updateJob("jobName",newJobXml);
				// 构建对应的job
				String projectName = jenkinsPublish.getProjectName();
				jenkins.getJob(projectName).build();
				// 获取html格式日志
				jenkins.getJob(projectName).getLastBuild().details().getConsoleOutputHtml();
				// 获取text格式日志
				jenkins.getJob(projectName).getLastBuild().details().getConsoleOutputText();

				for (int i = 0;; i++) {
					try {
						Thread.sleep(1000);
						String status = jenkins.getJob(projectName).getLastBuild().details().getResult().toString();
						param.put("status", status);
						logger.info("发布状态信息：" + status);
						break;
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				// 获取执行结果（是否成功）
				// jenkins.getJob(projectName).getLastBuild().details().getResult();
				// 等待标记
				// param.put("status", "WAIT");
				// 获取发布截止时间
				// long endTime =
				// jenkins.getJob(projectName).getLastBuild().details().getTimestamp();
				// 获取当前时间
				// long currentTime = new Date().getTime();
				// 开启睡眠等待发布完成
				// Thread.sleep(endTime - currentTime);
				// 设置所需发布时间
				// long publishTime = endTime - currentTime;
				// param.put("endTime", endTime + "");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// 失败标记
			param.put("status", "FAILURE");
		}

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);
		}
		return ResultGenerator.genSuccessResult(param);
	}

	// 获取项目发布状态接口
	@PostMapping("/status")
	public Result status(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody JenkinsStatus jenkinsStatus)
			throws Exception {

		Map<String, String> param = new HashMap<>();

		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);
		}
		/*---------------------------end 授权验证------------------------*/

		if (tokenRefreshFlag) {
			param.put("access_token", token);
			param.put("refresh_token", refreshtoken);
		}

		// 开启睡眠等待发布完成
		// Thread.sleep(jenkinsStatus.getWaitTime());
		try {
			// 项目发布状态(获取执行结果:是否成功)
			param.put("status",
					jenkins.getJob(jenkinsStatus.getProjectName()).getLastBuild().details().getResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			param.put("status", "");
		}
		return ResultGenerator.genSuccessResult(param);
	}

}
