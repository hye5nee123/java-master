package project;

import java.util.Scanner;

public class LindApp {
	@data
	public static void main(String[] args) {
		boolean run = true;
		Lind[] linds = new Lind[10000];

		Scanner scn = new Scanner(System.in);
		LindDAO dao = new LindDAO();

		System.out.println("안녕하세요");
		System.out.println("1.로그인 2.관리자 로그인");
		int no = Integer.parseInt(scn.nextLine());
		if (no == 1) {
			while (run) {
				System.out.println("1.정보수정 2.게시글 작성 3.목록보기 4. 돌아가기");
				no = Integer.parseInt(scn.nextLine());
				if(no == 1) {
					
				}
			}
		}
	}
}
