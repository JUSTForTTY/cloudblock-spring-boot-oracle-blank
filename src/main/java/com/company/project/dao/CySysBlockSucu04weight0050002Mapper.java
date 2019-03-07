package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu04weight0050002;
import com.company.project.model.CySysBlockSucu04weight0050002Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu04weight0050002Mapper extends CommonMapper<CySysBlockSucu04weight0050002> {
    long countByExample(CySysBlockSucu04weight0050002Example example);

    int deleteByExample(CySysBlockSucu04weight0050002Example example);

    List<CySysBlockSucu04weight0050002> selectByExampleWithBLOBs(CySysBlockSucu04weight0050002Example example);

    List<CySysBlockSucu04weight0050002> selectByExample(CySysBlockSucu04weight0050002Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu04weight0050002 record, @Param("example") CySysBlockSucu04weight0050002Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu04weight0050002 record, @Param("example") CySysBlockSucu04weight0050002Example example);

    int updateByExample(@Param("record") CySysBlockSucu04weight0050002 record, @Param("example") CySysBlockSucu04weight0050002Example example);
}