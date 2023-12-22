package com.yedam.student.serviceImpl;

import java.util.List;

import com.yedam.student.mapper.StudentDAO;
import com.yedam.student.service.StudentService;
import com.yedam.student.vo.Student;

public class StudentServiceImpl implements StudentService {
	// interface 는 어떤 클래스를 구현하는 지 설명 필요!

	// IMpl > implementation 이행 (구현)한다는 뜻

	StudentDAO dao = new StudentDAO();

	@Override
	public List<Student> studentList() {
		// dao.getStudnet("");
		return dao.getStudentList();
	}

	@Override
	public boolean addStudent(Student std) {

		return dao.addStudent(std);
	}

	@Override
	public boolean modStudent(String sno, int escore, int mscore) {

		return dao.modifyStudent(sno, escore, mscore);
	}

	@Override
	public boolean remStudent(String sno) {

		return dao.removeStudent(sno);
	}
	
	//단건조회
	@Override
	public Student getStudnet(String sno) {
		
		return dao.getStudnet(sno);
	}

}
