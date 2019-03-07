package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu07innerweiget0030001;
import com.company.project.model.CySysBlockSucu07innerweiget0030001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu07innerweiget0030001Mapper extends CommonMapper<CySysBlockSucu07innerweiget0030001> {
    long countByExample(CySysBlockSucu07innerweiget0030001Example example);

    int deleteByExample(CySysBlockSucu07innerweiget0030001Example example);

    List<CySysBlockSucu07innerweiget0030001> selectByExampleWithBLOBs(CySysBlockSucu07innerweiget0030001Example example);

    List<CySysBlockSucu07innerweiget0030001> selectByExample(CySysBlockSucu07innerweiget0030001Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu07innerweiget0030001 record, @Param("example") CySysBlockSucu07innerweiget0030001Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu07innerweiget0030001 record, @Param("example") CySysBlockSucu07innerweiget0030001Example example);

    int updateByExample(@Param("record") CySysBlockSucu07innerweiget0030001 record, @Param("example") CySysBlockSucu07innerweiget0030001Example example);
}