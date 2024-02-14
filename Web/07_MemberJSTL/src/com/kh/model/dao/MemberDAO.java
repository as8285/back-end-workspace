package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.vo.Member;

public class MemberDAO {

	public MemberDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading...!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnect() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root", "1234");
	}

	public void close(PreparedStatement ps, Connection conn) throws SQLException {
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
	}

	public void close(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if (rs != null)
			rs.close();
		close(ps, conn);
	}

	// DAO 개발 할 때 중요한 건
	// 매개변수(파라미터) 뭘 가지고 오는지, 리턴 타입 결과 출력이 어떤게 필요한지
	// 회원 가입

	public int registerMember(Member vo) throws SQLException {

		Connection conn = getConnect();

		String query = "INSERT INTO member VALUES(?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);

		ps.setString(1, vo.getId());
		ps.setString(2, vo.getPassword());
		ps.setString(3, vo.getName());

		int result = ps.executeUpdate();
		close(ps, conn);
		return result;
	}

	public Member FindMember(String name) throws SQLException {

		Connection conn = getConnect();
		String query = "SELECT*FROM member WHERE id=? AND password=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, name);

		ResultSet rs = ps.executeQuery();
		Member member = null;
		if (rs.next()) {

			member = new Member(rs.getString("id"), rs.getString("password"), rs.getString("name"));
		}

		close(rs, ps, conn);
		return member;

	}

	public Member Memberlogin(String name, String password) throws SQLException {

		Connection conn = getConnect();
		String query = "SELECT*FROM member WHERE id=? AND password=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		Member member = null;
		if (rs.next()) {

			member = new Member(rs.getString("id"), rs.getString("password"), rs.getString("name"));
		}

		close(rs, ps, conn);
		return member;

	}

	
	// 전체 회원 보기 
	public ArrayList<Member> showAllMember() throws SQLException {
		Connection conn = getConnect();
		String query = "SELECT*FROM member";
		PreparedStatement ps = conn.prepareStatement(query);
		ArrayList<Member> list = new ArrayList<>();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			list.add(new Member(rs.getString("id"), 
					            rs.getString("password"),
					            rs.getString("name")));
		}
		close(rs, ps, conn);
		System.out.println(list);

		return list;
	}
}
