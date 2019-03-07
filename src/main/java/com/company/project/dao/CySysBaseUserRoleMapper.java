package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBaseUserRole;
import com.company.project.model.CySysBaseUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBaseUserRoleMapper extends CommonMapper<CySysBaseUserRole> {
    long countByExample(CySysBaseUserRoleExample example);

    int deleteByExample(CySysBaseUserRoleExample example);

    List<CySysBaseUserRole> selectByExample(CySysBaseUserRoleExample example);

    int updateByExampleSelective(@Param("record") CySysBaseUserRole record, @Param("example") CySysBaseUserRoleExample example);

    int updateByExample(@Param("record") CySysBaseUserRole record, @Param("example") CySysBaseUserRoleExample example);
}