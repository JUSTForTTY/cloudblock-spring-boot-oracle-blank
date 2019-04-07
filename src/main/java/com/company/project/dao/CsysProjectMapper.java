package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysProject;
import com.company.project.model.CsysProjectExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysProjectMapper extends CommonMapper<CsysProject> {
    long countByExample(CsysProjectExample example);

    int deleteByExample(CsysProjectExample example);

    List<CsysProject> selectByExample(CsysProjectExample example);

    int updateByExampleSelective(@Param("record") CsysProject record, @Param("example") CsysProjectExample example);

    int updateByExample(@Param("record") CsysProject record, @Param("example") CsysProjectExample example);
}