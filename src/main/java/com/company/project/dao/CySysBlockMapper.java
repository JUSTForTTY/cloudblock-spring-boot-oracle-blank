package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlock;
import com.company.project.model.CySysBlockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockMapper extends CommonMapper<CySysBlock> {
    long countByExample(CySysBlockExample example);

    int deleteByExample(CySysBlockExample example);

    List<CySysBlock> selectByExampleWithBLOBs(CySysBlockExample example);

    List<CySysBlock> selectByExample(CySysBlockExample example);

    int updateByExampleSelective(@Param("record") CySysBlock record, @Param("example") CySysBlockExample example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlock record, @Param("example") CySysBlockExample example);

    int updateByExample(@Param("record") CySysBlock record, @Param("example") CySysBlockExample example);
}