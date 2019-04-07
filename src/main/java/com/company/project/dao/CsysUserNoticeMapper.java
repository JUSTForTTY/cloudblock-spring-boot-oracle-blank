package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysUserNotice;
import com.company.project.model.CsysUserNoticeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysUserNoticeMapper extends CommonMapper<CsysUserNotice> {
    long countByExample(CsysUserNoticeExample example);

    int deleteByExample(CsysUserNoticeExample example);

    List<CsysUserNotice> selectByExample(CsysUserNoticeExample example);

    int updateByExampleSelective(@Param("record") CsysUserNotice record, @Param("example") CsysUserNoticeExample example);

    int updateByExample(@Param("record") CsysUserNotice record, @Param("example") CsysUserNoticeExample example);
}