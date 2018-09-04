<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">  
    <meta name="viewport" content="width=device-width, initial-scale=1">  
<title>班级文件管理系统</title>
<link rel="stylesheet" href="css/index.css">  
</head>
<body>  
     <nav class="navbar">  
      <div class="container navbar-content">
        <a href="#">首页</a>
        <a href="${pageContext.request.contextPath }/showVediosFront.action">视频</a>
        <a href="${pageContext.request.contextPath }/showAudiosFront.action">音频</a>
        <a href="${pageContext.request.contextPath }/showPictureFront.action">图片</a>
        <a href="${pageContext.request.contextPath }/showDocumentsFront.action">文档</a>  
        <a href="#">关于我们</a>
        <a href="${pageContext.request.contextPath }/checkLogin.action">后台管理</a>  
      </div>
    </nav>  
  
    <img src="images/bg.jpg" class="index-bg">  
    <div class="container">  
      <h1>班级文件管理系统</h1>  
      <h4>文档文件列表</h4>  
     
      <div class="news-list">  
         
        <div class="news-list-left"> 
          <c:forEach items="${fileInfos1 }" var="file">  
          <div class="news-list-item">  
            <div class="author-time">  
              <span>${file.user.userName }</span> 上传于 <span>${file.uploadTime }</span>  
            </div>  
            <div class="news-des">  
              <h3 class="news-title"><i></i><a href="#">${file.fileName }</a> &nbsp;  &nbsp;<a href="${pageContext.request.contextPath }/downLoadFile.action?path=${file.filePath}">下载</a></h3> 
              <div class="news-content-des">  
                
              </div>  
            </div>  
          </div> 
           </c:forEach>
          </div>         
        
          
  
        <div class="news-list-right">  
          <div class="about">  
            <h4>关于我们</h4>  
            <div class="about-des">  
              <p>本系统使用了SSM的框架。旨在帮助我们在班级中的一些文件的分类管理，来解决和方便我们生活中的一些问题。</p>  
            </div>  
          </div>  
        </div>       
        </div>          
      <div>

        <footer class="copyright">
          <font >共 ${page1.totalPageCount} 页</font> <font >第  
            ${page1.pageNow} 页</font> <a href="showDocumentsFront.action?pageNow=1&fileName=${fileName }">首页</a>  
        <c:choose>  
            <c:when test="${page1.pageNow - 1 > 0}">  
                <a href="showDocumentsFront.action?pageNow=${page1.pageNow - 1}&fileName=${fileName }">上一页</a>  
            </c:when>  
            <c:when test="${page1.pageNow - 1 <= 0}">  
                <a href="showDocumentsFront.action?pageNow=1&fileName=${fileName }">上一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page1.totalPageCount==0}">  
                <a href="showDocumentsFront.action?pageNow=${page1.pageNow}&fileName=${fileName }">下一页</a>  
            </c:when>  
            <c:when test="${page1.pageNow + 1 < page1.totalPageCount}">  
                <a href="showDocumentsFront.action?pageNow=${page1.pageNow + 1}&fileName=${fileName }">下一页</a>  
            </c:when>  
            <c:when test="${page1.pageNow + 1 >= page1.totalPageCount}">  
                <a href="showDocumentsFront.action?pageNow=${page1.totalPageCount}&fileName=${fileName }">下一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page1.totalPageCount==0}">  
                <a href="showDocumentsFront.action?pageNow=${page1.pageNow}&fileName=${fileName }">尾页</a>  
            </c:when>  
            <c:otherwise>  
                <a href="showDocumentsFront.action?pageNow=${page1.totalPageCount}&fileName=${fileName }">尾页</a>  
            </c:otherwise>  
        </c:choose>
          <br>  
          Copyright &nbsp; 2018 zzuli All rights reserved.  
        </footer>  
      </div>  
    </div>  

</body>
</html>