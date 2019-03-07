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

import ch.qos.logback.classic.Logger;

/**
 * 
 * @author tty
 * @说明 生成云积木脚本文件
 *
 */
public class AngularFileBat {

	public static void BuildCloudBlock(String pageName) throws Exception {

		System.out.println("文件路径" + BuildUrlUtils.buildfileBatUrl);

		String currentTime = DateUtils.newSimpleDateTime();

		String fileBat = BuildUrlUtils.buildfileBatUrl + currentTime + ".bat";
		// 生成bat文件
		Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("" + fileBat + ""), "UTF-8"));

		fw.write("cd / \r\n\r\n");
		fw.write("" + BuildUrlUtils.AngularPackageRootUrl + "\r\n\r\n");
		fw.write("cd  " + BuildUrlUtils.AngularPackageTestUrl + "\r\n\r\n");
		 
		fw.write("npm run  gc  " + pageName + "\r\n\r\n");
		 
		fw.write("exit" + " \r\n\r\n");
		fw.flush();
		fw.close();

		// 执行bat命令文件
		// 调用我们在项目目录下准备好的bat文件，如果不是在项目目录下，则把“你的文件名.bat”改成文件所在路径。
		run("cmd.exe /c start /b " + fileBat,pageName);
		 
		 
	}

	public static void run_cmd(String strcmd, String pageName) throws Exception {
		String s;
		Process p = Runtime.getRuntime().exec(strcmd);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		while ((s = bufferedReader.readLine()) != null)
			System.out.println(s);

		p.waitFor();

		int queryExitValue = p.exitValue();
		System.out.println(p.exitValue());
		if (queryExitValue == 0) {
			System.out.println("执行完成.");
			// 更改配置文件
			System.out.println("替换完成.");
			// 删除bat文件
			// new File(BuildUrlUtils.buildfileBatUrl).delete();

			// 三、生成路由，如果页面已经发布过，则不用生成，修改页面及路由
			System.out.println("生成批路由==》");
			String importContent = "import { " + CaptureName.captureName(pageName) + "Component } from './" + pageName
					+ "/" + pageName + ".component';";

			String routeContent = ",{path: '" + pageName + "', component: " + CaptureName.captureName(pageName)
					+ "Component }";

			AngularRouteContent.insertRouteContent(importContent, routeContent);

		} else {
			System.out.println("执行失败.");
		}

	}

	public static void run(String strcmd,String pageName) throws Exception {
		Runtime r = Runtime.getRuntime();
		Process p = null;
		try {

			p = r.exec(strcmd);
			StreamGobbler errorGobbler = new StreamGobbler(p.getErrorStream(), "ERROR");
			errorGobbler.start();
			StreamGobbler outGobbler = new StreamGobbler(p.getInputStream(), "STDOUT");
			outGobbler.start();
			p.waitFor();
			
			// 三、生成路由，如果页面已经发布过，则不用生成，修改页面及路由
			System.out.println("生成批路由==》");
			String importContent = "import { " + CaptureName.captureName(pageName) + "Component } from './" + pageName + "/"
					+ pageName + ".component';";

			String routeContent = ",{path: '" + pageName + "', component: " + CaptureName.captureName(pageName)
					+ "Component }";

			AngularRouteContent.insertRouteContent(importContent, routeContent);
		} catch (Exception e) {
			System.out.println("运行错误:" + e.getMessage());
			e.printStackTrace();
		}

	}
	
}
