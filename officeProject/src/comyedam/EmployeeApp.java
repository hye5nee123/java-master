package comyedam;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		boolean run = true;
		Employee[] employees = new Employee[10000];
		String id;
		String pw;
		Scanner scn = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeMemDAO mdao = new EmployeeMemDAO();
		System.out.println("안녕하세요");
		System.out.println("1.로그인 2. 관리자 로그인");
		int no = Integer.parseInt(scn.nextLine());
		while (run) {
			Employee am = null;
			System.out.println("id 입력");
			id = scn.nextLine();
			System.out.println("비밀번호 입력");
			pw = scn.nextLine();
			am = mdao.logInCheck(id, pw);
			if (am == null) {
				System.out.println("아이디, 비밀번호를 확인하세요");

			} else {
				System.out.println("권한은 " + am.getWon_han() + "입니다");
				break;
			}
		}
		System.out.println("");
		while (run) {
			System.out.println("1.정보수정 2.게시글 작성 3.목록보기 4. 돌아가기");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				System.out.println("1.비밀번호 2.휴대폰번호 3.돌아가기");
				no = Integer.parseInt(scn.nextLine());
				if (no == 1) {
					System.out.println("회원 번호 입력");
					no = Integer.parseInt(scn.nextLine());
					System.out.println("새 비밀번호 입력");
					pw = scn.nextLine();
					if (mdao.modifyAccount(no, pw)) {
						System.out.println("수정 완료.");
					} else {
						System.out.println("수정 실패.");
					}
					break;
				} else if (no == 2) {
					System.out.println("회원 번호 입력");
					no = Integer.parseInt(scn.nextLine());
					System.out.println("수정할 번호 입력");
					String tel = scn.nextLine();
					if (mdao.modifyAlindT(no, tel)) {
						System.out.println("수정 완료.");
					} else {
						System.out.println("수정 실패.");
					}
					break;
				} else if (no == 3) {
					break;
				}
			case 2:
				System.out.println("1.글작성 2.돌아가기");
				no = Integer.parseInt(scn.nextLine());
				if (no == 1) {
					System.out.println("제목 입력 >>");
					String jemok = scn.nextLine();
					System.out.println("글 번호 입력");
					int num = Integer.parseInt(scn.nextLine());
					System.out.println("내용 입력 >>");
					String naeyoung = scn.nextLine();
					System.out.println("작성자 입력");
					String jak = scn.nextLine();
					System.out.println("일시 입력 >>");
					String ilsi = scn.nextLine();

					Employee emp = new Employee(num, jemok, naeyoung, jak, ilsi);

					if (dao.addGeul(emp)) {
						System.out.println("저장 되었습니다.");
					} else {
						System.out.println("저장 중 오류 발생!");
					}
					// System.out.println("저장 되었습니다.");
					break;
				} else if (no == 2) {
					break;
				}
			case 3:// 목록보기
				System.out.println("1.전체 글목록 조회 2.단건 조회 3.돌아가기");
				no = Integer.parseInt(scn.nextLine());
				if (no == 1) {
					for (Employee empl : dao.getEmployeeList()) {
						if (empl != null) {
							empl.showInfo_ge();
						}
					}
					for (int i = 0; i < employees.length; i++) {
						if (employees[i] != null) {
							employees[i].showInfo_ge();
						}
					}
					break;
				} else if (no == 2) {
					System.out.println("조회할 글 번호 입력");
					no = Integer.parseInt(scn.nextLine());
					String num = "";
					Employee emp = dao.getGeul(num);
					if (emp != null) {
						emp.showInfo_ge();
					} else {
						System.out.println("존재하지 않거나 삭제된 글입니다.");
					}
					break;

				} else if (no == 3) {
					break;
				}
			case 4:
				break;
			}
			break;
		}
	}
}
