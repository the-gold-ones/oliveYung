package com.olive.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.olive.dao.UserDAO;
import com.olive.service.UserService;
import com.olive.vo.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService userService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        userService = new UserService(new UserDAO());
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			User user = userService.login(request.getParameter("id"), request.getParameter("pw"));
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		} catch (Exception e) {
			request.setAttribute("error", e.getMessage());
			System.out.println(e.getMessage());
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		response.sendRedirect("index.jsp");
	}
}
