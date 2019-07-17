package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/FirstServlet","/abc"},initParams= {
		@WebInitParam(name="city",value="Bangalore"),
		@WebInitParam(name="age",value="23")
},loadOnStartup=1)
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		/*
		 * out.println("<h1>Welcome</h1>"); String
		 * city=getServletConfig().getInitParameter("city"); int
		 * age=Integer.parseInt(getServletConfig().getInitParameter("age")); String
		 * name=getServletConfig().getInitParameter("userName"); ServletContext
		 * context=getServletContext(); String
		 * team=context.getInitParameter("projectTeam"); String
		 * location=context.getInitParameter("Location"); String
		 * pass=context.getInitParameter("password");
		 * out.println("<h3>Hello "+name+" your are from "+city+" your age is "+age+
		 * "</h3>");
		 * out.println("<h3>Hello "+team+" your location is "+location+"</h3>");
		 * out.println("<h3>Passsword is "+pass+" </h3>");
		 * out.println("=============================================================");
		 * out.print(request.getServerName()+"<br/>");
		 * out.print(request.getServerPort()+"<br/>");
		 * out.print(context.getServerInfo()+"<br/>");
		 * out.print(request.getRemoteAddr()+"<br/>");
		 * out.print(request.getRemoteHost()+"<br/>");
		 */
		/*
		 * String query=request.getQueryString(); out.print(query); String
		 * name=request.getParameter("name"); int
		 * age=Integer.parseInt(request.getParameter("age")); String
		 * city=request.getParameter("city");
		 * out.println("<br/>"+name+" : "+age+" : "+city);
		 */
		String company=request.getParameter("company");
		out.print("<h1> Company is :" +company+"</h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
