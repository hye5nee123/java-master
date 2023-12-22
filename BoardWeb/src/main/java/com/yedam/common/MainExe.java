package com.yedam.common;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.vo.BoardVO;

public class MainExe {
	public static void main(String[] args) {

		SqlSessionFactory factory = DataSource.getInstance();
		// jdbc vs. mybatis. //이게 공장
		SqlSession session = factory.openSession(true);

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		BoardVO vo = new BoardVO();
		vo.setTitle("ttttt");
		vo.setContent("ccccc");
		vo.setWriter("wwwwww");
		vo.setBoardNo(4);

		/**if (mapper.updateBoard(vo) == 1) {
			System.out.println("수정됨.");
		} else {
			System.out.println("수정 X.");
		}

		mapper.insertBoard(vo);
		
		//updateCnt
		if (mapper.updateCnt(3) == 1) {
			System.out.println("1번 올라감");
		} else {
			System.out.println("X");
		}
		//deleteBoard
		if(mapper.deleteBoard(1) == 1) {
			System.out.println("삭제 완.");
		}else {
			System.out.println("삭제 X");
		}*/
		
		//int insertBoard(BoardVO vo);
		if(mapper.insertBoard(vo)==1) {
			System.out.println("입력완료");
		}else {
			System.out.println("X");
		}
		

		/**
		 * if (mapper.selectOne.equals() ) { System.out.println("검색됨"); } else {
		 * System.out.println("수정 x"); }
		 */

		/**
		 * List<BoardVO> list = mapper.selectList(); for (BoardVO vo : list) {
		 * System.out.println(vo.toString());}
		 */
	}
}
