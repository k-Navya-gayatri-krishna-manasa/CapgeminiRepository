package com.cg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname=request.getParameter("pname");
		String price=request.getParameter("price");
		int qty=Integer.parseInt(request.getParameter("quantity"));
		//to set additional parameters or attributes
		request.setAttribute("ProductName", pname);
		request.setAttribute("Price", price);
		request.setAttribute("Quantity", qty);
		request.setAttribute("ShopName", "Amazona");
		request.setAttribute("mail", "customer@gmail.com");
		RequestDispatcher dispatcher=request.getRequestDispatcher("DisplayProductInfo");
		dispatcher.forward(request, response);
		
	}

}
