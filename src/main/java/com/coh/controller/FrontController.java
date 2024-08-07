package com.coh.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coh.controller.impl.AdminLoginController;

/**
 * Servlet implementation class FrontController
 */
@WebServlet(name = "FrontControllerTest", urlPatterns = "/frontcontroller/*")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Controller> controllerMap = new HashMap<>();
    public FrontController() {
    	controllerMap.put("/frontcontroller/adminLogin", new AdminLoginController());
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FrontController");
		
		String uri = request.getRequestURI();
		
		Controller controller = controllerMap.get(uri);
		System.out.println(uri);
		if (controller == null) {
			response.setStatus(404);
			return;
		}
		controller.process(request, response);
	}

}
