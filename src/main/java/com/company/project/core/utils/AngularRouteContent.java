package com.company.project.core.utils;


 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
 
 
/**
 * 
 * @author tty
 * @说明：生成angular路由
 *
 */
public class AngularRouteContent {
  
    public static void insertRouteContent(String importContent,String routeContent) throws IOException {
        
    	RandomAccessFile raf = new RandomAccessFile(""+BuildUrlUtils.testRoutingModuleUrl+"", "rw");// "r"：可读，"w"
		// ：可写，"rw"：可读性；
		String line = null;
		StringBuilder fileContext = new StringBuilder();
		// import是否导入内容标记
		Boolean importFlag = true;
		// 到达const routes: Routes命令标记
		Boolean routesFlag = false;
		// path是否导入内容标记
		Boolean pathFlag = true;
		while ((line = raf.readLine()) != null) {
			// 识别不包含import标记的行位置，在此位置前拼接上需要import的内容
			if (importFlag && !line.contains("import")) {
				fileContext.append(""+importContent+"\n");
				importFlag = false;
			}
			// 若已经到达路由的位置且。。。
			else if (routesFlag && pathFlag && !line.contains("path:")) {
				fileContext.append(" "+routeContent+" \n");
				routesFlag = false;
			}
			// 判断是否到达写入路由位置
			else if (line.contains("const routes: Routes = ["))
				routesFlag = true;
			fileContext.append(line + "\n");
		}
		// 指针位置为0，即从文件开始处写入
		raf.seek(0);
		// 写入内容
		raf.writeBytes(fileContext.toString());
		raf.close();
    }
 
     
 
}