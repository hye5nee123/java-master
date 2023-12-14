package book123;

public class Book {
	// ÇÊµå.
	private String bookCode;
	private String bookName;
	private String author;
	private String publisher;
	private int bookCost;
	
	// »ý¼ºÀÚ.
	public Book(){}
	
	public Book(String bookCode, String bookName, String author, String publisher, int bookCost) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.bookCost = bookCost;
	}

	// ¸Þ¼Òµå.
	public void showInfo() {
		System.out.printf("%9s %13s %7s %11s %9d\n",bookCode, bookName, author, publisher, bookCost);
	}
	
	public String getBookCode() {
		return bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getBookCost() {
		return bookCost;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}
}