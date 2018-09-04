package com.gyp.record.web.controller;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyp.record.util.StringUtil;
import com.gyp.record.util.TimeUtil;
import com.gyp.record.web.pojo.User;
import com.gyp.record.web.service.FileInfoService;
import com.gyp.record.web.service.UserService;

import javassist.bytecode.stackmap.BasicBlock.Catch;


@Controller
public class LoginController {
	 
	 @Autowired
	 private UserService userService;
	 
	 @Autowired
	 private FileInfoService fileInfoService;
	 
	 @RequestMapping(value= {"/","/login"})
	 public String skip() {
		 return "login";
	 }
	
	 @RequestMapping(value="/login.action")
     public void login(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception{
    	 try {
		 HttpSession session = request.getSession();
    	 String userName=request.getParameter("userName");
    	 String password=request.getParameter("password");
    	 String auto=request.getParameter("rememberMe");
    	 System.out.println(auto);
    	 request.setAttribute("userName", userName);
    	 request.setAttribute("password", password);
    	 if(StringUtil.isEmpty(userName)||StringUtil.isEmpty(password)){
		 request.setAttribute("error", "账号或密码不能为空");
		
    	 request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
    	   return;
    	 }	
    	 User user = new User();
    	 user.setUserName(userName);
    	 user.setPassword(password);   	
    	 User currentUser=userService.loginUser(user);	
    	 System.out.println(currentUser);
    	 if(currentUser==null){
				request.setAttribute("error", "用户名或密码错误");
				request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
			}else{
				// 加入登陆日志
				/*Log log = new Log();
				log.setUsername(userName);
				log.setCreatetime(new Date());
				log.setIp(IpUtil.getIpAddr(request));
				log.setOperation("登录");
				logService.insertLog(log);*/
			    if(auto.equals("true")){
			    	// 设置cookie
					Cookie cookie2=new Cookie("pwd",password );
				    Cookie cookie = new Cookie("name",java.net.URLEncoder.encode(userName));
					
					cookie.setMaxAge(3600*24*15);  // cookie时效15天
					cookie2.setMaxAge(3600*24*15);
					response.addCookie(cookie);
					response.addCookie(cookie2);
					System.out.println(cookie.getValue());
					System.out.println(cookie2.getValue());
			    }
			    int uid=currentUser.getId();
				String user_school = currentUser.getUser_school();
				String user_class = currentUser.getUser_class();
				fileInfoService.showFilesByPage(request, model, uid, user_school, user_class);
				session.setAttribute("user", currentUser );
				response.sendRedirect("checkLogin.action");
			}
    	 } catch (Exception e){
    		 System.out.println(e.getMessage());
    		 throw e;
    	 }
    	 
     }
	 
	 @RequestMapping(value="/register.action")
	 public String register(HttpServletRequest request,HttpServletResponse response) throws Exception{
		 
		 try{
		 String userName = request.getParameter("userName");
		 String password = request.getParameter("password");
		 String repassword = request.getParameter("repassword");
		 String telNumber = request.getParameter("telNumber");
		 String sex = request.getParameter("sex");
		 
		 if(password.equals(repassword))
		 {
			 Date date = new Date();
			 String createTime = TimeUtil.formatTime(date, "yyyy-MM-dd HH:mm:ss");
			 User user = new User(userName,password,telNumber,createTime,sex); 
			 Integer registerUser = userService.registerUser(user);
			 if(registerUser!=0){
			 return "login";
			 }
		 }else{
			 request.getRequestDispatcher("WEB-INF/jsp/register.jsp").forward(request, response);
		 }
		 
		   
		 } catch (Exception e){
		 System.out.println(e.getMessage());
		 throw e;
	 }
		return null;
  }
}
