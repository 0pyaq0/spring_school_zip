<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>product add form</title>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(function(){
   $("#addBtn").click(function(){
	    var productName = $("#productName").val();
		var productPrice = $("#productPrice").val();
		var productDesc = $("#productDesc").val();
		var productPhoto = $("#productPhoto").val();

      if(productName==""){
         alert("상품명을 입력해주세요");
         productName.focus();
      }
      else if(productPrice==""){
         alert("상품 가격을 입력해주세요");
         productPrice.focus();
      }
      else if(productDesc==""){
         alert("상품 설명을 입력해주세요");
         productDesc.focus();
      }
      document.myForm.action="insert_product";
      document.myForm.submit();
   });

   $("#listBtn").click(function(){
      location.href="list";
   });
})
</script>
</head>
<body>
   <h1>상품 등록</h1>
   <form id="myForm" name="myForm"
      enctype="multipart/form-data" method="post">
      <table border="1">
			<tr>
				<td>상품명</td>
				<td><input type="text" name="productName" id="productName"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="text" name="productPrice" id="productPrice"></td>
			</tr>
			<tr>
				<td>상품설명</td>
				<td><textarea rows="5" cols="60" name="productDesc" id="productDesc"></textarea></td>
			</tr>
			<tr>
				<td>상품이미지</td>
				<td><input type="file" name="productPhoto" id="productPhoto"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="등록" id="addBtn">
					<input type="button" value="메뉴" id="listBtn">
				</td>
			</tr>
		</table>
   </form>
</body>
</html>