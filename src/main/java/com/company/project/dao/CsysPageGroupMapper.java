package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysPageGroup;
import com.company.project.model.CsysPageGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPageGroupMapper extends CommonMapper<CsysPageGroup> {
    long countByExample(CsysPageGroupExample example);

    int deleteByExample(CsysPageGroupExample example);

    List<CsysPageGroup> selectByExample(CsysPageGroupExample example);

    int updateByExampleSelective(@Param("record") CsysPageGroup record, @Param("example") CsysPageGroupExample example);

    int updateByExample(@Param("record") CsysPageGroup record, @Param("example") CsysPageGroupExample example);
}