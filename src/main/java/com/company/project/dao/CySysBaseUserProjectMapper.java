package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBaseUserProject;
import com.company.project.model.CySysBaseUserProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBaseUserProjectMapper extends CommonMapper<CySysBaseUserProject> {
    long countByExample(CySysBaseUserProjectExample example);

    int deleteByExample(CySysBaseUserProjectExample example);

    List<CySysBaseUserProject> selectByExample(CySysBaseUserProjectExample example);

    int updateByExampleSelective(@Param("record") CySysBaseUserProject record, @Param("example") CySysBaseUserProjectExample example);

    int updateByExample(@Param("record") CySysBaseUserProject record, @Param("example") CySysBaseUserProjectExample example);
}