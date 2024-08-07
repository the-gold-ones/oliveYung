package com.coh.controller.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coh.controller.Controller;
import com.coh.dao.AdminDAO;
import com.coh.service.AdminService;
import com.coh.vo.Admin;

public class AdminLoginController implements Controller{
	private AdminService adminService;
	
	public AdminLoginController() {
		adminService = new AdminService(new AdminDAO());
	}
	
	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Admin admin = adminService.login(request.getParameter("id"), request.getParameter("pw"));
			HttpSession session = request.getSession();
			session.setAttribute("admin", admin);
		} catch (Exception e) {
			request.setAttribute("error", e.getMessage());
		}
		request.getRequestDispatcher("../adminLogin.jsp").forward(request, response);
//		response.sendRedirect("../adminLogin.jsp"); //가능하지만 에러메시지를 출력할 수 없다. 
	}


}
