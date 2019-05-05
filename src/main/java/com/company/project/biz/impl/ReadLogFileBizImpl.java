package com.company.project.biz.impl;

import com.company.project.biz.BarcodeGroupBiz;
import com.company.project.biz.ProWoBarcodeBiz;
import com.company.project.biz.ReadLogFileBiz;
import com.company.project.model.BarcodeGroup;
import com.company.project.model.CsysUserView;
import com.company.project.model.ProWoBarcode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by tty on 2018/08/27.
 */
@Component
@Transactional
public class ReadLogFileBizImpl implements ReadLogFileBiz {

	private final Log logger = LogFactory.getLog(getClass());

	@Resource
    ProWoBarcodeBiz proWoBarcodeBiz;

	@Resource
    BarcodeGroupBiz barcodeGroupBiz;

	@Override
	public void readSNLogFile(CsysUserView baseUserView, MultipartFile snLogFile) {
		BufferedReader reader = null;
		String[] snArray;
		ProWoBarcode barcode = new ProWoBarcode();
		BarcodeGroup group = new BarcodeGroup();
		try {
			reader = new BufferedReader(new InputStreamReader(snLogFile.getInputStream()));
			String text = null;
			while ((text = reader.readLine()) != null) {
				text = text.substring(text.indexOf("SN:") + 3, text.length());
				// 切割;和,字符
				snArray = text.split("[;\\,]");
				for (int i = 0; i < snArray.length; i++) {
					logger.info("输出：" + snArray[i]);

					barcode.setProBarCode(snArray[i]);
					proWoBarcodeBiz.insertDataSettings(baseUserView, barcode);

					group.setProBarCode(snArray[i]);
					group.setBarcodeGroupCode(snArray[0]);
					group.setGroupType("0");
					barcodeGroupBiz.insertDataSettings(baseUserView, group);
				}
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
