package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysTrsRuledl;
import com.company.project.model.CsysTrsRuledlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsRuledlMapper extends CommonMapper<CsysTrsRuledl> {
    long countByExample(CsysTrsRuledlExample example);

    int deleteByExample(CsysTrsRuledlExample example);

    List<CsysTrsRuledl> selectByExample(CsysTrsRuledlExample example);

    int updateByExampleSelective(@Param("record") CsysTrsRuledl record, @Param("example") CsysTrsRuledlExample example);

    int updateByExample(@Param("record") CsysTrsRuledl record, @Param("example") CsysTrsRuledlExample example);
}