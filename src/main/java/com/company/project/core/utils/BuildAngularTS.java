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
 * @说明 :生成angular ts文件
 *
 */
public class BuildAngularTS {

	public static void insertNewLine(String packageName,CsysPage page) {
        try {
            
            Writer fw = new BufferedWriter(  new OutputStreamWriter(  new FileOutputStream(""+BuildUrlUtils.AngularPackageTestUrl+"\\"+packageName+"\\"+packageName+".component.ts"), "UTF-8"));
            
            System.out.println("替换ts内容");
            fw.write(""+page.getCsysPageHtmlTsCode()+" \r\n\r\n");
    		 
    		fw.flush(); 
    	    fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
}
