package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysProject;
import com.company.project.model.CySysProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysProjectMapper extends CommonMapper<CySysProject> {
    long countByExample(CySysProjectExample example);

    int deleteByExample(CySysProjectExample example);

    List<CySysProject> selectByExample(CySysProjectExample example);

    int updateByExampleSelective(@Param("record") CySysProject record, @Param("example") CySysProjectExample example);

    int updateByExample(@Param("record") CySysProject record, @Param("example") CySysProjectExample example);
}