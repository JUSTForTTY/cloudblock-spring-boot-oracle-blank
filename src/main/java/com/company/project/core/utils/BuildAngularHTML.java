package com.company.project.core.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;

import com.company.project.outer.model.CsysPage;



/**
 * 
 * @author: tty
 * @说明 :生成angular静态页面
 *
 */
public class BuildAngularHTML {

	public static void insertNewLine(String packageName,CsysPage page) {
        try {
            
            Writer fw = new BufferedWriter(  new OutputStreamWriter(  new FileOutputStream(""+BuildUrlUtils.AngularPackageTestUrl+"\\"+packageName+"\\"+packageName+".component.html"), "UTF-8"));
            
            System.out.println("替换html内容");
            fw.write(""+page.getCsysPageHtmlCode()+" \r\n\r\n");
    		 
    		fw.flush(); 
    	    fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
}
