package remind6;
//외부에서 접근 가능한 퍼블릭 클래스 생성
public class Student {
//필드에 학생들 속성 정의
	private String studNo;
	private String studName;
	private int engScore;
	private int matScore;
	//필드 초기화 
	Student(){
		
	}
	Student( String studNo, String studName, int engScore, int matScore) {
		this.studNo = studNo;
		this.studName = studName;
		this.engScore = engScore;
		this.matScore = matScore; 
	}
	//메소드 기능
	void showInfo() {
		System.out.println("학생번호는" + studNo+"이고 이름은"+ studName + "이고 영어 점수는"+engScore+"수학점수는"+matScore);
	}
	//setter
	void setStudNo(String studNo) {
		this.studNo = studNo;
	}
	void setStudName(String studName) {
		this.studName = studName;
	}
	void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	void setMatScore(int matScore) {
		this.matScore = matScore;
	}
	//getter
	String getStudNo() {
		return studNo;
	}
	String getStudName() {
		return studName;
	}
	int getEngScore() {
		return engScore;
	}
	int getMatScore() {
		return matScore;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
