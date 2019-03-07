package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysPotTrsCon;
import com.company.project.outer.model.CsysPotTrsConExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPotTrsConMapper extends CommonMapper<CsysPotTrsCon> {
    long countByExample(CsysPotTrsConExample example);

    int deleteByExample(CsysPotTrsConExample example);

    List<CsysPotTrsCon> selectByExample(CsysPotTrsConExample example);

    int updateByExampleSelective(@Param("record") CsysPotTrsCon record, @Param("example") CsysPotTrsConExample example);

    int updateByExample(@Param("record") CsysPotTrsCon record, @Param("example") CsysPotTrsConExample example);
}