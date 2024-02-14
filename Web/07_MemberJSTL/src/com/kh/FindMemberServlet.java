package com.kh;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;



@WebServlet("/search")
public class FindMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("id");
	
		MemberDAO dao = new MemberDAO();
		
	 try {
		 Member member=dao.FindMember(name);
	
	
	 if(member!=null) {
		 request.setAttribute("member", member);
		 request.getRequestDispatcher("view/find_ok.jsp").forward(request, response);
	 }
	 else {
		response.sendRedirect("views/find_fail.jsp");
	 }
	 } catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}}

