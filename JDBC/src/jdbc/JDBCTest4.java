package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest4 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
			conn.setAutoCommit(false);//자동 커밋을 해제
			String sql = "insert into student(sno,sname,major_no,score) "
					+ "values(?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "20001111");
			stmt.setString(2, "홍길동");
			stmt.setInt(3, 22);
			stmt.setDouble(4, 2.3);
			
			int count = stmt.executeUpdate();
			System.out.println(count + "건 적용되었습니다.");
			conn.commit();//커밋
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
