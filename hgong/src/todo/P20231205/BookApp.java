package todo.P20231205;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import todo.P20231205.*;

public class BookApp {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		BookExe exe = new BookExe();
		boolean run = true;
		Book[] books = new Book[100];
		while (run) {
			System.out.println("1.등록 2. 목록 3. 단건조회 4. 수정 5. 삭제 6.종료");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				System.out.println("책 코드 입력>>");
				int no = Integer.parseInt(scn.nextLine());
				System.out.println("책 제목 입력>>");
				String jemok = scn.nextLine();
				System.out.println("작가 입력");
				String writer = scn.nextLine();
				System.out.println("출판사 입력");
				String copy = scn.nextLine();
				System.out.println("가격 입력");
				int price = Integer.parseInt(scn.nextLine());

				Book bk = new Book(code, jemok, writer, copy, price);
				if (exe.addBook(bk)) {
					System.out.println("저장 되었습니다.");
				} else {
					System.out.println("저장 중 오류 발생!");
				}
				break;
			case 2:
				for(Book bok: exe.getBookList()) {
					if(bok != null) {
						bok.showInfo();
					}
				}
				for(int i =0l i <books.length;i++) {
					if(books[i] != null) {
						books[i].showInfo();
					}
				}
				break;
			case 3:
				System.out.println("조회할 책 코드 입력");
				no = Integer.parseInt(scn.nextLine());
				Book bokk = exe.getBook(no);
				if(bokk != null) {
					bokk.showInfo();
				}else {
					System.out.println("존재하지 않는 코드");
				}
				break;
			case 4:
				System.out.println("조회할 책코드 입력");
				no =Integer.parseInt(scn.nextLine());
				System.out.println("조회할 가격 입력");
				price = Integer.parseInt(scn.nextLine());
				if(exe.modifyBook(no,price)) {
					System.out.println("수정 완료");
				}else {
					System.out.println("수정 실패");
				}
				break;
			case 5:
				System.out.println("삭제할 코드 입력");
				no = scn.nextLine();
				if(exe.removeBook(no)) {
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제 실패");
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다");
				run =false;
			}
		}
		System.out.println("end of prog");
	}

}
