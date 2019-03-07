package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu04weight0030004;
import com.company.project.model.CySysBlockSucu04weight0030004Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu04weight0030004Mapper extends CommonMapper<CySysBlockSucu04weight0030004> {
    long countByExample(CySysBlockSucu04weight0030004Example example);

    int deleteByExample(CySysBlockSucu04weight0030004Example example);

    List<CySysBlockSucu04weight0030004> selectByExampleWithBLOBs(CySysBlockSucu04weight0030004Example example);

    List<CySysBlockSucu04weight0030004> selectByExample(CySysBlockSucu04weight0030004Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu04weight0030004 record, @Param("example") CySysBlockSucu04weight0030004Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu04weight0030004 record, @Param("example") CySysBlockSucu04weight0030004Example example);

    int updateByExample(@Param("record") CySysBlockSucu04weight0030004 record, @Param("example") CySysBlockSucu04weight0030004Example example);
}