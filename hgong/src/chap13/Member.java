package chap13;

import lombok.Data;

@Data
//get set 선언 완.
public class Member {
	// 필드
	private String memberNo;
	private String memberName;
	private int point;

	// 생성자
	public Member(String memberNo, String memberName, int point) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.point = point;
	}

	// hashCode , equsals 정의하는 지에 따라서 동일객체.
	
/**	@Override
	public int hashCode() {
		return super.hashCode();
	}*/
}
