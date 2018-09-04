package com.gyp.record.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gyp.record.web.pojo.User;

@Mapper
public interface UserMapper {
   public User getUserByName(@Param(value="userName")String userName);
   public Integer insertUser(User user);
   public User queryUserByName(User user);
   public void updateUserById(User user);
   public void updateUserAllById(User user);
   public User queryUserById(User user);
}
