package com.gyp.record.web.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.gyp.record.web.mapper.FileInfoMapper;
import com.gyp.record.web.pojo.FileInfo;
import com.gyp.record.web.pojo.Page;

@Service
public class FileInfoServiceimpl implements FileInfoService {
    
	@Autowired
	FileInfoMapper fileInfoMapper;
	
	

	@Override
	public void insertFileInfo(FileInfo fileInfo) {
		fileInfoMapper.insertFileInfo(fileInfo);
	}



	@Override
	public List<FileInfo> selectFileInfo(FileInfo fileInfo) {
		List<FileInfo> files = fileInfoMapper.queryFileById(fileInfo);
		return files;
	}



	@Override
	public List<FileInfo> selectFileInfoByType(FileInfo fileInfo) {
		List<FileInfo> files = fileInfoMapper.queryFileByType(fileInfo);
		return files;
	}



	@Override
	public void showFilesByPage(HttpServletRequest request, Model model, int uid,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCount(uid,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPage(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPage(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }
	    
	    model.addAttribute("fileInfos", fileInfos);
	    HttpSession session = request.getSession();
	    session.setAttribute("fileInfos1", fileInfos);
	    session.setAttribute("page1", page);
	    model.addAttribute("page", page);
	    System.out.println("111"+fileInfos);
	    
	}
	
	//download 页面
	@Override
	public void showFilesByPageDownload(HttpServletRequest request, Model model, int uid,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCount(uid,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPageDownload(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPageDownload(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    model.addAttribute("page", page);
	    System.out.println(fileInfos);
	    
	    
	}



	@Override
	public void searchFilesByPage(HttpServletRequest request, Model model, int uid, String fileName) {
		/*String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCount(uid);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	        fileInfos = fileInfoMapper.searchFilesByPage(page.getStartPos(), page.getPageSize(), uid, fileName);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.searchFilesByPage(page.getStartPos(), page.getPageSize(), uid, fileName);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    model.addAttribute("page", page);*/
		
	}



	@Override
	public void showFilesByPageVedios(HttpServletRequest request, Model model, int uid,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByVedios(uid,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPageVedios(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPageVedios(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    HttpSession session = request.getSession();
	    session.setAttribute("fileInfos1", fileInfos);
	    session.setAttribute("page1", page);
	    model.addAttribute("page", page);
		
	}



	@Override
	public void showFilesByPageDocuments(HttpServletRequest request, Model model, int uid,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByDocuments(uid,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPageDocuments(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPageDocuments(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    HttpSession session = request.getSession();
	    session.setAttribute("fileInfos1", fileInfos);
	    session.setAttribute("page1", page);
	    model.addAttribute("page", page);
		
	}



	@Override
	public void showFilesByPageAudios(HttpServletRequest request, Model model, int uid,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByAudios(uid,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPageAudios(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPageAudios(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    HttpSession session = request.getSession();
	    session.setAttribute("fileInfos1", fileInfos);
	    session.setAttribute("page1", page);
	    model.addAttribute("page", page);
		
	}



	@Override
	public void showFilesByPagePictures(HttpServletRequest request, Model model, int uid,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByPictures(uid,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPagePictures(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPagePictures(page.getStartPos(), page.getPageSize(), uid,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    HttpSession session = request.getSession();
	    session.setAttribute("fileInfos1", fileInfos);
	    session.setAttribute("page1", page);
	    model.addAttribute("page", page);
		
	}



	@Override
	public void showFilesByPageDownloadByName(HttpServletRequest request, Model model, int uid, String fileName,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByName(uid, fileName,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPageDownloadByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPageDownloadByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    model.addAttribute("page", page);
	    model.addAttribute("fileName", fileName);
	    System.out.println("queryFilesByPageDownloadByName:"+fileInfos);
		
	}



	@Override
	public void showFilesByPagePicturesByName(HttpServletRequest request, Model model, int uid, String fileName,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByPicturesByName(uid, fileName,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPagePicturesByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPagePicturesByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    model.addAttribute("page", page);
	    model.addAttribute("fileName", fileName);
	    System.out.println("queryFilesByPagePicturesByName"+fileInfos);
		
	}



	@Override
	public void showFilesByPageAudiosByName(HttpServletRequest request, Model model, int uid, String fileName,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByAudiosByName(uid, fileName,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPageAudiosByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPageAudiosByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    model.addAttribute("page", page);
	    model.addAttribute("fileName", fileName);
		System.out.println("queryFilesByPageAudiosByName"+fileInfos);
	}



	@Override
	public void showFilesByPageVediosByName(HttpServletRequest request, Model model, int uid, String fileName,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByVediosByName(uid, fileName,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPageVediosByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPageVediosByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    model.addAttribute("page", page);
	    model.addAttribute("fileName", fileName);
		System.out.println("queryFilesByPageVediosByName"+fileInfos);
		
	}



	@Override
	public void showFilesByPageDocumentsByName(HttpServletRequest request, Model model, int uid, String fileName,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByDocumentsByName(uid, fileName,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPageDocumentsByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPageDocumentsByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    model.addAttribute("page", page);
	    model.addAttribute("fileName", fileName);
		
	}



	@Override
	public void showFilesByPageByName(HttpServletRequest request, Model model, int uid, String fileName,String user_school,String user_class) {
		String pageNow=request.getParameter("pageNow");
		Page page=null;
		List<FileInfo> fileInfos = new ArrayList<>();
	    int totalCount=(int) fileInfoMapper.getFilesCountByName(uid, fileName,user_school,user_class);
	    if(pageNow !=null){
	    	page = new Page(totalCount, Integer.parseInt(pageNow)); 
	    	fileInfos=fileInfoMapper.queryFilesByPageByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }else{
	    	page = new Page(totalCount, 1); 
	    	fileInfos=fileInfoMapper.queryFilesByPageByName(page.getStartPos(), page.getPageSize(), uid,fileName,user_school,user_class);
	    }
	    model.addAttribute("fileInfos", fileInfos);
	    model.addAttribute("page", page);
	    model.addAttribute("fileName", fileName);
		
	}

}
