package com.olive.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.olive.dao.MembershipDAO;
import com.olive.service.MembershipService;

/**
 * Servlet implementation class UserLevelServlet
 */
@WebServlet("/membership/*")
public class UserLevelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MembershipService membershipService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLevelServlet() {
        super();
        this.membershipService = new MembershipService();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo();
		String path = "~/olive/index.jsp";
//		if (action.equals("UserUpdate.do"))
//			membershipService.
//		if (action.equals("publishCoupon.do"))
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
