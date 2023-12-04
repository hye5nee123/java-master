package chap11.object;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		/**
		 * 1: YEAR, 2:MONTH Calendar.YEAR,MONTH,DATE,DAY_OF_WEEK(1 = 일요일)
		 */
		Calendar cal = Calendar.getInstance();
		// 년도 지정
		cal.set(1, 2022);
		// 월 지정
		cal.set(Calendar.MONTH,4);
		System.out.println(Calendar.MONTH);
		cal.set(Calendar.DATE,1);
		cal.set(2023,2,1);
		System.out.println("요일 " + cal.get(Calendar.DAY_OF_WEEK));
		// ActualMaximum = 이번달의 마지막 날
		System.out.println("막날: " + cal.getActualMaximum(Calendar.DATE));
	}

}
