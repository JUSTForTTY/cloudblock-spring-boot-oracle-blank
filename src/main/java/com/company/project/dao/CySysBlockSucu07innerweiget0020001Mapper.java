package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu07innerweiget0020001;
import com.company.project.model.CySysBlockSucu07innerweiget0020001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu07innerweiget0020001Mapper extends CommonMapper<CySysBlockSucu07innerweiget0020001> {
    long countByExample(CySysBlockSucu07innerweiget0020001Example example);

    int deleteByExample(CySysBlockSucu07innerweiget0020001Example example);

    List<CySysBlockSucu07innerweiget0020001> selectByExampleWithBLOBs(CySysBlockSucu07innerweiget0020001Example example);

    List<CySysBlockSucu07innerweiget0020001> selectByExample(CySysBlockSucu07innerweiget0020001Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu07innerweiget0020001 record, @Param("example") CySysBlockSucu07innerweiget0020001Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu07innerweiget0020001 record, @Param("example") CySysBlockSucu07innerweiget0020001Example example);

    int updateByExample(@Param("record") CySysBlockSucu07innerweiget0020001 record, @Param("example") CySysBlockSucu07innerweiget0020001Example example);
}