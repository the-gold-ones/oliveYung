package com.olive.service;

import javax.servlet.http.HttpServletRequest;

import com.olive.dao.UserDAO;
import com.olive.vo.User;

public class UserService {
	private UserDAO userDAO;
	
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public User toUserVO(HttpServletRequest request) {
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setPw(request.getParameter("pw"));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setLevel(request.getParameter("level"));
		user.setGender(request.getParameter("gender"));
		user.setPhone(request.getParameter("phone"));
		return user;
	}
	
	public void join(User user) {
		validateDuplication(user.getId());
		userDAO.insertUser(user);
	}
	
	private void validateDuplication(String id) {
		userDAO.findUserById(id).ifPresent(m -> {throw new IllegalArgumentException("Already exists");});
	}
	
}
