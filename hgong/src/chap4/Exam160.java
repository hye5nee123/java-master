package chap4;

import java.util.Scanner;

public class Exam160 {

	public static void main(String[] args) {
		// 2번 :3의 배수의 합
		/**int i =1;
		int sum =0;
		for( i =1; i<=100;i++) {
			if(i% 3 ==0) {
				 sum += i;
			}
		System.out.println(sum);
		}*/
		//2번 : 3의 배수의 합
		/**int i = 1;
		int sum = 0;
		for(i =1; i <= 100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}*/
		//System.out.println(sum);
		//3번
		/**while(true) {
			int num1 = (int) (Math.random()*6)+1;
			int num2 = (int) (Math.random()*6)+1;
			System.out.println(num1+","+num2);
			if(num1 + num2 !== 5);
		{
			
		}*/
		
		

		//4번
		/**for( int i =1;i <= 10;i++) {
			for(int y =1; y <=10;y++) {
		}	
			if((4*i) + (5*y) == 60) {
			
		}*/
		
		//5번\
		/**for(let i =1; i<=4;i++){
		 * for(let j =1; j <=i;j++){
		 * console.log("*")
		 * }let stars += j;
		 * console.log(stars);
		 * }
		 * */
		//5번
		/**for(int i= 1; i <=4;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			} System.out.println( );
		} */
		//6번
		/*for(let i =1; i<=4; i++){
		 * for(let b =4-i;b<=i;--){
		 * console.log(" ")
		 *  }
		 * for(let s = 1; s <= i; s++){
		 * console.log("*")
		 *  }
		 * }
		 */
		//6번
		/*String star ="";
		for(int i = 1;i<=4;i++) {
			for(int b=0;b < 4-i;b++) {
				star += " ";
			}
			for(int s =1;s <=i;s++) {
				star += "*";
			}
			star += "\n";
		}
		System.out.println(star);*/
		//7번
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		int money = 0;
		
		while(run) {
			System.out.println("==============================================");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.print("선책 > ");
			int sNum = sc.nextInt();
			
			switch(sNum) {
			case 1 :
				System.out.print("예금액 > ");
				money = sc.nextInt();	
				balance += money;
				break;
			case 2 :
				System.out.print("출금액 > ");
				money = sc.nextInt();	
				if(money > balance) {
					System.out.println("잔고부족!");
				}else {
					balance -= money;
				}
				break;
			case 3 :
				System.out.println("잔고 > " + balance);
				break;
			
			case 4 :
				System.out.println("프로그램 종료");
				run = false;
				//런이 f를 만나면 끝
				}
			System.out.println("==============================================");}
			
	} //main end

} //class end
