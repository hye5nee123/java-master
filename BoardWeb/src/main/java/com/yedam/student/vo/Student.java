package com.yedam.student.vo;

//외부에서 접근 가능한 퍼블릭 클래스 생성
public class Student {
//필드에 학생들 속성 정의
	private String studNo;
	private String studName;
	private int engScore;
	private int matScore;

	// 생성자 정의
	public Student() {

	}

	public Student(String studNo, String studName, int engScore, int matScore) {
		this.studNo = studNo; // student_number
		this.studName = studName;

		this.engScore = engScore;
		this.matScore = matScore;
	}

	// 메소드 기능
	public void showInfo() {
		System.out.println("학생번호는" + studNo + "이고 이름은" + studName + "이고 영어 점수는" + engScore + "수학점수는" + matScore);
	}

	// setter
	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}

	// getter
	public String getStudNo() {
		return studNo;
	}

	public String getStudName() {
		return studName;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMatScore() {
		return matScore;
	}
}
