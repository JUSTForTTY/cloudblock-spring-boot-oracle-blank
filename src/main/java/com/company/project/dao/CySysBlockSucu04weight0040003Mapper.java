package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu04weight0040003;
import com.company.project.model.CySysBlockSucu04weight0040003Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu04weight0040003Mapper extends CommonMapper<CySysBlockSucu04weight0040003> {
    long countByExample(CySysBlockSucu04weight0040003Example example);

    int deleteByExample(CySysBlockSucu04weight0040003Example example);

    List<CySysBlockSucu04weight0040003> selectByExampleWithBLOBs(CySysBlockSucu04weight0040003Example example);

    List<CySysBlockSucu04weight0040003> selectByExample(CySysBlockSucu04weight0040003Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu04weight0040003 record, @Param("example") CySysBlockSucu04weight0040003Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu04weight0040003 record, @Param("example") CySysBlockSucu04weight0040003Example example);

    int updateByExample(@Param("record") CySysBlockSucu04weight0040003 record, @Param("example") CySysBlockSucu04weight0040003Example example);
}