package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysTrsCcAuth;
import com.company.project.model.CsysTrsCcAuthExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsCcAuthMapper extends CommonMapper<CsysTrsCcAuth> {
    long countByExample(CsysTrsCcAuthExample example);

    int deleteByExample(CsysTrsCcAuthExample example);

    List<CsysTrsCcAuth> selectByExample(CsysTrsCcAuthExample example);

    int updateByExampleSelective(@Param("record") CsysTrsCcAuth record, @Param("example") CsysTrsCcAuthExample example);

    int updateByExample(@Param("record") CsysTrsCcAuth record, @Param("example") CsysTrsCcAuthExample example);
}