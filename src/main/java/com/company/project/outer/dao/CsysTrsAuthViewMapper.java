package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysTrsAuthView;
import com.company.project.outer.model.CsysTrsAuthViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysTrsAuthViewMapper extends CommonMapper<CsysTrsAuthView> {
    long countByExample(CsysTrsAuthViewExample example);

    int deleteByExample(CsysTrsAuthViewExample example);

    List<CsysTrsAuthView> selectByExample(CsysTrsAuthViewExample example);

    int updateByExampleSelective(@Param("record") CsysTrsAuthView record, @Param("example") CsysTrsAuthViewExample example);

    int updateByExample(@Param("record") CsysTrsAuthView record, @Param("example") CsysTrsAuthViewExample example);
}