package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysOrgPotAuth;
import com.company.project.outer.model.CsysOrgPotAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysOrgPotAuthMapper extends CommonMapper<CsysOrgPotAuth> {
    long countByExample(CsysOrgPotAuthExample example);

    int deleteByExample(CsysOrgPotAuthExample example);

    List<CsysOrgPotAuth> selectByExample(CsysOrgPotAuthExample example);

    int updateByExampleSelective(@Param("record") CsysOrgPotAuth record, @Param("example") CsysOrgPotAuthExample example);

    int updateByExample(@Param("record") CsysOrgPotAuth record, @Param("example") CsysOrgPotAuthExample example);
}