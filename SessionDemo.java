package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userName=request.getParameter("uname");
		out.print("<h1>Welcome User"+userName+"</h1>");
		
		out.print("<form method='post' action='SessionDemo1'>");
		out.println("<input type='hidden' value='"+userName+"' name='uname'/>");
		out.print("<input type='submit' value='Submit'/></form>");
		
	}

}
