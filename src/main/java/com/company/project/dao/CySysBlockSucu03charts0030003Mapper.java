package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu03charts0030003;
import com.company.project.model.CySysBlockSucu03charts0030003Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu03charts0030003Mapper extends CommonMapper<CySysBlockSucu03charts0030003> {
    long countByExample(CySysBlockSucu03charts0030003Example example);

    int deleteByExample(CySysBlockSucu03charts0030003Example example);

    List<CySysBlockSucu03charts0030003> selectByExampleWithBLOBs(CySysBlockSucu03charts0030003Example example);

    List<CySysBlockSucu03charts0030003> selectByExample(CySysBlockSucu03charts0030003Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu03charts0030003 record, @Param("example") CySysBlockSucu03charts0030003Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu03charts0030003 record, @Param("example") CySysBlockSucu03charts0030003Example example);

    int updateByExample(@Param("record") CySysBlockSucu03charts0030003 record, @Param("example") CySysBlockSucu03charts0030003Example example);
}