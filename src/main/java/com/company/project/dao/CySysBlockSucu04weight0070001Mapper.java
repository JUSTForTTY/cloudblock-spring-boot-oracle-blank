package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu04weight0070001;
import com.company.project.model.CySysBlockSucu04weight0070001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu04weight0070001Mapper extends CommonMapper<CySysBlockSucu04weight0070001> {
    long countByExample(CySysBlockSucu04weight0070001Example example);

    int deleteByExample(CySysBlockSucu04weight0070001Example example);

    List<CySysBlockSucu04weight0070001> selectByExampleWithBLOBs(CySysBlockSucu04weight0070001Example example);

    List<CySysBlockSucu04weight0070001> selectByExample(CySysBlockSucu04weight0070001Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu04weight0070001 record, @Param("example") CySysBlockSucu04weight0070001Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu04weight0070001 record, @Param("example") CySysBlockSucu04weight0070001Example example);

    int updateByExample(@Param("record") CySysBlockSucu04weight0070001 record, @Param("example") CySysBlockSucu04weight0070001Example example);
}