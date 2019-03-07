package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu03charts0010002;
import com.company.project.model.CySysBlockSucu03charts0010002Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu03charts0010002Mapper extends CommonMapper<CySysBlockSucu03charts0010002> {
    long countByExample(CySysBlockSucu03charts0010002Example example);

    int deleteByExample(CySysBlockSucu03charts0010002Example example);

    List<CySysBlockSucu03charts0010002> selectByExampleWithBLOBs(CySysBlockSucu03charts0010002Example example);

    List<CySysBlockSucu03charts0010002> selectByExample(CySysBlockSucu03charts0010002Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu03charts0010002 record, @Param("example") CySysBlockSucu03charts0010002Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu03charts0010002 record, @Param("example") CySysBlockSucu03charts0010002Example example);

    int updateByExample(@Param("record") CySysBlockSucu03charts0010002 record, @Param("example") CySysBlockSucu03charts0010002Example example);
}