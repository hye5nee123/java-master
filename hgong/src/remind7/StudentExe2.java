package remind7;

public class StudentExe2 {
	private Student[] students;

	StudentExe2() {
		students = new Student[100];
	}

	boolean addStudent(Student std) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = std;
				return true;
			}
		}
		return false;

	}

	// 목록
	Student[] getStudentList() {
		return students;
	}

	// 단건조회
	Student getStudent(String no) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudNo().equals(no))
				return students[i];
		}
		return null;
	}

	// 수정
	boolean modifyStudent(String no, int eng, int mat) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudNo().equals(no)) {
				students[i].setEngScore(eng);
				students[i].setMatScore(mat);
				return true;
			}
		}
		return false;
	}

	// 삭제
	boolean removeStudent(String name) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudName().equals(name)) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}

}// end of Class
