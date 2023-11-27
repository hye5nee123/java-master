package chap1;

import java.util.Scanner;

public class Exam98 {

	public static void main(String[] args) {
		
		//1번 
		String name ="감자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		System.out.println("이름 :" +name);
		System.out.println("나이 :" +age);
		System.out.printf("전화: %s-%s-%s\n",tel1, tel2, tel3);
		//2번
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 =Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("result =" + result);
		//3번
		/**String name1;
		String num;
		String tel;
		Scanner sc = new Scanner(System.in);

		System.out.print("1. 이름 :");
		name1 = sc.nextLine();
		System.out.print("2. 주민번호 :");
		num = sc.nextLine();
		System.out.print("3. 전화번호 :");
		tel = sc.nextLine();*/
		String scinput;
		
		
		
		
	
	  
	
	}// end main

}//end class 
