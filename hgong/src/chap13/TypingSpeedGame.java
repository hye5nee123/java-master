package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://blog.naver.com/hms96104/222068733635
public class TypingSpeedGame {
	public static void main(String[] args) {
		// list.remove(0);
		// Map<sing,String>
		Scanner scn = new Scanner(System.in);
		String word = "hour on an uptown train Doors open as she walks in She's soaking caught in the rain Her "
				+ "skin shines crystalline Is all the bodies buried under the floorboards Sailors "
				+ "knew sirens would sing\r\n" + "From rocks off the cliffs by the sea\r\n"
				+ "The monsters with waiting teeth\r\n" + "Their skin shines crystalline";
		String[] words = word.split(" ");
		List<String> list = new ArrayList<>();
		for (String str : words) {
			list.add(str);
		}
		long start = System.currentTimeMillis();
		boolean run = true;
		// System.out.println("");
		while (run) {
			System.out.println("따라 치세요>>");
			System.out.println(word);

			/**
			 * Map<PersonType, String> map; map = new HashMap<>();
			 */

			// String sing = "";
			String a = scn.nextLine();
			String[] pk = a.split(" ");
			// 목록출력하고...(반복문)
			for (int i = 0; i < list.size(); i++) {
				// get 쓰고 list 타입으로 만들어줘라
				for (int j = 0; j < pk.length; j++) {
					if (list.get(i).equals(pk[j])) {
						list.remove(pk[j]);
						System.out.println();
					}

					// 입력값 목록 값과 비교해서 있으면 제거.

					// size가 0이면 반복문 끝.
					System.out.println(list.size());
				}
			}
			if (list.size() == 0) {
				run = false;
				System.out.println("end of game");
			}
			for (String str : list) {
				System.out.print(str);
			}

			/**
			 * 목록출력 사용자가 입력한 값을 컬렉션의 값과 비교해서 같은 단어가 있으면 삭제. 시작 시점~ 종료시점 걸린시간을 초단위로 계산. 완료하는데
			 * 35초가 걸림. 사이즈가 0이 되면 끝
			 */

		}
		long end = System.currentTimeMillis();
		System.out.println("걸린시간:" + (end - start));
	}
}
