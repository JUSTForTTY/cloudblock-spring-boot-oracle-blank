package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu04weight0030007;
import com.company.project.model.CySysBlockSucu04weight0030007Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu04weight0030007Mapper extends CommonMapper<CySysBlockSucu04weight0030007> {
    long countByExample(CySysBlockSucu04weight0030007Example example);

    int deleteByExample(CySysBlockSucu04weight0030007Example example);

    List<CySysBlockSucu04weight0030007> selectByExampleWithBLOBs(CySysBlockSucu04weight0030007Example example);

    List<CySysBlockSucu04weight0030007> selectByExample(CySysBlockSucu04weight0030007Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu04weight0030007 record, @Param("example") CySysBlockSucu04weight0030007Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu04weight0030007 record, @Param("example") CySysBlockSucu04weight0030007Example example);

    int updateByExample(@Param("record") CySysBlockSucu04weight0030007 record, @Param("example") CySysBlockSucu04weight0030007Example example);
}