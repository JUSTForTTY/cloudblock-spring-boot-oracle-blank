package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu06element0010001;
import com.company.project.model.CySysBlockSucu06element0010001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu06element0010001Mapper extends CommonMapper<CySysBlockSucu06element0010001> {
    long countByExample(CySysBlockSucu06element0010001Example example);

    int deleteByExample(CySysBlockSucu06element0010001Example example);

    List<CySysBlockSucu06element0010001> selectByExampleWithBLOBs(CySysBlockSucu06element0010001Example example);

    List<CySysBlockSucu06element0010001> selectByExample(CySysBlockSucu06element0010001Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu06element0010001 record, @Param("example") CySysBlockSucu06element0010001Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu06element0010001 record, @Param("example") CySysBlockSucu06element0010001Example example);

    int updateByExample(@Param("record") CySysBlockSucu06element0010001 record, @Param("example") CySysBlockSucu06element0010001Example example);
}