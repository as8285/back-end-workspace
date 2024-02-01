package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ServerInfo;


public class DBConnectionTest3 {


	public static void main(String[] args) {

		// 1. 드라이버 로딩 
		
		try {
			// Class.forName("주소값 드라이버 ")
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println();

			// 2. 디비연결
			//Connection conn = DriverMangager.getConnection("jdbc:mysql://localhost:3306/
			                    // kh(해당 스키마까지 들어가야한다.)", "root", "1234:")
			Connection conn = DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
			
			// 3. 쿼리 준비 - UPDATE
			String query = "UPDATE employee_copy SET emp_name = ? WHERE emp_id =? ";		
			PreparedStatement ps = conn.prepareStatement(query);


			ps.setString(1,"윤웡카");
			ps.setInt(2, 700);
		
			System.out.println(ps.executeUpdate() + "명 수정!");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	
		
		
	
		
	}

}
