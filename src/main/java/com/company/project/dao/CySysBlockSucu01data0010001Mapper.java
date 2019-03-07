package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu01data0010001;
import com.company.project.model.CySysBlockSucu01data0010001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu01data0010001Mapper extends CommonMapper<CySysBlockSucu01data0010001> {
    long countByExample(CySysBlockSucu01data0010001Example example);

    int deleteByExample(CySysBlockSucu01data0010001Example example);

    List<CySysBlockSucu01data0010001> selectByExampleWithBLOBs(CySysBlockSucu01data0010001Example example);

    List<CySysBlockSucu01data0010001> selectByExample(CySysBlockSucu01data0010001Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu01data0010001 record, @Param("example") CySysBlockSucu01data0010001Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu01data0010001 record, @Param("example") CySysBlockSucu01data0010001Example example);

    int updateByExample(@Param("record") CySysBlockSucu01data0010001 record, @Param("example") CySysBlockSucu01data0010001Example example);
}