package chap13;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lombok.Data;

@Data
public class MapExe2 {
	public static void main(String[] args) {
		// String은 멤버의 주소를 담아두도록 하겠다.
		Map<Member, String> map;
		// instance 선언
		map = new HashMap<>();

		map.put(new Member("M001", "홍길동", 100), "경기도 100번지");
		map.put(new Member("M002", "김민수", 90), "서울시 200번지");
		map.put(new Member("M003", "박씨", 80), "대전시 300번지");
		// instance가 새로 만들어지면 같아보여도 다른 값
		map.put(new Member("M001", "홍길동", 100), "경기도 200번지");
		// 해당되는 키 넣기 (지울 때)
		map.remove(new Member("M001", "홍길동", 100));

		// 중복된 값은 담아주지 않음(set)
		// 1) key를 set 저장.
		Set<Member> set = map.keySet();
		for (Member member : set) {
			// toString과 showInfo의 차이점?
			System.out.println("key:" + member + ", value::" + map.get(member));
		}
		// 2) key,value => set에 저장.
		// entry = key, value 한쌍
		Set<Entry<Member, String>> entry = map.entrySet();
		for (Entry<Member, String> ent : entry) {
			System.out.println("key:" + ent.getKey() + ",val:" + ent.getValue());

		}
	}
}
