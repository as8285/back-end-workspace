package com.kh.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;


@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 받아야할 값
		String name = request.getParameter("name");

		// doa 에서 가져올값
		MemberDAO dao = new MemberDAO();
		Member member = null;
		try {
			member = dao.SearchMember(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 2. 바인딩
		request.setAttribute("info", member);

		// 3. 네이게이션 : search.jsp(만약에 멤보정보가 없으면... 이라는 것을 추가! )
		if(member!=null) {
			request.getRequestDispatcher("search.jsp").forward(request, response);
		}
		else {
			response.sendRedirect("fail.jsp");
		}

	}

}
