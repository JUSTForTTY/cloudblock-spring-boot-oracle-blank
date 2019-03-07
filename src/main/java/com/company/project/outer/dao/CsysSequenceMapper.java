package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysSequence;
import com.company.project.outer.model.CsysSequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysSequenceMapper extends CommonMapper<CsysSequence> {
    long countByExample(CsysSequenceExample example);

    int deleteByExample(CsysSequenceExample example);

    List<CsysSequence> selectByExample(CsysSequenceExample example);

    int updateByExampleSelective(@Param("record") CsysSequence record, @Param("example") CsysSequenceExample example);

    int updateByExample(@Param("record") CsysSequence record, @Param("example") CsysSequenceExample example);
}