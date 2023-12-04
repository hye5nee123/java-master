package chap7.abstracts;

public class Bird extends Animal{
	//밑에 추상 메소드를 구현하지 않으면 에러임
	@Override
	public void sound() {
		//추상클래스를 상속하는 자식클래스는 추성메소드 구현.
		System.out.println("짹짹");
	}

}
