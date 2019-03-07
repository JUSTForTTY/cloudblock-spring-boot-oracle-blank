package com.company.project.core.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.CsysPageBiz;
import com.company.project.biz.CySysProjectBiz;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.outer.model.CsysUserView;
import com.company.project.model.CySysProject;
import com.company.project.outer.model.CsysPage;
import com.company.project.service.CommonService;

/**
 * 
 * @author tty
 * @说明 生成云积木脚本文件
 *
 */
@RestController
@RequestMapping("/gitclone")
public class GitCloneCodeUtils {

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private AuthUtils authUtils;

	@Resource
	private CommonService commonService;

	@Resource
	private CySysProjectBiz cySysProjectBiz;
	
	@Resource
	private CsysPageBiz csysPageBiz;

	@Resource
	private AuthLoginBiz authloginBiz;

	@GetMapping("/project/{projectId}/{operation}")
	public Result gitCloneAllProject(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @PathVariable String projectId,
			@PathVariable String operation) throws Exception {

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

		try {
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			// clone和push前端
			gitProject(BuildUrlUtils.cloneFrontProjectBat, BuildUrlUtils.gitFrontProjectName,
					BuildUrlUtils.moduleGitFrontProject, BuildUrlUtils.frontProjectPositon,
					BuildUrlUtils.gitFrontProject, "front", operation, projectId, baseUserView);

			// clone和push后端

			/*
			 * gitCloneAndPushProject(BuildUrlUtils.cloneBackProjectBat,
			 * BuildUrlUtils.gitBackProjectName, BuildUrlUtils.moduleGitBackProject,
			 * BuildUrlUtils.backProjectPositon, BuildUrlUtils.gitBackProject, "back",
			 * operation);
			 */

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult("success", param);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultGenerator.genServerErrorResult(param);
		}
	}

	/*
	 * clonegit项目 参数说明 cloneProjectBat : clone项目bat文件位置 projectName ： git项目名称
	 * moduleGitProjectUrl ：项目模板git地址 gitProjectUrl ： 项目git地址
	 */

	public void gitProject(String cloneProjectBat, String projectName, String moduleGitProjectUrl,
			String projectPosition, String gitProjectUrl, String title, String operation, String projectId,
			CsysUserView CsysUserView) throws Exception {

		// 磁盘目录
		String serverCodePosition = BuildUrlUtils.serverCodePosition;

		// bat文件夹目录
		cloneProjectBat = serverCodePosition + ":\\" + cloneProjectBat;
		File file = new File(cloneProjectBat);
		if (!file.exists())
			// 创建bat目录文件夹
			file.mkdirs();

		// 若为clone操作
		if (operation.equals("clone")) {
			String filePath = serverCodePosition + ":\\\\" + projectPosition + "\\\\" + projectName;
			// 若git项目文件夹不存在，则执行clone操作
			if (!new File(filePath).exists()) {
				System.out.println("克隆clone");
				gitCloneProject(cloneProjectBat, projectName, moduleGitProjectUrl, projectPosition, gitProjectUrl,
						title, operation, projectId, serverCodePosition, CsysUserView);
			} else {
				System.out.println("拉pull");
				// 若git项目文件已经夹存在，则执行pull操作
				gitPullProject(cloneProjectBat, projectName, moduleGitProjectUrl, projectPosition, gitProjectUrl, title,
						operation, projectId, serverCodePosition, CsysUserView);
			}
		} else if (operation.equals("push")) {
			System.out.println("提push");
			// 执行push操作
			gitPushProject(cloneProjectBat, projectName, moduleGitProjectUrl, projectPosition, gitProjectUrl, title,
					operation, projectId, serverCodePosition, CsysUserView);
			//更新页面状态，将待提交的页面更新为已提交
			CsysPage cySysPage=new CsysPage();
			cySysPage.setCsysPageGitstatus("1");
			List<CsysPage> lst= csysPageBiz.getDataSettingsByCondition(cySysPage);
			for(CsysPage csp:lst) {
				csp.setCsysPageGitstatus("2");
				csysPageBiz.updateDataSettings(CsysUserView, csp);
			}

		}
	}

	/**
	 * 模拉拉取
	 *
	 */
	private void gitCloneProject(String cloneProjectBat, String projectName, String moduleGitProjectUrl,
			String projectPosition, String gitProjectUrl, String title, String operation, String projectId,
			String serverCodePosition, CsysUserView CsysUserView) throws Exception {

		/*------------------------------git start操作-------------------------------------*/
		// git项目标签名称
		String newTag = "v." + commonService.getSequenceNumber("project_version");

		String localProject = serverCodePosition + "://" + projectPosition + "/" + projectName;

		// clone项目
		GitClient.Clone(moduleGitProjectUrl, localProject, "", "");

		// 先拉取模板代码进行合并
		GitClient.Pull(localProject, "origin", "", "");

		// 命令把远程（客户）的git地址加为当前项目的远程分支之一。
		GitClient.remoteNewOrigin(localProject, gitProjectUrl, "newOrigin", "lhmes", "tty18020285665");

		// 将本地版本库推送到远程服务器（将本地git项目主分支推送到远程（客户）的主分支，该操作会和远程主分支进行对比后覆盖）
		GitClient.Push(localProject, "newOrigin", "", "lhmes", "tty18020285665");

		// 本地创建标签，标签中会包含当前分支的文件 
		GitClient.AddTag(localProject, newTag);

		// 将本地标签推送到远程（客户）上，远程会创建一个同名的标签，并将标签中的文件推送上去
		GitClient.Push(localProject, "newOrigin", newTag, "lhmes", "tty18020285665");
		/*------------------------------git end操作-------------------------------------*/
		
		
		// 拼接bat文件位置
		cloneProjectBat += "\\" + projectName + ".bat";

		// 生成bat文件
		Writer fw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("" + cloneProjectBat + ""), "UTF-8"));
		// 文件命名
		fw.write("title " + title + " \r\n\r\n");

		// 返回根目录
		fw.write("cd / \r\n\r\n");

		// 进入磁盘目录
		fw.write(serverCodePosition + ": \r\n\r\n");

		// 进入目录
		fw.write("cd " + projectPosition + " \r\n\r\n");

		// 进入项目目录
		fw.write("cd " + projectName + " \r\n\r\n");

		// 安装命令，执行完此命令，下面的命令将不再执行
		fw.write("npm install \r\n\r\n");
 
		// 执行完退出
		fw.write("exit" + " \r\n\r\n");
		fw.flush();
		fw.close();
		// 执行bat命令文件
		// 调用我们在项目目录下准备好的bat文件，如果不是在项目目录下，则把“你的文件名.bat ”改成文件所在路径。
		run("cmd.exe /c start /b " + cloneProjectBat); // 调用run_cmd方法执行操作
		updateProjectVersion(CsysUserView, projectId, newTag);
	}

	/**
	 * 更新模板
	 *
	 */
	private void gitPullProject(String cloneProjectBat, String projectName, String moduleGitProjectUrl,
			String projectPosition, String gitProjectUrl, String title, String operation, String projectId,
			String serverCodePosition, CsysUserView CsysUserView) throws Exception {

		/*------------------------------git start操作-------------------------------------*/
		// git项目标签名称
		String newTag = "v."+ commonService.getSequenceNumber("project_version");

		String localProject = serverCodePosition + "://" + projectPosition + "/" + projectName;

		// 先拉取模板代码进行合并
		GitClient.Pull(localProject, "origin", "", "");

		// 代码暂存
		GitClient.Add(localProject);

		// commit代码
		GitClient.Commit(localProject);

		// 将本地版本库推送到远程服务器（将本地git项目主分支推送到远程（客户）的主分支，该操作会和远程主分支进行对比后覆盖）
		GitClient.Push(localProject, "newOrigin", "", "lhmes", "tty18020285665");

		// 本地创建标签，标签中会包含当前分支的文件
		GitClient.AddTag(localProject, newTag);

		// 将本地标签推送到远程（客户）上，远程会创建一个同名的标签，并将标签中的文件推送上去
		GitClient.Push(localProject, "newOrigin", newTag, "lhmes", "tty18020285665");

		/*------------------------------git end操作-------------------------------------*/
		
		
		// 拼接bat文件位置
		cloneProjectBat += "\\" + projectName + ".bat";

		// 生成bat文件
		Writer fw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("" + cloneProjectBat + ""), "UTF-8"));

		// 文件命名
		fw.write("title " + title + " \r\n\r\n");

		// 返回根目录
		fw.write("cd / \r\n\r\n");

		// 进入磁盘目录
		fw.write(serverCodePosition + ": \r\n\r\n");

		// 进入目录
		fw.write("cd " + projectPosition + " \r\n\r\n");

		// 进入项目目录
		fw.write("cd " + projectName + " \r\n\r\n");
		// 安装命令，执行完此命令，下面的命令将不再执行
		fw.write("npm install \r\n\r\n");

		// 执行完退出
		fw.write("exit" + " \r\n\r\n");
		fw.flush();
		fw.close();
		// 执行bat命令文件
		// 调用我们在项目目录下准备好的bat文件，如果不是在项目目录下，则把“你的文件名.bat ”改成文件所在路径。
		run("cmd.exe /c start /b " + cloneProjectBat); // 调用run_cmd方法执行操作
	}

	private void gitPushProject(String cloneProjectBat, String projectName, String moduleGitProjectUrl,
			String projectPosition, String gitProjectUrl, String title, String operation, String projectId,
			String serverCodePosition, CsysUserView CsysUserView) throws Exception {

		/*------------------------------git start操作-------------------------------------*/
		// git项目标签名称
		String newTag = "v." + commonService.getSequenceNumber("project_version");

		String localProject = serverCodePosition + "://" + projectPosition + "/" + projectName;

		// 先拉取模板代码进行合并
		GitClient.Pull(localProject, "newOrigin", "lhmes", "tty18020285665");

		// 代码暂存
		GitClient.Add(localProject);

		// commit代码
		GitClient.Commit(localProject);

		// 将本地版本库推送到远程服务器（将本地git项目主分支推送到远程（客户）的主分支，该操作会和远程主分支进行对比后覆盖）
		GitClient.Push(localProject, "newOrigin", "", "lhmes", "tty18020285665");

		// 本地创建标签，标签中会包含当前分支的文件
		GitClient.AddTag(localProject, newTag);

		// 将本地标签推送到远程（客户）上，远程会创建一个同名的标签，并将标签中的文件推送上去
		GitClient.Push(localProject, "newOrigin", newTag, "lhmes", "tty18020285665");
		/*------------------------------git end操作-------------------------------------*/
		 
	 
		updateProjectVersion(CsysUserView, projectId, newTag);
	}

	/*
	 * 更新新项目版本号
	 */
	private void updateProjectVersion(CsysUserView CsysUserView, String projectId, String newTag) {
		// TODO Auto-generated method stub
		CySysProject project = new CySysProject();
		project.setCySysProjectId(projectId);
		project.setCySysProjectGitVersion(newTag);
		cySysProjectBiz.updateDataSettings(CsysUserView, project);
	}

	public static void run(String strcmd) throws Exception {
		Runtime r = Runtime.getRuntime();
		Process p = null;
		try {

			p = r.exec(strcmd);
			StreamGobbler errorGobbler = new StreamGobbler(p.getErrorStream(), "ERROR");
			errorGobbler.start();
			StreamGobbler outGobbler = new StreamGobbler(p.getInputStream(), "STDOUT");
			outGobbler.start();
			p.waitFor();
		} catch (Exception e) {
			System.out.println("运行错误:" + e.getMessage());
			e.printStackTrace();
		}

	}

	// 销毁进程
	public static void killProcess() throws IOException {
		Runtime.getRuntime().exec("cmd.exe /C start wmic process where name='cmd.exe' call terminate");
	}
}
