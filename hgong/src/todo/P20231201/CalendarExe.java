package todo.P20231201;

import java.util.Calendar;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CalendarExe {
	public static void main(String[] args) {
		int year = 2023;
		int month = 9;
		
		System.out.println(year+"년"+month+"월 달력");
		Calendar today = Calendar.getInstance();
		
		//10월 달력 작성.
		today.set(Calendar.YEAR,year);
		today.set(Calendar.MONTH,(month-1));
		today.set(Calendar.DATE,1);
		
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		today.set(9, 2023);
		// 일 지정
		today.set(Calendar.DATE, 1);
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println();
		//빈공백 생성.
		int spaces = today.get(Calendar.DAY_OF_WEEK);
		for (int i = 0; i <= spaces; i++) {
			System.out.printf("%4s","");
			}
		int lastDate = today.getActualMa
		}
		
		//int lastData 

		// 달력.
		// String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };

		/**
		 * for (String day : days) { System.out.printf("%4s", day); }
		 * System.out.println(); // 빈공백 생성 for (int i = 0; i < 5; i++) {
		 * System.out.printf("%4s", ""); } for (int i = 1; i <= 31; i++) { if( i ==3) {
		 * System.out.println(); } // System.out.print(" "); System.out.printf("%4d",
		 * i); // System.out.print(""); if (i % 7 == 0) { System.out.println(); } }
		 * System.out.println("\n== the end == ");
		 */
	
	//https://qh5944.tistory.com/21
	//https://reakwon.tistory.com/190
	}

