<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="${num1 }"></c:out>×
<c:out value="${num2 }"></c:out>＝
<c:out value="${answer }"></c:out>

<a href="${pageContext.request.contextPath }/calc/output2">次へ</a>

</body>
</html>