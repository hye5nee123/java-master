package chap11.object;

public class MathExe {
	public static void main(String[] args) {
		long result = Math.round(1.2);
		System.out.println("round: " + result);
		double result1 = Math.rint(1.7);
		System.out.println("rint: " + result1);
		// 둘다 양수는 똑같음
		long resultR = Math.round(-1.8);
		System.out.println("round: " + resultR);
		double resultRi = Math.rint(-1.8);
		System.out.println("rint: " + resultRi);
		// 0 < = x <1
		/**
		 * for (int i = 1; i <= 10; i++) { int r = 100 + (int) (Math.random() * 10);
		 * System.out.println(r); }
		 */
		// 60 ~ 100 점.
		/**for (int i = 1; i <= 10; i++) {
			int r = 61 + (int) (Math.random() * 40); // 0 <= x < 40
			System.out.println(r);
		}*/

		// 1 ~6수.
	
	/**	int[] numbers = new int [5];
		int temp;
		//배열을 어떻게 표현하는지 모르겠음....
		//numbers[i] = nP;
		//int r = (int) (Math.random() * 6) + 1;
		//중복되지 않는 값을 배열에 넣고 싶다.
		for(int i=0;i<=numbers.length;i++) {
			
			//numbers[i] = int np;
			numbers[]++;
			if(r == i) {
				r--;
			}
			
			System.out.println(r);
		}*/
		int[] numbers = new int[5];
		for(int i =0;i<numbers.length;i++) {
			boolean exist = false;
			//체크
			int no = 1_(int) (Math.random()*6);
			for(int j =0; j<i;j++) {
				if(numbers[j] == no)
					exist = true;
			}
			//있으면 저장 안하고...
			if(exist) {
				i--;
				continue;
			}
			//없으면 저장
			numbers[i] = no;
		}
	}

}
/**
 * https://velog.io/@on-n-on-turtle/java-Math.random-%EC%9B%90%E
 * D%95%98%EB%8A%94-%EB%B2%94%EC%9C%84%EA%B
 * 9%8C%EC%A7%80-%EB%A7%8C%EB%93%9C%EB%8A%94-%EB%B2%95
 */
