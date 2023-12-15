package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LindDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("연결 성공!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 목록
	Lind[] getLindList() {
		getConn();
		Lind[] linds = new Lind[10000];
		String sql = "select * from won order by 1";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
