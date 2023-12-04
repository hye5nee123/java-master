package chap8;

//추상클래스처럼 추상메소드.
/**
 * Oracle: insert(), update() / MySQL : add(),modify () /
 */
public interface DataBaseService {
	// 변수로는 쓰지 못함 그저 규칙만 제시할 뿐 ^^
	public static final String name = ""; // 상수만 선언 ㄱㄴ
	// 입력, 수정, 삭제
	
	
	//인터페이스에서는 모든 메소드가 추상메소드.
	public void add();

	public void modify();

	public void remove();
}
