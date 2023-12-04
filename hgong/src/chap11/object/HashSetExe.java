package chap11.object;

import java.util.HashSet;

public class HashSetExe {
	public static void main(String[] args) {
		//배열 -> 컬렉션(List, Set, Map)
		//랜덤
		HashSet<String>set = new HashSet<String>();
		//set은 중복된 값 허용 X
		set.add("Song");
		set.add("Seo");
		set.add("park");
		set.add("Song");
		set.add("Woo");
		
		//set.add(new Member("Hong",20)); >위에서 String으로 지정하면 불가능!(개발자에게는 더 편함)(오류를 일으켜서)
		
		// >>song은 한번만 출력
		for(Object name: set) {
			System.out.println(name);
		}
		
		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동",20));
		members.add(new Member("김길동",21));
		members.add(new Member("박길동",22));
		members.add(new Member("홍길동",20));
		for(Member mem : members){
			System.out.println(mem.toString());
		}
	}

}
	
