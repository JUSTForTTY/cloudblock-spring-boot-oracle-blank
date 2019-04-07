package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysPotPublic;
import com.company.project.model.CsysPotPublicExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPotPublicMapper extends CommonMapper<CsysPotPublic> {
    long countByExample(CsysPotPublicExample example);

    int deleteByExample(CsysPotPublicExample example);

    List<CsysPotPublic> selectByExample(CsysPotPublicExample example);

    int updateByExampleSelective(@Param("record") CsysPotPublic record, @Param("example") CsysPotPublicExample example);

    int updateByExample(@Param("record") CsysPotPublic record, @Param("example") CsysPotPublicExample example);
}