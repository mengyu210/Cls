package com.gyp.record.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gyp.record.util.JsonTools;
import com.gyp.record.util.TimeUtil;
import com.gyp.record.web.pojo.FileInfo;
import com.gyp.record.web.pojo.User;
import com.gyp.record.web.service.FileInfoService;

@Controller
public class UploadFileController {
	
	
    private String uploadPath="\\upload\\";
	
    @Autowired
    private FileInfoService fileInfoService;
    //上传文件
	@RequestMapping(value="/uploadFile.action", produces="application/json; charset=utf-8")
	@ResponseBody
	public String uploadFile(HttpServletRequest request,@RequestParam("file") MultipartFile file){
		
		System.out.println("测试上传");
		
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		
		
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			System.out.println("-----++------");
		    String path=request.getSession().getServletContext().getRealPath(uploadPath);
		    
		    String fileName=uploadFile(file, path);
		    System.out.println(path);
		    long fileSize=file.getSize();
		    String name=file.getOriginalFilename();
			String fileType=name.substring(name.lastIndexOf("."));
			Date Time=new Date();
			String uploadTime = TimeUtil.formatTime(Time, "yyyy-MM-dd HH:mm:ss");
			
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			String filePath=path+"\\"+fileName;
			System.out.println(filePath);
		   FileInfo fileInfo = new FileInfo(fileName, fileSize, filePath, fileType, uploadTime, user);
		   fileInfoService.insertFileInfo(fileInfo);
		  
		   
		   map.put("code", 0);
		   map.put("uploadfile",fileName);
		}catch (Exception e){
			map.put("code", 1);
			e.printStackTrace();
		}
		
		return JsonTools.createJsonString(map);
	}
	
	
	public static String uploadFile(MultipartFile file,String path) throws IOException{
		//上传文件的真实名字
		String name=file.getOriginalFilename();
		
		//获取后缀名
		/*String suffixName=name.substring(name.lastIndexOf("."));*/
		//自定义文件名
		/*String hash =Integer.toHexString(new Random().nextInt());*/
		
		String fileName=name;
		File tempFile = new File(path,fileName);
		if(!tempFile.getParentFile().exists()){
			tempFile.getParentFile().mkdir();
		}
		if(tempFile.exists()){
			tempFile.delete();
		}
		tempFile.createNewFile();
		file.transferTo(tempFile);
		
		return tempFile.getName();
	}
}
