package com.gyp.record.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyp.record.web.pojo.User;
import com.gyp.record.web.service.FileInfoService;

@Controller
public class ListFilesController {
	
	@Autowired
    private FileInfoService fileInfoService;
	
	
	@RequestMapping(value="/showDownloadFiles.action")
	public String showdownloadFiles(HttpServletRequest request,Model model){
		User user = (User) request.getSession().getAttribute("user");
		String fileName = request.getParameter("fileName");
		System.out.println(fileName+"---------------------");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPageDownload(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPageDownloadByName(request, model, uid, fileName,user_school,user_class);
		}
		
		
		return "download";
	}
	
	@RequestMapping(value="/showFiles.action")
	public String showFiles(HttpServletRequest request,Model model){
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPage(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPageByName(request, model, uid, fileName,user_school,user_class);
		}
		
		
		return "allFiles";
	}
	
	@RequestMapping(value="/showFilesFront.action")
	public String showFilesFront(HttpServletRequest request,Model model){
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPage(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPageByName(request, model, uid, fileName,user_school,user_class);
		}
		
		
		return "foreground";
	}
	
	
	@RequestMapping(value="/showVediosFront.action")
	public String showVediosFront(HttpServletRequest request,Model model){
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPageVedios(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPageVediosByName(request, model, uid, fileName,user_school,user_class);
		}
		
		
		return "foregroundVedios";
	}
	
	
	@RequestMapping(value="/showAudiosFront.action")
	public String showAudiosFront(HttpServletRequest request,Model model){
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPageAudios(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPageAudiosByName(request, model, uid, fileName,user_school,user_class);
		}
		
		
		return "foregroundAudios";
	}
	
	@RequestMapping(value="/showPictureFront.action")
	public String showPictureFront(HttpServletRequest request,Model model){
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPagePictures(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPagePicturesByName(request, model, uid, fileName,user_school,user_class);
		}
		return "foregroundPicture";
	}
	
	
	@RequestMapping(value="/showDocumentsFront.action")
	public String showDocumentsFront(HttpServletRequest request,Model model){
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPageDocuments(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPageDocumentsByName(request, model, uid, fileName,user_school,user_class);
		}
		return "foregroundDocuments";
	}
	
	
	
	
    
	@RequestMapping(value="/showFilevedios.action")
	public String showFileVedios(HttpServletRequest request,Model model){
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPageVedios(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPageVediosByName(request, model, uid, fileName,user_school,user_class);
		}
		
		
		return "vedios";
	}
	
	@RequestMapping(value="/showFileDocuments.action")
	public String showFileDocuments(HttpServletRequest request,Model model){
		String pageNow=request.getParameter("pageNow");
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPageDocuments(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPageDocumentsByName(request, model, uid, fileName,user_school,user_class);
		}
			
		
		
		return "documents";
	}
	
	
	@RequestMapping(value="/showFileAudios.action")
	public String showFileAudios(HttpServletRequest request,Model model){
		String pageNow=request.getParameter("pageNow");
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPageAudios(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPageAudiosByName(request, model, uid, fileName,user_school,user_class);
		}
		
		
		return "audios";
	}
	
	@RequestMapping(value="/showFilePictures.action")
	public String showFilePictures(HttpServletRequest request,Model model){
		String pageNow=request.getParameter("pageNow");
		String fileName = request.getParameter("fileName");
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		String user_school = user.getUser_school();
		String user_class = user.getUser_class();
		if(fileName == null || "".equals(fileName)){
			fileInfoService.showFilesByPagePictures(request, model, uid,user_school,user_class);
		}else{
			fileInfoService.showFilesByPagePicturesByName(request, model, uid, fileName,user_school,user_class);
		}
		
		
		return "picture";
	}
	
	
	public String searchForFileInfos(HttpServletRequest request,Model model,String fileName){
		User user = (User) request.getSession().getAttribute("user");
		if(user ==null || "".equals(user)){
			return "login";
		}
		int uid=user.getId();
		
		fileInfoService.searchFilesByPage(request, model, uid, fileName);
		return "";
	}
}
