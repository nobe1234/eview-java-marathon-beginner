<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>名前：<c:out value="${name}"></c:out><br></td>
</tr>
<tr>
<td>年齢：<c:out value="${age}"></c:out><br></td>
</tr>
<tr>
<td>住所：<c:out value="${address}"></c:out><br></td>
</tr>
</table>
</body>
</html>