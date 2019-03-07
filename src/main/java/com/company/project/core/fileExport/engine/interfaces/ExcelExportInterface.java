package com.company.project.core.fileExport.engine.interfaces;

import javax.servlet.http.HttpServletRequest;

import com.company.project.core.fileExport.engine.bean.AutoExportExcel;

public interface ExcelExportInterface {

	public String autoExcel(HttpServletRequest request, AutoExportExcel AutoExportExcel) throws Exception;

}
