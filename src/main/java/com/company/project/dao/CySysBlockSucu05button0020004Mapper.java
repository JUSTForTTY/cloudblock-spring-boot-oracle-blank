package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu05button0020004;
import com.company.project.model.CySysBlockSucu05button0020004Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu05button0020004Mapper extends CommonMapper<CySysBlockSucu05button0020004> {
    long countByExample(CySysBlockSucu05button0020004Example example);

    int deleteByExample(CySysBlockSucu05button0020004Example example);

    List<CySysBlockSucu05button0020004> selectByExampleWithBLOBs(CySysBlockSucu05button0020004Example example);

    List<CySysBlockSucu05button0020004> selectByExample(CySysBlockSucu05button0020004Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu05button0020004 record, @Param("example") CySysBlockSucu05button0020004Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu05button0020004 record, @Param("example") CySysBlockSucu05button0020004Example example);

    int updateByExample(@Param("record") CySysBlockSucu05button0020004 record, @Param("example") CySysBlockSucu05button0020004Example example);
}