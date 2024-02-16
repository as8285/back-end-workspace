package com.kh.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

@WebServlet("/front.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 요청이 어디에서 들어오는 요청인지 구분할 command 값 같이 받는다.
		String command = request.getParameter("command");
		String path = "index.jsp";

		try {
			// 회원가입
			if (command.equals("register")) {
				path = register(request, response); // index.jsp
			}
			// 로그인
			else if (command.equals("login")) {
				path = login(request, response); // index.jsp
			} else if (command.equals("search")) {
				path = search(request, response); // index.jsp
			} else if (command.equals("allshow")) {
				path = allshow(request, response);
			} else if (command.equals("logout")) {
				path = logout(request, response);
			}

		} catch (SQLException e) {

		}

		// 네비게이션
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected String register(HttpServletRequest request, HttpServletResponse response) throws SQLException {

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");

		// 3. DAO 리턴 받기
		MemberDAO dao = new MemberDAO();
		Member member = new Member(id, password, name);
		dao.registerMember(member);

		return "index.jsp";
	}

	// 로그인 네비 게이션
	protected String login(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		MemberDAO dao = new MemberDAO();
		Member member = dao.Memberlogin(id, password);
		// 바인딩
		HttpSession session = request.getSession();
		session.setAttribute("member", member);
		// response.sendRedirect("views/login_result.jsp");
		return "views/login_result.jsp";
	}

//  사람 찾기
	protected String search(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String name = request.getParameter("id");

		MemberDAO dao = new MemberDAO();
		Member member = dao.FindMember(name);
		/*
		 * if (member != null) { request.setAttribute("member", member); return
		 * "view/find_ok.jsp";
		 * 
		 * } else { return "views/find_fail.jsp"; }
		 * 
		 * }
		 */
		if (member != null)
			request.setAttribute("member", member);
		return member != null ? " view/find_ok.jsp" : "views/find_fail.jsp";
	}

	protected String allshow(HttpServletRequest request, HttpServletResponse response) throws SQLException {

		MemberDAO dao = new MemberDAO();
		ArrayList<Member> list = null;
		list = dao.showAllMember();
		request.setAttribute("list", list);

		return "views/allShow.jsp";

	}

	protected String logout(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		if (member != null) {
			session.invalidate();

		}
		return "index.jsp";
	}

}