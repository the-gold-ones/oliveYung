package com.coh.controller.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coh.controller.Controller;
import com.coh.service.MembershipService;
import com.coh.vo.Coupon;
import com.coh.vo.User;

public class CouponController implements Controller {
	private MembershipService membershipService;
	
	public CouponController() {
		this.membershipService = new MembershipService();
	}

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		List<Coupon> coupons = membershipService.getCoupons(user.getIdx());
		request.setAttribute("coupons", coupons);
		request.getRequestDispatcher("/memberships/coupon.jsp").forward(request, response);
	}

}
