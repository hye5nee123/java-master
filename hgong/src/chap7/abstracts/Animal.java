package chap7.abstracts;

//추상클래스
public abstract class Animal {
	private String name;

	public Animal() {

	}

	public void setName() {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	// 추상 메소드
	//suoud를 꼭 구현해 줘야 에러가 안 남
	public abstract void sound();
	
}
