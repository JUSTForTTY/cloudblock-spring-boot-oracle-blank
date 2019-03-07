package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu05button0030001;
import com.company.project.model.CySysBlockSucu05button0030001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu05button0030001Mapper extends CommonMapper<CySysBlockSucu05button0030001> {
    long countByExample(CySysBlockSucu05button0030001Example example);

    int deleteByExample(CySysBlockSucu05button0030001Example example);

    List<CySysBlockSucu05button0030001> selectByExampleWithBLOBs(CySysBlockSucu05button0030001Example example);

    List<CySysBlockSucu05button0030001> selectByExample(CySysBlockSucu05button0030001Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu05button0030001 record, @Param("example") CySysBlockSucu05button0030001Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu05button0030001 record, @Param("example") CySysBlockSucu05button0030001Example example);

    int updateByExample(@Param("record") CySysBlockSucu05button0030001 record, @Param("example") CySysBlockSucu05button0030001Example example);
}