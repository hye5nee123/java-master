package chap8;

public class OracleService implements DataBaseService {

	@Override
	public void add() {
		System.err.println("Oracle 입력처리");

	}

	@Override
	public void modify() {
		System.err.println("Oracle 수정처리");

	}

	@Override
	public void remove() {
		System.err.println("Oracle 삭제처리");

	}

}
