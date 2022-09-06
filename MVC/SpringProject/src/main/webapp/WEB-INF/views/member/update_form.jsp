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
	<form method="post" action="member/update">
	아이디<input type="text" name ="userid" value="${list.userid }" /><br/>
	비밀번호<input type="password" name="upw" value="${list.upw }"/><br/>
	이름<input type="text" name="uname" value="${list.uname }"/><br/>
	이메일<input type="text" name="uemail" value="${list.uemail }" /><br/>
	<button type="submit">Join Us</button>
	</form>
</body>
</html>