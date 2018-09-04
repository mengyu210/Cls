package com.gyp.record.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gyp.record.web.pojo.User;
import com.gyp.record.web.service.UserService;

@Controller
public class InformationController {
    
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/updateInfo.action")
	@ResponseBody
	//完善
	public  String updateInformation(HttpServletRequest request,String trueName,String user_age,String user_school,String user_class,String user_address,String id){
		HttpSession session = request.getSession();
		new Integer(id);
		System.out.println(id);
		User user = new User(new Integer(id),trueName,new Integer(user_age),user_school,user_class,user_address);
		System.out.println(user+"user");
		userService.updateUser(user);
		System.out.println(id+"asd");
		User selectUser = userService.selectUser(user);
    	session.setAttribute("user", selectUser);
		return "success";
	}
	
	
	@RequestMapping(value="/modifyInfo.action")
	@ResponseBody
	//修改
    public String modifyInformation(HttpServletRequest request,String id,String userName,String password,String telNumber,String user_sex,String trueName,String user_age,String user_school,String user_class,String user_address){
    	HttpSession session = request.getSession();
		User user =new User(new Integer(id), userName, password, telNumber, trueName, new Integer(user_age), user_school, user_class, user_address, user_sex);
    	userService.modifyUser(user);
    	User selectUser = userService.selectUser(user);
    	session.setAttribute("user", selectUser);
    	return "success";
    }
}
