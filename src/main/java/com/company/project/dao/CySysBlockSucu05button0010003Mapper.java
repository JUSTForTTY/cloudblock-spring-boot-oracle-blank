package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu05button0010003;
import com.company.project.model.CySysBlockSucu05button0010003Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu05button0010003Mapper extends CommonMapper<CySysBlockSucu05button0010003> {
    long countByExample(CySysBlockSucu05button0010003Example example);

    int deleteByExample(CySysBlockSucu05button0010003Example example);

    List<CySysBlockSucu05button0010003> selectByExampleWithBLOBs(CySysBlockSucu05button0010003Example example);

    List<CySysBlockSucu05button0010003> selectByExample(CySysBlockSucu05button0010003Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu05button0010003 record, @Param("example") CySysBlockSucu05button0010003Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu05button0010003 record, @Param("example") CySysBlockSucu05button0010003Example example);

    int updateByExample(@Param("record") CySysBlockSucu05button0010003 record, @Param("example") CySysBlockSucu05button0010003Example example);
}