package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysLayoutCategory;
import com.company.project.model.CySysLayoutCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysLayoutCategoryMapper extends CommonMapper<CySysLayoutCategory> {
    long countByExample(CySysLayoutCategoryExample example);

    int deleteByExample(CySysLayoutCategoryExample example);

    List<CySysLayoutCategory> selectByExample(CySysLayoutCategoryExample example);

    int updateByExampleSelective(@Param("record") CySysLayoutCategory record, @Param("example") CySysLayoutCategoryExample example);

    int updateByExample(@Param("record") CySysLayoutCategory record, @Param("example") CySysLayoutCategoryExample example);
}