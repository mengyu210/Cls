<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<meta http-equiv="X-UA-Compatible" content="IE=edge; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>注册页面</title>
<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="css/register.css" />
<link rel="stylesheet" href="css/supersized.css">
<script src="js/jquery-1.8.2.min.js" ></script>
<script src="js/supersized.3.2.7.min.js" ></script>
<script src="js/supersized-init.js" ></script>
</head>
<body>
    <div class="beg-login-box">
			<header>
				<h1>后台用户注册</h1>
			</header>
			<div class="beg-login-main">
				<form action="${pageContext.request.contextPath }/register.action" class="layui-form" method="post">
				<input name="__RequestVerificationToken" type="hidden" value="fkfh8D89BFqTdrE2iiSdG_L781RSRtdWOH411poVUWhxzA5MzI8es07g6KPYQh9Log-xf84pIR2RIAEkOokZL3Ee3UKmX0Jc8bW8jOdhqo81" />
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
						<input type="text" name="userName" lay-verify="userName" autocomplete="off" placeholder="这里输入登录名" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="password" name="password" lay-verify="password" autocomplete="off" placeholder="这里输入密码" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="password" name="repassword" lay-verify="password" autocomplete="off" placeholder="这里重复输入密码" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="text" name="telNumber" lay-verify="telNumber" autocomplete="off" placeholder="这里输入电话号码" class="layui-input">
					</div>
					<!-- <div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="text" name="trueName" lay-verify="trueName" autocomplete="off" placeholder="这里输入真实姓名" class="layui-input">
					</div> -->
				<div class="layui-form-item">
					<label class="layui-form-label">单选框</label>
					<div class="layui-input-block">
						<input type="radio" name="sex" value="男" title="男"> <input
							type="radio" name="sex" value="女" title="女" checked>
					</div>
				</div>
				<div class="layui-form-item">
						<div class="beg-pull-left beg-login-remember">
						   <button type="reset" class="layui-btn layui-btn-primary">
						   <i class="layui-icon">&#xe650;</i>重置
						   </button>
						</div>
						<div class="beg-pull-right">
							<button class="layui-btn layui-btn-primary" lay-submit lay-filter="register">
                            <i class="layui-icon">&#xe650;</i> 注册
                        </button>
						</div>
						
					</div>
				</form>
			</div>
			
			<footer>
				<p>版权 ©2352441187@qq.com</p>
			</footer>
			
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
					
				});
			});
		</script>
</body>
</html>