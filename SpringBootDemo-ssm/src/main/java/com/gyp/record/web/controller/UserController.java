package com.gyp.record.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gyp.record.util.GeneratorValidateCode;

@Controller
public class UserController {
	
	
	
	@RequestMapping(value="/skip.action")
	public String login(){
	   
		return "login";  
		
    }
	
	@RequestMapping(value="/checkLogin.action")
	public String checkLogin()
	{
		
		return "index";
	}
	
	@RequestMapping(value="/checkMain.action")
	public String checkMain(){
		return "main";
	}
	
	@RequestMapping(value="/checkRegister.action")
	public String checkRegister(){
		return "register";
	}
	
	@RequestMapping(value="/showList.action")
	public String showList(){
		return "download";
	}
	
	@RequestMapping(value="/uploadPage.action")
	public String uploadPage(){
		return "upload";
	}
	
	//信息完善
	@RequestMapping(value="/updateInformation.action")
	public String updateInformation(){
		return "updateInformation";
	}
	
	//信息修改
	@RequestMapping(value="/modifyInformation.action")
	public String modifyInformation(){
		return "modifyInformation";
	}
	
	//注销
	@RequestMapping(value="/LogOut.action")
	 public String LogOut(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		session.removeAttribute("name");
		session.removeAttribute("pwd");
		System.out.println(request.getParameter("name"));
		session.invalidate();
		return "login";
	}
	
	@RequestMapping(value="/toSuccess.action")
	public String toSuccess(){
		return "success";
	}
	
	@RequestMapping(value="/toFront.action")
	public String toFront(HttpSession session){
		System.out.println(session.getAttribute("fileInfos1"));
		return "foreground";
	}
}
