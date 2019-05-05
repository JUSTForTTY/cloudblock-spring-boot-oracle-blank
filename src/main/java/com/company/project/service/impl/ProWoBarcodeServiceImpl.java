package com.company.project.service.impl;

import com.company.project.dao.ProWoBarcodeMapper;
import com.company.project.model.ProWoBarcode;
import com.company.project.service.ProWoBarcodeService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/05/05.
 */
@Service
@Transactional
public class ProWoBarcodeServiceImpl extends AbstractService<ProWoBarcode> implements ProWoBarcodeService {
    @Resource
    private ProWoBarcodeMapper proWoBarcodeMapper;

}
