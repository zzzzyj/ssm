<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<table border="1">
		<c:choose>
			<c:when test="${!empty results}">
				<tr >
					<th>贴子名称</th>
					<th>贴主</th>
					<th>贴子详情</th>		
				</tr>
				<c:forEach items="${results }" var="result">
					<tr>
					<!--  Map<String, Map<String, Object>> -->
						<td>${result.value['tiezi_name']}</td>
						<td>${result.value['tiezi_author']}</td>
						<td><a href="demo/detail/${result.key }">详情</a>	
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr><td>没有符合该关键字的贴子。</td></tr>
			</c:otherwise>
		</c:choose>
	
	</table>
</body>
</html>