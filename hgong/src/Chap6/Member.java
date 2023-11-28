package Chap6;
//public <-> private
public class Member {
	//속성(필드)
	private int memberNo;
	private String memberName;
	private String phone;
	private String gender; //Men or Women => M, W
	
	//생성자 :필드의 초기값 지정.
	//기본 생성자 컴파일러가 생성.
	Member(){
		
	}
	public Member(int memberNo, String memberName, String phone, String gender) {
		
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.phone = phone;
		this.gender = gender;
	}
	Member(int memberNo, String memberName){
		this.memberNo = memberNo;
		this.memberName = memberName;
	}
	//가능 (메소드) void는 반환 되는 값 X
	void showInfo() {
		System.out.println("이름은" + memberName+"이고 연락처는"+ phone + "입니다.");
	}
	String showAllInfo() {
		String result = "이름은" + memberName + "이고 번호는" + memberNo + "이고 연락처는" //
						+ phone + "이고 성별은" +gender+ "입니다.";
		return result;
	}
	//memberNo의 값을 지정하는 메소드 생성
	//generate set ~ 자동으로 지정 가능
	void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	//getter
	int getMemberNo() {
		return memberNo;
	}
	String getMemberName() {
		return memberName;
	}
	String getPhone() {
		return phone;
	}
	String getGender() {
		return gender;
	}
}
