package todo.p20231214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BOOKDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("연결 성공!");
			// Exception이 제일 상위 예외 처리
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 목록
	Book[] getBookList() {
		getConn();
		Book[] books = new Book[10];
		String sql = "select * from book oreder by 1";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookCode(rs.getString("book_code"));
				book.setBookTitle(rs.getString("book_title"));
				book.setPress(rs.getString("book_press"));
				book.setAuthor(rs.getString("book_Author"));
				book.setPrice(rs.getInt("book_price"));

				for (int i = 0; i < books.length; i++) {
					if (books[i] == null) {
						books[i] = book;
						break;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}// end of get booklist().
		// 추가

	boolean addBook(Book bk) {
		getConn();
		String sql = "insert into book values(?,?,?,?,?) ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bk.getBookCode());
			psmt.setString(2, bk.getBookTitle());
			psmt.setString(3, bk.getAuthor());
			psmt.setString(4, bk.getPress());
			psmt.setInt(5, bk.getPrice());

			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	//조회
	Book getBook(String sno) {
		getConn();
		
		String sql = "select * from book where book_code= ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sno);
			rs = psmt.executeQuery();
			if(rs.next()) {
				Book book = new Book();
				book.setBookCode(rs.getString("book_code"));
				book.setBookTitle(rs.getString("book_tilte"));
				book.setAuthor(rs.getString("book_press"));
				book.setPress(rs.getString("book_press"));
				book.setAuthor(rs.getString("book_press"));
				
			}
		}
	}
	
}
