package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysNoticeTp;
import com.company.project.outer.model.CsysNoticeTpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysNoticeTpMapper extends CommonMapper<CsysNoticeTp> {
    long countByExample(CsysNoticeTpExample example);

    int deleteByExample(CsysNoticeTpExample example);

    List<CsysNoticeTp> selectByExampleWithBLOBs(CsysNoticeTpExample example);

    List<CsysNoticeTp> selectByExample(CsysNoticeTpExample example);

    int updateByExampleSelective(@Param("record") CsysNoticeTp record, @Param("example") CsysNoticeTpExample example);

    int updateByExampleWithBLOBs(@Param("record") CsysNoticeTp record, @Param("example") CsysNoticeTpExample example);

    int updateByExample(@Param("record") CsysNoticeTp record, @Param("example") CsysNoticeTpExample example);
}