package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysWorkflow;
import com.company.project.model.CsysWorkflowExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysWorkflowMapper extends CommonMapper<CsysWorkflow> {
    long countByExample(CsysWorkflowExample example);

    int deleteByExample(CsysWorkflowExample example);

    List<CsysWorkflow> selectByExampleWithBLOBs(CsysWorkflowExample example);

    List<CsysWorkflow> selectByExample(CsysWorkflowExample example);

    int updateByExampleSelective(@Param("record") CsysWorkflow record, @Param("example") CsysWorkflowExample example);

    int updateByExampleWithBLOBs(@Param("record") CsysWorkflow record, @Param("example") CsysWorkflowExample example);

    int updateByExample(@Param("record") CsysWorkflow record, @Param("example") CsysWorkflowExample example);
}