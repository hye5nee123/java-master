package chap13;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		/**
		 * String[] strs = { "Mon", "Tue", "10" }; // 삭제(하고 널로 표기) strs[0] = null; for
		 * (int i = 0; i < strs.length; i++) { System.out.println(strs[i]); }
		 * List<String> list = new ArrayList<String>();
		 * 
		 * // 추가 list.add("Apple"); list.add("Banana"); list.add("Cherry");
		 * 
		 * // 삭제(있던 공간까지 삭제 > ) // list.remove(0); list.remove("Apple"); // 객체 직접 넣기
		 * 
		 * // 문자교체(변경) list.set(0, "바나나");
		 * 
		 * // 전체 요소 삭제. list.clear();
		 * 
		 * for (int i = 0; i < list.size(); i++) { // 문자열 값이 반환
		 * System.out.println(list.get(i)); } // 컬렉션 크기 변경 for (int i = 0; i < 100; i++)
		 * { list.add("" + i); } for (int i = 0; i < list.size(); i++) {
		 * System.out.print(list.get(i)); }
		 */
		// 이름저장
		List<String> names = new ArrayList<String>();
		names.add("송강"); // 0 :첫번째.
		names.add("김강"); // 1 :두번째.
		names.add("서강준"); // 2 :세번째.

		String search = "강준";
		int cnt = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).indexOf(search) != -1) {
				// -1 해서 명수 줄임(카운트 할때 이름 없으면 빼야 하니까
				cnt++;
			}
		}
		System.out.println(search + "은" + cnt + "명 입니다.");
		/**
		 * for (String name : names) { if (name == search) { cnt++; }System.out.print
		 * (Integer.parseInt(cnt)); }
		 */
	}

}
