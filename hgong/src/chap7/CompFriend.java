package chap7;

//Friend 상속 + 회사, 부서       생성자 메소드들을 그대로 물려받음
public class CompFriend extends Friend {
	// 필드.
	private String company;
	private String dept;

	// 기본 생성자.
	public CompFriend(String name, String phone,String company, String dept) {
		super(name, phone);       //super는 부모 클래스
		this.company = company;
		this.dept = dept;
	}

	// 메소드 getter , setter.
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDept() {
		return dept;

	}

	public void setPhone(String dept) {
		this.dept = dept;
	}
}
