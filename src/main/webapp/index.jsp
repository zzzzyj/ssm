<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="http://${pageContext.request.serverName }:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
</head>
<body>
	<h1>web solr test</h1>
	<a href="demo/toAddUI">点击前往发帖子</a>
	<br/>
	<form action="demo/query" method="post">
		<input name="keywords"/>
		<input type="submit" value="query"/>
	</form>
</body>
</html>