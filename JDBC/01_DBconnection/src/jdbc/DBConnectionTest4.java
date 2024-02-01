package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import config.ServerInfo;

public class DBConnectionTest4 {

	public static void main(String[] args) {

		// 1. 드라이버 로딩

		try {

			Properties p = new Properties();
			p.load(new FileInputStream("src/config/jdbc.properties"));
			// Class.forName("주소값 드라이버 ")
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println();

			// 2. 디비연결
			// Connection conn = DriverMangager.getConnection("jdbc:mysql://localhost:3306/
			// kh(해당 스키마까지 들어가야한다.)", "root", "1234:")
			Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);

			// 3. 쿼리 준비 - DELETE
			String query = p.getProperty("delete");
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, 900);

			System.out.println(ps.executeUpdate() + "명 삭제!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
