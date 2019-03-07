package com.company.project.core.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author tty
 * @说明 生成云积木脚本文件
 *
 */
public class AngularPublishBat {

	private final Log logger = LogFactory.getLog(getClass());

	public static void BuildCloudBlock() throws Exception {
		System.out.println("文件路径" + BuildUrlUtils.buildProjectBatUrl);
		// 生成bat文件
		Writer fw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("" + BuildUrlUtils.buildProjectBatUrl + ""), "UTF-8"));
		// 文件命名
		fw.write("title publish \r\n\r\n");
		fw.write("" + BuildUrlUtils.AngularPackageRootUrl + "\r\n\r\n");
		fw.write("cd  " + BuildUrlUtils.AngularPackageTestUrl + "\r\n\r\n");
		fw.write("ng build --prod \r\n\r\n");
		// fw.write("exit");//无效
		fw.flush();
		fw.close();

		if (new File(BuildUrlUtils.AngularPackageTestUrl + "/dist").exists())
			new File(BuildUrlUtils.AngularPackageTestUrl + "/dist").delete();

		// 执行bat命令文件
		// 调用我们在项目目录下准备好的bat文件，如果不是在项目目录下，则把“你的文件名.bat ”改成文件所在路径。
		run("cmd /c start " + BuildUrlUtils.buildProjectBatUrl); // 调用上面的run_cmd方法执行操作

		// 开启循环
		for (;;) {
			Thread.sleep(1000);
			// 判断前端dist文件包是否已经生成
			if (new File(BuildUrlUtils.AngularPackageTestUrl + "/dist").exists()) {
				System.out.println("发布完成啦");
				// 重新生成文件
				fw = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream("" + BuildUrlUtils.buildProjectBatUrl + ""), "UTF-8"));
				// 文件命名
				fw.write("title copy \r\n\r\n");
				// 复制项目下的dist下的所有文件（包含文件夹和文件）到服务器指定的目录下，/y指令为若存在则进行覆盖操作
				fw.write("xcopy " + BuildUrlUtils.AngularPackageTestUrl.replace("/", "\\") + "\\dist "
						+ BuildUrlUtils.ProjectServer.replace("/", "\\") + " /s /f /h /y \r\n\r\n");
				fw.write("exit");// 复制完后自动关闭窗口
				fw.flush();
				fw.close();
				// 复制dist文件
				run("cmd /c start " + BuildUrlUtils.buildProjectBatUrl);
				System.out.println("复制成功啦");
				// killProcess();
				// 删除bat文件
				//new File(BuildUrlUtils.buildProjectBatUrl).delete();
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		AngularPublishBat.BuildCloudBlock();
	}

	public static void run(String strcmd) throws Exception {
		Runtime rt = Runtime.getRuntime(); // Runtime.getRuntime()返回当前应用程序的Runtime对象
		Process ps = rt.exec(strcmd); // 该对象的exec()方法指示Java虚拟机创建一个子进程执行指定的可执行程序，并返回与该子进程对应的Process对象实例。
		ps.waitFor(); // 等待子进程完成再往下执行。
		ps.destroy(); // 销毁子进程
	}

	public static void killProcess() throws IOException {
		Runtime.getRuntime().exec("cmd.exe /C start wmic process where name='publish' call terminate");
	}
}
