package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysPage;
import com.company.project.outer.model.CsysPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPageMapper extends CommonMapper<CsysPage> {
    long countByExample(CsysPageExample example);

    int deleteByExample(CsysPageExample example);

    List<CsysPage> selectByExampleWithBLOBs(CsysPageExample example);

    List<CsysPage> selectByExample(CsysPageExample example);

    int updateByExampleSelective(@Param("record") CsysPage record, @Param("example") CsysPageExample example);

    int updateByExampleWithBLOBs(@Param("record") CsysPage record, @Param("example") CsysPageExample example);

    int updateByExample(@Param("record") CsysPage record, @Param("example") CsysPageExample example);
}