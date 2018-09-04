package com.gyp.record.web.service;

import com.gyp.record.web.pojo.User;

public interface UserService {
	public User getUserByName(String userName);
    public User loginUser(User user);
    public User selectUser(User user);
    public Integer registerUser(User user);
    public void updateUser(User user);
    public void modifyUser(User user);
}
