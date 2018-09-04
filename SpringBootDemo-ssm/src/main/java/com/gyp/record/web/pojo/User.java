package com.gyp.record.web.pojo;

import java.util.ArrayList;
import java.util.List;

public class User {
	
   @SuppressWarnings("unused")
   private static final long serialVersionUID=1L;
   //用户ID 
   private Integer id;
   //用户姓名
   private String userName;
   //用户密码
   private String password;
   //用户电话
   private String telNumber;
   //用户真实
   private String trueName;
   //用户创建时间
   private String createTime;
   //用户年龄
   private Integer user_age;
   //用户学校
   private String user_school;
   //用户班级
   private String user_class;
   //用户地址
   private String user_address;
   //用户性别
   private String user_sex;
   
   private List<FileInfo>  fileInfos=new ArrayList<FileInfo>();
   
   
   
   

	public List<FileInfo> getFileInfos() {
	return fileInfos;
}

    public void setFileInfos(List<FileInfo> fileInfos) {
	this.fileInfos = fileInfos;
   }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getUser_age() {
		return user_age;
	}

	public void setUser_age(Integer user_age) {
		this.user_age = user_age;
	}

	public String getUser_school() {
		return user_school;
	}

	public void setUser_school(String user_school) {
		this.user_school = user_school;
	}

	public String getUser_class() {
		return user_class;
	}

	public void setUser_class(String user_class) {
		this.user_class = user_class;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
    
	
	
	public User() {
		
		
	}

	

	public User(Integer id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

	public User(String userName, String password, String telNumber, String createTime, String user_sex) {
		super();
		this.userName = userName;
		this.password = password;
		this.telNumber = telNumber;
		this.createTime = createTime;
		this.user_sex = user_sex;
	}
	

	public User(Integer id, String trueName, Integer user_age, String user_school, String user_class,
			String user_address) {
		super();
		this.id = id;
		this.trueName = trueName;
		this.user_age = user_age;
		this.user_school = user_school;
		this.user_class = user_class;
		this.user_address = user_address;
	}

	public User(Integer id, String username, String password, String telNumber, String trueName, String createTime,
			Integer user_age, String user_school, String user_class, String user_address, String user_sex) {
		super();
		this.id = id;
		this.userName = username;
		this.password = password;
		this.telNumber = telNumber;
		this.trueName = trueName;
		this.createTime = createTime;
		this.user_age = user_age;
		this.user_school = user_school;
		this.user_class = user_class;
		this.user_address = user_address;
		this.user_sex = user_sex;
	}
	

	public User(Integer id, String userName, String password, String telNumber, String trueName, Integer user_age,
			String user_school, String user_class, String user_address, String user_sex) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.telNumber = telNumber;
		this.trueName = trueName;
		this.user_age = user_age;
		this.user_school = user_school;
		this.user_class = user_class;
		this.user_address = user_address;
		this.user_sex = user_sex;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + userName + ", password=" + password + ", telNumber=" + telNumber
				+ ", trueName=" + trueName + ", createTime=" + createTime + ", user_age=" + user_age + ", user_school="
				+ user_school + ", user_class=" + user_class + ", user_address=" + user_address + ", user_sex="
				+ user_sex + "]";
	}
    
	
}
