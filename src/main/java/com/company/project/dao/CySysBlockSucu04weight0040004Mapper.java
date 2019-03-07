package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu04weight0040004;
import com.company.project.model.CySysBlockSucu04weight0040004Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu04weight0040004Mapper extends CommonMapper<CySysBlockSucu04weight0040004> {
    long countByExample(CySysBlockSucu04weight0040004Example example);

    int deleteByExample(CySysBlockSucu04weight0040004Example example);

    List<CySysBlockSucu04weight0040004> selectByExampleWithBLOBs(CySysBlockSucu04weight0040004Example example);

    List<CySysBlockSucu04weight0040004> selectByExample(CySysBlockSucu04weight0040004Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu04weight0040004 record, @Param("example") CySysBlockSucu04weight0040004Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu04weight0040004 record, @Param("example") CySysBlockSucu04weight0040004Example example);

    int updateByExample(@Param("record") CySysBlockSucu04weight0040004 record, @Param("example") CySysBlockSucu04weight0040004Example example);
}