package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysPotStyle;
import com.company.project.model.CsysPotStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPotStyleMapper extends CommonMapper<CsysPotStyle> {
    long countByExample(CsysPotStyleExample example);

    int deleteByExample(CsysPotStyleExample example);

    List<CsysPotStyle> selectByExample(CsysPotStyleExample example);

    int updateByExampleSelective(@Param("record") CsysPotStyle record, @Param("example") CsysPotStyleExample example);

    int updateByExample(@Param("record") CsysPotStyle record, @Param("example") CsysPotStyleExample example);
}