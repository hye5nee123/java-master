package chap4;

public class Exam140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주사위 번호 뽑기 
		int num = (int)(Math.random() * 6) +1;
		if(num == 1) {
			System.out.println("1번 나옴");
		}else if(num == 2) {
			System.out.println("2번 나옴");
		}else if(num ==3) {
			System.out.println("3번 나옴");
		}else if(num ==4) {
			System.out.println("4번 나옴");
		}else if(num ==5) {
			System.out.println("5번 나옴");
		}else {
			System.out.println("6번 나옴");
		}
		
		//switch문
		switch(num) {
		case 1:
			System.out.println("s1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("s2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("s3번이 나왔습니다");
			break;
		case 4:
			System.out.println("s4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("s5번이 나왔습니다.");
			break;
		default:
			System.out.println("s"
					+ "s6번이 나왔습니다.");
		}
	} //end main

} //end class
