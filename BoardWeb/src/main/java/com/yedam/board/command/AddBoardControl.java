package com.yedam.board.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class AddBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// param(3개), db insert, 목록 페이지.
		String title = req.getParameter("title");
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");
		BoardVO vo = new BoardVO();

		// 왜 빨간줄 뜨는지 복습 하면서 이해 불가 > 물어볼것. 집에 lombok 없어서 오류나는 거였음.;

		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		// svc :addBoard()
		BoardService dao = new BoardServiceMybatis();
		boolean ss = dao.addBoard(vo);

		if (ss) {
			try {
				resp.sendRedirect("modifyForm.do");
			} catch (IOException e) {

				e.printStackTrace();
			}
		} else {
			try {
				resp.sendRedirect("boardForm.do");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
