package two;

public class Employee {

	private int won_no;
	private String won_id;
	private String won_pw;
	private String won_name;
	private String won_han;
	private int won_tel;
	private int geul_num;
	private String geul_jemok;
	private String geul_nae;
	private String geul_jak;
	private String geul_ilja;

	Employee() {

	}

	// 생성자
	Employee(int won_no, String won_pw, int won_tel) {
		this.won_no = won_no;
		this.won_pw = won_pw;
		this.won_tel = won_tel;
	}

	Employee(int won_no, String won_id, String won_pw, String won_name, String won_han, int won_tel) {
		this.won_no = won_no;
		this.won_id = won_id;
		this.won_pw = won_pw;
		this.won_name = won_name;
		this.won_han = won_han;
		this.won_tel = won_tel;
	}

	// 게시글 더할 때 필요
	Employee(String geul_jemok, String geul_nae, String geul_jak) {

		this.geul_jemok = geul_jemok;
		this.geul_nae = geul_nae;
		this.geul_jak = geul_jak;

	}

	// 메소드 기능

	// 관리자 옵션 >사용자 조회 가능!
	void showInfo_ge() {
		System.out.println("글 번호는 " //
				+ geul_num + " 이고 제목은"//
				+ geul_jemok + "글 내용은 " //
				+ geul_nae + " 작성자는" //
				+ geul_jak + " 이고 글 작성날짜는 " //
				+ geul_ilja);
	}

	void ShowInfo() {
		System.out.println("회원번호는" //
				+ won_no + "이고 ID는"//
				+ won_id + "비밀번호는" //
				+ won_pw + "이름은" //
				+ won_name + "이고 사용자 권한은" //
				+ won_han + "전화번호는" + won_tel);
	}

	// setter
	void setWon_no(int won_no) {
		this.won_no = won_no;

	}

	void setWon_id(String won_id) {
		this.won_id = won_id;
	}

	void setWon_pw(String won_pw) {
		this.won_pw = won_pw;
	}

	void setWon_name(String won_name) {
		this.won_name = won_name;
	}

	void setWon_han(String won_han) {
		this.won_han = won_han;
	}

	void setWon_tel(int won_tel) {
		this.won_tel = won_tel;
	}

	void setGeul_num(int geul_num) {
		this.geul_num = geul_num;
	}

	void setGeul_jemok(String geul_jemok) {
		this.geul_jemok = geul_jemok;
	}

	void setGeul_nae(String geul_nae) {
		this.geul_nae = geul_nae;
	}

	void setGeul_jak(String geul_jak) {
		this.geul_jak = geul_jak;
	}

	void setGeul_ilja(String geul_ilja) {
		this.geul_ilja = geul_ilja;
	}

	// getter
	int getWon_no() {
		return won_no;
	}

	String getWon_id() {
		return won_id;
	}

	String getWon_pw() {
		return won_pw;
	}

	String getWon_name() {
		return won_name;
	}

	String getWon_han() {
		return won_han;
	}

	int getWon_tel() {
		return won_tel;
	}

	int getGeul_num() {
		return geul_num;
	}

	String getGeul_jemok() {
		return geul_jemok;
	}

	String getGeul_nae() {
		return geul_nae;
	}

	String getGeul_jak() {
		return geul_jak;
	}

	String getGeul_ilja() {
		return geul_ilja;
	}

}
