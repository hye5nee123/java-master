package chap7;

import java.util.Scanner;

import todo.Board;

public class FriendExe {
	Scanner scn = new Scanner(System.in);
	Friend[] storage = new Friend[10];
	static Friend[] friends;
	
	// 1:등록 2:목록 3:조회
	// 등록
	public boolean addFriend(Friend friend) {
		for (Friend fnd : storage) {
			if (fnd != null) {
				System.out.println(fnd.showInfo());
			}
		}
		return false;
	}

	// 목록 가져오기
	public Friend[] friendList() {
		for (Friend fnd : storage) {
			if (fnd != null) {
				System.out.println(fnd.showInfo());
			}
		}
		return null;
	}

	// 이름으로 찾는 경우 결과값을 null 여부로 체크 X
	// 새로 배열을 하나 선언 해서 담아줘야 함! null로 구분하면 안된다 >값이 있는지만 구분하기 때문. 반환 유형이 정해져있음
	public Friend[] searchFriend(String name) {
		Friend[] result = new Friend[10];
		System.out.println("찾을 이름을 입력하세요");
		String results = scn.nextLine();
		String searchCond = " ";
		searchCond = scn.nextLine();
		for (Friend fnd : storage) {
			if (fnd.getName().equals(searchCond)) {
				System.out.println(fnd.showInfo());
			}
		}

		return null;
	}

	// 결과 값이 null 여부로 체크.
	public Friend[] searchPhone(String phone) {
		System.out.println("찾을 번호을 입력하세요");
			for (Friend fnd : storage) {
				if (fnd != null && fnd.getPhone().equals(storage)) {
					System.out.println(fnd.showInfo());
				}
			}

		return null;
		}
}
