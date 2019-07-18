package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysExcelAttach;
import com.company.project.model.CsysExcelAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysExcelAttachMapper extends CommonMapper<CsysExcelAttach> {
    long countByExample(CsysExcelAttachExample example);

    int deleteByExample(CsysExcelAttachExample example);

    List<CsysExcelAttach> selectByExample(CsysExcelAttachExample example);

    int updateByExampleSelective(@Param("record") CsysExcelAttach record, @Param("example") CsysExcelAttachExample example);

    int updateByExample(@Param("record") CsysExcelAttach record, @Param("example") CsysExcelAttachExample example);
}