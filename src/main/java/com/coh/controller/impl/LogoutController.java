package com.coh.controller.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coh.controller.Controller;
import com.coh.listen.Observer;

public class LogoutController implements Controller {

	public LogoutController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Observer.decrementCount();
		HttpSession session = request.getSession();
		session.getServletContext().setAttribute("userCount", Observer.getCount());
		session.invalidate();
		response.sendRedirect("../index.jsp");
	}

}
