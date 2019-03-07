package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu08searchweiget0010001;
import com.company.project.model.CySysBlockSucu08searchweiget0010001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu08searchweiget0010001Mapper extends CommonMapper<CySysBlockSucu08searchweiget0010001> {
    long countByExample(CySysBlockSucu08searchweiget0010001Example example);

    int deleteByExample(CySysBlockSucu08searchweiget0010001Example example);

    List<CySysBlockSucu08searchweiget0010001> selectByExampleWithBLOBs(CySysBlockSucu08searchweiget0010001Example example);

    List<CySysBlockSucu08searchweiget0010001> selectByExample(CySysBlockSucu08searchweiget0010001Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu08searchweiget0010001 record, @Param("example") CySysBlockSucu08searchweiget0010001Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu08searchweiget0010001 record, @Param("example") CySysBlockSucu08searchweiget0010001Example example);

    int updateByExample(@Param("record") CySysBlockSucu08searchweiget0010001 record, @Param("example") CySysBlockSucu08searchweiget0010001Example example);
}