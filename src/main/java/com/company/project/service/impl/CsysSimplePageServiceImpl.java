package com.company.project.service.impl;

import com.company.project.dao.CsysSimplePageMapper;
import com.company.project.model.CsysSimplePage;
import com.company.project.service.CsysSimplePageService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/14.
 */
@Service
@Transactional
public class CsysSimplePageServiceImpl extends AbstractService<CsysSimplePage> implements CsysSimplePageService {
    @Resource
    private CsysSimplePageMapper csysSimplePageMapper;

}
