package two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	static Employee[] employees;

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

	// 글 단건 조회하기
	Employee getGeul(int no) {
		getConn();

		String sql = "SELECT *  FROM geul  WHERE geul_num= ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, no);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Employee geul = new Employee();
				geul.setGeul_num(rs.getInt("geul_num"));
				geul.setGeul_jemok(rs.getString("geul_jemok"));
				geul.setGeul_nae(rs.getString("geul_nae"));
				geul.setGeul_jak(rs.getString("geul_jak"));
				geul.setGeul_ilja(rs.getString("geul_ilja"));
				return geul;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	// 전체 목록
	Employee[] getEmployeeList() {
		getConn();
		Employee[] employees = new Employee[10000];
		String sql = "select * from geul order by 1 ";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setGeul_num(rs.getInt("geul_num"));
				emp.setGeul_jemok(rs.getString("geul_jemok"));
				emp.setGeul_nae(rs.getString("geul_nae"));
				emp.setGeul_jak(rs.getString("geul_jak"));
				emp.setGeul_ilja(rs.getString("geul_ilja"));
				for (int i = 0; i < employees.length; i++) {
					if (employees[i] == null) {
						employees[i] = emp;
						break;
					}
				}
			}
		}

		catch (SQLException e) {
			e.printStackTrace();

		}
		return employees;
	}// end of getEmployeeList

	// 글 추가
	boolean addGeul(Employee geul) {
		getConn();
		String sql = "insert into geul values(geul_seq.nextval,?,?,?,sysdate) ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, geul.getGeul_jemok());

			psmt.setString(2, geul.getGeul_nae());
			psmt.setString(3, geul.getGeul_jak());

			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 글 번호 자동 추가

	/* orcle에서 연동완료 */

	/**
	 * seq 만드는 법 CREATE SEQUENCE geul_seq INCREMENT BY 1 START WITH 001 MINVALUE 1
	 * MAXVALUE 9999 NOCYCLE NOCACHE NOORDER;
	 */

	// SELECT geul_seq.NEXTVAL FROM geul; 후에

	// INSERT INTO geul(geul_num,geul_jemok) VALUES (geul_seq.NEXTVAL,'어린왕자');
	// >넣어주기!

	// https://docs.oracle.com/en/database/oracle/oracle-database/12.2/refrn/ALL_SEQUENCES.html#GUID-5867804F-1339-4CB6-9A56-6B6DCECB61BB

	// 페이징(뺄까 고민중 깃허브에 올린 사람 있으면 할거임...)
	Employee[] pageList(Employee[] ary, int page) {
		Employee[] resultAry = new Employee[5];

		int start = (page - 1) * 5;
		int end = page * 5;
		int j = 0;
		for (int i = 0; i < ary.length; i++) {
			if (i >= start && i < end) {
				resultAry[j++] = ary[i];
			}
		}
		return resultAry;
	}

	// 글삭제
	boolean removeEmployee(int num) {
		getConn();
		String sql = "DELETE FROM geul \r\n" + "WHERE geul_num=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
