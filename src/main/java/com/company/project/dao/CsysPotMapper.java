package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysPot;
import com.company.project.model.CsysPotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPotMapper extends CommonMapper<CsysPot> {
    long countByExample(CsysPotExample example);

    int deleteByExample(CsysPotExample example);

    List<CsysPot> selectByExample(CsysPotExample example);

    int updateByExampleSelective(@Param("record") CsysPot record, @Param("example") CsysPotExample example);

    int updateByExample(@Param("record") CsysPot record, @Param("example") CsysPotExample example);
}