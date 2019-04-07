package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysRole;
import com.company.project.model.CsysRoleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysRoleMapper extends CommonMapper<CsysRole> {
    long countByExample(CsysRoleExample example);

    int deleteByExample(CsysRoleExample example);

    List<CsysRole> selectByExample(CsysRoleExample example);

    int updateByExampleSelective(@Param("record") CsysRole record, @Param("example") CsysRoleExample example);

    int updateByExample(@Param("record") CsysRole record, @Param("example") CsysRoleExample example);
}