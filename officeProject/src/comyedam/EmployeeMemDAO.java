package comyedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMemDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	int no = 0;

	int wonNum = 0;

	int tel = 0;

	// 연결하기
	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	// 정보 추가
	boolean addEmployee(Employee empA) {
		getConn();
		String sql = "insert into won values(?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, empA.getWon_id());
			psmt.setString(2, empA.getWon_pw());
			psmt.setString(3, empA.getWon_name());
			psmt.setString(4, empA.getWon_han());
			psmt.setInt(5, empA.getWon_tel());
			psmt.setInt(6, empA.getWon_no());
			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 권한
	Employee logInCheck(String id, String pw) {
		getConn();
		String sql = "select * from won where won_id = ? and won_pw = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Employee am = new Employee();
				am.setWon_id(id);
				am.setWon_pw(pw);
				am.setWon_han(rs.getString("won_han"));
				return am;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}// 로그인 권한 end

	// **수정**

	// 회원번호 주면 비밀번호 수정기능
	boolean modifyAccount(String id, String pw) {

		// System.out.println(wonNum);
		getConn();
		String sql = "update won \r\n set won_pw = ? \r\n where won_id = ?";
		// int code = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			psmt.setString(2, id);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}// 비밀번호 수정

	// 전화번호 수정
	boolean modifyAccountT(String id, String tel) {
		getConn();
		String sql = "UPDATE won \r\n  SET won_tel=?  \r\n WHERE won_id=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tel);
			psmt.setString(2, id);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}// 전화번호 수정 끝

}// end of class.
