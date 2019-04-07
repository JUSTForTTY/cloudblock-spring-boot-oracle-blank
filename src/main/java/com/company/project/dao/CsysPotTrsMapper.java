package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysPotTrs;
import com.company.project.model.CsysPotTrsExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPotTrsMapper extends CommonMapper<CsysPotTrs> {
    long countByExample(CsysPotTrsExample example);

    int deleteByExample(CsysPotTrsExample example);

    List<CsysPotTrs> selectByExample(CsysPotTrsExample example);

    int updateByExampleSelective(@Param("record") CsysPotTrs record, @Param("example") CsysPotTrsExample example);

    int updateByExample(@Param("record") CsysPotTrs record, @Param("example") CsysPotTrsExample example);
}