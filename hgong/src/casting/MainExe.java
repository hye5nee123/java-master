package casting;

public class MainExe {
	public static void main(String[] args) {
		
		//8 byte     4 byte (자형 ㄱㄴ)
		double d1 = 100;
		
		//반대는 불가 double 에서 int 로 불가능 ex) int n1 = 100.0;
		int n1 = (int)100.0;

		// promotion.(자동 형변환)
		Parent p1 = new Child();
		// 데이터값이 다른데 에러가 안 뜨는 이유는 자식 클래스라서 원래는 Parent p1 = (parent)new Child(); 해줘야 함

		// casting.(강제 형변환)
		// Child c1 = (Child) new Parent();
		// 부모는 자식한테 자동형변환 불가능

		// 강제 형변환
		/**
		 * 자식 인스턴스는 강제형변환 OK. 부모 인스턴스는 강제형변환 NG.
		 */
		// 에러 : 컴파일에러/ 실행에러
		Parent p2 = new Parent();
		// 부모클래스의 인스턴스 p2
		Child c2 = new Child();
		// 자식클래스의 인스턴스 c2

		// 자동 형변환 가능 문제 X
		// p2 = c2;
		// 형변환 전 인스턴스 유형 체크 !
		if (p2 instanceof Child) {
			Child c3 = (Child) p2;
		}
		// p2 = c2 작업 없이 위 작업 이행하면 실행에러 난다 or if 문에 담아주면 된다
		System.out.println("end of prog.");
		// Child c3 = (Child) p2;
	}

}
