<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<title>상품 리스트</title>
</head>
<body>
	<h2>상품목록</h2>
	<table border="1">
		<tr>
			<th>상품ID</th>
			<th>상품이미지</th>
			<th>상품명</th>
			<th>가격</th>
		</tr>
		<c:forEach var="value" items="${list}">
		<tr>
			<td>${value.productId}</td>
			<td>
				<a href="detail/${value.productId}">
					<img src="../img/${value.productUrl}" width="100px" height="100px">
				</a>
			</td>
			<td align="center">
				<a href="detail/${value.productId}">${value.productName}</a><br>
			</td>
			<td>
				<fmt:formatNumber value="${value.productPrice}" pattern="###,###,###"/>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>