package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/VisitCount")
public class VisitCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		session.setMaxInactiveInterval(60);
		Integer count=(Integer) session.getAttribute("visitCount");
		if(count==null) {
			count=1;
			
		}
		else {
			count++;
			
		}
		out.print("<h1>Hi User You are visiting site for the "+count+" time(s)</h1>");
		session.setAttribute("visitCount", count);
		
	}

}
