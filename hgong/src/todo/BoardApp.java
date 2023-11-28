package todo;

import java.util.Scanner;

public class BoardApp {
public static void main(String[] args) {
	boolean run = true;
	Board[] boards = new Board[100];
	Scanner scn = new Scanner(System.in) {
		BoardExe exe = new BoardExe();
while(run) {
	System.out.println("1.등록 2.목록 3.상세조회 4. 종료");
	System.out.println("게시판(게시글번호/제목/작성자/내용/작성일시)");
	int menu = Integer.parseInt(scn.nextLine());
	switch(menu) {
	case 1:
		System.out.println("게시글 번호 입력>>");
		int no = scn.nextInt();
		System.out.println("제목 입력");
		String jemok = scn.nextLine();
		System.out.println("작성자 입력");
		String writer =scn.nextLine();
		System.out.println("내용입력");
		String nae = scn.nextLine();
		System.out.println("작성일시 입력");
		String ilsi =scn.nextLine();
		
		Board brd = new Board(no, jemok, writer, nae,ilsi);
		if(exe.addBoard(brd)){
			System.out.println("저장 되었습니다.");
		}else {
			System.out.println("저장 중 오류 발생!");
		}
		System.out.println("저장 되었습니다.");
		break;
	case 2 ://목록보기
		for(Board brd : exe.getBolist()) {
			if(brd != null) {
				brd.showInfo();
			}
		}
		for(int i = 0;i < students.length;i++) {
			if(boards[i] != null ) {
				boards[i].showInfo();
			}
		}
		break;
	case 3: //단건조회
		System.out.println("조회할 게시판 번호 입력>>");
		no =scn.nextLine();
		Board brd =exe.getBoNO(no);
		if(brd !=null) {
			brd.showInfo();
		}else {
			System.out.println("존재하지 않는 정보");
		}
		break;
	case 6: 
		System.out.ptintln("프로그램을 종료합니다")
		run =false;
		}
	
	}


}
