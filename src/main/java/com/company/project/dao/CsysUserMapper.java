package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysUser;
import com.company.project.model.CsysUserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysUserMapper extends CommonMapper<CsysUser> {
    long countByExample(CsysUserExample example);

    int deleteByExample(CsysUserExample example);

    List<CsysUser> selectByExample(CsysUserExample example);

    int updateByExampleSelective(@Param("record") CsysUser record, @Param("example") CsysUserExample example);

    int updateByExample(@Param("record") CsysUser record, @Param("example") CsysUserExample example);
}