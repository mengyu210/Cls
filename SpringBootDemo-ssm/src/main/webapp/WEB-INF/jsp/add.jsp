<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
		<title>表单</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="format-detection" content="telephone=no">

		<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
</head>
<body>
   <div style="margin: 15px;">
			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
				<legend>新增</legend>
			</fieldset>

			<form class="layui-form" action="">
				<div class="layui-form-item">
					<label class="layui-form-label">单行输入框</label>
					<div class="layui-input-block">
						<input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">验证必填项</label>
					<div class="layui-input-block">
						<input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">验证手机</label>
					<div class="layui-input-inline">
						<input type="tel" name="phone" lay-verify="phone" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">验证邮箱</label>
					<div class="layui-input-inline">
						<input type="text" name="email" lay-verify="email" autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">验证数字</label>
						<div class="layui-input-inline">
							<input type="number" name="number" lay-verify="number" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">验证日期</label>
						<div class="layui-input-block">
							<input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-mm-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">验证链接</label>
						<div class="layui-input-block">
							<input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
						</div>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">验证身份证</label>
					<div class="layui-input-block">
						<input type="text" name="identity" lay-verify="identity" placeholder="" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">自定义验证</label>
					<div class="layui-input-inline">
						<input type="password" name="password" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
					</div>
					<div class="layui-form-mid layui-word-aux">请填写6到12位密码</div>
				</div>

				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">范围</label>
						<div class="layui-input-inline" style="width: 100px;">
							<input type="text" name="price_min" placeholder="￥" autocomplete="off" class="layui-input">
						</div>
						<div class="layui-form-mid">-</div>
						<div class="layui-input-inline" style="width: 100px;">
							<input type="text" name="price_max" placeholder="￥" autocomplete="off" class="layui-input">
						</div>
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label">单行选择框</label>
					<div class="layui-input-block">
						<select name="interest" lay-filter="aihao">
							<option value=""></option>
							<option value="0">写作</option>
							<option value="1" selected="">阅读</option>
							<option value="2">游戏</option>
							<option value="3">音乐</option>
							<option value="4">旅行</option>
						</select>
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label">分组选择框</label>
					<div class="layui-input-inline">
						<select name="quiz">
							<option value="">请选择问题</option>
							<optgroup label="城市记忆">
								<option value="你工作的第一个城市">你工作的第一个城市</option>
							</optgroup>
							<optgroup label="学生时代">
								<option value="你的工号">你的工号</option>
								<option value="你最喜欢的老师">你最喜欢的老师</option>
							</optgroup>
						</select>
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label">选择地区</label>
					<div class="layui-input-inline">
						<select name="province" lay-filter="province">
							<option value="">请选择省</option>
						</select>
					</div>
					<div class="layui-input-inline" style="display: none;">
						<select name="city" lay-filter="city">
							<option value="">请选择市</option>
						</select>
					</div>
					<div class="layui-input-inline" style="display: none;">
						<select name="area" lay-filter="area">
							<option value="">请选择县/区</option>
						</select>
					</div>
			    </div>

				<div class="layui-form-item">
					<label class="layui-form-label">复选框</label>
					<div class="layui-input-block">
						<input type="checkbox" name="like[write]" title="写作">
						<input type="checkbox" name="like[read]" title="阅读" checked="">
						<input type="checkbox" name="like[game]" title="游戏">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">开关-关</label>
					<div class="layui-input-block">
						<input type="checkbox" name="close" lay-skin="switch" title="开关">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">开关-开</label>
					<div class="layui-input-block">
						<input type="checkbox" checked="" name="open" lay-skin="switch" lay-filter="switchTest" title="开关">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">单选框</label>
					<div class="layui-input-block">
						<input type="radio" name="sex" value="男" title="男" checked="">
						<input type="radio" name="sex" value="女" title="女">
						<input type="radio" name="sex" value="禁" title="禁用" disabled="">
					</div>
				</div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">普通文本域</label>
					<div class="layui-input-block">
						<textarea placeholder="请输入内容" class="layui-textarea"></textarea>
					</div>
				</div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">编辑器</label>
					<div class="layui-input-block">
						<textarea class="layui-textarea layui-hide" name="content" lay-verify="content" id="LAY_demo_editor"></textarea>
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<a class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</a>
						<a class="layui-btn" href="list.html">返回</a>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>
		</div>
		<script type="text/javascript" src="plugins/layui/layui.js"></script>
		<script type="text/javascript" src="js/add.js"></script>
		<script type="text/javascript" src="js/area.js"></script>
		<script>
			//初始数据
			var areaData = Area;
	
			var $form;
			var form;
			var $;
			layui.use(['jquery', 'form'], function() {
				$ = layui.jquery;
				form = layui.form();
				$form = $('form');
				loadProvince();
			});
	
			function loadProvince() {
				var proHtml = '';
				for(var i = 0; i < areaData.length; i++) {
					proHtml += '<option value="' + areaData[i].provinceCode + '_' + areaData[i].mallCityList.length + '_' + i + '">' +
						areaData[i].provinceName + '</option>';
				}
				//初始化省数据
				$form.find('select[name=province]').append(proHtml);
				form.render();
				form.on('select(province)', function(data) {
					$form.find('select[name=area]').html('<option value="">请选择县/区</option>').parent().hide();
					var value = data.value;
					var d = value.split('_');
					var code = d[0];
					var count = d[1];
					var index = d[2];
					if(count > 0) {
						loadCity(areaData[index].mallCityList);
					} else {
						$form.find('select[name=city]').parent().hide();
					}
				});
			}
	
			function loadCity(citys) {
				var cityHtml = '';
				for(var i = 0; i < citys.length; i++) {
					cityHtml += '<option value="' + citys[i].cityCode + '_' + citys[i].mallAreaList.length + '_' + i + '">' +
						citys[i].cityName + '</option>';
				}
				$form.find('select[name=city]').html(cityHtml).parent().show();
				form.render();
				form.on('select(city)', function(data) {
					var value = data.value;
					var d = value.split('_');
					var code = d[0];
					var count = d[1];
					var index = d[2];
					if(count > 0) {
						loadArea(citys[index].mallAreaList);
					} else {
						$form.find('select[name=area]').parent().hide();
					}
				});
			}
	
			function loadArea(areas) {
				var areaHtml = '';
				for(var i = 0; i < areas.length; i++) {
					areaHtml += '<option value="' + areas[i].areaCode + '">' +
						areas[i].areaName + '</option>';
				}
				$form.find('select[name=area]').html(areaHtml).parent().show();
				form.render();
				form.on('select(area)', function(data) {
					//console.log(data);
				});
			}
		</script>
</body>
</html>