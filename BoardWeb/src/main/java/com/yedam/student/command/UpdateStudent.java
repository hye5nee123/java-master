package com.yedam.student.command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.student.mapper.StudentDAO;
import com.yedam.student.service.StudentService;
import com.yedam.student.serviceImpl.StudentServiceImpl;

/**
 * Servlet implementation class UpdateStudent
 */
@WebServlet("/updateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 한글
		response.setContentType("text/html;charset=utf-8");
		// 파라미터 확인
		String sno = request.getParameter("sno");
		String escore = request.getParameter("escore");
		String mscore = request.getParameter("mscore");

		// StudentDAO dao = new StudentDAO();
		StudentService dao = new StudentServiceImpl();
		boolean ss = dao.modStudent(sno, Integer.parseInt(escore), Integer.parseInt(mscore));

		PrintWriter out = response.getWriter();
		if (ss) {
			// 주소값은 list 값으로 넣어주기!
			// error 404
			out.println("<script>alert('ok'); location.href='studentListServ.srv';</script>");
		} else {
			out.println("<script>alert('Fail');location.href='index.html'; </script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
