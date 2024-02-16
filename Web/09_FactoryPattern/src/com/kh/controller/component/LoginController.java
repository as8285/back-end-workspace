package com.kh.controller.component;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.controller.Controller;
import com.kh.controller.ModelAndView;
import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

public class LoginController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
			String id = request.getParameter("id");
			String password = request.getParameter("password");

			MemberDAO dao = new MemberDAO();
			Member member = dao.Memberlogin(id, password);
			// 바인딩
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			// response.sendRedirect("views/login_result.jsp");
		
			return new ModelAndView("views/login_result.jsp",true);
		
	}

	}


