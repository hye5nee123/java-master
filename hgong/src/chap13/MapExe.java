package chap13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.Data;
public class MapExe {
	// 키 : 값 쌍으로 구성.
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 추가
		map.put("홍길동", 80);
		map.put("김길동", 85);
		map.put("조혜원", 100);
		//key 추가
		map.put("홍길동", 70);

		//
		Integer result = map.get("홍길동");
		// System.out.println(result);

		// 전체목록.
		
		//키 값만 빼와서 새로운 컬렉션에 담아줌
		Set<String> set = map.keySet();
		for(String key:set) {
			System.out.println("key: " +key+ ", value: " + map.get(key));
		}

	}
}
