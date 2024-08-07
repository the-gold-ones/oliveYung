package com.coh.controller.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coh.controller.Controller;
import com.coh.dao.UserDAO;
import com.coh.service.UserService;
import com.coh.vo.User;

public class UserModifyController implements Controller {
	private UserService userService;
	public UserModifyController() {
		userService = new UserService(new UserDAO());
	}

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = userService.toUserVO(request);
		userService.modifyUser(user);
		response.sendRedirect("../index.jsp");
	}

}
