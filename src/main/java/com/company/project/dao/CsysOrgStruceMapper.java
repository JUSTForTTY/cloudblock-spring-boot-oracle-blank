package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysOrgStruce;
import com.company.project.outer.model.CsysOrgStruceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysOrgStruceMapper extends CommonMapper<CsysOrgStruce> {
    long countByExample(CsysOrgStruceExample example);

    int deleteByExample(CsysOrgStruceExample example);

    List<CsysOrgStruce> selectByExampleWithBLOBs(CsysOrgStruceExample example);

    List<CsysOrgStruce> selectByExample(CsysOrgStruceExample example);

    int updateByExampleSelective(@Param("record") CsysOrgStruce record, @Param("example") CsysOrgStruceExample example);

    int updateByExampleWithBLOBs(@Param("record") CsysOrgStruce record, @Param("example") CsysOrgStruceExample example);

    int updateByExample(@Param("record") CsysOrgStruce record, @Param("example") CsysOrgStruceExample example);
}