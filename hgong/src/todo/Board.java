package todo;

public class Board {

	private int boNO;
	private String boJemok;
	private String boWriter;
	private String boNae;
	private String boIlsi;
	
	//이 부분이 변경 되었습니다.
	
	Board(){
		
	}
	Board(int boNO,String boJemok, String bookWriter,String bookNae,String bookIlsi){
		this.boNO = boNO;
		this.boJemok = boJemok;
		this.boWriter = boWriter;
		this.boNae = boNae;
		this.boIlsi = boIlsi;
	}
	//메소드 기능
	void showInfo() {
		System.out.println("게시판 번호는"+boNO+"이고 제목은"+boJemok+"작성자는"+boWriter+"이고 내용은"+boNae+"이고 작성시간은"+boIlsi);
	}
	//setter
	void setBoNO(int boNO) {
		this.boNO = boNO;
	}
	void setBoJemok(String boJemok ) {
		this.boJemok = boJemok;
	}
	void setBoWriter(String boWriter) {
		this.boWriter = boWriter;
	}
	void setBoNae(String boNae) {
		this.boNae = boNae;
	}
	void setBoIlsi(String boIlsi) {
		this.boIlsi =boIlsi;
	}
	//getter
	int getBoNO() {
		return boNO;
	}
	String getJemok () {
		return boJemok;
	}
	String getBoWriter() {
		return boWriter;
	}
	String getBoNae() {
		return boNae;
	}
	String getBoIlsi() {
		return boIlsi;
	}
				
}
