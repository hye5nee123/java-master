package com.yedam.student.service;

import java.util.List;

import com.yedam.student.vo.Student;

public interface StudentService {
	// 목록,입력,수정,삭제,단건조회.
	List<Student> studentList();
	
	//학생 추가
	boolean addStudent(Student std);
	//학생 수정
	boolean modStudent(String sno, int escore, int mscore );
	//학생 삭제
	boolean remStudent(String sno);
	//단건조회
	Student getStudnet(String sno);
	
}
