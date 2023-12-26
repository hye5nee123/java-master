package com.yedam.common;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;

public class RemoveBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// param("bno") - 삭제 - 목록.

		int bno = Integer.parseInt(req.getParameter("bno"));

		BoardService svc = new BoardServiceMybatis();

		if (svc.remBoard(bno)) {
			try {
				resp.sendRedirect("boardlist.do");
			} catch (IOException e) {

				e.printStackTrace();
			}
		} else {
			try {
				resp.sendRedirect("remBoardForm.do");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
