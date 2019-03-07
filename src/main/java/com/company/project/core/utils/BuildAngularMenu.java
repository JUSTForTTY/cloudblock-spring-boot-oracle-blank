package com.company.project.core.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;




/**
 * 
 * @author: tty
 * @说明 :生成angular静态菜单
 *
 */
public class BuildAngularMenu {

	public static void insertNewLine(String menuJson) {
        try {
            
            Writer fw = new BufferedWriter(  new OutputStreamWriter(  new FileOutputStream(""+BuildUrlUtils.AngularPackageMenuUrl+"\\menu-data.json"), "UTF-8"));
            
            fw.write("");
            fw.flush();
            fw.close();
            
            Writer fw2 = new BufferedWriter(  new OutputStreamWriter(  new FileOutputStream(""+BuildUrlUtils.AngularPackageMenuUrl+"\\menu-data.json"), "UTF-8"));
            
            System.out.println("替换菜单内容");
            fw2.write(""+menuJson+" \r\n\r\n");
    		 
            fw2.flush(); 
            fw2.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
}
