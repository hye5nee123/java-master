package chap5;

public class array {
	public static void main(String[] args) {
		int a = 10;
		int[] ary = {10, 20, 33,25,34};
		int sum = 0;
		for(int i=0;i <= ary.length-1;i++) { //배열의 길이에 -1 해줘야 함 (이유 배열은 0부터 시작해서 or <= 말고 < 해쥬면 된다
			sum +=  ary[i];   // sum = sum +ary[i];
		}System.out.println(sum);
		
		//*sum = ary[0]+ary[1]+ary[2];
		//System.out.println(" ary의 총합계는 "+sum+"입니다");*/
		
		int [] intAry = new int[5];
		String[] names = new String[10]; //공간선언(길이)
		System.out.println(intAry[0]);
		double[] heights = new double[3];
		System.out.println(heights[0]);  //숫자값은 초기값이 "0";
		names[0]= "홍길동";
		names[1]= "송강"; //변수 인덱스값 붙일 때 [] 대괄호 필수~~~
		names[2]= "서강준";
		System.out.println(names[0]);
		System.out.println(names[3]); // 클래스일시 초기값이 "null"
		System.out.println(names[1]); // ><
	}
}
