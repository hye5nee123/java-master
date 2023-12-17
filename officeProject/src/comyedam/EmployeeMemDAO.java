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
	String id;
	String pw;

	// 연결하기
	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("로그인 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 정보 추가
	boolean addEmployee(Employee ali) {
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
	boolean modifyAccount(int setwon_no, String won_pw) {
		getConn();
		String sql = "update won set won_pw = ? where setwon_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			psmt.setInt(2, no);

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
	boolean modifyAlindT(int no, String tel) {
		getConn();
		String sql = "UPDATE won\r\n" + "SET wom_tel\r\n" + "WHERE won_no=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tel);
			psmt.setInt(2, no);
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
