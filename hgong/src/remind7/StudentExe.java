package remind7;

import java.util.ArrayList;

public class StudentExe {
	// ArrayList = class
	private ArrayList<Student> students;
	// 배열
	// private Student[] students;

	StudentExe() {
		students = new ArrayList<Student>();
		students.add (new Student("B001" , "이것이 자바다", "신용권"))
		//students = new Student[100];
		// 필드
	}
	//boolean으로 만든 이유
	boolean addStudent(Student std) {
		return students.add(std);
		// return false 하는 이유?
	}

	// 목록
	ArrayList<Student> getStudentList() {
		return students;
	}

	// 단건조회
	Student getStudent(String studNo) {
		for (int i = 0; i < students.size(); i++) {
			if ( students.get(i)!= null&& students.get(i).getStudNo().equals(studNo)) {
				return students.get(i);
			}
		}
		return null;
		//반복문을 돌려 똑같은 넘버 없으면 널 반환.
	}

	// 수정
	boolean modifyBook(String no, int eng, int mat) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) != null && students[i].getStudNo().equals(no)) {
				students.get(i).setEngScore(eng);
				students.get(i).setMatScore(mat);
				return true;

			}
		}
		return false;
	}

	// 삭제
	boolean removeBook(String name) {
		for (int i = 0; i < students.length; i++) {
			if (students.get(i) != null && students.get(i).getStudentNo().equals(studNo)) {
				students.remove(i);
				return true;
			}
		}
		return false;
	}

}// end of class
