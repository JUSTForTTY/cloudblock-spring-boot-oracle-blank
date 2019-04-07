package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysTrsCondition;
import com.company.project.model.CsysTrsConditionExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsConditionMapper extends CommonMapper<CsysTrsCondition> {
    long countByExample(CsysTrsConditionExample example);

    int deleteByExample(CsysTrsConditionExample example);

    List<CsysTrsCondition> selectByExample(CsysTrsConditionExample example);

    int updateByExampleSelective(@Param("record") CsysTrsCondition record, @Param("example") CsysTrsConditionExample example);

    int updateByExample(@Param("record") CsysTrsCondition record, @Param("example") CsysTrsConditionExample example);
}