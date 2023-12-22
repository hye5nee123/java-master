
+<%@page import="com.yedam.student.vo.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.yedam.student.mapper.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentList.jsp</title>
</head>
<body>
	<table border='1'>

		<!-- 글자 뒤에 놓고 ctrl+shift 하면 import ㄱㄴ dd <%%> 면 자바 코드 가능-->
		<thead>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>영어</th>
				<th>수학</th>
			</tr>
		</thead>
		<tbody>
			<%
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.getStudentList();

			for (Student std : list) {
			%>
			<tr>
				<td><a href= "studentInfo.jsp?sno=<%=std.getStudNo()%>"><%=std.getStudNo() %></a></td>
				<td><%=std.getStudName()%></td>
				<td><%=std.getEngScore()%></td>
				<td><%=std.getMatScore()%></td>
			</tr>
			<%
			}
			%>
		</tbody>

	</table>
</body>
</html>