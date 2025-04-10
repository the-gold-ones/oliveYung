package com.coh.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coh.controller.impl.AdminLoginController;
import com.coh.controller.impl.CouponController;
import com.coh.controller.impl.JoinController;
import com.coh.controller.impl.LoginController;
import com.coh.controller.impl.LogoutController;
import com.coh.controller.impl.UserModifyController;

/**
 * Servlet implementation class FrontController
 */
@WebServlet(name = "FrontControllerTest", urlPatterns = "/frontcontroller/*")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Controller> controllerMap = new HashMap<>();
    public FrontController() {
    	controllerMap.put("/frontcontroller/adminLogin", new AdminLoginController());
    	controllerMap.put("/frontcontroller/login", new LoginController());
    	controllerMap.put("/frontcontroller/logout", new LogoutController());
    	controllerMap.put("/frontcontroller/user/coupon", new CouponController());
    	controllerMap.put("/frontcontroller/join", new JoinController());
    	controllerMap.put("/frontcontroller/user/modify", new UserModifyController());
    }

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FrontController");
		
		String uri = request.getRequestURI();
		
		Controller controller = controllerMap.get(uri);
		System.out.println("URI :" + uri); //URI :/frontcontroller/adminLogin
		System.out.println("URL :" + request.getRequestURL()); //URL :http://localhost:9000/frontcontroller/adminLogin
		if (controller == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		controller.process(request, response);
	}

}
