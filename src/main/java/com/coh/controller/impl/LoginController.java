package com.coh.controller.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coh.controller.Controller;
import com.coh.dao.UserDAO;
import com.coh.listen.Observer;
import com.coh.service.UserService;
import com.coh.vo.User;

public class LoginController implements Controller {
	private UserService userService;

	public LoginController() {
		// TODO Auto-generated constructor stub
		userService = new UserService(new UserDAO());
	}

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			User user = userService.login(request.getParameter("id"), request.getParameter("pw"));
			Observer.incrementCount();
			HttpSession session = request.getSession();
			session.getServletContext().setAttribute("userCount", Observer.getCount());
			session.setAttribute("user", user);
			response.sendRedirect("../index.jsp");
		} catch (Exception e) {
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("../login.jsp").forward(request, response);
		}
		
	}

}
