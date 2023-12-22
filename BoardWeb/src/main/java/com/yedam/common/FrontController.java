package com.yedam.common;
//컨트롤러 : url -> 서블릿 실행.

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("*.do")
public class FrontController extends HttpServlet {
	// 생명주기 : 생성자 -> init() -> service() -> destroy()
	// url 값 / servlet
	Map<String, Control> map;

	public FrontController() {
		System.out.println("생성자 호출");
		map = new HashMap<String, Control>();
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출");
		map.put("/main.do", new MainControl());
		map.put("/sub.do", new SubControl());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() 호출");
		String url = req.getRequestURI(); // /BoardWeb/main.do > url 치면 읽어오는 것을 요청
		String context = req.getContextPath(); // /Boardweb을 읽어옴(프로젝트 상위 것을 읽어오겠다!)
		String path = url.substring(context.length());
		System.out.println(path);
		// path가 key 값.
		Control ctrl = map.get(path);
		ctrl.execute(req, resp);
	}

	public void destroy() {
		System.out.println("destroy()호출");
	}
}
