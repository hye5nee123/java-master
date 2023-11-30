package chap7;

import lombok.Data;

//자식: UnivFriend -> Friend(부모)
@Data // ctrl + space
public class UnivFriend extends Friend {
	private String univ; // 학과
	private String major; // 전공

	// 기본 생성자
	public UnivFriend() {

	}

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone); // super는 부모 클래스
		this.univ = univ;
		this.major = major;
	}

	// 자식이 showINfo 재정의 가능
	@Override
	public String showInfo() {
		return "이름은" + getName() + "연락처는" + getPhone() + "학교는" + univ + "전공은" + major;
	}
	//to String랑 시작점이 다름

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
