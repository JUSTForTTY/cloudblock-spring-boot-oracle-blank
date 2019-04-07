package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysMenu;
import com.company.project.model.CsysMenuExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysMenuMapper extends CommonMapper<CsysMenu> {
    long countByExample(CsysMenuExample example);

    int deleteByExample(CsysMenuExample example);

    List<CsysMenu> selectByExample(CsysMenuExample example);

    int updateByExampleSelective(@Param("record") CsysMenu record, @Param("example") CsysMenuExample example);

    int updateByExample(@Param("record") CsysMenu record, @Param("example") CsysMenuExample example);
}