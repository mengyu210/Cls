<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge; charset=UTF-8">
<meta name="viewport"
content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>信息完善</title>

<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="css/updateInformation.css" />
</head>
<body class="beg-login-bg">
      <div class="beg-login-box">
         <header>
				<h1>用户信息完善</h1>
			</header>
		 <div class="beg-login-main">
      <form action="${pageContext.request.contextPath }/updateInfo.action" class="layui-form" method="post">
      <input name="id" type="hidden" value="${user.id }" />
      
     <div class="layui-form-item">
				<label class="beg-login-icon">
                       <i class="layui-icon">&#xe612;</i>
                </label>
		<input type="text" name="userName" lay-verify="userName" autocomplete="off" placeholder="这里输入登录名" value="${user.userName }" disabled="disabled" class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                </label>
				<input type="text" name="telNumber" lay-verify="telNumber" autocomplete="off" placeholder="这里输入电话号码" value="${user.telNumber }" disabled="disabled" class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe622;</i>
                </label>
				<input type="text" name="createTime" lay-verify="createTime" autocomplete="off" placeholder="这里输入创建时间" value="${user.createTime }" disabled="disabled" class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe632;</i>
                </label>
				<input type="text" name="user_sex" lay-verify="sex" autocomplete="off" placeholder="这里输入性别" value="${user.user_sex }" disabled="disabled" class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe652;</i>
                </label>
				<input type="text" name="trueName" lay-verify="trueName" autocomplete="off" placeholder="这里输入真实姓名" value="${user.trueName }" class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe634;</i>
                </label>
				<input type="text" name="user_age" lay-verify="age" autocomplete="off" placeholder="这里输入年龄" value="${user.user_age }" class="layui-input">
	</div>
	<div class="layui-form-item">
				<label class="beg-login-icon">
                        <i class="layui-icon">&#xe634;</i>
                </label>
				<input type="text" id="school" name="user_school" lay-verify="school" autocomplete="off" placeholder="这里输入用户学校" value="${user.user_school }" class="layui-input">
	            	
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
					<button class="layui-btn layui-btn-primary" lay-submit lay-filter="update">
                            <i class="layui-icon">&#xe650;</i> 保存
                    </button>
			</div>
						
	</div>
	
	</form>
	  </div>
	</div>
	 <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
     <script type="text/javascript" src="plugins/layui/layui.js"></script>
		<script>
			layui.use(['layer', 'form'], function() {
				var layer = layui.layer,
					$ = layui.jquery,
					form = layui.form();
				
				form.verify({
					age: function(value){
						var reg=/^(1[89])|([2-7][0-9])|(80)$/;
						if(!reg.test(value)){
							return '年龄不在18-80范围';				
						}	
					}	
				});
				
				 /* form.on('submit(update)',function(data){
					 alert("12356");
					 $.ajax({
						type: "post",
						url: '${pageContext.request.contextPath }/updateInfo.action?',
						contentType: "application/json",
						date:date,
						dataType: "json",
						success: function (data)
                     {
                          alert("success");
	                  }
					 });
					 
				return false; 
				});   */ 
			});
		</script>
</body>
</html>