<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="write_form">
		이름 : <input type="text" name="idx" /> <br>
		비밀번호 : <input type="text" name="password" /> <br>
		제목 : <input type="text" name="title" /> <br>
		글쓴이 : <input type="text" name="writer" /> <br>
		이메일 : <input type="text" name="email" /> <br>
		내용 : <input type="text" name="content" /> <br>
		<button type="submit">작성완료</button>
	</form>
</body>
</html>