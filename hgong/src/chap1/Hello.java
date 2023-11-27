package chap1;

import java.util.Scanner;
// ctrl + shift + o

public class Hello {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello, java");
		
		int x = 5;
		int y = x + 10;
		System.out.println(y);
		
		double z = 3.5;
		System.out.println(z);
		System.out.println("y = " +y);
		
		//변수의 값 교환
		x = 3;
		y = 10;
		//값 교환
		int c = x;
		x = y;
		y = c;
		//값 출력
		System.out.println("x =" + x);
		System.out.println("y =   "+ y);
		System.out.println(0b1011);
		
		
		// 기본타입
		// 크기 순서 byte< short< char(음수표현 x)< int< long
		char charData = 'a';
		int intData = charData;
		//문자 타입이 아니라 정수타입 
		System.out.println("char : " +charData + ", int :  " + intData);
		
		char c1 = 'a';
		int c2 = c1 + 2; // 덧셈 연산시 자동타입변환
		char c3 = (char)c2; //강제 타입 변환 시킴
		System.out.printf("c2의 값은 %d, c3의 값은 %s \n",c2,c3);
		x = 5;
		y = 2;
		double result = (double)x / y;
		//x나 y에 (double)를 넣기(강제변환)
		System.out.println(result);
		double var1 = 3.5;
		double var2 = 2.7;
		int result2 = (int)(var1 + var2);
		System.out.println(result2);
		
		long let1 = 2L;
		float let2 = 1.8f;
		double let3 = 2.5;
		String let4 = "3.9";
		int result3 = (int)(let1 + let2 + let3) + (int)Double.parseDouble(let4);
		System.out.println(result3);
		
		
	 	//표준 입력 : 키보드 => System.in.read();
		//한 글자만 읽어용
		
//		int keyCode;
//		
//		while(true){
//			keyCode = System.in.read();
//			System.out.println("keyCode : "+ keyCode);
//			if(keyCode == 113) {
//				break;
//				}
//			}
//		System.out.println("종료");
//		
		// 문자열 입력 => Scanner class -> 객체 생성 해서 사용
		String scinput;
		Scanner sc = new Scanner(System.in);
		while(true) {
			//ctrl + shft + o -> import 하는 키
			System.out.print("이름 입력:");
			//Scanner로 입력 받을때는 위든 어디에 받을지 넣어라
			scinput = sc.nextLine();
			if(scinput.equals("q")) {
				//반드시 알아놓기!
				break;
			}
			System.out.println("내 이름은 "+ scinput);

		}
		System.out.println("종료");
		
		System.out.println("수 입력");
		scinput = sc.nextLine();
		System.out.println(Integer.parseInt(scinput) + 10);
		//문자를 데려옴
	
		
		
		
		
		
		sc.close();
		//scanner에 노란색 줄 생기는 거 X
		
		
	} //end main
} //end class
		