package com.yedam.board.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

public class BoardFormControl implements Control {
//ㅇ
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// 등록화면 open.

		// 페이지 이동(forward)
		RequestDispatcher rd = //
				req.getRequestDispatcher("board/addBoardForm.tiles");
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
