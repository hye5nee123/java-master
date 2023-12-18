package gongbu;

import java.util.Arrays;

public class Java {
	public static void main(String[] args) {
		int[] score = new int[5];
		score[3] = 100;
		System.out.println(score[3]);

		String[] st = new String[100];
		st[30] = "80";
		System.out.println(st[30]);

		// st9 = new int[100]; >error
		int[] art;
		art = new int[] { 7, 8, 9, 10 };
		for (int i = 0; i < art.length; i++) {
			System.out.println(" art의 요소는 " + art[i] + ",");
		}

		int[] zi = new int[100];
		zi[3] = 80;

		String[] zzz = new String[60];
		zzz[5] = "가나다";

		double[] num = { 10, 90, 10.00 };
		System.out.println(num[0]);

		char[] ch = new char[10000];

		char[] mz;
		mz = new char[] { '안', '녕', '하', '세', '요' };
		System.out.println(mz);
		System.out.println(Arrays.toString(mz));

		int sum = 0;
		int avg = 0;
		int[] scr = {100,90,80,101};
		for( int i = 0;i<scr.length;i++){
			sum += scr[i];
		}avg=sum/scr.length;
		
		System.out.println("총합 :"+sum);System.out.println("평균 :"+avg);
		
		int [] sss = {7,20,70,444};
		int max = sss[0];
		int min = sss[0];
		
		for(int i =1;i < sss.length;i++) {
			if(sss[i] > max) {
				max = sss[i];
			} else if(sss[i] < min) {
				min = sss[i];
			}
		}//end of for
		
		
		System.err.println("max값은" + max);
		System.out.println("min 값은" + min);
		
		//이해불가
		int[] numArr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < 100;i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
		
		//로또 번호 만들기
		
		int [] ball = new int[45]; //45개의 정수값을 저장하기 위한 배열 생성.
		
		for(int = 0; i < ball.length;i++) 
			ball[i] = i+1;
		
		int tmp = 0;
		int j = 0;
		
		for(int i =0; i <6;i++) {
			j= (int)(Math.random() *45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
			
		
		
		
		
		
		
		
		
	}//end of main;

	private String[] mz;

	@Override
	public String toString() {

		return "한국인들 인사는" + mz[1];
	}

	// 배열의 총합 구하기

	/**
	 * int sum =0; int avg = 0; int[] scr = new int[100]; scr[1] = 10;
	 */



}
