package chap3;

import java.util.*;

public class exam128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문 4
		int penNum = 534;
		int stuNum = 30;
		
		//학생 1명이 가지는 연필 개수
		int ppsNum = penNum / stuNum;
		System.out.println(ppsNum);
		
		int rempNum = penNum % stuNum;
		
		System.out.printf("학생당 연필 수 :%d , 남은 연필 수 : %d \n",ppsNum, rempNum);
		
		//문제 5
//		강제 타입 변환
		//문제 6
		
		int value = 356;
		System.out.println((value / 100)*100);
		
		
		//문제 7 
		float var1 = 10f;
		float var2 = var1 / 100;
		if(var2 == 0.1) {
			System.out.print("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		//문제 8
		int Top =5;
		int Bottom = 10;
		int Height = 7;
		double area = ((Top + Bottom)*Height/ 2.0);
		System.out.println(area);
		
		//문제 9
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 :");
		double num1 = sc.nextDouble();
		System.out.print("두번째 수");
		double num2 = sc.nextDouble();
		double num3 = num1 / num2;
		
		if(num2 == 0.0) { 
				System.out.println(" 결과 : 무한대" );
			
		}else {
			System.out.println("결과 : "+num3);
			
		}
		int won = 10;
		int three = 3;
		int ilsa = 14;
		double result14 = won * won *Double.parseDouble(three+ "."+ ilsa);
		System.out.println("원의 넓이:"+result14);
		
		//11
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디");
		String name = scanner.nextLine();
		
		System.out.print("패스워드");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(strPassword.equals("12345")){
				System.out.println("로그인 성공");
				}else { 
					System.out.println("로그인 실패:패스워드가 틀림");
				}
		} else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}
		
	}

}
