package todo;

import java.text.SimpleDateFormat;
import java.util.Date;
//기능 정의 (배열선언 등등 데이터 처리용)
//저장소 Boards

//https://itjy2.tistory.com/23
public class BoardExe {
	static Board[] boards;

//board라는 정보를 저장하기 위해 boards라는 배열 저장
//	instance를 만들겠단 의미
//	boards에 값을 넣기 위해
	BoardExe() {
		// boards = new Board[100];
	}

	// 정적 실행 블록
	{
		boards = new Board[100];
	}

	// 초기값 생성.
	public static void initData() {
		boards[0] = new Board(1, "첫번째 글", "user01", "첫번째 글 입력중입니다.", "23-11-27");
		boards[1] = new Board(2, "두번째 글", "user02", "두번째 글 입력중입니다.", "23-11-27");
		boards[3] = new Board(4, "네번째 글", "user04", "네번째 글 입력중입니다.", "23-11-27");
		boards[2] = new Board(3, "세번째 글", "user03", "세번째 글 입력중입니다.", "23-11-27");

		boards[4] = new Board(5, "다섯번째 글", "user05", "다섯번째 글 입력중입니다.", "23-11-27");
		boards[5] = new Board(6, "여섯번째 글", "user06", "여섯번째 글 입력중입니다.", "23-11-27");
		boards[6] = new Board(7, "일곱번째 글", "user07", "일곱번째 글 입력중입니다.", "23-11-27");
		boards[7] = new Board(8, "여덟번째 글", "user08", "여덟번째 글 입력중입니다.", "23-11-27");

	}

//등록 글번호 제목 작성자 등등등
	public static boolean addBoard(Board board) {
		for (int i = 1; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				return true;
			}
		}
		return false;
	}

	public static Board[] boardList() {
		Board temp = null;
		for (int j = 1; j < boards.length - 1; j++) {
			for (int i = 0; i < boards.length - 1; i++) {
				if (boards[i] != null && boards[i + 1] != null) {
					if (boards[i].getBN() > boards[i + 1].getBN()) {
						temp = boards[i];
						boards[i] = boards[i + 1];
						boards[i + 1] = temp;
					}
				}
			}
		}
		return boards;
	} // end of boardList
		// 배열, 페이지 = > 페이지의 5건을 반환.

	public static Board[] pageList(Board[] ary, int page) {
		Board[] resultAry = new Board[5];

		int start = (page - 1) * 5;
		int end = page * 5;
		int j = 0;
		for (int i = 0; i < ary.length; i++) {
			if (i >= start && i < end) {
				resultAry[j++] = ary[i];
			}
		}
		return resultAry;
	}

	public static Board getBoard(int boardNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBN() == boardNo) {
				return boards[i];
			}
		}
		return null;
	}

	public static int getSequence() {
		int seqNO = 1;
		int max = 0;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBN() > max) {
				max = boards[i].getBN();
			}
		}
		seqNO = max + 1;
		return seqNO;
	}

	public static boolean modBoard(int no, String content) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBN() == no) {
				boards[i].setBC(content);
				boards[i].setBDT(sdf.format(today));
				return true;
			}
		}
		return false;
	}

	public static boolean remBoard(int no) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBN() == no) {
				boards[i] = null;
				return true;
			}
		}
		return false;
	}

	// 사용자가 해당글번호의 수정,삭제 권한 체크 => boolean type
	public static boolean checkResponsibility(String id, int no) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBN() == no && boards[i].getBW().equals(id)) {
			}
		}
		return true;
		// 동일하면 t 아니면 F
	}// end of check
		// 게시글을 담고 있는 배열에서 값이 잇는 건수를 반환.

	public static int getBoardCount() {
		int realCnt = 0;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				realCnt++;
			}

		}
		return realCnt;
	}

}