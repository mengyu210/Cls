package com.gyp.record.web.pojo;

public class FileInfo {
	 @SuppressWarnings("unused")
	private static final long serialVersionUID=1L;
	
	private Integer id;
	//文件名
	private String fileName;
    //文件大小	
	private Long fileSize;
	//文件路径
	private String filePath;
	//文件类型
	private String fileType;
	//更新时间
	private String uploadTime;
	
	private User user;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Long getFileSize() {
		return fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	public FileInfo() {

	}
	
	
	
	
	public FileInfo(String fileName, Long fileSize, String filePath, String fileType, String uploadTime, User user) {
		super();
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.filePath = filePath;
		this.fileType = fileType;
		this.uploadTime = uploadTime;
		this.user = user;
	}
	@Override
	public String toString() {
		return "FileInfo [id=" + id + ", fileName=" + fileName + ", fileSize=" + fileSize + ", filePath=" + filePath
				+ ", fileType=" + fileType + ", uploadTime=" + uploadTime + ", user=" + user + "]";
	}
	
	
}
