<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="infoForm" action="${pageContext.request.contextPath}/infouser/infoview">
ID:<form:input path="id"/><br><br>
<input type="submit" value="検索">
</form:form>

</body>
</html>