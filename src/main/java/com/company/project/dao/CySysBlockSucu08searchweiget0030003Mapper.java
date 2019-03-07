package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu08searchweiget0030003;
import com.company.project.model.CySysBlockSucu08searchweiget0030003Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu08searchweiget0030003Mapper extends CommonMapper<CySysBlockSucu08searchweiget0030003> {
    long countByExample(CySysBlockSucu08searchweiget0030003Example example);

    int deleteByExample(CySysBlockSucu08searchweiget0030003Example example);

    List<CySysBlockSucu08searchweiget0030003> selectByExampleWithBLOBs(CySysBlockSucu08searchweiget0030003Example example);

    List<CySysBlockSucu08searchweiget0030003> selectByExample(CySysBlockSucu08searchweiget0030003Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu08searchweiget0030003 record, @Param("example") CySysBlockSucu08searchweiget0030003Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu08searchweiget0030003 record, @Param("example") CySysBlockSucu08searchweiget0030003Example example);

    int updateByExample(@Param("record") CySysBlockSucu08searchweiget0030003 record, @Param("example") CySysBlockSucu08searchweiget0030003Example example);
}