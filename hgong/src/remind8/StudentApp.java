package remind8;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		StudentExe exe = new StudentExe();
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Student[] students = new Student[100];
		while (run) {
			System.out.println("1.등록 2.목록 3. 단건조회 4. 수정 5. 삭제 6. 종료");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				System.out.println("학생 번호 입력");
				String no = scn.nextLine();
				System.out.println("학생 이름 입력");
				String name = scn.nextLine();
				System.out.println("영어 점수 입력");
				int eng = Integer.parseInt(scn.nextLine());
				System.out.println("수학 점수 입력");
				int mat = Integer.parseInt(scn.nextLine());
				Student std = new Student(no, name, eng, mat);
				if (exe.addStudnet(std)) {
					System.out.println("저장 되었습니다.");
				} else {
					System.out.println("저장 중 오류 발생");
				}
				break;
			case 2:
				for (Student stdnt : exe.getStudentList()) {
					if (stdnt != null) {
						stdnt.showInfo();
					}
				}
				for (int i = 0; i < students.length; i++) {
					if (students[i] != null) {
						students[i].showInfo();
					}
				}
				break;
			case 3:
				System.out.println("조회할 학생 번호 입력");
				no = scn.nextLine();
				// 뭔 뜻이노
				// class 타입으로 선업 : 문자 숫자 다 담겠다.
				Student stnt = exe.getStudent(no);
				if (stnt != null) {
					stnt.showInfo();
				} else {
					System.out.println("존재하지 않는 정보");
				}
				break;
			case 4:
				System.out.println("조회할 학생 번호 입력");
				no = scn.nextLine();
				System.out.println("영어 점수 입력>>");
				eng = Integer.parseInt(scn.nextLine());
				System.out.println("수학 점수 입력");
				mat = Integer.parseInt(scn.nextLine());

				if (exe.modifyStudent(no, eng, mat)) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패.");
				}
				break;
			case 5:
				System.out.println("삭제할 학생 이름 입력>>");
				name = scn.nextLine();
				if (exe.removeStudent(name)) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 6:
				System.out.println("프로그램 종료합니다.");
				run = false;
			}

		} // end of while.
		System.out.println("end of prog");
	}

}
