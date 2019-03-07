package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu05button0020001;
import com.company.project.model.CySysBlockSucu05button0020001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu05button0020001Mapper extends CommonMapper<CySysBlockSucu05button0020001> {
    long countByExample(CySysBlockSucu05button0020001Example example);

    int deleteByExample(CySysBlockSucu05button0020001Example example);

    List<CySysBlockSucu05button0020001> selectByExampleWithBLOBs(CySysBlockSucu05button0020001Example example);

    List<CySysBlockSucu05button0020001> selectByExample(CySysBlockSucu05button0020001Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu05button0020001 record, @Param("example") CySysBlockSucu05button0020001Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu05button0020001 record, @Param("example") CySysBlockSucu05button0020001Example example);

    int updateByExample(@Param("record") CySysBlockSucu05button0020001 record, @Param("example") CySysBlockSucu05button0020001Example example);
}