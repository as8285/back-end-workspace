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
		String password = request.getParameter("password");
		MemberDAO dao = new MemberDAO();
		Member member = null;
	 try {
		member=dao.FindMember(name);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	 request.setAttribute("info", member);
	 if(member!=null) {
		  request.getAttribute("index");
	 }
	 else {
		 response.sendRedirect("find_fail.jsp").forward(request,response);
	 }
	}
	

}
