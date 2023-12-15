package comyedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlindDAO {
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

	// 글 조회하기
	Alind getGeul(String gli) {
		getConn();

		String sql = "SELECT * FROM geul WHERE won_no= ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, gli);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Alind geul = new Alind();
				geul.setGeul_num(rs.getInt("geul_num"));
				geul.setGeul_jemok(rs.getString("geul_jemok"));
				geul.setGeul_nae(rs.getString(" geul_nae"));
				geul.setGeul_jak(rs.getString("geul_jak"));
				geul.setGeul_ilja(rs.getString(" geul_ilja"));
				return geul;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

}
