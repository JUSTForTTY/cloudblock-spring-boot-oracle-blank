package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysMenuAuthView;
import com.company.project.model.CsysMenuAuthViewExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysMenuAuthViewMapper extends CommonMapper<CsysMenuAuthView> {
    long countByExample(CsysMenuAuthViewExample example);

    int deleteByExample(CsysMenuAuthViewExample example);

    List<CsysMenuAuthView> selectByExample(CsysMenuAuthViewExample example);

    int updateByExampleSelective(@Param("record") CsysMenuAuthView record, @Param("example") CsysMenuAuthViewExample example);

    int updateByExample(@Param("record") CsysMenuAuthView record, @Param("example") CsysMenuAuthViewExample example);
}