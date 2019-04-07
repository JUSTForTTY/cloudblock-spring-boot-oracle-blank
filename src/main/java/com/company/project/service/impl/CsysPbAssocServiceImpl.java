package com.company.project.service.impl;

import com.company.project.service.CsysPbAssocService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysPbAssocMapper;
import com.company.project.model.CsysPbAssoc;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysPbAssocServiceImpl extends AbstractService<CsysPbAssoc> implements CsysPbAssocService {
    @Resource
    private CsysPbAssocMapper csysPbAssocMapper;

}
