package com.cg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Verify")
public class Verify extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid=request.getParameter("uname");
		String pass=request.getParameter("password");
		
		if(uid.equals("capgemini") && pass.equals("pwd")) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("Success");
			dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect("login1.html");
		}
	}

}
