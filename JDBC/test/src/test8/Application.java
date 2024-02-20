package test8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql::3306/kh","root","1234");
		String query = "SELECT * FROM employee; ";
		PreparedStatement st= conn.prepareStatement(query);
		ResultSet rs = st.executeQuery(); 
		
		while(rs.next()){
			System.out.println(rs.getString("emp_id") + "/" + rs.getString("emp_Name"));
			
		}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}


		
	}

