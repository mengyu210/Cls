package com.gyp.record.web.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gyp.record.web.mapper.UserMapper;
import com.gyp.record.web.pojo.User;

@Service
public class UserServiceimpl implements UserService{
	 
	
	 
	 @Autowired
	 UserMapper userMapper;
	
     public User loginUser(User user){
    	 
         User user2 = userMapper.queryUserByName(user);     
         return user2;
     }

	@Override
	public Integer registerUser(User user) {
		Integer insertUser = userMapper.insertUser(user);
		
		return insertUser;
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUserById(user);
		
	}

	@Override
	public void modifyUser(User user) {
		userMapper.updateUserAllById(user);
		
	}

	@Override
	public User selectUser(User user) {
		
		return userMapper.queryUserById(user);
	}

	@Override
	public User getUserByName(String userName) {
		System.out.println("service");
		return userMapper.getUserByName(userName);
	}
}
