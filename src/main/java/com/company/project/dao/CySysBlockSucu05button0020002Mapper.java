package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu05button0020002;
import com.company.project.model.CySysBlockSucu05button0020002Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu05button0020002Mapper extends CommonMapper<CySysBlockSucu05button0020002> {
    long countByExample(CySysBlockSucu05button0020002Example example);

    int deleteByExample(CySysBlockSucu05button0020002Example example);

    List<CySysBlockSucu05button0020002> selectByExampleWithBLOBs(CySysBlockSucu05button0020002Example example);

    List<CySysBlockSucu05button0020002> selectByExample(CySysBlockSucu05button0020002Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu05button0020002 record, @Param("example") CySysBlockSucu05button0020002Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu05button0020002 record, @Param("example") CySysBlockSucu05button0020002Example example);

    int updateByExample(@Param("record") CySysBlockSucu05button0020002 record, @Param("example") CySysBlockSucu05button0020002Example example);
}