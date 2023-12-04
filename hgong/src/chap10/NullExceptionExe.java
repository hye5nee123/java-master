package chap10;

public class NullExceptionExe {
	public static void main(String[] args) {
		// Null 값을 참조할 경우 [주의]
		String name = "Hong";

		name = null;
		String menu = "2";

		// main 메소드 안에서 예외 발생 (실행 예외).
		// 예외처리
		try {
			// null,number 둘다 예외가 나타날 수 있으므로 캐치 2번.
			name = "";
			System.out.println(name.toString());
			int num = Integer.parseInt(menu);
			System.out.println("입력값은" + num);
			// System.out.println(numary[3]);

			// e랑 ne는 그냥 변수.
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println("null예외 발생. 010~~로 문의하세요!");
			// e.printStackTrace(); > 사용자가 이러면 모른다!
			/**
			 * } catch (NumberFormatException ne) { System.out.println("숫자값을 입력하세요");
			 */
		} catch (Exception ee) {
			System.out.println("알수 없는 예외.");
		}

		System.out.println("end of prog");
	}
}
