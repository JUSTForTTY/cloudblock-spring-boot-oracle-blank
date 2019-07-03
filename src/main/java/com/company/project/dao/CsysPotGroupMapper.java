package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysPotGroup;
import com.company.project.model.CsysPotGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPotGroupMapper extends CommonMapper<CsysPotGroup> {
    long countByExample(CsysPotGroupExample example);

    int deleteByExample(CsysPotGroupExample example);

    List<CsysPotGroup> selectByExample(CsysPotGroupExample example);

    int updateByExampleSelective(@Param("record") CsysPotGroup record, @Param("example") CsysPotGroupExample example);

    int updateByExample(@Param("record") CsysPotGroup record, @Param("example") CsysPotGroupExample example);
}