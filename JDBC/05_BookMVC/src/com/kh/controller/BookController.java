package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.dao.BookDAO;
import com.kh.model.vo.Book;
import com.kh.model.vo.Publisher;


public class BookController {
	private BookDAO dao = new BookDAO();

	// 1.전체 책 조회
	public ArrayList<Book> printBookAll() {
		try {
			return dao.printBookAll();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
	
	// 2. 책등록

	public boolean registerBook(String title, String author) {
		try {
		if(dao.registerBook(title, author)==1){
			return true;
		
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		
		
	
	}
		return false;
	}
	// 책삭제
	public boolean sellBook(int no) {
		try {
		if(dao.sellBook(no)==1) return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 회원가입 
	
	
	
	
	
	
		// 1. 책대여
		public void rentBook() throws SQLException{
				
			System.out.println(printBookAll());
			
			// printBookAll(전체 책 조회) 출력 후
				dao.rentBook();
		
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

	

