package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/EmployeeServlet" )
public class EmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}


	private static final long serialVersionUID = 1L;
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String no=request.getParameter("empId");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		double salary=Double.parseDouble(request.getParameter("salary"));
		String city=request.getParameter("city");
		String [] values=request.getParameterValues("skills");
		StringBuilder sb=new StringBuilder();
		for(String val:values) {
			sb.append(val+",");
		}
		String sb1=sb.substring(0, sb.length()-1);
		out.println("<h1>Employee Details</h1>");
		out.print("<table border='1'>");
		out.print("<tr>");
		out.print("<td>Employee Id</td>");
		out.print("<td>"+no+"</td></tr>");
		out.print("<tr>");
		out.print("<td>Employee Name</td>");
		out.print("<td>"+name+"</td></tr>");
		out.print("<tr>");
		out.print("<td>Employee Gender</td>");
		out.print("<td>"+gender+"</td></tr>");
		out.print("<tr>");
		out.print("<td>Employee Age</td>");
		out.print("<td>"+age+"</td></tr>");
		out.print("<tr>");
		out.print("<td>Employee Salary</td>");
		out.print("<td>"+salary+"</td></tr>");
		out.print("<tr>");
		out.print("<td>Employee City</td>");
		out.print("<td>"+city+"</td></tr>");
		out.print("<tr>");
		out.print("<td>Employee Skills</td>");
		out.print("<td>"+sb1+"</td></tr>");
		out.print("</table>");

	}

}
