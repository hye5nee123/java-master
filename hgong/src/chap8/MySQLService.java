package chap8;
//상속 extends 부모클래+스
//구현 implements 인터페이스
public class MySQLService implements DataBaseService {
	//추상메소드 반드시 구현
	@Override
	public void add() {
		System.out.println("MySQL 입력처리.");
	}

	@Override
	public void modify() {
		System.out.println("MuSQL 수정처리");
		
	}

	@Override
	public void remove() {
		System.out.println("MySQL 삭제처리");
		
	}

}
