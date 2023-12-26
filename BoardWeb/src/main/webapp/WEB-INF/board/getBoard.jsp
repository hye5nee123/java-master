<%@page import="com.yedam.board.vo.BoardVO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getBoard.jsp</title>
</head>
<body>
	<h3>상세화면</h3>
	<%
	BoardVO vo = (BoardVO) request.getAttribute("vo");
	%>
	<form name="myFrom" action="modifyForm.do">
		<input type="hidden" name="bno" value="<%=vo.getBoardNo()%>">
		<table border="1">
			<tbody>
				<tr>
					<td>글번호</td>
					<td colspan="3"><%=vo.getBoardNo()%></td>
				</tr>
				<tr>
					<td>제목</td>
					<td colspan="2"><%=vo.getTitle()%></td>

				</tr>
				<tr>
					<td>내용</td>
					<td colspan="2"><%=vo.getContent()%></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td colspan="3"><%=vo.getWriter()%></td>
					<td>5</td>
				</tr>
				<tr>
					<td>작성일</td>
					<td><%=vo.getWriteDate()%></td>
					<td>조회수</td>
					<td><%=vo.getClickCnt()%></td>
				</tr>

				<tr>
					<td>이미지</td>
					<td></td>
				</tr>
				<tr>
					<td colspan="4" align="center"><input type="submit" value="수정">
						<input type="button" onclick="deleteFun()" value="삭제"></td>
				</tr>
			</tbody>
		</table>
	</form>
	<br>
	<a href="boardList.do">글목록으로</a>
	<script>
		function deleteFun() {
			console.log(window);
			document.forms.myForm.action = "removeForm.do";
			document.forms.myForm.submit();
		}
	</script>
</body>
</html>