<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/nameRecieve/output">
<input type="text" name="name" ><br>
<input type="submit" value="送信" ><br>
</form>
</body>
</html>