package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		/*
		 * ServletConfig config=getServletConfig(); String
		 * name=config.getInitParameter("userName"); String
		 * company=config.getInitParameter("company"); ServletContext
		 * context=getServletContext(); String
		 * team=context.getInitParameter("projectTeam"); String
		 * location=context.getInitParameter("Location"); out.println("<html>");
		 * out.println("<head><title>MyApp</title></head>"); out.println("<body>");
		 * out.println("<h1>Welcome to my first Servlet</h1>");
		 * out.println("<h3>Hello "+name+" you work for the company "+company+"</h3>");
		 * out.println("<h3>Hello "+team+" your location is "+location+"</h3>");
		 * 
		 * out.println("</body>"); out.println("</html>");
		 */
		
		
		/* resp.sendRedirect("http://www.microsoft.com"); */
		/*resp.sendRedirect("employee.html");*/
		
		//RequestDispatcher dispatcher=req.getRequestDispatcher("FirstServlet");
		
		//or
		
		ServletContext context=getServletContext();
		out.print("<h1>Hello</h1>");
		RequestDispatcher dispatcher=context.getRequestDispatcher("/FirstServlet");

		
		//dispatcher.forward(req, resp);
		dispatcher.include(req, resp); //to print statement 44 along with forwarded req of /FirstServlet


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
	
	
}
