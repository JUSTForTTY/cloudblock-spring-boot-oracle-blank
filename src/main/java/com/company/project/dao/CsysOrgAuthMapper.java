package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysOrgAuth;
import com.company.project.model.CsysOrgAuthExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysOrgAuthMapper extends CommonMapper<CsysOrgAuth> {
    long countByExample(CsysOrgAuthExample example);

    int deleteByExample(CsysOrgAuthExample example);

    List<CsysOrgAuth> selectByExample(CsysOrgAuthExample example);

    int updateByExampleSelective(@Param("record") CsysOrgAuth record, @Param("example") CsysOrgAuthExample example);

    int updateByExample(@Param("record") CsysOrgAuth record, @Param("example") CsysOrgAuthExample example);
}