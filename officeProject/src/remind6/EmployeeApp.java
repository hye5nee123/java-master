package remind6;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		boolean run = true;
		Employee[] employees = new Employee[10000];
		/* 참조변수 */

		// employee class 기능을 쓰기 위해서 인스턴스 선언!
		Employee empy = new Employee();
		String id = null;
		String pw = null;
		Scanner scn = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeMemDAO mdao = new EmployeeMemDAO();
		int wonNum = 0;
		System.out.println("안녕하세요");
		while(run) {
		System.out.println("1.로그인 2. 관리자 로그인");
		int menu = Integer.parseInt(scn.nextLine());
		int no = 0;
		 switch(menu) {
		 case 1: 
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
						System.out.println("");
			while (run) {
				System.out.println("1.정보수정 2.게시글 작성 3.목록보기 4. 돌아가기");
				menu = Integer.parseInt(scn.nextLine());
				switch (menu) {
				case 1:
					System.out.println("1.비밀번호 2.휴대폰번호 3.돌아가기");
					no = Integer.parseInt(scn.nextLine());
					switch (menu) {
					case 1:
						System.out.println("새 비밀번호 입력");
						pw = scn.nextLine();
						// wonNum = mdao.getWon_no();
						if (mdao.modifyAccount(id, pw)) {
							System.out.println("수정 완료.");
						} else {
							System.out.println("수정 실패.");
						}
						break;
					case 2:
						System.out.println("수정할 번호 입력");
						String tel = scn.nextLine();
						if (mdao.modifyAccountT(id, tel)) {
							System.out.println("수정 완료.");
						} else {
							System.out.println("수정 실패.");

						}
					case 3: break;
					} 
					
				case 2:
					switch(menu) {
					System.out.println("1.글작성 2.돌아가기");
					menu = Integer.parseInt(scn.nextLine());
					case 1 :
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

						Employee empg = new Employee(num, jemok, naeyoung, jak, ilsi);

						if (dao.addGeul(empg)) {
							System.out.println("저장 되었습니다.");
						} else {
							System.out.println("저장 중 오류 발생!");
						}
						// System.out.println("저장 되었습니다.");
						break;
					 case 2: 

						break;
					}
					break;
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
						Employee emp = dao.getGeul(no);
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

		} else if (no == 2) {
			System.out.println("관리자 코드 입력");
			no = Integer.parseInt(scn.nextLine());
			if (no == 1234) {
				System.out.println("오늘도 좋은 하루 보내세요");
				System.out.println("1.회원정보 등록 2.글삭제 3.나가기");
				menu = Integer.parseInt(scn.nextLine());
				switch (menu) {
				case 1: // 관리자 권한 회원 추가
					System.out.println("사번 입력>>");
					no = Integer.parseInt(scn.nextLine());
					System.out.println("사원 id 입력>>");
					id = scn.nextLine();
					System.out.println("비밀번호 입력");
					pw = scn.nextLine();
					System.out.println("이름 입력");
					String name = scn.nextLine();
					System.out.println("권한 부여");
					String han = scn.nextLine();
					System.out.println("전화번호 입력");
					int tel = Integer.parseInt(scn.nextLine());

					Employee empA = new Employee(no, id, pw, name, han, tel);

					if (mdao.addEmployee(empA)) {
						System.out.println("저장되었습니다.");
					} else {
						System.out.println("저장 중 오류 발생!");
					}
					break;
				case 2:// 글삭제
					System.out.println("삭제할 글 번호 입력");
					no = Integer.parseInt(scn.nextLine());
					if (dao.removeEmployee(no)) {
						System.out.println("삭제완료");
					} else {
						System.out.println("삭제실패");
					}
					break;
				case 3:
					break;
				}
			}
		}
			}
		}
}
// System.out.println("접근이 제한되었습니다.")

}

//disconn 참고 

/**
 * https://cobook.tistory.com/6
 * 
 */
