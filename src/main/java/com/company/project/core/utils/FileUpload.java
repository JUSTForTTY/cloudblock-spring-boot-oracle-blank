package com.company.project.core.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.company.project.core.bean.FileMeta;

@RestController
@RequestMapping({ "/v1" })
public class FileUpload {
	private final Log logger = LogFactory.getLog(getClass());

	/***************************************************
	 * URL: /rest/controller/upload upload(): receives files
	 * 
	 * @param request
	 *            : MultipartHttpServletRequest auto passed
	 * @param response
	 *            : HttpServletResponse auto passed
	 * @return LinkedList<FileMeta> as json format
	 ****************************************************/
	@RequestMapping(value = "/photoUpload", method = RequestMethod.POST)
	public @ResponseBody LinkedList<FileMeta> upload(MultipartHttpServletRequest request,
			HttpServletResponse response) {

		LinkedList<FileMeta> files = new LinkedList<FileMeta>();
		FileMeta fileMeta = null;

		// 1. build an iterator
		Iterator<String> itr = request.getFileNames();
		MultipartFile mpf = null;
		// logger.info("文件" + itr);
		// 2. get each file
		while (itr.hasNext()) {

			// 2.1 get next MultipartFile
			mpf = request.getFile(itr.next());
			String fileName = mpf.getOriginalFilename();
			String floderName = "";
			if (fileName.endsWith("xls") || fileName.endsWith("xlsx")) {
				floderName = "excel";
			} else {
				floderName = "photofiles";
			}

			logger.info(mpf.getOriginalFilename() + " uploaded! " + files.size());

			// 2.2 if files > 10 remove the first from the list
			if (files.size() >= 10)
				files.pop();

			// 2.3 create new fileMeta
			fileMeta = new FileMeta();
			fileMeta.setFileName(mpf.getOriginalFilename());
			fileMeta.setFileSize(mpf.getSize() / 1024 + " Kb");
			fileMeta.setFileType(mpf.getContentType());
			 
			try {
				fileMeta.setBytes(mpf.getBytes());
			    
				File uploadfile = new File(BuildUrlUtils.fileUploadPath+"\\uploadfile\\");
				// 如果文件夹不存在则创建
				if (!uploadfile.exists() && !uploadfile.isDirectory()) {
					logger.info("//uploadfile不存在");
					uploadfile.mkdir();
				} else {
					logger.info("//目录存在");
				}				
				
				File file = new File(BuildUrlUtils.fileUploadPath+"\\uploadfile\\"
						+ floderName + "\\");
				// 如果文件夹不存在则创建
				if (!file.exists() && !file.isDirectory()) {
					logger.info("//不存在");
					file.mkdir();
				} else {
					logger.info("//目录存在");
				}

				logger.info("新文件路径：" + file.getPath()+"\\" + mpf.getOriginalFilename());

				String dateStr=DateUtils.newSimpleDateTime();
				
				fileMeta.setFileUrl("/"+floderName + "/" + dateStr+"-"+fileName);
				// 文件绝对路径
//				fileMeta.setFileAbsolutePath(
//						BuildUrlUtils.projectDomainName + "/" + floderName + "/" + mpf.getOriginalFilename());
				
				FileCopyUtils.copy(mpf.getBytes(), new FileOutputStream(file.getPath() + "\\" +dateStr+"-"+ mpf.getOriginalFilename()));

				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 2.4 add to files
			files.add(fileMeta);
		}
		// result will be like this
		// [{"fileName":"app_engine-85x77.png","fileSize":"8
		// Kb","fileType":"image/png"},...]
		return files;
	}
	/***************************************************
	 * URL: /rest/controller/get/{value} get(): get file as an attachment
	 * 
	 * @param response
	 *            : passed by the server
	 * @param value
	 *            : value from the URL
	 * @return void
	 ****************************************************/

}
