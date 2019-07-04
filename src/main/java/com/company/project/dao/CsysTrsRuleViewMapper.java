package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysTrsRuleView;
import com.company.project.model.CsysTrsRuleViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsRuleViewMapper extends CommonMapper<CsysTrsRuleView> {
    long countByExample(CsysTrsRuleViewExample example);

    int deleteByExample(CsysTrsRuleViewExample example);

    List<CsysTrsRuleView> selectByExample(CsysTrsRuleViewExample example);

    int updateByExampleSelective(@Param("record") CsysTrsRuleView record, @Param("example") CsysTrsRuleViewExample example);

    int updateByExample(@Param("record") CsysTrsRuleView record, @Param("example") CsysTrsRuleViewExample example);
}