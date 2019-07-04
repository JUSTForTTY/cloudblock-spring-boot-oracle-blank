package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysTrsRule;
import com.company.project.model.CsysTrsRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsRuleMapper extends CommonMapper<CsysTrsRule> {
    long countByExample(CsysTrsRuleExample example);

    int deleteByExample(CsysTrsRuleExample example);

    List<CsysTrsRule> selectByExample(CsysTrsRuleExample example);

    int updateByExampleSelective(@Param("record") CsysTrsRule record, @Param("example") CsysTrsRuleExample example);

    int updateByExample(@Param("record") CsysTrsRule record, @Param("example") CsysTrsRuleExample example);
}