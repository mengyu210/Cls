<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>文件页面</title>
		<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="css/global.css" media="all">
		<link rel="stylesheet" href="css/list.css" />
		<link rel="stylesheet" href="css/download.css">
</head>
<body>
      <div class="admin-main">
			<blockquote class="layui-elem-quote">
			
				<div class="layui-form-item" style="float:inherit;">
					<form action="showFiles.action" method="get">
					<label class="layui-form-label">文件名称</label>
					<div class="layui-input-inline">
						<input type="text" name="fileName" class="layui-input">
					</div>
					<button class="layui-btn layui-btn-small">
					<i class="layui-icon">&#x1002;</i>
					</button>
					</form>
				</div>
                
			</blockquote>
			<fieldset class="layui-elem-field">
				<legend>文件列表</legend>
				<div class="layui-field-box">
				<table class="site-table">
					<thead>
						<tr>							
							<th>ID值</th>
							<th>文件名</th>
							<th>文件大小</th>
							<th>上传时间</th>
							<th>上传用户</th>	
						</tr>
					</thead>
					<tbody>
						
							
							<c:forEach items="${fileInfos }" var="file"> 
                              <tr>
                                
                                <td>${file.id }</td>
                                <td>${file.fileName }</td>
                                <td>${file.fileSize }</td>
                                <td>${file.uploadTime }</td>
                                <td>${file.user.userName }</td>
                               
                              </tr>
                            </c:forEach>				
					</tbody>
				</table>
				</div>
			</fieldset>
      <div class="table-page">  
        <font >共 ${page.totalPageCount} 页</font> <font >第  
            ${page.pageNow} 页</font> <a href="showFiles.action?pageNow=1&fileName=${fileName }">首页</a>  
        <c:choose>  
            <c:when test="${page.pageNow - 1 > 0}">  
                <a href="showFiles.action?pageNow=${page.pageNow - 1}&fileName=${fileName }">上一页</a>  
            </c:when>  
            <c:when test="${page.pageNow - 1 <= 0}">  
                <a href="showFiles.action?pageNow=1&fileName=${fileName }">上一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page.totalPageCount==0}">  
                <a href="showFiles.action?pageNow=${page.pageNow}&fileName=${fileName }">下一页</a>  
            </c:when>  
            <c:when test="${page.pageNow + 1 < page.totalPageCount}">  
                <a href="showFiles.action?pageNow=${page.pageNow + 1}&fileName=${fileName }">下一页</a>  
            </c:when>  
            <c:when test="${page.pageNow + 1 >= page.totalPageCount}">  
                <a href="showFiles.action?pageNow=${page.totalPageCount}&fileName=${fileName }">下一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page.totalPageCount==0}">  
                <a href="showFiles.action?pageNow=${page.pageNow}&fileName=${fileName }">尾页</a>  
            </c:when>  
            <c:otherwise>  
                <a href="showFiles.action?pageNow=${page.totalPageCount}&fileName=${fileName }">尾页</a>  
            </c:otherwise>  
        </c:choose>  
    </div>  
    
    
  </div>
         
             
      
      
</body>
</html>