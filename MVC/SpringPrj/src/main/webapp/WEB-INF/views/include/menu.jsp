<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="sum">1부터 10까지의 합</a>
<a href="multi_table">구구단</a> <br/><br/>
<h2>성적</h2>
<form method="post" action="report">
이름 : <input type="text" name="name"/><br/>
국어 : <input type="number" name="kor"/><br/>
영어 : <input type="number" name="eng"/><br/>
수학 : <input type="number" name="math"/><br/><br/>
<button type="submit">입력완료</button>
</form>
</body>
</html>