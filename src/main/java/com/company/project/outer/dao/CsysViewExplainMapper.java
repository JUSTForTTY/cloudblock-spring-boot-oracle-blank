package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysViewExplain;
import com.company.project.outer.model.CsysViewExplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysViewExplainMapper extends CommonMapper<CsysViewExplain> {
    long countByExample(CsysViewExplainExample example);

    int deleteByExample(CsysViewExplainExample example);

    List<CsysViewExplain> selectByExample(CsysViewExplainExample example);

    int updateByExampleSelective(@Param("record") CsysViewExplain record, @Param("example") CsysViewExplainExample example);

    int updateByExample(@Param("record") CsysViewExplain record, @Param("example") CsysViewExplainExample example);
}