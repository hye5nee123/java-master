package chap13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TodoExe {
	public static void main(String[] args) {
		// 순번,할일(Todo)
		// key , value
		Map<Integer, Todo> todoList = new HashMap<>();
		Scanner scn = new Scanner(System.in);
		// while 변수 선언 x 일시 true 하면 무한반복
		while (true) {
			System.out.println("번호 할일 기한>>");
			String input = scn.nextLine(); // 20 장보기 (enter) 23-12-08(enter)
			// 자르는 거
			String[] inpAry = input.split(" ");
			
			//걸러낼 조건.
			if(inpAry.length !=2  && inpAry.length !=3) {
				System.out.println("입력값을 확인하세요");
				continue;
			}
			
			String order = inpAry[0]; // 순번
			String title = inpAry[1]; // 할일 제목.
			
			String dueDate = inpAry[2]; //

			if (dueDate == null) {
			} else {
				/**
				 * Date - > String -> Date 바꾸는 방식을 써야 함! 2023-10-23 => format
				 */ // MM은 대문자임!
				Todo todo = null;
				if(inpAry.length == 2) {
					todo = new Todo(title);
				}else if (inpAry.length == 3) {
					dueDate = inpAry[2];
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				// parse = 문자열을 데이트 타입으로 바꿈
				// 데이트 타입을 문자열로 바꾸려면 format
				try {
					todo = new Todo(title, sdf.parse(dueDate));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			} //end of if.
			/**todoList.put(Integer.parseInt(order), todo);

			todoList.put(Integer.parseInt(inpAry[0]), inpAry[1]);
			if (todoList.size() == 5) {
				break;
			}*/
		}
		// 순번, 할일 출력
		// Map<Integer.String> rodoList =
		// map = new HashMap<>();
		//Set<Integer> set = map.keySet();
		for (Integer integer : set) {
			// toString과 showInfo의 차이점?
			System.out.println("key:" + integer + ", value::" + map.get(String));
		}
		System.out.println("번호 할일");
		System.out.println("===================");
		Set<Entry<Integer, Todo>> entry = todoList.entrySet()
				for(Entry<Integer,Todo> ent : entry) {
					System.out.println(ent.getKey() + "" + ent.getValue());
				}
;		System.out.println("end of prog");

	}
}
