package todo;

import java.util.Scanner;

public class FriendApp {
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = null;
	
	public static void addfriend() {System.out.println("친구 정보 입력>>");
	for(int i =0; i <friends.length;i++) {
		Friend friend = new Friend();
		System.out.println("친구 이름 입력");
		friend.name = scn.nextLine();
		System.out.println("친구 연락처 입력>>");
		friend.tel = Integer.parseInt(scn.nextLine());
		System.out.println("친구 혈액형 입력>>");
		friend.blood = scn.nextLine();
		
		friends[i] = friend; //뜻을 모르겠음
		}
	}// end of addfriend()
	public static void searchfriend() {
		System.out.println("조회할 이름 입력>>");
		String name = scn.nextLine();
		boolean exists = false;
		//친구 이름 - 점수 출력...
		for(Friend fri : friends) {
			if(name.equals(fri.name)) {
				System.out.println("이름은" +fri.name+",번호는"+fri.tel);
				exists = true;
			}
		}
		if (!exists) {
			System.out.println("찾는 이름이 없습니다.");
		}
	}
	public static void modify() {
		// 이름입력 -> 변경 연락처.
		System.out.println("조회할 이름 입력>>");
		String name = scn.nextLine();
		boolean exists = false;
		
		for(int i =0;i<friends.length;i++) {
			System.out.println("찾는 이름이 없습니다.");
		}
	}
	public static void main(String[] args) {
		boolean run = true;
		int friendNum = 0;
		while(run) {
			System.out.println("1.친구 수 2. 번호입력 3. 목록출력 4.수정 5.종료");
			int menu =scn.nextInt(); //3 Enter. (입력한 3을 읽어들이는 거)
			scn.nextLine();
			switch(menu) {
				case 1:
					System.out.println("친구 수 입력>>");
					friendNum = Integer.parseInt(scn.nextLine());
					friends = new Friend[friendNum]; 
					break;
				case 2 :
					addfriend();
					break;
				case 3:
					searchfriend();
					break;
				case 4: //수정
					modify();
					break;
				case 5: //수정
					System.out.println("종료합니다");
					run = false;
				}
			
		}
	}
}