<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Table</title>
		<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="css/global.css" media="all">
		<link rel="stylesheet" href="css/list.css" />
</head>
<body>
     <div class="admin-main">
			<blockquote class="layui-elem-quote">
			<a href="add.html" class="layui-btn layui-btn-small" id="add">
				<i class="layui-icon">&#xe608;</i> 添加
			</a>
			<a href="javascript:;" class="layui-btn layui-btn-small" id="delete">
				<i class="layui-icon">&#xe640;</i> 删除
			</a>
				<div class="layui-form-item" style="float:right">
					<label class="layui-form-label">名称</label>
					<div class="layui-input-inline">
						<input type="text" name="phone" class="layui-input">
					</div>
					<label class="layui-form-label">名称</label>
					<div class="layui-input-inline">
						<input type="text" name="phone" class="layui-input">
					</div>
					<a href="" class="layui-btn layui-btn-small">
					<i class="layui-icon">&#x1002;</i>
					</a>
				</div>
                
			</blockquote>
			<fieldset class="layui-elem-field">
				<legend>数据列表</legend>
				<div class="layui-field-box">
				<table class="site-table">
					<thead>
						<tr>
							<th><input type="checkbox" id="selected-all"></th>
							<th>所属分类</th>
							<th>标题</th>
							<th>作者</th>
							<th>创建时间</th>
							<th>浏览量</th>
							<th>状态</th>
							<th>排序值</th>
							<th>置顶</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox"></td>
							<td>Layui</td>
							<td>
								<a href="/manage/article_edit_1">演示站点发布成功啦。</a>
							</td>
							<td>Beginner</td>
							<td>2016-11-16 11:50</td>
							<td>1298</td>
							<td>正常</td>
							<td>99</td>
							<td style="text-align:center;"><i class="layui-icon" style="color:green;"></i></td>
							<td>
								<a href="/detail-1" target="_blank" class="layui-btn layui-btn-normal layui-btn-mini">预览</a>
								<a href="/manage/article_edit_1" class="layui-btn layui-btn-mini">编辑</a>
								<a href="javascript:;" data-id="1" data-opt="del" class="layui-btn layui-btn-danger layui-btn-mini">删除</a>
							</td>
						</tr>
						<tr>
							<td><input type="checkbox"></td>
							<td>CSS</td>
							<td>
								<a href="/manage/article_edit_12">CSS实现垂直居中6种方法</a>
							</td>
							<td>Beginner</td>
							<td>2016-11-17 14:27</td>
							<td>62</td>
							<td>正常</td>
							<td>0</td>
							<td style="text-align:center;"><i class="layui-icon" style="color:red;">ဇ</i></td>
							<td>
								<a href="/detail-1" target="_blank" class="layui-btn layui-btn-normal layui-btn-mini">预览</a>
								<a href="/manage/article_edit_1" class="layui-btn layui-btn-mini">编辑</a>
								<a href="javascript:;" data-id="1" data-opt="del" class="layui-btn layui-btn-danger layui-btn-mini">删除</a>
							</td>
						</tr>
					</tbody>
				</table>
				</div>
			</fieldset>
			<div class="admin-table-page">
				<div id="page" style="padding-left:10px;">
				</div>
			</div>
		</div>
		<script type="text/javascript" src="plugins/layui/layui.js"></script>
		<script type="text/javascript" src="js/list.js"></script>
</body>
</html>