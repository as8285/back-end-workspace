package com.kh.model.dao;
// DAO(Data Access Object)
// : DB에 접근하는 역활을 하는 객체(CRUD)
//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.vo.Book;
import com.kh.model.vo.Publisher;
import com.kh.model.vo.Rent;

public class BookDAO {
	public void BookDAO() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
public Connection getConnect() throws SQLException  {
return DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "1234");
}

public void close(PreparedStatement ps, Connection conn)throws SQLException{
	if(ps!=null) ps.close();
	if(conn!=null)conn.close();
}
public void closeAll(ResultSet rs,PreparedStatement ps,Connection conn) throws SQLException{
	if(rs!=null)rs.close();
	close(ps, conn);
		
}
//1.전체 책 조회 
public ArrayList<Book>printBookAll() throws SQLException{
Connection conn = getConnect();
String query= "SELECT * FROM tb_book LEFT JOIN tb_publisher USING(pub_no)";
PreparedStatement ps = conn.prepareStatement(query);
ResultSet rs = ps.executeQuery();
ArrayList<Book>list = new ArrayList<>();
	while (rs.next()) {
		Book book = new Book();
		book.setBkNO(rs.getInt("bk_no"));
		book.setBkTitle(rs.getString("bk_title"));
		book.setBkAuthor(rs.getString("bk_author"));	
		book.setBkPrice(rs.getInt("bk_price"));
		book.setPublisher(new Publisher(rs.getInt("bk_no"),
				rs.getString("pub_name"),rs.getString("phone")));
		list.add(book);
		
		
	}
	
	 closeAll(rs,ps, conn);
	 return list;
}
// 2. 책등록

public int registerBook(String bk_title, String bk_author) throws SQLException {
	Connection conn = getConnect();
	String query = "INSERT INTO tb_book(bk_title,bk_author) VALUES (?, ?)";
	PreparedStatement ps = conn.prepareStatement(query);
	ps.setString(1, bk_title);
	ps.setString(2, bk_author);
	
	int result =ps.executeUpdate();
	close(ps, conn);
	return result;
	
	
}

// 책삭제
public int sellBook(int no) throws SQLException {
	Connection conn = getConnect();
	String query = "DELETE FROM tb_book WHERE bk_no=?";
	PreparedStatement ps = conn.prepareStatement(query);
	ps.setInt(1, no);
	
	System.out.println(ps.executeUpdate());

	int result =ps.executeUpdate();
	
	close(ps, conn);
	return result;
}

// 회원가입 






	// 1. 책대여
	public void rentBook() throws SQLException{
			
		System.out.println(printBookAll());
		

		Connection conn = getConnect();
		String query1= "SELECT * FROM tb_book";
		String query2= "SELECT * FROM tb_book WHERE ?";
		PreparedStatement ps1 = conn.prepareStatement(query1);
		PreparedStatement ps2 = conn.prepareStatement(query2);
		ResultSet rs1 = ps1.executeQuery();
		ResultSet rs2 = ps1.executeQuery();
		System.out.println("====== 책 목록 ======");
			while (rs1.next()) {

				System.out.println(rs1.getString("bk_title") + " - "   + rs1.getString("bk_author"));
			}
			
			while (rs2.next()) {

				System.out.println(rs2.getString("bk_title") + " - "   + rs2.getString("bk_author"));
			}
	
				
				}
				
			
			
		

		
		// 대여할 책 번호 선택을 사용자한테 입력 받아 
		// 대여에 성공하면 "성공적으로 책을 대여했습니다." 출력 
		// 실패하면 "책을 대여하는데 실패했습니다." 출력

	// 2. 내가 대여한 책 조회
	public void printRentBook() throws SQLException{
		// 내가 대여한 책들을 반복문을 이용하여 조회 
		// 대여번호, 책 제목, 책 저자, 대여 날짜, 반납 기한 조회
	
	}
	// 3. 대여 취소 
	public void deleteRent() {
		//printRentBook(내가 대여한 책 조회) 출력후 
		// 취소할 책 번호 선택을 사용자한테 입력받아 
		// 취소에 성공하면 "성공적으로 대여를 취소했습니다." 출력 
		// 실패하면 "대여를 취소하는데 실패했습니다." 출력
	}
	// 4. 회원 탈퇴
	public void deleteMember() throws SQLException{
		
		// 회원탈퇴에 성공하면 "회원탈퇴 하였습니다. ㅠㅠ "출력 
		// 실패하면 "회원탈퇴하는데 실패했습니다."출력
		
	}
	
	
}



