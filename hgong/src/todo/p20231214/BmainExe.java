package todo.p20231214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BmainExe {

	static Connection conn;

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("연결 성종!");
			String sql = "insert into book(book_code,book_title,book_autor,book_press,book_price)\r\n"
					+ "VALUES(?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "1001");
			psmt.setString(2, "잭과 콩나무");
			psmt.setString(3, "김씨");
			psmt.setString(4, "비상");
			psmt.setInt(5, 50000);

			int r = psmt.executeUpdate();
			if (r == 1) {
				System.out.println("입력성공.");
			}

		} catch (Exception e) {
			// 예외 처리시 catch 옆에는 무조건 Exception
			e.printStackTrace();
		}
	}

	public static void select() throws Exception {
		String sql = "select * from book";// 전체 칼럼 다 가지고 오겠다
		PreparedStatement psmt = conn.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();
		while (rs.next()) {
			System.out.println("코드" + rs.getString("book_code") + ", 책 제목:" + rs.getString("book_title") + ",저자: "
					+ rs.getString("book_autor") + ",출판사:" + rs.getString("book_press") + ",가격:"
					+ rs.getInt("book_price"));
		}
	}

}
