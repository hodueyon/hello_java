<%@page import="java.util.List"%>
<%@page import="co.test.vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>도서 리스트.</title>
</head>

<body>
	<%
		List<BookVO> list = (List<BookVO>) request.getAttribute("bookList");
	%>
	<%if(list.size()>0) {%>
    <table border="1">
        <caption>도서목록</caption>
        <thead>
            <tr>
                <th>도서코드</th>
                <th>도서명</th>
                <th>도서저자</th>
                <th>도서출판사</th>
                <th>도서가격</th>
            </tr>
        </thead>
        <tbody>
    	<%for(BookVO vo:list) { %>
        	<tr><td><%=vo.getBookCode() %></td>
				<td><%=vo.getBookTitle() %></td>
				<td><%=vo.getBookAuthor() %></td>
				<td><%=vo.getBookPress()%></td>
				<td><%=vo.getBookPrice()%></td>
			</tr>
			<%} %>	
        </tbody>
    </table>
    	<%} else {%>
    		<p>정보가 없습니다!</p>
    	<%} %>	
    
    <a href="main.do">첫페이지</a>
</body>

</html>