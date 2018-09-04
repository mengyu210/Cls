package com.gyp.record.web.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.gyp.record.web.pojo.FileInfo;

public interface FileInfoService {
    public List<FileInfo> selectFileInfo(FileInfo fileInfo);
    public List<FileInfo> selectFileInfoByType(FileInfo fileInfo);
    public void insertFileInfo(FileInfo fileInfo);
    
    public void showFilesByPage(HttpServletRequest request,Model model,int uid,String user_school,String user_class);
    
    public void showFilesByPageByName(HttpServletRequest request,Model model,int uid,String fileName,String user_school,String user_class);
    
    public void showFilesByPageDownload(HttpServletRequest request,Model model,int uid,String user_school,String user_class);
    
    public void showFilesByPageDownloadByName(HttpServletRequest request,Model model,int uid,String fileName,String user_school,String user_class);
    
    public void showFilesByPageVedios(HttpServletRequest request,Model model,int uid,String user_school,String user_class);
    
    public void showFilesByPageVediosByName(HttpServletRequest request,Model model,int uid,String fileName,String user_school,String user_class);
    
    public void showFilesByPageDocuments(HttpServletRequest request,Model model,int uid,String user_school,String user_class);
    
    public void showFilesByPageDocumentsByName(HttpServletRequest request,Model model,int uid,String fileName,String user_school,String user_class);
    
    public void showFilesByPageAudios(HttpServletRequest request,Model model,int uid,String user_school,String user_class);
    
    public void showFilesByPageAudiosByName(HttpServletRequest request,Model model,int uid,String fileName,String user_school,String user_class);
    
    public void showFilesByPagePictures(HttpServletRequest request,Model model,int uid,String user_school,String user_class);
    
    public void showFilesByPagePicturesByName(HttpServletRequest request,Model model,int uid,String fileName,String user_school,String user_class);
    
    public void searchFilesByPage(HttpServletRequest request,Model model,int uid,String fileName);
}
