package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysPageBlock;
import com.company.project.model.CsysPageBlockExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPageBlockMapper extends CommonMapper<CsysPageBlock> {
    long countByExample(CsysPageBlockExample example);

    int deleteByExample(CsysPageBlockExample example);

    List<CsysPageBlock> selectByExampleWithBLOBs(CsysPageBlockExample example);

    List<CsysPageBlock> selectByExample(CsysPageBlockExample example);

    int updateByExampleSelective(@Param("record") CsysPageBlock record, @Param("example") CsysPageBlockExample example);

    int updateByExampleWithBLOBs(@Param("record") CsysPageBlock record, @Param("example") CsysPageBlockExample example);

    int updateByExample(@Param("record") CsysPageBlock record, @Param("example") CsysPageBlockExample example);
}