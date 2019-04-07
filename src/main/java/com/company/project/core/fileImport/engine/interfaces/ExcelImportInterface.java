package com.company.project.core.fileImport.engine.interfaces;

import org.springframework.web.multipart.MultipartFile;

import com.company.project.model.CsysUserView;

public interface ExcelImportInterface {

	/*
	 * 导入excel数据
	 */
	public void importExcelFile(CsysUserView cySysBaseUserView, MultipartFile excelFile, String sysExcelImportId)
			throws Exception;
}
