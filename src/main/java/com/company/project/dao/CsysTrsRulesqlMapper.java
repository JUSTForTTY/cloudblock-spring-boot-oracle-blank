package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysTrsRulesql;
import com.company.project.model.CsysTrsRulesqlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsRulesqlMapper extends CommonMapper<CsysTrsRulesql> {
    long countByExample(CsysTrsRulesqlExample example);

    int deleteByExample(CsysTrsRulesqlExample example);

    List<CsysTrsRulesql> selectByExample(CsysTrsRulesqlExample example);

    int updateByExampleSelective(@Param("record") CsysTrsRulesql record, @Param("example") CsysTrsRulesqlExample example);

    int updateByExample(@Param("record") CsysTrsRulesql record, @Param("example") CsysTrsRulesqlExample example);
}