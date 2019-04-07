package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysTrsPage;
import com.company.project.outer.model.CsysTrsPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsPageMapper extends CommonMapper<CsysTrsPage> {
    long countByExample(CsysTrsPageExample example);

    int deleteByExample(CsysTrsPageExample example);

    List<CsysTrsPage> selectByExample(CsysTrsPageExample example);

    int updateByExampleSelective(@Param("record") CsysTrsPage record, @Param("example") CsysTrsPageExample example);

    int updateByExample(@Param("record") CsysTrsPage record, @Param("example") CsysTrsPageExample example);
}