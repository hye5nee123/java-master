package todo.P20231201;

public class CalendarExe {
	public static void main(String[] args) {
		// 달력.
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };

		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println();
		// 빈공백 생성
		for (int i = 0; i < 5; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= 31; i++) {
			if( i ==3) {
				System.out.println();
			}
			// System.out.print(" ");
			System.out.printf("%4d", i);
			// System.out.print("");
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n== the end == ");
	}
}
