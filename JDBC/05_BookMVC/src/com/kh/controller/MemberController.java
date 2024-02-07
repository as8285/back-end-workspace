package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.model.vo.Member;

public class MemberController {
	private MemberDAO dao = new MemberDAO();
	public MemberController() {
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
	

	public int registerMember(String id,String password, String name) throws SQLException{
		Connection conn = getConnect();
		String query = "INSERT INTO tb_member(member_id,member_pwd,member_name)VALUES(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, id);
		ps.setString(2, password);
		ps.setString(3,name);
		int result= ps.executeUpdate();
		close(ps,conn);
		return result;
	}

	public boolean login(String id, String password)  {
		Member memebr;
		try {
	
		member = dao.login(id,password)
			if(member.getStatus().equals("Y")) return member;
	}catch(SQLException e ) {
		
	}
	
	public boolean deleteMember(int no){
		try {
			if(dao.deleteMember(no==1))
		}
		}
		
		
	}
}
