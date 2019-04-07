package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysModule;
import com.company.project.model.CsysModuleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysModuleMapper extends CommonMapper<CsysModule> {
    long countByExample(CsysModuleExample example);

    int deleteByExample(CsysModuleExample example);

    List<CsysModule> selectByExampleWithBLOBs(CsysModuleExample example);

    List<CsysModule> selectByExample(CsysModuleExample example);

    int updateByExampleSelective(@Param("record") CsysModule record, @Param("example") CsysModuleExample example);

    int updateByExampleWithBLOBs(@Param("record") CsysModule record, @Param("example") CsysModuleExample example);

    int updateByExample(@Param("record") CsysModule record, @Param("example") CsysModuleExample example);
}