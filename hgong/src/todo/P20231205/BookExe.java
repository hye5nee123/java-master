package todo.P20231205;

public class BookExe {
	private Book[] books;
	BookExe(){
		books = new Book[100];
		
		boolean addBook(Book bok) {
			for(int i =0; i< books.length;i++) {
				if(books[i] == null) {
					books[i] =bok;
				}
			}
		}
	}

}
