package com.company.project.dao;

import com.company.project.core.mapper.CommonMapper;
import com.company.project.model.CsysPbAssoc;
import com.company.project.model.CsysPbAssocExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsysPbAssocMapper extends CommonMapper<CsysPbAssoc> {
    long countByExample(CsysPbAssocExample example);

    int deleteByExample(CsysPbAssocExample example);

    List<CsysPbAssoc> selectByExample(CsysPbAssocExample example);

    int updateByExampleSelective(@Param("record") CsysPbAssoc record, @Param("example") CsysPbAssocExample example);

    int updateByExample(@Param("record") CsysPbAssoc record, @Param("example") CsysPbAssocExample example);
}