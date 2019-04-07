package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysUserView;
import com.company.project.model.CsysUserViewExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysUserViewMapper extends CommonMapper<CsysUserView> {
    long countByExample(CsysUserViewExample example);

    int deleteByExample(CsysUserViewExample example);

    List<CsysUserView> selectByExample(CsysUserViewExample example);

    int updateByExampleSelective(@Param("record") CsysUserView record, @Param("example") CsysUserViewExample example);

    int updateByExample(@Param("record") CsysUserView record, @Param("example") CsysUserViewExample example);
}