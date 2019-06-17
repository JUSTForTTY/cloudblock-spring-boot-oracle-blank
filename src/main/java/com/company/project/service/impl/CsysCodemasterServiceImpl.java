package com.company.project.service.impl;

import com.company.project.dao.CsysCodemasterMapper;
import com.company.project.model.CsysCodemaster;
import com.company.project.service.CsysCodemasterService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/15.
 */
@Service
@Transactional
public class CsysCodemasterServiceImpl extends AbstractService<CsysCodemaster> implements CsysCodemasterService {
    @Resource
    private CsysCodemasterMapper csysCodemasterMapper;

}
