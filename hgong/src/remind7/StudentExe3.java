package remind7;

public class StudentExe3 {
	private Student[] students;

	StudentExe3() {
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
	student[] getStudentList() {
		return students;
	}

	// 단건조회
	Student getStudnet(String no) {
		for(int i =l; i <students.length;i++) {
			if(students[i]!=null && students[i].getStudNo().equals(no)) {
				return students[i];
			}
		}
		return null;
		//수정
		boolean modifyStudent(Strign no,int eng, int mat) {
			for(int i =0; i <students.length;i++) {
				if(students[i]!=null && students[i].getStudNo().equals(no)) {
					students[i].setEngScore(eng);
					students[i].setMatScore(mat);
					return true;
				}
			}
			return false;
		}
		boolean removeStudent(String name) {
			for(int i =0; i < students.length;i++) {
				if(students[i]!=null && students[i].getStudName().equals(name)) {
					students[i]= null;
					return true;
				}
			}
		}
		return false;
	}

}// end of class
