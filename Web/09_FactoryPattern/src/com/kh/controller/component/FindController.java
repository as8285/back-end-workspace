package com.kh.controller.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.controller.Controller;
import com.kh.controller.ModelAndView;
import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

public class FindController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("id");

		MemberDAO dao = new MemberDAO();
		Member member = dao.FindMember(name);
		if (member != null) {
			request.setAttribute("member", member);
			return new ModelAndView(" views/find_ok.jsp");
		} else {
			return new ModelAndView("views/find_fail.jsp",true);
		}

	}
	}
