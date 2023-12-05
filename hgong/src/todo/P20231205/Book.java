package todo.P20231205;

public class Book {
	// 필드에 속성 정의
	private int bookCode;
	private String bookJemok;
	private String bookWriter;
	private String bookCopy;
	private int bookPrice;

	Book() {

	}

//생성자
	Book(int bookCode, String bookJemok, String bookWriter, String bookCopy, int bookPrice) {
		this.bookCode = bookCode;
		this.bookJemok = bookJemok;
		this.bookWriter = bookWriter;
		this.bookCopy = bookCopy;
		this.bookPrice = bookPrice;
	}

	//메소드
	void showInfo() {
		System.out.println("책 코드는"+ bookCode + "이고 제목은" + bookJemok+"이고 작가는" + bookWriter+ "이고 출판사는"+bookCopy+"책의 가격은"+ bookPrice);
	}

	//setter
	void setBD(int bookCode) {
		this.bookCode = bookCode;
	}

	void setBJ(String bookJemok) {
		this.bookJemok = bookJemok;
	}

	void setBW(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	void setBC(String bookCopy) {
		this.bookCopy = bookCopy;
	}

	void setBP(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	//getter
	int getBD() {
		return bookCode;
	}

	String getBJ() {
		return bookJemok;
	}

	String getBW() {
		return bookWriter;
	}

	String getBC() {
		return bookCopy;
	}

	int getBP() {
		return bookPrice;
	}

}
