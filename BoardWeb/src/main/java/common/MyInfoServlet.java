package common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyInfoServlet")
public class MyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 생성자
	public MyInfoServlet() {
		super();

	}

	// doGet이라는 메소드. 사용자의 요청정보를 가져와서(ip,도메인...) 응답값 > 반드시 받아와야 하는 매개값
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8"); // content 타입:txt,html,json

		// 파라미터 확인.
		String sno = request.getParameter("sno");
		String sname = request.getParameter("sname");
		String escore = request.getParameter("escore");
		String mscore = request.getParameter("mscore");
		// PrintWriter out = response.getWriter();

		System.out.println("sno: " + sno + ", sname:" + sname + ", escore" + escore + ", mscore :" + mscore);

		// db저장
		Student std = new Student(sno, sname, Integer.parseInt(escore), Integer.parseInt(mscore));
		StudentDAO dao = new StudentDAO();
		boolean done = dao.addStudent(std);

		PrintWriter out = response.getWriter();

		out.println("<h3>Welcome Servlet, 안녕하세요 ^_^</h3>");
		out.println("<a href = 'index.html'>인덱스 이동</a>");
		// ==out.append("Serverd at: ").append(request.getContextPath());
		// html로 보여준 것 //요청정보에서 읽어오는 것
		// response.getWriter().append("Serverd at: ").append(request.getContextPath());

		if (done) {
			// 주소값은 list 값으로 넣어주기!
			// error 404
			out.println("<script>alert('ok'); location.href='student/studentList.jsp';</script>");
		} else {
			out.println("<script>alert('Fail');location.href='index.html'; </script>");
		}
	}

	// doPost라는 메소드.
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// return 타입이 doGet
		doGet(request, response);
	}

}
