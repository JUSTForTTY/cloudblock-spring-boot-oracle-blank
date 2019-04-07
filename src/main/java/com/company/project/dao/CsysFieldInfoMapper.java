package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysFieldInfo;
import com.company.project.model.CsysFieldInfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysFieldInfoMapper extends CommonMapper<CsysFieldInfo> {
    long countByExample(CsysFieldInfoExample example);

    int deleteByExample(CsysFieldInfoExample example);

    List<CsysFieldInfo> selectByExample(CsysFieldInfoExample example);

    int updateByExampleSelective(@Param("record") CsysFieldInfo record, @Param("example") CsysFieldInfoExample example);

    int updateByExample(@Param("record") CsysFieldInfo record, @Param("example") CsysFieldInfoExample example);
}