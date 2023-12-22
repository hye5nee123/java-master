<%@page import="common.*"%>
<!--  common 안에 있는 모든 것을 import 하겠습니다. -->
<%@page import="com.yedam.student.mapper.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- jsp 파일이구나! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentInfo.jsp</title>
</head>
<body>
	<%
	String str = "Hello";
	// 내장객체: request(변수이름 선언 안하고 쓰기 ㄱㄴ)
	//parametet값을 읽어와서 담긴 값 반환하겠다
	String sno = request.getParameter("sno");
	StudentDAO dao = new StudentDAO();
	Student std = dao.getStudnet(sno);
	%>

	<table border='1'>
		<caption>학생정보</caption>
		<tr>
			<th>학생번호</th>
			<td><%=std.getStudNo()%></td>
		</tr>
		<tr>
			<th>학생이름</th>
			<td><%=std.getStudName()%></td>
		</tr>
		<tr>
			<th>영어점수</th>
			<td><%=std.getEngScore()%></td>
		</tr>
		<tr>
			<th>수학점수</th>
			<td><%=std.getMatScore()%></td>
		</tr>
	</table>
</body>
</html>