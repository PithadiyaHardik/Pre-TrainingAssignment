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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		UserServices us=new UserServices();
		try {
			boolean result=us.Register(name, email, username, password);
			if(result)
			{
				session.setAttribute("username", username);
				response.sendRedirect("Home.jsp");
			}
			else {
				session.setAttribute("registermessage", "Either username is taken or email is already in use");
				response.sendRedirect("Register.jsp");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			session.setAttribute("registermessage","Something went wrong try again.");
			System.out.println(e);
			response.sendRedirect("Register.jsp");
		}
		
		
	}

}
