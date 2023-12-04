package chap11.object;

public class StringExe {

	public static void main(String[] args) {

		String[] fileNames = { "c:/images/prod/ample.jpg", "d;/test/sample/americano.png",
				"d:/goods/test/2023/moka.jpg" };
		for (String file : fileNames) {
			System.out.println(findFileName(file));
		}

		/**
		 * https://www.inflearn.com/questions/788804/string-%EB%AC%B8%EC%9E%90%EC
		 * %97%B4-string-%EB%B0%B0%EC%97%B4%EC%97%90%EC%84%9C%EC%9D%98-length-length-c
		 * harat-%EC%93%B0%EC%9E%84%EC%9D%98-%EC%B0%A8%EC%9D%B4%EC%A0%90%EC%9D%84-%EC%
		 * 95%8C%EA%B3%A0-%EC%8B%B6%EC%8A%B5%EB%8B%88%EB%8B%A4
		 */

		String[] numbers = { "980304-123467", "980304-2234567", "020101-3456789", "020104-4456789", "0301053545678" };

		/**
		 * for (String no : numbers) { System.out.println(findGender(no)); }
		 */

		byte[] b1 = "Hello".getBytes(); // 문자열 하나하나를 byte 값으로 반환하겠습니다.(아스키값)
		for (byte b : b1) {
			System.out.println(b);
		}

		String name = new String(new byte[] { 65, 66, 67, 68, 69 });
		name = new String(b1);
		System.out.println(name);

		// n번째 배열의 인덱스의 값을 가져오겠습니다
		char c1 = name.charAt(0);
		System.out.println(c1);

		/**
		 * char n9 = no.charAt(9); System.out.println(n9);
		 */

	}// end of main.

	// 성별을 반환
	/**
	 * static String findGender(String ssn) { // 생년월일 - 1,2,3,4 //String jumin =
	 * ssn.split(); int pos = ssn.length() - 7; switch(ssn.charAt(pos)) { case '1';
	 * case '3'; return "남"; case '2'; case '4'; return "여"; } return "오류"
	 */
	// 파일명 가져오기 이해불가........
	// subString이 뭔지 모르겠음.....
	static String findFileName(String file) {
		// lastIndexOf써보세요....
		int pos = 0;
		while (true) {
			int pos2 = file.indexOf("/", pos);
			if (pos2 == -1) {
				break;
			}
			pos2++;
			pos = pos2;
		}
		return file.substring(pos);
	}
}
//

/**
 * char n8 = ssn.charAt(8);
 * 
 * if (n8 == 1 || n8 == 3) { return "남"; } else if (n8 == 2 || n8 == 4) { return
 * "여"; } else { if (n9 == 1 || n9 == 3) { return "남"; } else if (n9 == 2 || n9
 * == 4) { return "여"; } }
 */

// ㅇㅇ
