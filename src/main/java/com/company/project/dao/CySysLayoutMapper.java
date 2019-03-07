package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysLayout;
import com.company.project.model.CySysLayoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysLayoutMapper extends CommonMapper<CySysLayout> {
    long countByExample(CySysLayoutExample example);

    int deleteByExample(CySysLayoutExample example);

    List<CySysLayout> selectByExampleWithBLOBs(CySysLayoutExample example);

    List<CySysLayout> selectByExample(CySysLayoutExample example);

    int updateByExampleSelective(@Param("record") CySysLayout record, @Param("example") CySysLayoutExample example);

    int updateByExampleWithBLOBs(@Param("record") CySysLayout record, @Param("example") CySysLayoutExample example);

    int updateByExample(@Param("record") CySysLayout record, @Param("example") CySysLayoutExample example);
}