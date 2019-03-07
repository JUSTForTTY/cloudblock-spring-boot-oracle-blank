package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysProjectPublish;
import com.company.project.model.CySysProjectPublishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysProjectPublishMapper extends CommonMapper<CySysProjectPublish> {
    long countByExample(CySysProjectPublishExample example);

    int deleteByExample(CySysProjectPublishExample example);

    List<CySysProjectPublish> selectByExample(CySysProjectPublishExample example);

    int updateByExampleSelective(@Param("record") CySysProjectPublish record, @Param("example") CySysProjectPublishExample example);

    int updateByExample(@Param("record") CySysProjectPublish record, @Param("example") CySysProjectPublishExample example);
}