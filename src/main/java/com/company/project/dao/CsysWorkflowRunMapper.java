package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysWorkflowRun;
import com.company.project.outer.model.CsysWorkflowRunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysWorkflowRunMapper extends CommonMapper<CsysWorkflowRun> {
    long countByExample(CsysWorkflowRunExample example);

    int deleteByExample(CsysWorkflowRunExample example);

    List<CsysWorkflowRun> selectByExample(CsysWorkflowRunExample example);

    int updateByExampleSelective(@Param("record") CsysWorkflowRun record, @Param("example") CsysWorkflowRunExample example);

    int updateByExample(@Param("record") CsysWorkflowRun record, @Param("example") CsysWorkflowRunExample example);
}