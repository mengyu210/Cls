<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge; charset=UTF-8">
<meta name="viewport"
content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>用户信息修改</title>
<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="css/updateInformation.css" />
</head>
<body class="beg-login-bg">
      <div class="beg-login-box">
         <header>
				<h1>用户信息修改</h1>
			</header>
		 <div class="beg-login-main">
      <form action="${pageContext.request.contextPath }/modifyInfo.action" class="layui-form" method="post">
      <input name="id" type="hidden" value="${user.id }" />
      
     <div class="layui-form-item">
				<label class="beg-login-icon">
                       <i class="layui-icon">&#xe612;</i>
                </label>
		<input type="text" name="userName" lay-verify="userName" autocomplete="off" placeholder="这里输入登录名" value="${user.userName }"  class="layui-input">
	</div>
	<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="password" name="password" lay-verify="password" autocomplete="off" placeholder="这里输入密码" value="${user.password }" class="layui-input">
					</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                </label>
				<input type="text" name="telNumber" lay-verify="telNumber" autocomplete="off" placeholder="这里输入电话号码" value="${user.telNumber }"  class="layui-input">
	</div>
	
				
	<%-- <div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe622;</i>
                </label>
				<input type="text" name="createTime" lay-verify="createTime" autocomplete="off" placeholder="这里输入创建时间" value="${user.createTime }" disabled="disabled" class="layui-input">
	</div> --%>
	
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe632;</i>
                </label>
				<input type="text" name="user_sex" lay-verify="sex" autocomplete="off" placeholder="这里输入性别" value="${user.user_sex }"  class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe652;</i>
                </label>
				<input type="text" name="trueName" lay-verify="trueName" autocomplete="off" placeholder="这里输入真实姓名" value="${user.trueName }"  class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe634;</i>
                </label>
				<input type="text" name="user_age" lay-verify="age" autocomplete="off" placeholder="这里输入年龄" value="${user.user_age }"  class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe634;</i>
                </label>
				<input type="text" name="user_school" lay-verify="school" autocomplete="off" placeholder="这里输入用户学校" value="${user.user_school }" class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe634;</i>
                </label>
				<input type="text" name="user_class" lay-verify="user_class" autocomplete="off" placeholder="这里输入用户的班级" value="${user.user_class }" class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe634;</i>
                </label>
				<input type="text" name="user_address" lay-verify="address" autocomplete="off" placeholder="这里输入用户地址" value="${user.user_address }" class="layui-input">
	</div>
	<div class="layui-form-item">
			<div class="beg-pull-left beg-login-remember">
				 <button type="reset" class="layui-btn layui-btn-primary">
						<i class="layui-icon">&#xe600;</i>撤销
				 </button>
			</div>
			<div class="beg-pull-right">
					<button class="layui-btn layui-btn-primary" lay-submit lay-filter="register">
                            <i class="layui-icon">&#xe650;</i> 确认修改
                    </button>
			</div>
						
	</div>
	
	</form>
	  </div>
	</div>
     <script type="text/javascript" src="plugins/layui/layui.js"></script>
		<script>
			layui.use(['layer', 'form'], function() {
				var layer = layui.layer,
					$ = layui.jquery,
					form = layui.form();
				
				form.verify({
					userName: function(value, item){ //value：表单的值、item：表单的DOM对象
					    if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
					        return '用户名不能有特殊字符';
					      }
					      if(/(^\_)|(\__)|(\_+$)/.test(value)){
					        return '用户名首尾不能出现下划线\'_\'';
					      }
					      if(/^\d+\d+\d$/.test(value)){
					        return '用户名不能全为数字';
					      }
					    }
				     ,password: [
                          /^[\S]{6,12}$/
                         ,'密码必须6到12位，且不能出现空格'
				      ]
				     ,telNumber: [/^1[3|4|5|7|8]\d{9}$/, '手机必须11位，只能是数字！']
					 ,age: function(value){
								var reg=/^(1[89])|([2-7][0-9])|(80)$/;
								if(!reg.test(value)){
									return '年龄不在18-80范围';		
								}		
							}
				     ,sex: function(value) {
						var reg=/^['男'|'nv']$/;
						if(!reg.test(value)){
							return '请输入"男"或者"女"';
						    }			
					    }
				});
				
				
			});
		</script>
</body>
</html>