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
	<form action="demo/create" method="post">
		帖子标题：<input name="tieziTitle"/><br/>
		贴子作者：<input name="tieziAuthor" /><br/>
		帖子内容：<textarea style="width: 200px;height: 200px" name="tieziContent"></textarea><br/>
		<input type="submit" value="发贴" />	
	</form>
</body>
</html>