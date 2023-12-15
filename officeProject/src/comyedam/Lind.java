package comyedam;

import lombok.Data;

public class Lind {

	private int won_no;
	private String won_id;
	private String won_pw;
	private String won_name;
	private String won_han;
	private int won_tel;

	Lind() {

	}

	// 메소드 기능

	// 관리자 옵션 >사용자 조회 가능!
	void showInfo() {
		System.out.println("회원번호는" //
				+ won_no + "이고 ID는"//
				+ won_id + "비밀번호는" //
				+ won_pw + "이름은" //
				+ won_name + "이고 사용자 권한은" //
				+ won_han + "전화번호는" + won_tel);
	}

}
