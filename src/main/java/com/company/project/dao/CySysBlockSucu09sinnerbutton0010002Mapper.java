package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockSucu09sinnerbutton0010002;
import com.company.project.model.CySysBlockSucu09sinnerbutton0010002Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockSucu09sinnerbutton0010002Mapper extends CommonMapper<CySysBlockSucu09sinnerbutton0010002> {
    long countByExample(CySysBlockSucu09sinnerbutton0010002Example example);

    int deleteByExample(CySysBlockSucu09sinnerbutton0010002Example example);

    List<CySysBlockSucu09sinnerbutton0010002> selectByExampleWithBLOBs(CySysBlockSucu09sinnerbutton0010002Example example);

    List<CySysBlockSucu09sinnerbutton0010002> selectByExample(CySysBlockSucu09sinnerbutton0010002Example example);

    int updateByExampleSelective(@Param("record") CySysBlockSucu09sinnerbutton0010002 record, @Param("example") CySysBlockSucu09sinnerbutton0010002Example example);

    int updateByExampleWithBLOBs(@Param("record") CySysBlockSucu09sinnerbutton0010002 record, @Param("example") CySysBlockSucu09sinnerbutton0010002Example example);

    int updateByExample(@Param("record") CySysBlockSucu09sinnerbutton0010002 record, @Param("example") CySysBlockSucu09sinnerbutton0010002Example example);
}