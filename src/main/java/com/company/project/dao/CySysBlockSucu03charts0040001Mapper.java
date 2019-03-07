package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu03charts0040001;
import com.company.project.model.CySysBlockSucu03charts0040001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu03charts0040001Mapper extends CommonMapper<CySysBlockSucu03charts0040001> {
    long countByExample(CySysBlockSucu03charts0040001Example example);

    int deleteByExample(CySysBlockSucu03charts0040001Example example);

    List<CySysBlockSucu03charts0040001> selectByExampleWithBLOBs(CySysBlockSucu03charts0040001Example example);

    List<CySysBlockSucu03charts0040001> selectByExample(CySysBlockSucu03charts0040001Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu03charts0040001 record, @Param("example") CySysBlockSucu03charts0040001Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu03charts0040001 record, @Param("example") CySysBlockSucu03charts0040001Example example);

    int updateByExample(@Param("record") CySysBlockSucu03charts0040001 record, @Param("example") CySysBlockSucu03charts0040001Example example);
}