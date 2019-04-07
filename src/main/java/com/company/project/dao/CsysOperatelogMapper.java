package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysOperatelog;
import com.company.project.model.CsysOperatelogExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysOperatelogMapper extends CommonMapper<CsysOperatelog> {
    long countByExample(CsysOperatelogExample example);

    int deleteByExample(CsysOperatelogExample example);

    List<CsysOperatelog> selectByExample(CsysOperatelogExample example);

    int updateByExampleSelective(@Param("record") CsysOperatelog record, @Param("example") CsysOperatelogExample example);

    int updateByExample(@Param("record") CsysOperatelog record, @Param("example") CsysOperatelogExample example);
}