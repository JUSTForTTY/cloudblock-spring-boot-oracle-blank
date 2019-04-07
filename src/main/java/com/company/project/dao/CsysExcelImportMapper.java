package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysExcelImport;
import com.company.project.model.CsysExcelImportExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysExcelImportMapper extends CommonMapper<CsysExcelImport> {
    long countByExample(CsysExcelImportExample example);

    int deleteByExample(CsysExcelImportExample example);

    List<CsysExcelImport> selectByExample(CsysExcelImportExample example);

    int updateByExampleSelective(@Param("record") CsysExcelImport record, @Param("example") CsysExcelImportExample example);

    int updateByExample(@Param("record") CsysExcelImport record, @Param("example") CsysExcelImportExample example);
}