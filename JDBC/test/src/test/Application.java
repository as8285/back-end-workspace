package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root", "1234");
			String query = "SELECT * FROM employee VALUES(?,?)";
			PreparedStatement st = conn.prepareStatement(query);
			ResultSet rs = st.executeQuery();

			System.out.println(rs.getString("empId" + " / " + rs.getString("empName")));

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
