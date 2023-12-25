package com.yedam.board.vo;

import java.util.Date;

import lombok.Data;

@Data
//get,set 만들어줌!

//여기가 찐 실행 하는 곳!
//value를 담아놓기 위한 object
public class BoardVO {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	// javutil 데이트 import
	private Date writeDate;
	private int clickCnt;
	private String image;

	public String toString() {
		return title + " " + content;
	}
}
