package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysOrgPot;
import com.company.project.model.CsysOrgPotExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysOrgPotMapper extends CommonMapper<CsysOrgPot> {
    long countByExample(CsysOrgPotExample example);

    int deleteByExample(CsysOrgPotExample example);

    List<CsysOrgPot> selectByExample(CsysOrgPotExample example);

    int updateByExampleSelective(@Param("record") CsysOrgPot record, @Param("example") CsysOrgPotExample example);

    int updateByExample(@Param("record") CsysOrgPot record, @Param("example") CsysOrgPotExample example);
}