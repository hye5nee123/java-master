package remind7;

public class StudentExe {
	// 배열
	private Student[] students;

	StudentExe() {
		students = new Student[100];
		// 필드
	}

	boolean addStudent(Student std) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = std;
				return true;
			}
		}
		return false;
		// return false 하는 이유?
	}

	// 목록
	Student[] getStudentList() {
		return students;
	}

	// 단건조회
	Student getStudent(String no) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudNo().equals(no)) {
				return students[i];
			}
		}
		return null;
	}

	// 수정
	boolean modifyStudent(String no, int eng, int mat) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudNo().equals(no)) {
				students[i].setEngScore(eng);
				students[i].setMathScore(mat);
				return true;

			}
		}
		return false;
	}
	//삭제
	boolean removeStudent(String name) {
		for(int i = 0; i< students.length;i++) {
			if(students[i] != null && students[i].getStudName().equals(name)) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}

}// end of class
