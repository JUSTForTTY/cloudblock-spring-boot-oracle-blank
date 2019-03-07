package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu05button0010006;
import com.company.project.model.CySysBlockSucu05button0010006Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu05button0010006Mapper extends CommonMapper<CySysBlockSucu05button0010006> {
    long countByExample(CySysBlockSucu05button0010006Example example);

    int deleteByExample(CySysBlockSucu05button0010006Example example);

    List<CySysBlockSucu05button0010006> selectByExampleWithBLOBs(CySysBlockSucu05button0010006Example example);

    List<CySysBlockSucu05button0010006> selectByExample(CySysBlockSucu05button0010006Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu05button0010006 record, @Param("example") CySysBlockSucu05button0010006Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu05button0010006 record, @Param("example") CySysBlockSucu05button0010006Example example);

    int updateByExample(@Param("record") CySysBlockSucu05button0010006 record, @Param("example") CySysBlockSucu05button0010006Example example);
}