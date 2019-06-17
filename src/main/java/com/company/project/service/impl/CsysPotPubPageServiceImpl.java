package com.company.project.service.impl;

import com.company.project.dao.CsysPotPubPageMapper;
import com.company.project.model.CsysPotPubPage;
import com.company.project.service.CsysPotPubPageService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/15.
 */
@Service
@Transactional
public class CsysPotPubPageServiceImpl extends AbstractService<CsysPotPubPage> implements CsysPotPubPageService {
    @Resource
    private CsysPotPubPageMapper csysPotPubPageMapper;

}
