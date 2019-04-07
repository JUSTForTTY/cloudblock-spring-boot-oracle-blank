package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysMenuPageView;
import com.company.project.outer.model.CsysMenuPageViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysMenuPageViewMapper extends CommonMapper<CsysMenuPageView> {
    long countByExample(CsysMenuPageViewExample example);

    int deleteByExample(CsysMenuPageViewExample example);

    List<CsysMenuPageView> selectByExample(CsysMenuPageViewExample example);

    int updateByExampleSelective(@Param("record") CsysMenuPageView record, @Param("example") CsysMenuPageViewExample example);

    int updateByExample(@Param("record") CsysMenuPageView record, @Param("example") CsysMenuPageViewExample example);
}