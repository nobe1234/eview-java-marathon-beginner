<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/register/totalprice" method="post">

商品１：<input type="text" name="price1"><br>
商品２：<input type="text" name="price2"><br>
商品３：<input type="text" name="price3"><br>
<br><br>
<input type="submit" value="購入">
</form>

</body>
</html>