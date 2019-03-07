package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu04weight0030005;
import com.company.project.model.CySysBlockSucu04weight0030005Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu04weight0030005Mapper extends CommonMapper<CySysBlockSucu04weight0030005> {
    long countByExample(CySysBlockSucu04weight0030005Example example);

    int deleteByExample(CySysBlockSucu04weight0030005Example example);

    List<CySysBlockSucu04weight0030005> selectByExampleWithBLOBs(CySysBlockSucu04weight0030005Example example);

    List<CySysBlockSucu04weight0030005> selectByExample(CySysBlockSucu04weight0030005Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu04weight0030005 record, @Param("example") CySysBlockSucu04weight0030005Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu04weight0030005 record, @Param("example") CySysBlockSucu04weight0030005Example example);

    int updateByExample(@Param("record") CySysBlockSucu04weight0030005 record, @Param("example") CySysBlockSucu04weight0030005Example example);
}