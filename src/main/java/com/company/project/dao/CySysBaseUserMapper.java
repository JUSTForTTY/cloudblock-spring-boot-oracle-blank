package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CySysBaseUser;
import com.company.project.model.CySysBaseUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CySysBaseUserMapper extends CommonMapper<CySysBaseUser> {
    long countByExample(CySysBaseUserExample example);

    int deleteByExample(CySysBaseUserExample example);

    List<CySysBaseUser> selectByExample(CySysBaseUserExample example);

    int updateByExampleSelective(@Param("record") CySysBaseUser record, @Param("example") CySysBaseUserExample example);

    int updateByExample(@Param("record") CySysBaseUser record, @Param("example") CySysBaseUserExample example);
}