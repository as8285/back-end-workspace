package com.kh.test8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws SQLException {
			try {
				Class.forName("com.mysql.cj.jdbd.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1234");
				
				String query = "SELECT emp_id,emp_name FROM employee";			
				PreparedStatement st = conn.prepareStatement(query);
				ResultSet rs = st.executeQuery();
			System.out.println(rs.getString("emp_id") + " / " + rs.getString("emp_name"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			
	}

}
