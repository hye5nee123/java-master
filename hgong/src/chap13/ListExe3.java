package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Data;

public class ListExe3 {
	static Scanner scn = new Scanner(System.in);
	static boolean run = true;
	// static List<Member> members = new ArrayList<>();

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> num = new ArrayList<>();
		ArrayList<String> id = new ArrayList<>();
		String regId;
		String na;
		String nu;
		int point;
		// String ma;
		int index = 0;

		// 회원등록(회원번호, 이름, 포인트)
		// 1.등록 2. 이름조회 3. 포인트변경 4.삭제 5.종료

		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 이름 조회");
			System.out.println("3. 포인트 변경");
			System.out.println("4. 삭제");
			System.out.println("5. 종료");
			System.out.print(">> ");
			int select = scn.nextInt();
			switch (select) {
			case 1:
				// ID 입력
				System.out.println("등록하고자 하는 ID를 입력하세요.");
				System.out.print("ID : ");
				regId = scn.nextLine();
				if (id.indexOf(id) == -1) {
					// id에 관해서 중복이 없다면 회원정보 입력
					// id ArrayList에 추가
					id.add(regId);
					regId =scn.nextLine();
					System.out.print("이름 : ");
					na = scn.nextLine();
					// 이름 ArrayList에 추가
					name.add(na);
					System.out.println("포인트 입력해주세요.");
					System.out.print("포인트 : ");
					nu = scn.nextLine();
					num.add(nu);
					// 번호 ArrayList에 추가
					// 등록이 완료되면 등록된 정보를 보여줌.
					System.out.println("\n등록이 완료되었습니다!");
					System.out.println("등록하신 이름은 : " + na + " / 번호는 : " + nu + " / E-mail은 : " + nu + "입니다.");
				} else {
					// 메일이 중복시에 출력
					System.out.println("중복된 메일입니다. 다시 확인해 주세요.");
				}
				break;

			}

		}
	}
}

//https:sukw9512.tistory.com/97 [상이태상의 도서관:티스토리]