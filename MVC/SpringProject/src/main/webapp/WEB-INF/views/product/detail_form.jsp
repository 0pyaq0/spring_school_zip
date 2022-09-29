<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>상품 상세정보</title>
</head>
<body>
<h2>상품 상세정보</h2>
	<table border="1">
		<tr>
			<td>
				<img src="../../img/${dto.productUrl}" width="340" height="300">
			</td>
			<td>
				<table border="1" style="height: 300px; width: 400px;">
					<tr align="center">
						<td>상품명</td>
						<td>${dto.productName}</td>
					</tr>
					<tr align="center">
						<td>가격</td>
						<td><fmt:formatNumber value="${dto.productPrice}" pattern="###,###,###"/></td>
					</tr>
					<tr align="center">
						<td>상품소개</td>
						<td>${dto.productDesc}</td>
					</tr>
					<tr align="center">
						<td colspan="2">
							<form name="myForm" method="post" action="cart_insert">
								<input type="hidden" name="productId" value="${dto.productId}">
								<select name="amount">
									<c:forEach begin="1" end="10" var="i">
										<option value="${i}">${i}</option>
									</c:forEach>
								</select>&nbsp;개
								<input type="submit" value="장바구니에 담기">
							</form>
							<a href="list_all">상품목록</a>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>