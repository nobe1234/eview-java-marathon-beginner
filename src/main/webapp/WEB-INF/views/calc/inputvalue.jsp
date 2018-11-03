<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/calc/output1" method="post">
<input type="text" name="num1">×
<input type="text" name="num2">
<br><br>
<input type="submit" value="計算">
</form>

</body>
</html>