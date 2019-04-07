package com.company.project.outer.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.outer.model.CsysNotice;
import com.company.project.outer.model.CsysNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysNoticeMapper extends CommonMapper<CsysNotice> {
    long countByExample(CsysNoticeExample example);

    int deleteByExample(CsysNoticeExample example);

    List<CsysNotice> selectByExampleWithBLOBs(CsysNoticeExample example);

    List<CsysNotice> selectByExample(CsysNoticeExample example);

    int updateByExampleSelective(@Param("record") CsysNotice record, @Param("example") CsysNoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") CsysNotice record, @Param("example") CsysNoticeExample example);

    int updateByExample(@Param("record") CsysNotice record, @Param("example") CsysNoticeExample example);
}