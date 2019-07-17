package com.cg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/JSPServlet")
public class JSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * User user=new User(); user.setId(100); user.setName("Manu");
		 */
		HttpSession session=request.getSession();
		/*
		 * session.setAttribute("user1",user); //if we want to write req.setAttribute()
		 * we have to use RequestDispatcher response.sendRedirect("index.jsp");
		 * 
		 * 
		 * //this is for Expression language exg
		 * request.setAttribute("name","Request Name");
		 * session.setAttribute("name","Session Name"); ServletContext
		 * context=getServletContext(); context.setAttribute("name","Context Name");
		 * 
		 */ /*
			 * RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			 * dispatcher.forward(request, response);
			 */
		EmployeeBean e1=new EmployeeBean(1001, "Binmu","Female" ,23, 35000);
		EmployeeBean e2=new EmployeeBean(1002, "Sai","Male" ,28, 99999);
		EmployeeBean e3=new EmployeeBean(1003, "Anil","Male" ,42, 59000);
		EmployeeBean e4=new EmployeeBean(1004, "Anitha","Female" ,26, 95000);
		List<EmployeeBean> employees=new ArrayList<EmployeeBean>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		session.setAttribute("employees",employees);
		

		
		
	}

}
