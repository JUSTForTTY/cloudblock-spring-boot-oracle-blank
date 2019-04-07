package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysPageLayout;
import com.company.project.model.CsysPageLayoutExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPageLayoutMapper extends CommonMapper<CsysPageLayout> {
    long countByExample(CsysPageLayoutExample example);

    int deleteByExample(CsysPageLayoutExample example);

    List<CsysPageLayout> selectByExampleWithBLOBs(CsysPageLayoutExample example);

    List<CsysPageLayout> selectByExample(CsysPageLayoutExample example);

    int updateByExampleSelective(@Param("record") CsysPageLayout record, @Param("example") CsysPageLayoutExample example);

    int updateByExampleWithBLOBs(@Param("record") CsysPageLayout record, @Param("example") CsysPageLayoutExample example);

    int updateByExample(@Param("record") CsysPageLayout record, @Param("example") CsysPageLayoutExample example);
}