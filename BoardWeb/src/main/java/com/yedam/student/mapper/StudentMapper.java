package com.yedam.student.mapper;

import java.util.List;

import com.yedam.student.vo.Student;

public interface StudentMapper {
	// CRUD

	// 목록 가져오기
	List<Student> studentList();

	// 한건 등록
	int addStudent(Student std); // #{studentNo}

	// 삭제
	int remStudent(String sno); // #{sno}
}
