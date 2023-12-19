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
		// int wonNum = 0;
		while (run) {
			System.out.println("*:..｡♡︎*ﾟ¨ﾟﾟ･*:..｡♡︎*ﾟ¨ﾟﾟ･*:..｡♡︎*ﾟ¨ﾟ･*:..｡♡︎*ﾟ¨ﾟﾟ･*:..｡♡︎*ﾟ¨ﾟﾟ･");
			System.out.println("안녕하세요");
			System.out.println(" ");
			System.out.println("1.로그인 2. 관리자 로그인");
			System.out.println(" ");
			System.out.println("*:..｡♡︎*ﾟ¨ﾟﾟ･*:..｡♡︎*ﾟ¨ﾟﾟ･*:..｡♡︎*ﾟ¨ﾟ･*:..｡♡︎*ﾟ¨ﾟﾟ･*:..｡♡︎*ﾟ¨ﾟﾟ･");
			int menu = Integer.parseInt(scn.nextLine());
			int no = 0;
			switch (menu) {
			case 1:
				boolean run1 = true;
				while (run1) {
					Employee am = null;
					System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ");
					System.out.println("id 입력");
					System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊");
					id = scn.nextLine();
					System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ");
					System.out.println("비밀번호 입력");
					System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ");
					pw = scn.nextLine();
					am = mdao.logInCheck(id, pw);
					if (am == null) {
						System.out.println("✎︎＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿");
						System.out.println("아이디, 비밀번호를 확인하세요");
						System.out.println("✎︎＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿");
						System.out.println("");
						// run =false;
					} else {

						System.out.println("");
						System.out.println("권한은 " + am.getWon_han() + "입니다");
						System.out.println("");

						System.out.println("");
						break;
					}
				}

				while (run) {
					System.out.println("✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎");
					System.out.println(" ");
					System.out.println("1.정보수정 2.게시글 작성 3.목록보기 4. 돌아가기");
					System.out.println(" ");
					System.out.println("✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎");
					menu = Integer.parseInt(scn.nextLine());
					switch (menu) {
					case 1:
						System.out.println(".₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ.₊̣̇");
						System.out.println("1.비밀번호 2.휴대폰번호 3.돌아가기");
						System.out.println(".₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ.₊̣̇");
						menu = Integer.parseInt(scn.nextLine());
						switch (menu) {
						case 1:
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ⋆⁺₊");
							System.out.println("새 비밀번호 입력");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ⋆⁺₊");
							pw = scn.nextLine();
							// wonNum = mdao.getWon_no();
							if (mdao.modifyAccount(id, pw)) {
								System.out.println("˗ˏˋ ♡ ˎˊ˗");
								System.out.println("수정 완료.");
								System.out.println("˗ˏˋ ♡ ˎˊ˗");
								System.out.println(" ");
							} else {
								System.out.println("  •᷄⌓•᷅   ");
								System.out.println("수정 실패.");
								System.out.println("  •᷄⌓•᷅   ");
								System.out.println(" ");
								break;
							}
							continue;

						case 2:
							System.out.println("☎※☎※☎※☎※");
							System.out.println("수정할 번호 입력");
							System.out.println("☎※☎※☎※☎※");

							String tel = scn.nextLine();
							if (mdao.modifyAccountT(id, tel)) {
								System.out.println("˗ˏˋ ♡ ˎˊ˗");
								System.out.println("수정 완료.");
								System.out.println("˗ˏˋ ♡ ˎˊ˗");
								System.out.println(" ");
							} else {
								System.out.println("  •᷄⌓•᷅   ");
								System.out.println("수정 실패.");
								System.out.println("  •᷄⌓•᷅   ");
								break;
							}

						case 3:
							continue;
						}

					case 2:
						System.out.println(".₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ");
						System.out.println("1.글작성 2.돌아가기");
						System.out.println(".₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ");
						no = Integer.parseInt(scn.nextLine());
						if (no == 1) {
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ");
							System.out.println("제목 입력 >>");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ");
							String jemok = scn.nextLine();
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ");
							System.out.println("내용 입력 >>");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ");
							String naeyoung = scn.nextLine();
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ");
							System.out.println("작성자 입력");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ");
							String jak = scn.nextLine();
							// 인스턴스 선언(이 배열을 사용하기 위해서!)
							Employee empg = new Employee(jemok, naeyoung, jak);

							if (dao.addGeul(empg)) {
								System.out.println("˗ˏˋ ♡ ˎˊ˗˗ˏˋ ♡ ˎˊ˗");
								System.out.println("저장 되었습니다.");
								System.out.println("˗ˏˋ ♡ ˎˊ˗˗ˏˋ ♡ ˎˊ˗");
							} else {
								System.out.println("!error!!error!");
								System.out.println("저장 중 오류 발생!");
								System.out.println("!error!!error!");
								break;
							}
							continue;
							// System.out.println("저장 되었습니다.");
						} else if (no == 2) {
							continue;
						}
						break;
					case 3:// 목록보기
						System.out.println(".₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ.₊̣̇.₊̣̇.ෆ*˚*");
						System.out.println("1.전체 글목록 조회 2.단건 조회 3.돌아가기");
						System.out.println(".₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ.₊̣̇.ෆ*˚*ෆ.₊̣̇.₊̣̇.ෆ*˚*");
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
							continue;

						} else if (no == 2) {
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ⋆⁺₊♡ ");
							System.out.println("조회할 글 번호 입력");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ⋆⁺₊♡ ");
							no = Integer.parseInt(scn.nextLine());
							Employee emp = dao.getGeul(no);
							if (emp != null) {
								emp.showInfo_ge();
							} else {
								System.out.println("  •᷄⌓•᷅     •᷄⌓•᷅     •᷄⌓•᷅     •᷄");
								System.out.println("존재하지 않거나 삭제된 글입니다.");
								System.out.println("  •᷄⌓•᷅     •᷄⌓•᷅     •᷄⌓•᷅     •᷄");
							}
							continue;

						} else if (no == 3) {
							continue;
						}
					case 4:
						run1 = false;
					}
					break;
//					break;
					// 여기다 break 걸면 id 입력

				}
				break;

			case 2: {
				while (run) {
					System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ");
					System.out.println("관리자 코드 입력");
					System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡ ");
					no = Integer.parseInt(scn.nextLine());
					if (no == 1234) {
						System.out.println("✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎");
						System.out.println("오늘도 좋은 하루 보내세요");
						System.out.println("1.회원정보 등록 2.글삭제 3.나가기");
						System.out.println("✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎✿︎");
						menu = Integer.parseInt(scn.nextLine());
						switch (menu) {
						case 1: // 회원등록
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡");
							System.out.println("사번 입력>>");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡");
							no = Integer.parseInt(scn.nextLine());
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡");
							System.out.println("사원 id 입력>>");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡");
							id = scn.nextLine();
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡");
							System.out.println("비밀번호 입력");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺₊ ♡");
							pw = scn.nextLine();
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺");
							System.out.println("이름 입력");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺");
							String name = scn.nextLine();
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺");
							System.out.println("권한 부여");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺");
							String han = scn.nextLine();
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺♡ ⋆⁺₊⋆");
							System.out.println("전화번호 입력");
							System.out.println("♡ ⋆⁺₊⋆ ☾⋆⁺♡ ⋆⁺₊⋆");
							int tel = Integer.parseInt(scn.nextLine());

							Employee empA = new Employee(no, id, pw, name, han, tel);

							if (mdao.addEmployee(empA)) {
								System.out.println("˗ˏˋ ♡ ˎˊ˗˗ˏˋ ♡ ˎˊ˗");
								System.out.println("저장되었습니다.");
								System.out.println("˗ˏˋ ♡ ˎˊ˗˗ˏˋ ♡ ˎˊ˗");
							} else {
								System.out.println("!error!!error!");
								System.out.println("저장 중 오류 발생!");
								System.out.println("!error!!error!");
							}
							continue;

						case 2:// 글삭제
							System.out.println("ᨎᨎᨎᨎᨎᨎᨎᨎᨎᨎ");
							System.out.println("삭제할 글 번호 입력");
							System.out.println("ᨎᨎᨎᨎᨎᨎᨎᨎᨎᨎ");
							no = Integer.parseInt(scn.nextLine());
							if (dao.removeEmployee(no)) {
								System.out.println("♡♥♡♥♡♥♡♥");
								System.out.println("삭제완료");
								System.out.println("♡♥♡♥♡♥♡♥");
							} else {
								System.out.println("!error!");
								System.out.println("삭제실패");
								System.out.println("!error!");
							}
							continue;

						case 3:

							break;
						}
					} else {
						System.out.println("※※※※※※※");
						System.out.println("제한된 접근");
						System.out.println("※※※※※※※");
					}
					break;

				}

			}
				break;

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
