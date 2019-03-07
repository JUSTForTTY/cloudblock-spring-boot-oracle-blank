package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu09sinnerbutton0010003;
import com.company.project.model.CySysBlockSucu09sinnerbutton0010003Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu09sinnerbutton0010003Mapper extends CommonMapper<CySysBlockSucu09sinnerbutton0010003> {
    long countByExample(CySysBlockSucu09sinnerbutton0010003Example example);

    int deleteByExample(CySysBlockSucu09sinnerbutton0010003Example example);

    List<CySysBlockSucu09sinnerbutton0010003> selectByExampleWithBLOBs(CySysBlockSucu09sinnerbutton0010003Example example);

    List<CySysBlockSucu09sinnerbutton0010003> selectByExample(CySysBlockSucu09sinnerbutton0010003Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu09sinnerbutton0010003 record, @Param("example") CySysBlockSucu09sinnerbutton0010003Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu09sinnerbutton0010003 record, @Param("example") CySysBlockSucu09sinnerbutton0010003Example example);

    int updateByExample(@Param("record") CySysBlockSucu09sinnerbutton0010003 record, @Param("example") CySysBlockSucu09sinnerbutton0010003Example example);
}