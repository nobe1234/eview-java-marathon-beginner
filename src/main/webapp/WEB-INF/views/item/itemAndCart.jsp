<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ page import="java.util.Calendar" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 商品一覧 -->
<h2>商品一覧</h2>
<c:forEach var="item" items="${itemList }" varStatus="status">
<form:form modelAttribute="item" action="${pageContext.request.contextPath}/startApp/itemAndCart">
<c:out value="${item.name }"></c:out>
<fmt:formatNumber value="${item.price }" pattern="###,###円"/>
<input type="hidden" name="index" value="${status.index }">
<input type="submit" value="カートへ">
</form:form>
</c:forEach>

<!-- カート一覧 -->
<h2>ショッピングカート</h2>
<c:forEach var="cart" items="${cartList}" varStatus="status">
<form:form modelAttribute="item" action="${pageContext.request.contextPath}/startApp/deleteCart">
<c:out value="${cart.name }"></c:out>
<fmt:formatNumber value="${cart.price }" pattern="###,###円"/>
<input type="hidden" name="index" value="${status.index }">
<input type="submit" value="削除">
</form:form>
</c:forEach>

合計金額
<c:out value="${totalPrice }"></c:out>

</body>
</html>