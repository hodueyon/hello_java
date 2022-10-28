<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h3>로그인</h3>
	<form action ="./signIn.do" method="post" >
		ID : <input type="text" name = "id"><br>
		비밀번호 : <input type ="password" name="passwd"><br> 
		<input type="submit" value="로그인"><br>
		<input type="reset" value="초기화"><br>
	</form>
	
	<a href="passwdReConfirmForm.do">비밀번호 재전송</a>
	<!-- passwdReConfirmForm.jsp 아이디 입력하고 재전송 -> 메일주소로 변경된 비번.. 
		passwdReConfirm.do : 아이디 받아서 이메일 정보로 메일을 발송송송오송송송
	-->
</body>
</html>