<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>파일업로드</title>
</head>
<body>
<h1>업로드 하세요</h1>
<form action="re_upload" method="post" enctype="multipart/form-data">
	<input type="file" name="file" >
	<input type="submit" value="선택 완료" />
</form>
</body>
</html>