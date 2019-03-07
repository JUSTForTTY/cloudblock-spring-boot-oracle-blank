package com.company.project.core.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.model.CySysJdbcConnector;

@RestController
@RequestMapping({ "/jdbcConnect" })
public class JdbcConnectTest {

	/*
	 * private static final String DRIVERCLASS = "oracle.jdbc.driver.OracleDriver";
	 * private static final String URL =
	 * "jdbc:oracle:thin:@106.14.153.167:1521:orcl"; private static final String
	 * USERNAME = "orcl"; private static final String PASSWORD = "1234"; Boolean
	 * flag = false; String url =
	 * "jdbc:mysql://116.62.18.34:33060/small_town_erp_v1"; String username =
	 * "root"; String password = "!QAZ2wsxchuangyou"; String driver =
	 * "com.mysql.jdbc.Driver";
	 */ // 获取mysql数据库的驱动类

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private AuthUtils authUtils;

	@PostMapping
	public Result testJdbcConnect(HttpServletRequest request, HttpServletResponse response,
			@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody CySysJdbcConnector connector) {
		Boolean flag = false;
		String driver = "";
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
		if (connector.getUrl().contains("mysql")) {
			driver = "com.mysql.jdbc.Driver";
		} else {
			driver = "oracle.jdbc.driver.OracleDriver";
		}
		Connection conn = null;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			logger.debug("驱动加载失败");
			e1.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(connector.getUrl(), connector.getUsername(), connector.getPassword());// 获取连接对象
			logger.debug("成功连接数据库！");
			flag = true;
			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ResultGenerator.genSuccessResult(flag + "", param);
	}
}
