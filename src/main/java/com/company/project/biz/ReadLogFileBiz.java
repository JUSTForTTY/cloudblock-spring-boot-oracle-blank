package com.company.project.biz;

import com.company.project.model.CsysUserView;
import org.springframework.web.multipart.MultipartFile;

public interface ReadLogFileBiz {

	void readSNLogFile(CsysUserView baseUserView, MultipartFile snLogFile);

}
