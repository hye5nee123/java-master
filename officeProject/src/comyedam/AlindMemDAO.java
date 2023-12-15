package comyedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlindMemDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	// 연결하기
	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("연결 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 추가
	boolean addAlind(Alind ali) {
		getConn();
		String sql = "insert into student values(?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, ali.getWon_id());
			psmt.setString(2, ali.getWon_pw());
			psmt.setString(3, ali.getWon_name());
			psmt.setString(4, ali.getWon_han());

			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean checkResponsibility(String id, int no) {
		for (int i = 0; i < Alinds.length; i++) {
			if (boards[i] != null && boards[i].getBN() == no && boards[i].getBW().equals(id)) {
			}
		}
		return true;
		// 동일하면 t 아니면 F
	}// end of check
		// 게시글을 담고 있는 배열에서 값이 잇는 건수를 반환.

}
