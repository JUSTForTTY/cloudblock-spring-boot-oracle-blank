package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysUserRole;
import com.company.project.model.CsysUserRoleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysUserRoleMapper extends CommonMapper<CsysUserRole> {
    long countByExample(CsysUserRoleExample example);

    int deleteByExample(CsysUserRoleExample example);

    List<CsysUserRole> selectByExample(CsysUserRoleExample example);

    int updateByExampleSelective(@Param("record") CsysUserRole record, @Param("example") CsysUserRoleExample example);

    int updateByExample(@Param("record") CsysUserRole record, @Param("example") CsysUserRoleExample example);
}