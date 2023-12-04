package casting;

public class Child extends Parent{
	//부모자식 관계
	private String phone;
	
	@Override
	String showInfo() {
		return super.showInfo() + " - " + phone;
		//부모가 가진 이름 나이에 폰까지 넣어줌
	}
}
