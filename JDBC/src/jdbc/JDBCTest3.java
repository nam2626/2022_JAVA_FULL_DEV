package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest3 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
			System.out.println("DB 접속 완료");
			String name = null;
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 일부를 입력하세요 >> ");
			name = sc.nextLine();
			
			String sql = "select sno, sname, major_no, score from student "
					+ "where sname like '%' || ? || '%'";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)
				+ " " + rs.getInt(3) + " " + rs.getDouble(4));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
