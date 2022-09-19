<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Board Update</h1>
<form method="post" action="board_update">
		제목 : <input type="text" name="title" /> <br><br>
		비밀번호 : <input type="text" name="password" /> <br><br>
		글쓴이 : <input type="text" name="writer" /> <br><br>
		이메일 : <input type="text" name="email" /> <br><br>
		내용 : <textarea name="content" rows="20"></textarea> <br><br>
		<button type="submit">수정완료</button>
	</form>
</body>
</html>