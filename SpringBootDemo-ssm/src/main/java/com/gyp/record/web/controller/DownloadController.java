package com.gyp.record.web.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gyp.record.web.pojo.User;
import com.gyp.record.web.service.FileInfoService;

@Controller
public class DownloadController {
	
	 @Autowired
     private FileInfoService fileInfoService;
      
	 @RequestMapping(value = "/downLoadFile.action")  
	    public ResponseEntity<byte[]> download(@RequestParam("path") String path) throws IOException {  
	       File file = new File(path);  
	       String name=file.getName();
	       HttpHeaders headers = new HttpHeaders();  
	       String fileName = new String(name.getBytes("UTF-8"), "iso-8859-1");// 为了解决中文名称乱码问题  
	       headers.setContentDispositionFormData("attachment", fileName);  
	       headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);  
	       return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),  
	              headers, HttpStatus.CREATED);  
		
	    }
	    
	    
	    @RequestMapping(value="/showDownloadFilesByName.action")
		public String showdownloadFiles(HttpServletRequest request,Model model){
			User user = (User) request.getSession().getAttribute("user");
			String fileName = request.getParameter("fileName");
			System.out.println(fileName);
			if(user ==null || "".equals(user)){
				return "login";
			}
			int uid=user.getId();
			String user_school = user.getUser_school();
			String user_class = user.getUser_class();
			fileInfoService.showFilesByPageDownload(request, model, uid,user_school,user_class);
			
			return "download";
		}
}
