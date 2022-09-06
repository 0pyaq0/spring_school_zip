<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="value"  items="${list}">
	id: ${value.userid }, pw:${value.upw }, ${value.uname },${value.uemail},
	<a href="member/update?userid=${value.userid}">수정</a>
	<a href="member/delete?userid=${value.userid}">삭제</a> <br/>
	</c:forEach>
</body>
</html>