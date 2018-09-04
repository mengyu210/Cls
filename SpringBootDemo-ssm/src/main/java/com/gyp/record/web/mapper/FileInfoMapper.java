package com.gyp.record.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gyp.record.web.pojo.FileInfo;

@Mapper
public interface FileInfoMapper {

   public Integer insertFileInfo(FileInfo fileInfo);
   
   public List<FileInfo> queryFileById(FileInfo fileInfo);
   
   public List<FileInfo> queryFileByType(FileInfo fileInfo);
   //分页显示下载文件
   public List<FileInfo> queryFilesByPageDownload(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public List<FileInfo> queryFilesByPageDownloadByName(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="fileName") String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   //分页查看所有文件
   public List<FileInfo> queryFilesByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public List<FileInfo> queryFilesByPageByName(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="fileName") String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   //分页查看视频类型的文件
   public List<FileInfo> queryFilesByPageVedios(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public List<FileInfo> queryFilesByPageVediosByName(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="fileName") String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   //分页查看音频类型的文件
   public List<FileInfo> queryFilesByPageAudios(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public List<FileInfo> queryFilesByPageAudiosByName(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="fileName") String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   //分页查看图片类型的文件
   public List<FileInfo> queryFilesByPagePictures(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public List<FileInfo> queryFilesByPagePicturesByName(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="fileName") String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   //分页查看文档类型的文件 
   public List<FileInfo> queryFilesByPageDocuments(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public List<FileInfo> queryFilesByPageDocumentsByName(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="fileName") String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   
   
   
   
   
   //查询文件数量
   public long getFilesCount(@Param(value="uid")Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public long getFilesCountByName(@Param(value="uid")Integer uid,@Param(value="fileName")String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   //查询视频文件数量
   public long getFilesCountByVedios(@Param(value="uid")Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
 //查询视频文件数量
   public long getFilesCountByVediosByName(@Param(value="uid")Integer uid,@Param(value="fileName")String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   //查询音频文件数量
   public long getFilesCountByAudios(@Param(value="uid")Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public long getFilesCountByAudiosByName(@Param(value="uid")Integer uid,@Param(value="fileName")String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   //查询图片文件数量
   public long getFilesCountByPictures(@Param(value="uid")Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public long getFilesCountByPicturesByName(@Param(value="uid")Integer uid,@Param(value="fileName")String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   //查询文档文件数量
   public long getFilesCountByDocuments(@Param(value="uid")Integer uid,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public long getFilesCountByDocumentsByName(@Param(value="uid")Integer uid,@Param(value="fileName")String fileName,@Param(value="user_school")String user_school,@Param(value="user_class")String user_class);
   
   public List<FileInfo> searchFilesByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="uid") Integer uid,@Param(value="fileName") String fileName);
}
