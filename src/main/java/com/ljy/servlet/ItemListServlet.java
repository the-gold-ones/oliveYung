package com.ljy.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ljy.ItemDAO;
import com.ljy.ItemVO;

@WebServlet("/ItemListServlet")
public class ItemListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	private ItemDAO itemDAO = null;
    public ItemListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		this.itemDAO = new ItemDAO();
		
		List<ItemVO> itemList = this.itemDAO.selectList();
		
		request.setAttribute("itemList", itemList);
		
		RequestDispatcher requestDispatcher = 
				request.getRequestDispatcher("/admin_itemList.jsp");
			requestDispatcher.forward(request, response);
		
	}


}
