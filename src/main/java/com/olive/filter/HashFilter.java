package com.olive.filter;

import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Servlet Filter implementation class join
 */
@WebFilter("/tt")
public class HashFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HashFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	//Decode한 값을 저장함. 문제 생기면 수정하겠음.
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		String password = req.getParameter("pw");
		if(password != null && !password.isEmpty()) {
			String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
			req.setAttribute("hashedPassword", URLDecoder.decode(hashedPassword, StandardCharsets.UTF_8));
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
