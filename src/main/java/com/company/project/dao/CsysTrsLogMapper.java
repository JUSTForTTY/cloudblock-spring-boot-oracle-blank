package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysTrsLog;
import com.company.project.outer.model.CsysTrsLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CsysTrsLogMapper extends CommonMapper<CsysTrsLog> {
    long countByExample(CsysTrsLogExample example);

    int deleteByExample(CsysTrsLogExample example);

    List<CsysTrsLog> selectByExample(CsysTrsLogExample example);

    int updateByExampleSelective(@Param("record") CsysTrsLog record, @Param("example") CsysTrsLogExample example);

    int updateByExample(@Param("record") CsysTrsLog record, @Param("example") CsysTrsLogExample example);
}