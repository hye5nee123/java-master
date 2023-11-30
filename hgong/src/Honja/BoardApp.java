package Honja;

import java.util.Scanner;

import Chap6.User;
import Chap6.UserExe;

public class BoardApp {
	static BoardExe exe = new BoardExe();
	public static void main(String[] args) {
		//필드
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		String id = null;
		
		UserExe uexe = new UserExe();
		//uexe가 실체
		while (true) {
			System.out.println("id를 입력>>");
			id = scn.nextLine();
			System.out.println("pw를 입력>>");
			String pw = scn.nextLine();
			User user = uexe.logIn(id, pw);
			if (user != null) {
				System.out.println(user.getUserName() + "환영합니다!");
				break;
			} else {
				System.out.println("id와 pw를 확인하세요");
			}
		}
		exe.initData();

		while (run) {
			System.out.println("1. 등록 2. 목록 3. 상세조회 4.수정 5. 삭제 6. 종료");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				System.out.println("제목 입력 >>");
				String head = scn.nextLine();
				System.out.println("내용 입력 >>");
				String contents = scn.nextLine();
				System.out.println("일시 입력 >>");
				String dateTime = scn.nextLine();

				Board board = new Board(exe.getSequence(), head, id, contents, dateTime);

				if (exe.addBoard(board)) {
					System.out.println("입력 성공");
				} else {
					System.out.println("처리 실패!");
				}
				break;

			case 2: // 목록보기 > 페이지 보기
				Board[] boardAry = exe.boardList();
				showList(boardAry, 1);
				while (true) {
					int page = Integer.parseInt(scn.nextLine());
					if (page == 0) {
						break;
					}
					showList(boardAry, page);
				}
				break;

			case 3:
				System.out.println("글번호 입력");
				int no = Integer.parseInt(scn.nextLine());
				Board result = exe.getBoard(no);
				if (result != null) {
					System.out.println(result.showDetailInfo());
				} else {
					System.out.println("조회된 내용이 없습니다.");
				}
				break;

			case 4:
				System.out.println("수정할 글번호>>");
				no = Integer.parseInt(scn.nextLine());
				System.out.println("수정할 글내용 >");
				contents = scn.nextLine();

				if (exe.checkResponsibility(id, no)) { // if 가 만족하려면 f
					System.out.println("권한이 없습니다");
					continue;
				}

				if (exe.modBoard(no, contents)) {
					System.out.println("변경 성공!");
				} else {
					System.out.println("처리 실패");
				}
				break;
			case 5:
				System.out.println("삭제할 글번호>>");
				no = Integer.parseInt(scn.nextLine());
				if (exe.remBoard(no)) {
					System.out.println("삭제 성공!");
				} else {
					System.out.println("처리 실패 (없는 글번호)");
				}
				break;

			case 6:
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
		System.out.println("end of prog");

	} // end of main.
		// ctrl +왼쪽마우스 : 펑션값 원위치로 이동

	public static void showList(Board[] boardAry, int page) {
		// 페이징 처리
		Board[] pageAry = exe.pageList(boardAry, page);
		// 이 배열에서 5개만~ 하겠다
		// Board[] pageAry = exe.pageList(boardAry, 1);
		exe.pageList(boardAry, 1);
		System.out.println("글번호 제목 작성자");
		System.out.println("--------------------");
		for (Board brd : boardAry) {
			// 5번 반복
			if (brd != null)
				System.out.println(brd.showInfo());
		}
		// 전체페이지 계산하고 출력.
		int cnt = exe.getBoardCount(); // 위에 다 끝났으면 여기로 (위 for문) > 100번 돈다
		int totalPage = (int) Math.ceil(cnt / 5.0);

		for (int i = 1; i <= totalPage; i++) {
			System.out.println(i + "");
		}
		System.out.println("\n 페이지를 선택하세요>> 종료:0 입력");
	}

}// end of class