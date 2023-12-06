package remind8;

public class StudentExe {
	private Student[] students;

	StudentExe() {

		students = new Student[100];

	}

	boolean addStudnet(Student std) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = std;
				return true;
			}
		}
		return false;
	}

	Student[] getStudentList() {
		return students;
	}

	Student getStudent(String no) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudNo().equals(no)) {
				return students[i];
			}
		}
		return null;
	}

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

	boolean removeStudent(String name) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudName().equals(name)) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}

}
