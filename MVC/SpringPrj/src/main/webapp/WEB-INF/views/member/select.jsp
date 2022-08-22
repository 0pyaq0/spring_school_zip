<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>member list</h1>
<table border=1>
	<thread>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>pw</td>
			<td>email</td>
			<td>date</td>
	</thread>
	<tbody>
	<c:forEach var="value" items="${list}">
	<tr>
		<td>${value.userid}</td>
		<td>${value.uname}</td>
		<td>${value.upw}</td>
		<td>${value.uemail}</td>
		<td>${value.uregDate}</td>
	</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>