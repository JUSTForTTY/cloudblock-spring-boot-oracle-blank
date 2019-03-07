package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu05button0010008;
import com.company.project.model.CySysBlockSucu05button0010008Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu05button0010008Mapper extends CommonMapper<CySysBlockSucu05button0010008> {
    long countByExample(CySysBlockSucu05button0010008Example example);

    int deleteByExample(CySysBlockSucu05button0010008Example example);

    List<CySysBlockSucu05button0010008> selectByExampleWithBLOBs(CySysBlockSucu05button0010008Example example);

    List<CySysBlockSucu05button0010008> selectByExample(CySysBlockSucu05button0010008Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu05button0010008 record, @Param("example") CySysBlockSucu05button0010008Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu05button0010008 record, @Param("example") CySysBlockSucu05button0010008Example example);

    int updateByExample(@Param("record") CySysBlockSucu05button0010008 record, @Param("example") CySysBlockSucu05button0010008Example example);
}