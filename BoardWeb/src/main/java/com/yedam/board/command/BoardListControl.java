package com.yedam.board.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class BoardListControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// 게시글 목록 -> boardList.jsp로 전달.
		BoardService svc = new BoardServiceMybatis();
		// interface Mybatis> interface 구현.
		List<BoardVO> list = svc.boardList();

		// 참조변수 list를 boardlist라는 attri에 담아서 가져옴
		req.setAttribute("boardList", list);

		// 페이지 이동(forward)
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/board/boardList.jsp");
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

}
