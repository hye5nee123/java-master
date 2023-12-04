package chap10;

public class ExceptionExe {
	public static void main(String[] args) {

		System.out.println("end of prog");
	}

	public static void test() {
		// 위치에 그 클래스 존재여부 알려줌(컴파일 시점)
		// 일반 예외: 예외를 처리.
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
