package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysExcelImportView;
import com.company.project.outer.model.CsysExcelImportViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysExcelImportViewMapper extends CommonMapper<CsysExcelImportView> {
    long countByExample(CsysExcelImportViewExample example);

    int deleteByExample(CsysExcelImportViewExample example);

    List<CsysExcelImportView> selectByExample(CsysExcelImportViewExample example);

    int updateByExampleSelective(@Param("record") CsysExcelImportView record, @Param("example") CsysExcelImportViewExample example);

    int updateByExample(@Param("record") CsysExcelImportView record, @Param("example") CsysExcelImportViewExample example);
}