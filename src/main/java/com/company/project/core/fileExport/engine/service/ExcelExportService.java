package com.company.project.core.fileExport.engine.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import com.company.project.biz.SystemBiz;
import com.company.project.core.fileExport.engine.bean.AutoExportExcel;
import com.company.project.core.fileExport.engine.interfaces.ExcelExportInterface;
import com.company.project.core.utils.BuildUrlUtils;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysUserView;

@Service
public class ExcelExportService implements ExcelExportInterface {

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	SystemBiz systemBiz;

	@Override
	public String autoExcel(HttpServletRequest request, AutoExportExcel autoExportExcel) throws Exception {
		String fileName = autoExportExcel.getExportExcelName();
		// 取得tomcat父目录加导出文件夹
		String path = new File(System.getProperty("catalina.home")).getParent() + "/uploadfile/export";
		path = path.replaceAll("\\\\", "/");
		logger.info("文件目录：" + path);

		// 创建导出新文件夹目录
		String filePath = path + "/newExcelFile/" + DateUtils.format(new Date(), "yyyyMMdd");
		// 格式为当前年月日
		File folder = new File(filePath);
		// 若文件夹不存在，则创建
		if (!folder.exists()) {
			folder.mkdir();
		}
		String number = DateUtils.format(new Date(), "yyyyMMddHHmmss");
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			number += r.nextInt(10);
		}
		// 创建新文件路径，新文件夹+源文件名+_时间和随机数+源文件格式
		String newFilePath = folder + "\\" + fileName + "_" + number + ".xls";
		newFilePath = newFilePath.replaceAll("\\\\", "/");
		logger.info("新文件路径：" + newFilePath);
		// 复制空白excel模板
		FileUtils.copyFile(new File(path + "/template/blankTemplate.xls"), new File(newFilePath));
		FileInputStream inputStream = new FileInputStream(newFilePath);
		// 开始写入
		Workbook workbook = new HSSFWorkbook(inputStream);
		// 设置sheet页面名称
		String[] sheetName = autoExportExcel.getSheetNameArray();
		if (sheetName.length > 0) {
			workbook.setSheetName(0, sheetName[0]);
		}

		// 获取每个sheet对象
		Sheet sheet = workbook.getSheetAt(0);
		// 声明行对象，在sheet中获取表头第0行
		Row row = sheet.createRow(0);
		// 声明列对象
		Cell cell = null;

		// 开始写入表头
		String[] headerNameArray = autoExportExcel.getHeaderNameArray();
		for (int i = 0; i < headerNameArray.length; i++) {
			cell = row.createCell(i);
			cell.setCellValue(headerNameArray[i]);
		}
		// 获取字段名称
		String[] columnNameArray = autoExportExcel.getColumnNameArray();
		// 获取数据
		List<Map<String, Object>> dataList = systemBiz
				.getTableData(new ArrayList<CsysUserView>(), autoExportExcel.getTableDataBean()).getData().getList();
		logger.info("导出数据长度为：" + dataList.size());
		// 开始写入数据
		int count = 1;
		Object value = null;
		for (Map<String, Object> map : dataList) {
			// 第二行开始
			row = sheet.createRow(count);
			for (int i = 0; i < columnNameArray.length; i++) {
				// 根据字段获取值
				value = map.get(columnNameArray[i]);
				if (value != null && !"".equals(value)) {
					cell = row.createCell(i);
					cell.setCellValue(value.toString());
				}
			}
			count++;
		}

		// 设置自适应列宽
		for (int i = 0; i < headerNameArray.length; i++) {
			// 先设置自动列宽
			sheet.autoSizeColumn(i);
			// 设置列宽为自动列宽的1.2倍
			sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 12 / 10);
		}
		FileOutputStream xlsStream = new FileOutputStream(new File(newFilePath));
		workbook.write(xlsStream);
		xlsStream.close();
		// 返回文件路径
		String fileDownloadPath = (BuildUrlUtils.projectDomainName + "\\export/newExcelFile/"
				+ DateUtils.format(new Date(), "yyyyMMdd") + "/" + fileName + "_" + number + ".xls").replaceAll("\\\\",
						"/");
		return fileDownloadPath;
	}
}
