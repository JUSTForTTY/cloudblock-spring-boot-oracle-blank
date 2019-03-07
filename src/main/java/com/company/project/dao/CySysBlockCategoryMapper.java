package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBlockCategory;
import com.company.project.model.CySysBlockCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBlockCategoryMapper extends CommonMapper<CySysBlockCategory> {
    long countByExample(CySysBlockCategoryExample example);

    int deleteByExample(CySysBlockCategoryExample example);

    List<CySysBlockCategory> selectByExample(CySysBlockCategoryExample example);

    int updateByExampleSelective(@Param("record") CySysBlockCategory record, @Param("example") CySysBlockCategoryExample example);

    int updateByExample(@Param("record") CySysBlockCategory record, @Param("example") CySysBlockCategoryExample example);
}