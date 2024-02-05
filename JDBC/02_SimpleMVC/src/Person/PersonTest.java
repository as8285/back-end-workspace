package Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonTest {

    // DRIVER_NAME,URL,USER,String PASSWORD 지정
    final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/kh";
    final static String USER = "root";
    final static String PASSWORD = "1234";

    public static void main(String[] args) {
        PersonTest pt = new PersonTest();

        try {
            // 드라이버 로딩
            Class.forName(DRIVER_NAME);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

			//pt.addPerson(111, "김강우", "서울");
			//pt.addPerson(222, "고아라", "제주도");
			//pt.addPerson(333, "강태주", "경기도");

             //person 테이블에서 데이터 수정
          //pt.updatePerson(111, "제주도");

            // person 테이블에서 데이터 삭제
          // pt.removePerson(333);

            // Person 테이블에 있는 데이터 전체 보여주기
           // pt.searchAllPerson();

            // person 테이블에서 데이터 한개만 가져오기
            //pt.searchPerson(111);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

	// 고정적인 반복 -- DB 연결, 자원 반납 -- > 공통적인 메서드 정의 따로
	// 2. DB 연결
	public Connection getConnect() throws SQLException {
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;

	}

	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps, conn);
	}

	// person 테이블 추가 - INSERT
	public void addPerson(int id, String name, String address) throws SQLException, ClassNotFoundException {

		Connection conn = getConnect();
		String query = "INSERT INTO person VALUES(?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, address);

		int result = ps.executeUpdate();

		if (result == 1) {
			System.out.println(name + "님, 회원가입완료!");
		}
		closeAll(ps, conn);
	}
	
	
	// 변동적인 반복 -- 비즈니스 로직 DAO(Database Access Object)
	// person 테이블에서 데이터 수정 -UPDATE
	
	
	public void updatePerson(int id, String address) throws SQLException, ClassNotFoundException {
		Connection conn = getConnect();

		String query = "UPDATE person SET address = ? WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(query);

		ps.setString(1, address);
		ps.setInt(2, id);
		int result = ps.executeUpdate();

		System.out.println(result + "명수정 ! ");

		// 자원 반납
		closeAll(ps, conn);

	}

	// person 테이블에서 데이터 삭제 - DELETE
	public void removePerson(int id) throws SQLException {
		Connection conn = getConnect();
		 String query =  "DELETE  FROM  person WHERE id= ?"; 
		 PreparedStatement ps = conn.prepareStatement(query);
		 ps.setInt(1,id);
		 int result = ps.executeUpdate();
		   if (result == 1) {
	            System.out.println(result + "명 삭제 !  ");
	        }

		   closeAll(ps, conn);
	}
	
//person 테이블에 있는 데이터 전체 보여주기 SELECT
	public void searchAllPerson() throws SQLException {
		Connection conn = getConnect();
		String query = "SELECT * FROM person";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			System.out.println(rs.getString("name") + "," + rs.getString("address"));
		}

// 5.자원 반납 
		
		 closeAll(rs,ps, conn);

	}

//person 테이블에서 데이터 한개만 가져오기 SELECT
	public void searchPerson(int id) throws SQLException {
		Connection conn = getConnect();
		 String query =  "DELETE  FROM  person WHERE id= ?"; 
		 PreparedStatement ps = conn.prepareStatement(query);
	
		 ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		
		
		if (rs.next()) {

			System.out.println(rs.getString("name") + "," + rs.getString("address"));
		}
		 closeAll(rs,ps, conn);

	}
}
