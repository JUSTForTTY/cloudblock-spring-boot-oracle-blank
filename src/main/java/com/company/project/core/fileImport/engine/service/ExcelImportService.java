package com.company.project.core.fileImport.engine.service;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.company.project.biz.CsysExcelImportBiz;
import com.company.project.biz.CsysExcelImportViewBiz;
import com.company.project.core.bean.DynamicSql;
import com.company.project.core.fileImport.engine.interfaces.ExcelImportInterface;
import com.company.project.core.utils.DateUtils;
import com.company.project.dao.CsysFieldInfoMapper;
import com.company.project.dao.DynamicSqlMapper;
import com.company.project.dao.SystemMapper;
import com.company.project.model.CsysExcelImport;
import com.company.project.model.CsysExcelImportView;
import com.company.project.model.CsysFieldInfo;
import com.company.project.model.CsysFieldInfoExample;
import com.company.project.model.CsysUserView;

@Service
public class ExcelImportService implements ExcelImportInterface {

	private final Log logger = LogFactory.getLog(getClass());
	
	@Resource
	CsysExcelImportViewBiz csysExcelImportViewBiz;

	@Resource
	private SystemMapper systemMapper;


	@Resource
    CsysFieldInfoMapper csysFieldInfoMapper;
	
	@Resource
	DynamicSqlMapper dynamicSqlMapper;
	
	@Resource
    CsysExcelImportBiz csysExcelImportBiz;
	/*
     * 导入excel数据
     */
    @Override
    public void importExcelFile(CsysUserView CsysUserView, MultipartFile excelFile, String sysExcelImportId)
            throws Exception {

      
        //判断excel模板导入模式
        CsysExcelImport csysExcelImport= csysExcelImportBiz.getDataSettings(sysExcelImportId);
        if(null!=csysExcelImport.getCsysExcelImportModel()&&!"".equals(csysExcelImport.getCsysExcelImportModel())) {
        	
        	switch(csysExcelImport.getCsysExcelImportModel()) {
        	//新增
        	case "0":
        		
        		ExcelInsertFile(CsysUserView, excelFile, sysExcelImportId);
        		break;
        	//更新
        	case "1":
        		ExcelUpdateFile(CsysUserView, excelFile, sysExcelImportId);
        		break;
        	//新增+更新
        	case "2":
        		ExcelInsertAndUpdateFile(CsysUserView, excelFile, sysExcelImportId);
        		break;
        	//默认，新增
        	default:
        		ExcelInsertFile(CsysUserView, excelFile, sysExcelImportId);
        		break;
        	
        	
        	}
        }
        
         
    }
    
    public void ExcelInsertFile(CsysUserView CsysUserView, MultipartFile excelFile, String sysExcelImportId) throws IOException {
    	String fileName = excelFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        
        // 若文件后缀名为csv，则调用对应的方法
        if ("csv".equals(suffix)) {
            // importCsvFileAll(file, templateCode);
            return;
        }

        // 获取导入信息
        Map<String,Object> map = getImportExcelInfo(sysExcelImportId);

        // 表名
        String tableName = map.get("tableName").toString();
        // 定义excel读取方式
        String readType = map.get("importType").toString();
        // 定义统一读取起始行
        Integer readRow = Integer.valueOf(map.get("readRow").toString());

        // 定义字段字符串
        String allFieldName = map.get("addFieldName").toString();
        // 定义字段数组行
        Integer[] rowArray = (Integer[])map.get("rowArray");
        // 定义字段数组列
        Integer[] columnArray = (Integer[]) map.get("columnArray");
        // 定义表字段类型
        String[] fieldTypeArray = (String[]) map.get("fieldTypeArray");
        // 定义表字段属性
        String[] fieldTypeAttribute = (String[]) map.get("fieldAttributeArray");
        // 定义表字段属性
        String[] fieldUpdateField = (String[]) map.get("fieldUpdateField");
        //定义系统字段
        List<CsysFieldInfo> csysFieldInfoList=(List<CsysFieldInfo>) map.get("fieldSysField");
         
        // 定义表主键名
        /*
         * String fieldPrimaryName = (String) list.get(8); // 定义表主键名列 String
         * fieldPrimaryColumn = (String) list.get(9);
         */

        // 定义表主键名excel列值
        // String fieldPrimaryValue = "";

        // 定义导入表字段
        ArrayList key = new ArrayList<>();
        // 定义导入表更新字段名和字段值sql
        ArrayList value = new ArrayList<>();

        // 动态sql
        DynamicSql dynamicSql = new DynamicSql();
        // 表名
        dynamicSql.setTableName(tableName);
        // 字段名
        dynamicSql.setCloumn(allFieldName);

        // 开始读取excel信息
        Workbook wb = null;
        try {
            wb = new XSSFWorkbook(excelFile.getInputStream());
        } catch (Exception e) {
            // TODO: handle exception
            wb = new HSSFWorkbook(excelFile.getInputStream());
        }
        int sheetnumber = wb.getNumberOfSheets();
        // 获取此工作簿下sheet页的个数
        for (int z = 0; z < sheetnumber; z++) {
            Sheet sheet = wb.getSheetAt(z);
            // 判断sheet是否为空即判断sheet页中行数大于0
            if (sheet.getPhysicalNumberOfRows() > 0) {
                String primaryValue = "";
                List<Integer[]> mergeList = getCombineCell(sheet);
                // 多条导入即逐行导入
                if ("1".equals(readType)) {
                    // 获取行数
                    int rowNum = sheet.getLastRowNum();
                    // 循环行
                    for (int i = readRow; i <= rowNum; i++) {
                        // 定义值集合
                        List valueList = new ArrayList<>();
                        Row row = sheet.getRow(i);
                        // 判重标记
                        //Boolean repeatFlag = false;
                        // 循环字段数组列
                        for (int j = 0; j < columnArray.length; j++) {
                            // 拼接字段列值
                            String fieldValue = null;
                             
                            if(null!=fieldUpdateField[j]&&!"".equals(fieldUpdateField[j])) {
                            	//新增导入不需要查询出条件字段
                            	if("0".equals(fieldUpdateField[j])) {
                            		switch(fieldTypeAttribute[j]) {
                            		//普通字段
                            		case "0":
                            			fieldValue = getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
                                                 fieldTypeArray[j], mergeList, sheet).trim();
                            			break;
                            		//主键(可拓展根据自定义规则进行创建主键)
//                            		case "1":
//                            			fieldValue = getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
//                                                 fieldTypeArray[j], mergeList, sheet).trim();
//                            			break;
                            		//外键
                            		case "2":
                            			 fieldValue = getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
                                                 fieldTypeArray[j], mergeList, sheet).trim();
                            			break;
//                            		//删除标记
//                            		case "3":
//                            			fieldValue="0";
//                            			break;
//                            		//系统创建时间
//                            		case "4":
//                            			fieldValue="to_date("+DateUtils.newTimestamp()+",'yyyy-mm-dd hh24:mi:ss')";
//                            			break;
//                            		//系统创建人
//                            		case "5":
//                            			
//                            			fieldValue = CsysUserView.getCsysUserId();
//                            			
//                            			break;
//                            		//系统更新时间
//                            		case "6":
//                            			fieldValue="to_date("+DateUtils.newTimestamp()+",'yyyy-mm-dd hh24:mi:ss')";
//                            			break;
//                            		//系统更新人
//                            		case "7":
//                            			
//                            			fieldValue = CsysUserView.getCsysUserId();
//                            			
//                            			break;
                            		default:
                            			fieldValue = getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
                                                fieldTypeArray[j], mergeList, sheet).trim();
                            			break;
                            		 
                            		}
                              
                            }
                          
                           }
                            //logger.info("结果值为：" + fieldValue);
                            // 拼接值
                            valueList.add(fieldValue);
                        }
                       
                        // 拼接系统值
                        for(CsysFieldInfo cfi:csysFieldInfoList) {
                        	Object fieldValue = null;
                        	switch (cfi.getCsysFieldInfoAttribute()) {
                        	//删除标记
							case "3":
								fieldValue="0";
								break;
							//系统创建时间
							case "4":
								fieldValue=DateUtils.newTimestamp();
								break;
							//系统创建人
							case "5":
								fieldValue = CsysUserView.getCsysUserId();
								break;
							//系统创建时间
							case "6":
								fieldValue=DateUtils.newTimestamp();
								break;
							//系统创建人
							case "7":
								fieldValue = CsysUserView.getCsysUserId();
								break;
							default:
								break;
							}
                        	valueList.add(fieldValue);
                        }
                        // 组装值集合
                        dynamicSql.setValueList(valueList);
                        
                        //logger.info("输出：" + dynamicSql.toString());
                        // 调用通用新增方法
                        dynamicSqlMapper.insertData(dynamicSql);
                    }
                    // 单条导入
                } else if ("0".equals(readType)) {
                    // 定义值集合
                    List valueList = new ArrayList<>();
                    logger.info("长度：" + rowArray.length);
                    // 循环字段数组列
                    for (int i = 0; i < rowArray.length; i++) {
                        // 拼接字段列值
                        String fieldValue = getFieldVlaue(sheet.getRow(rowArray[i]).getCell(columnArray[i]), i,
                                columnArray[i], fieldTypeArray[i], mergeList, sheet).trim();
                        // 拼接值
                        valueList.add(fieldValue);
                    }
                    // 组装值集合
                    dynamicSql.setValueList(valueList);
                    // 调用通用新增方法
                    dynamicSqlMapper.insertData(dynamicSql);
                    logger.info("返回值：" + primaryValue);
                }
            }
        }
    	
    }

    /**
     * 更新excel数据，根据excel中定义的主键条件规则进行匹配，符合匹配进行更新，否则不进行操作
     * @param CsysUserView
     * @param excelFile
     * @param sysExcelImportId
     * @throws IOException 
     */
    public void ExcelUpdateFile(CsysUserView CsysUserView, MultipartFile excelFile, String sysExcelImportId) throws IOException {
    	String fileName = excelFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        
        // 若文件后缀名为csv，则调用对应的方法
        if ("csv".equals(suffix)) {
            // importCsvFileAll(file, templateCode);
            return;
        }

        // 获取导入信息
        Map<String,Object> map = getImportExcelInfo(sysExcelImportId);

        // 表名
        String tableName = map.get("tableName").toString();
        // 定义excel读取方式
        String readType = map.get("importType").toString();
        // 定义统一读取起始行
        Integer readRow = Integer.valueOf(map.get("readRow").toString());

        // 定义字段字符串
        String allFieldName = map.get("addFieldName").toString();
        // 定义字段字符数组
        String[] allFieldNameArray=(String[])map.get("allFieldNameArray");
        // 定义字段数组行
        Integer[] rowArray = (Integer[])map.get("rowArray");
        // 定义字段数组列
        Integer[] columnArray = (Integer[]) map.get("columnArray");
        // 定义表字段类型
        String[] fieldTypeArray = (String[]) map.get("fieldTypeArray");
        // 定义表字段属性
        String[] fieldTypeAttribute = (String[]) map.get("fieldAttributeArray");
        // 定义表字段属性
        String[] fieldUpdateField = (String[]) map.get("fieldUpdateField");
        //定义系统字段
        List<CsysFieldInfo> csysFieldInfoList=(List<CsysFieldInfo>) map.get("fieldSysField");
        
        String[] fieldTransferSqlArray=(String[])map.get("fieldTransferSqlArray");
        
        // 定义表主键名
        /*
         * String fieldPrimaryName = (String) list.get(8); // 定义表主键名列 String
         * fieldPrimaryColumn = (String) list.get(9);
         */

        // 定义表主键名excel列值
        // String fieldPrimaryValue = "";

        // 定义导入表字段
        ArrayList key = new ArrayList<>();
        // 定义导入表更新字段名和字段值sql
        ArrayList value = new ArrayList<>();

        // 动态sql
        DynamicSql dynamicSql = new DynamicSql();
        // 表名
        dynamicSql.setTableName(tableName);
        // 字段名
        dynamicSql.setCloumn(allFieldName);

        // 开始读取excel信息
        Workbook wb = null;
        try {
            wb = new XSSFWorkbook(excelFile.getInputStream());
        } catch (Exception e) {
            // TODO: handle exception
            wb = new HSSFWorkbook(excelFile.getInputStream());
        }
        int sheetnumber = wb.getNumberOfSheets();
        // 获取此工作簿下sheet页的个数
        for (int z = 0; z < sheetnumber; z++) {
            Sheet sheet = wb.getSheetAt(z);
            // 判断sheet是否为空即判断sheet页中行数大于0
            if (sheet.getPhysicalNumberOfRows() > 0) {
                String primaryValue = "";
                List<Integer[]> mergeList = getCombineCell(sheet);
                // 多条导入即逐行导入
                if ("1".equals(readType)) {
                    // 获取行数
                    int rowNum = sheet.getLastRowNum();
                    // 循环行
                    for (int i = readRow; i <= rowNum; i++) {
                        // 定义值集合
                        List valueList = new ArrayList<>();
                        Row row = sheet.getRow(i);
                        // 判重标记
                        //Boolean repeatFlag = false;
                        String whereCondition=" where 1=1 ";
                        // 循环字段数组列
                        for (int j = 0; j < columnArray.length; j++) {
                            // 拼接字段列值
                            Map<String,Object> fieldValue = new HashMap<>();
                            String whereValue = null;
                             
                            if(null!=fieldUpdateField[j]&&!"".equals(fieldUpdateField[j])) {
                            	//不需要作为更新条件
                            	if("0".equals(fieldUpdateField[j])) {
                            		switch(fieldTypeAttribute[j]) {
                            		//普通字段
                            		case "0": 
                            			fieldValue.put(allFieldNameArray[j], "'"+getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
                                                 fieldTypeArray[j], mergeList, sheet).trim()+"'");
                            			break;
                            		//主键(可拓展根据自定义规则进行创建主键)
//                            		case "1":
//                            		
//                            			fieldValue.put(allFieldNameArray[j], getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
//                                                 fieldTypeArray[j], mergeList, sheet).trim());
//                            			break;
                            		//外键
                            		case "2":
                            			fieldValue.put(allFieldNameArray[j], "'"+getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
                                                fieldTypeArray[j], mergeList, sheet).trim()+"'");
                            			break;
                            		//删除标记
//                            		case "3":
//                            			fieldValue.put(allFieldNameArray[j], "0");
//                            			break;
//                            		//系统创建时间
//                            		case "4":
//                            			
//                            			fieldValue.put(allFieldNameArray[j], "to_date("+DateUtils.newTimestamp()+",'yyyy-mm-dd hh24:mi:ss')");
//                            			break;
//                            		//系统创建人
//                            		case "5":
//                            	 
//                            			fieldValue.put(allFieldNameArray[j], CsysUserView.getCsysUserId());
//                            			
//                            			break;
//                            		//系统更新时间
//                            		case "6":
//                            			fieldValue.put(allFieldNameArray[j], "to_date("+DateUtils.newTimestamp()+",'yyyy-mm-dd hh24:mi:ss')");
//                            			break;
//                            		//系统更新人
//                            		case "7":
//                            			
//                            			fieldValue.put(allFieldNameArray[j], CsysUserView.getCsysUserId());
//                            			
//                            			break;
                            		default:
                            			fieldValue.put(allFieldNameArray[j], "'"+getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
                                                fieldTypeArray[j], mergeList, sheet).trim()+"'");
                            			break;
                            		 
                            		}
                            	//需要作为更新条件
                            	}else if("1".equals(fieldUpdateField[j])) {
                            		
                            		whereValue = getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
                                            fieldTypeArray[j], mergeList, sheet).trim();
                            		if(null!=fieldTransferSqlArray[j]&&!"".equals(fieldTransferSqlArray[j])) {
                            			
                            			whereValue=fieldTransferSqlArray[j].replaceAll("&currentvalue&", whereValue);
                            			
                            			whereCondition=whereCondition+" and "+allFieldNameArray[j]+" = ("+whereValue+")";
                            		}else {
                            			whereCondition=whereCondition+" and "+allFieldNameArray[j]+" = '"+whereValue+"'";
                               		 	
                            		}
                            		 
                            	
                            		  
                            	}else {
                            		
                            		fieldValue.put(allFieldNameArray[j], getFieldVlaue(row.getCell(columnArray[j]), i, columnArray[j],
                                            fieldTypeArray[j], mergeList, sheet).trim());
                            		
                            	}
                            	
                            	
                            }
                          
                            //logger.info("结果值为：" + fieldValue);
                            // 拼接值
                            valueList.add(fieldValue);
                        }
                        
                        //拼接系统值
                        for(CsysFieldInfo cfi:csysFieldInfoList) {
                        	Map<String,Object> fieldValue = new HashMap<>();
                        	switch (cfi.getCsysFieldInfoAttribute()) {
                        	//删除标记
							case "3":
								fieldValue.put(cfi.getCsysFieldInfoName(), "0");
								break;
							//系统创建时间
//							case "4":
//								fieldValue.put(cfi.getCsysFieldInfoName(), "to_date("+DateUtils.newTimestampStr()+",'yyyy-mm-dd hh24:mi:ss')");
//								break;
//							//系统创建人
//							case "5":
//								fieldValue.put(cfi.getCsysFieldInfoName(), CsysUserView.getCsysUserId());
//								break;
							//系统更新时间
							case "6":
								fieldValue.put(cfi.getCsysFieldInfoName(),"to_date('"+DateUtils.newTimestampStr()+"','yyyy-mm-dd hh24:mi:ss')");
								break;
							//系统更新人
							case "7":
								fieldValue.put(cfi.getCsysFieldInfoName(), "'"+CsysUserView.getCsysUserId()+"'");
								break;
							default:
								break;
							}
                        	valueList.add(fieldValue);
                        	
                        }
                        
                        // 组装值集合
                        dynamicSql.setValueList(valueList);
                        
                        dynamicSql.setWhereCondition(whereCondition);
                        //logger.info("输出：" + dynamicSql.toString());
                        // 调用通用新增方法
                        dynamicSqlMapper.updateData(dynamicSql);
                    }
                    // 单条导入
                } else if ("0".equals(readType)) {
                    // 定义值集合
                    List valueList = new ArrayList<>();
                    logger.info("长度：" + rowArray.length);
                    // 循环字段数组列
                    for (int i = 0; i < rowArray.length; i++) {
                        // 拼接字段列值
                        String fieldValue = getFieldVlaue(sheet.getRow(rowArray[i]).getCell(columnArray[i]), i,
                                columnArray[i], fieldTypeArray[i], mergeList, sheet).trim();
                        // 拼接值
                        valueList.add(fieldValue);
                    }
                    // 组装值集合
                    dynamicSql.setValueList(valueList);
                    // 调用通用新增方法
                    dynamicSqlMapper.insertData(dynamicSql);
                    logger.info("返回值：" + primaryValue);
                }
            }
        }
    	
    	
    }
    
    public void ExcelInsertAndUpdateFile(CsysUserView CsysUserView, MultipartFile excelFile, String sysExcelImportId) {
	
	 
    }
    
    @Override
    public List<CsysFieldInfo> getSystemColumn(String tableName) {
        CsysFieldInfoExample example = new CsysFieldInfoExample();
        //创建人
        example.or().andCsysFieldInfoRegionEqualTo(tableName).andCsysFieldInfoAttributeEqualTo("5");
        //修改人
        example.or().andCsysFieldInfoRegionEqualTo(tableName).andCsysFieldInfoAttributeEqualTo("7");
        return csysFieldInfoMapper.selectByExample(example);
    }

    private Map<String,Object> getImportExcelInfo(String sysExcelImportId) {

        CsysExcelImportView csysExcelImportView = new CsysExcelImportView();
        csysExcelImportView.setCsysExcelImportId(sysExcelImportId);
        // 根据编号查询需要导入的字段
        List<CsysExcelImportView> fieldList = csysExcelImportViewBiz.getDataSettingsByCondition(csysExcelImportView);
        logger.info("导入字段长度：" + fieldList.size());

        //查询本表的系统字段
        List<CsysFieldInfo> sysFieldInfo = new ArrayList<CsysFieldInfo>();
        if(fieldList.size()>0) {
        	
        	List<String> sysFiledList=new ArrayList<>();
        	//删除标记
        	sysFiledList.add("3");
        	//系统创建时间
        	sysFiledList.add("4");
        	//系统创建人
        	sysFiledList.add("5");
        	//系统更新时间
        	sysFiledList.add("6");
        	//系统更新人
        	sysFiledList.add("7");
        	CsysFieldInfoExample example=new CsysFieldInfoExample();
        	CsysFieldInfoExample.Criteria criteria =example.createCriteria();
        	criteria.andCsysFieldInfoRegionEqualTo(fieldList.get(0).getCsysFieldInfoRegion());
        	criteria.andCsysFieldInfoAttributeIn(sysFiledList);
        	criteria.andCsysFieldInfoIsDeleteEqualTo("0");
        	
        	sysFieldInfo=csysFieldInfoMapper.selectByExample(example);
        }
        
        // 返回结果集
        Map<String,Object> map=new HashMap<>();

        // 字段长度
        Integer fieldLength = fieldList.size();

        // 定义字段数组
        //String[] allFieldArray = new String[fieldLength];

        // 定义字段数组
        StringBuilder allFieldName = new StringBuilder();

        ArrayList<String> allFieldNameArray = new ArrayList<String>(); 
        
        // 定义字段数组行
        ArrayList<Integer> rowArray = new ArrayList<Integer>();
        
        // 定义字段数组列
        ArrayList<Integer> columnArray = new ArrayList<Integer>();
        
        // 定义表字段类型
        ArrayList<String> fieldTypeArray = new ArrayList<String>();
        
        //定义表属性
        ArrayList<String> fieldAttributeArray = new ArrayList<String>();
        
        //定义字段更新属性
        ArrayList<String> fieldUpdateArray = new ArrayList<String>();
        
        //定义字段更新动态条件
        ArrayList<String> fieldTransferSqlArray = new ArrayList<String>();
        
        
        
        // 定义表主键名
        //String[] fieldPrimaryName = {};

        // 定义表主键名列
        //String[] fieldPrimaryColumn = {};

        // 循环导入表字段
        for (int i = 0; i < fieldList.size(); i++) {
            // 将导入表字段列名存入数组中
            csysExcelImportView = fieldList.get(i);
            // poi读取excel列是从第0行开始，所以此处减去1
            rowArray.add(Integer.parseInt(csysExcelImportView.getCsysExcelImportReadRow().toString()));
            columnArray.add(csysExcelImportView.getCsysExcelAttachFieldColumn());
            allFieldName.append(csysExcelImportView.getCsysFieldInfoName() + ",");
            allFieldNameArray.add(csysExcelImportView.getCsysFieldInfoName());
            fieldTypeArray.add(csysExcelImportView.getCsysFieldInfoType());
            fieldAttributeArray.add(csysExcelImportView.getCsysFieldInfoAttribute());
            fieldUpdateArray.add(csysExcelImportView.getCsysExcelAttachIsPrimary());
            fieldTransferSqlArray.add(csysExcelImportView.getCsysExcelAttachTransfersql());
        }
        if(sysFieldInfo.size()>0) {
        	
        	for(CsysFieldInfo cfi:sysFieldInfo) {
        		allFieldName.append(cfi.getCsysFieldInfoName() + ",");
        		allFieldNameArray.add(csysExcelImportView.getCsysFieldInfoName());
        		 
        	}
        }
        

        if (fieldList.size() > 0) {
            csysExcelImportView = fieldList.get(0);

            map.put("tableName", csysExcelImportView.getCsysViewExplainName());
            map.put("importType",csysExcelImportView.getCsysExcelImportType());
            map.put("readRow", csysExcelImportView.getCsysExcelImportReadRow());
        }
     
        map.put("addFieldName", allFieldName.length() > 0 ? allFieldName.deleteCharAt(allFieldName.length() - 1).toString() : "");
        map.put("allFieldNameArray", allFieldNameArray.toArray(new String[allFieldNameArray.size()]));
        map.put("rowArray", rowArray.toArray(new Integer[rowArray.size()]));
        map.put("columnArray", columnArray.toArray(new Integer[columnArray.size()]));
        map.put("fieldTypeArray", fieldTypeArray.toArray(new String[fieldTypeArray.size()]));
        map.put("fieldAttributeArray", fieldAttributeArray.toArray(new String[fieldAttributeArray.size()]));
        map.put("fieldSysField",sysFieldInfo);
        map.put("fieldUpdateField",fieldUpdateArray.toArray(new String[fieldUpdateArray.size()]));
        map.put("fieldTransferSqlArray",fieldTransferSqlArray.toArray(new String[fieldTransferSqlArray.size()]));
        
        
        return map;
    }

    /*
     * 获取execl格式值
     */
    private String getFieldVlaue(Cell cell, int row, Integer column, String fieldType, List<Integer[]> mergeList,
                                 Sheet sheet) {
        logger.info("初始值：" + cell);
        if (cell == null) {
            // 若该单元格值为null，则判断该单元格是否属于合并单元格，若是，则取出合并单元格的值
            if (mergeList.size() > 0) {
                return getMergedRegionValue(cell, fieldType, row, column, mergeList, sheet);
            } else {
                return "";
            }
        } else if ("".equals(cell.toString().trim())) {
            if (mergeList.size() > 0) {
                return getMergedRegionValue(cell, fieldType, row, column, mergeList, sheet);
            } else {
                return "";
            }
        } else {
            return getCellValue(cell, fieldType);
        }
    }

    /**
     * 判断该单元格是否属于合并单元格，若属于，则返回合并单元格的值
     *
     * @param fieldType
     * @param column
     * @param
     * @param sheet
     */

    public String getMergedRegionValue(Cell cell, String fieldType, int row, Integer column, List<Integer[]> mergeList,
                                       Sheet sheet) {
        // 遍历合并单元格数据
        for (Integer[] merge : mergeList) {
            // 若当前单元格行大于等于合并单元格的第一行，行小于等于合并单元格的最后一行，列大于等于合并单元格的第一列，列小于等于合并单元格的最后一列
            if (row >= merge[0] && row <= merge[1] && column >= merge[2] && column <= merge[3]) {
                // 若为合并单元格，则将该单元格的第一行第一列的单元格赋给当前单元格
                cell = sheet.getRow(merge[0]).getCell(merge[2]);
                // logger.debug("存在合并单元格值：" + cell);
                return getCellValue(cell, fieldType);
            }
        }
        return "";
    }

    private String getCellValue(Cell cell, String fieldType) {
        if (cell == null) {
            return "";
        } else {
            String fieldValue = cell.toString().trim();
            if ("null".equals(fieldValue)) {
                return "";
            } else {
                // 去除首尾单双引号
                if ((fieldValue.toString().indexOf("'") == 0
                        && fieldValue.toString().lastIndexOf("'") == fieldValue.toString().length() - 1)
                        || (fieldValue.toString().indexOf("\"") == 0
                        && fieldValue.toString().lastIndexOf("\"") == fieldValue.toString().length() - 1)) {
                    // 截取首尾单引号或双引号
                    return fieldValue.toString().substring(1, fieldValue.toString().length() - 1);
                }

                // 数字进行格式化，默认取整数
                DecimalFormat numeric = new DecimalFormat("0");

                // 判断excel公式
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_FORMULA:
                        try {
                            fieldValue = numeric.format(cell.getNumericCellValue());
                            // logger.debug("excel公式：" + fieldValue);

                        } catch (Exception e) {
                            // 异常则不处理值
                        }
                        break;

                    case HSSFCell.CELL_TYPE_NUMERIC:
                        // 处理日期格式
                        if (HSSFDateUtil.isCellDateFormatted(cell)) {
                            if ("datetime".equals(fieldType)) {
                                fieldValue = DateUtils.format(cell.getDateCellValue());
                                // logger.debug("年月日时分秒：" + fieldValue);
                            } else if ("date".equals(fieldType)) {
                                fieldValue = DateUtils.formatDate(cell.getDateCellValue());
                                // logger.debug("年月日：" + fieldValue);
                            }
                        } else {
                            // 判断是否为科学计数
                            if (isScientificCounting(cell.toString())) {
                                // 数值转换法，用来处理数值过长会变成科学计数
                                fieldValue = numeric.format(cell.getNumericCellValue());
                            } else {
                                // 普通数值去除多余小数后返回
                                fieldValue = subZeroAndDot(cell.toString());
                            }
                        }
                }
            }
            return fieldValue;
        }
    }

    /**
     * 获取合并单元格，将每个合并单元格的第一行、最后一行、第一列、最后一列放入数组中
     *
     * @param sheet
     */
    private List<Integer[]> getCombineCell(Sheet sheet) {
        List<Integer[]> mergeList = new ArrayList<>();
        // 获得一个 sheet 中合并单元格的数量
        int sheetmergerCount = sheet.getNumMergedRegions();
        // 遍历合并单元格
        for (int i = 0; i < sheetmergerCount; i++) {
            // 定义合并单元格行列数组
            Integer[] merge = new Integer[4];
            // 获得合并单元格加入list中
            CellRangeAddress ca = sheet.getMergedRegion(i);
            // 合并单元格第一行
            merge[0] = ca.getFirstRow();
            // 合并单元格最后一行
            merge[1] = ca.getLastRow();
            // 合并单元格第一列
            merge[2] = ca.getFirstColumn();
            // 合并单元格最后一列
            merge[3] = ca.getLastColumn();
            mergeList.add(merge);
        }
        return mergeList;
    }

    /*
     * 判断是否为科学计数
     */
    public boolean isScientificCounting(String number) {
        String regx = "^((-?\\d+.?\\d*)[Ee]{1}(-?\\d+))$";// 科学计数法正则表达式
        Pattern pattern = Pattern.compile(regx);
        return pattern.matcher(number).matches();
    }

    /**
     * 使用java正则表达式去掉多余的.与0
     *
     * @param s
     * @return
     */
    public static String subZeroAndDot(String s) {
        if (s.indexOf(".") > 0) {
            s = s.replaceAll("0+?$", "");// 去掉多余的0
            s = s.replaceAll("[.]$", "");// 如最后一位是.则去掉
        }
        return s;
    }
}
