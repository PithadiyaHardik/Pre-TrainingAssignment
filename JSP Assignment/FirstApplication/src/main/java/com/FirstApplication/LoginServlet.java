package com.FirstApplication;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserServices us=new UserServices();
				
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		boolean checkLogin;
		try {
			checkLogin = us.login(username, password);
			if(checkLogin)
			{	session.setAttribute("username", username);
				response.sendRedirect("Home.jsp");
			}
			else {
				session.setAttribute("loginmessage", "Invalid cradentials.");
				response.sendRedirect("Login.jsp");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			session.setAttribute("loginmessage","Something went wrong try again.");
			response.sendRedirect("Login.jsp");
		}
		
	}

}
