package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysTrsAuth;
import com.company.project.outer.model.CsysTrsAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsAuthMapper extends CommonMapper<CsysTrsAuth> {
    long countByExample(CsysTrsAuthExample example);

    int deleteByExample(CsysTrsAuthExample example);

    List<CsysTrsAuth> selectByExample(CsysTrsAuthExample example);

    int updateByExampleSelective(@Param("record") CsysTrsAuth record, @Param("example") CsysTrsAuthExample example);

    int updateByExample(@Param("record") CsysTrsAuth record, @Param("example") CsysTrsAuthExample example);
}