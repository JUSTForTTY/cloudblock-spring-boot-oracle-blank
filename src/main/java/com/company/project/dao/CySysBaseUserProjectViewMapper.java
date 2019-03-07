package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBaseUserProjectView;
import com.company.project.model.CySysBaseUserProjectViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBaseUserProjectViewMapper extends CommonMapper<CySysBaseUserProjectView> {
    long countByExample(CySysBaseUserProjectViewExample example);

    int deleteByExample(CySysBaseUserProjectViewExample example);

    List<CySysBaseUserProjectView> selectByExample(CySysBaseUserProjectViewExample example);

    int updateByExampleSelective(@Param("record") CySysBaseUserProjectView record, @Param("example") CySysBaseUserProjectViewExample example);

    int updateByExample(@Param("record") CySysBaseUserProjectView record, @Param("example") CySysBaseUserProjectViewExample example);
}