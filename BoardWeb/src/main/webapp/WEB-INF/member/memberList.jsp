<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- member/memberList.jsp -->
<h3>회원목록</h3>
<table class="table">
    <thead>
        <tr>
            <th>아이디</th>
            <th>이름</th>
            <th>권한</th>
        </tr>
    </thead>
    <tbody>
      <c:forEach var="member" items="${list }">
        <tr>
            <td>${member.id }</td>
            <td>${member.name }</td>
            <td>${member.responsibility }</td>
        </tr>
      </c:forEach>
    </tbody>
</table>