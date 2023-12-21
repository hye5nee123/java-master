package common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//확장자 x     url임 
@WebServlet("/studentListServ.srv")
public class studentListServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public studentListServ() {
		super();

	}

	// overriding 중임
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		// 목록 페이지.
		StudentDAO dao = new StudentDAO();
		// dao.getStudentList()
		List<Student> list = dao.getStudentList();
		// out.print("<table border = '1'>");
		String str = "<table border = '1'>";
		str += "<thead><tr><th>학생번호</th><th>학생이름</th><th>영어점수</th><th>수학점수</th></tr></thead>";
		str += "<tbody>";
		// 데이터 건수만큼 반복하겠다!
		for (Student std : list) {
			str += "<tr><td><a href = 'getStudentSetvlet?sno=" + std.getStudNo() + "'>" + std.getStudNo()
					+ "</a></td><td>" + std.getStudName()//
					+ "</td><td>" + std.getEngScore() + "</td><td>" + std.getMatScore()//
					+ "</td></tr>";
		}
		str += "</tbody></table>";

		out.print(str);
		out.println("<br><a href='student/inform.html'>이동하기</a>");

		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
