package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PresentationServlet")
public class PresentationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("itemName");
		if(name==null) {
			request.setAttribute("err", new ItemNotFoundException("Item not provided"));
			RequestDispatcher dispatcher=request.getRequestDispatcher("ErrorServlet");
			dispatcher.forward(request, response);
		}
		else {
			out.print("<h1>Printing Item Name from Presentation Servlet:"+name+"</h1>");
			out.print("<hr>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("ItemServlet");
			dispatcher.include(request, response);
			
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
