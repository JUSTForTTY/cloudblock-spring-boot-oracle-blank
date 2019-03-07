package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu07innerweiget0010003;
import com.company.project.model.CySysBlockSucu07innerweiget0010003Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu07innerweiget0010003Mapper extends CommonMapper<CySysBlockSucu07innerweiget0010003> {
    long countByExample(CySysBlockSucu07innerweiget0010003Example example);

    int deleteByExample(CySysBlockSucu07innerweiget0010003Example example);

    List<CySysBlockSucu07innerweiget0010003> selectByExampleWithBLOBs(CySysBlockSucu07innerweiget0010003Example example);

    List<CySysBlockSucu07innerweiget0010003> selectByExample(CySysBlockSucu07innerweiget0010003Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu07innerweiget0010003 record, @Param("example") CySysBlockSucu07innerweiget0010003Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu07innerweiget0010003 record, @Param("example") CySysBlockSucu07innerweiget0010003Example example);

    int updateByExample(@Param("record") CySysBlockSucu07innerweiget0010003 record, @Param("example") CySysBlockSucu07innerweiget0010003Example example);
}