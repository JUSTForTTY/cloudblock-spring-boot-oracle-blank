package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysMenuAuth;
import com.company.project.outer.model.CsysMenuAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysMenuAuthMapper extends CommonMapper<CsysMenuAuth> {
    long countByExample(CsysMenuAuthExample example);

    int deleteByExample(CsysMenuAuthExample example);

    List<CsysMenuAuth> selectByExample(CsysMenuAuthExample example);

    int updateByExampleSelective(@Param("record") CsysMenuAuth record, @Param("example") CsysMenuAuthExample example);

    int updateByExample(@Param("record") CsysMenuAuth record, @Param("example") CsysMenuAuthExample example);
}