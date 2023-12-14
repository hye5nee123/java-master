package yeon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainExe {
	static Connection conn;
		public static void main(String[] args) {
			String url =  "jdbc:oracle:thin:@localhost:1521:xe";
			
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(url, "dev", "dev");
				System.out.println("연결 성공!!");
//				String sql = "select  student_number,student_name";   > col 조회
				// select();
				String sql = "insert into student(student_number,student_name,eng_score,mat_score)\r\n" + "VALUES(?,?,?,?)";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1,"23-003");
				psmt.setString(2, "23-003");
				psmt.setInt(3, 80);
				psmt.setInt(4, 85);
				
				//입력,수정,삭제 > executeUPdate();
				int r = psmt.executeUpdate();
				if(r == 1) {
					System.out.println("입력성공");
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void select() throws Exception {
			String sql = "select * from student";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
		}
}
