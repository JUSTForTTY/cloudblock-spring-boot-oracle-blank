package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysTrsLogPam;
import com.company.project.outer.model.CsysTrsLogPamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsLogPamMapper extends CommonMapper<CsysTrsLogPam> {
    long countByExample(CsysTrsLogPamExample example);

    int deleteByExample(CsysTrsLogPamExample example);

    List<CsysTrsLogPam> selectByExample(CsysTrsLogPamExample example);

    int updateByExampleSelective(@Param("record") CsysTrsLogPam record, @Param("example") CsysTrsLogPamExample example);

    int updateByExample(@Param("record") CsysTrsLogPam record, @Param("example") CsysTrsLogPamExample example);
}