package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionTest2 {
final static String DRIVER_NAME = "com.mysql.cj,jdbc.Driver";
final static String URL = "jdbc:mysql://localhost:3306";
final static String USER = "root";
final static String PASSWORD = "1234";
	public static void main(String[] args) {

		// 1. 드라이버 로딩 
		
		try {
			// Class.forName("주소값 드라이버 ")
			Class.forName(DRIVER_NAME);
			System.out.println();

			// 2. 디비연결
			//Connection conn = DriverMangager.getConnection("jdbc:mysql://localhost:3306/
			                    // kh(해당 스키마까지 들어가야한다.)", "root", "1234:")
			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			// 3. 쿼리 준비 - INSERT
			String query = "INSERT INTO employee_copy(emp_id,emp_name,emp_no)VALUES(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			
			// 4. 쿼리문 실행 
			ps.setInt(1, 700);
			ps.setString(2, "윤민영");
			ps.setString(3,"111111-222222");
			
			System.out.println(ps.executeUpdate() + "명 추가!");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	
		
		
	
		
	}

}
