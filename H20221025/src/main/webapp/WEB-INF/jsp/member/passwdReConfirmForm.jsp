<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 재전송</title>
</head>
<body>
	<h3>비밀번호 재전송</h3>
		<form action = "passwdReConfirm.do" method="post">
			Id : <input type="text" name="id"><br>
			<input type="submit" value = "재전송"><br>
			<input type="reset" value = "초기화">
		</form> 
	
</body>
</html>