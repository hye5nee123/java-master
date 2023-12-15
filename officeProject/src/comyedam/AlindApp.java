package comyedam;

import java.util.Scanner;

public class AlindApp {
	public static void main(String[] args) {
		boolean run = true;
		Alind[] alinds = new Alind[10000];

		Scanner scn = new Scanner(System.in);
		AlindDAO dao = new AlindDAO();
		System.out.println("안녕하세요");
		System.out.println("1.로그인 2. 관리자 로그인");
		int no = Integer.parseInt(scn.nextLine());
		if (no == 1) {
			System.out.println("id 입력");
			no = Integer.parseInt(scn.nextLine());
			System.out.println("비밀번호 입력");
			no = Integer.parseInt(scn.nextLine());
			
			System.out.println("");
			while (run) {
				System.out.println("1.정보수정 2.게시글 작성 3.목록보기 4. 돌아가기");
				int menu = Integer.parseInt(scn.nextLine());
				switch (menu) {
				case 1:
					System.out.println("");
					no = scn.nextInt();
					System.err.println();
				}
			}
		}
	}
}
