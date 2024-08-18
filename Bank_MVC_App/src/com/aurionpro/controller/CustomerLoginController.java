package com.aurionpro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.entity.Customer;
import com.aurionpro.entity.CustomerDetails;
import com.aurionpro.model.CustomerDBControl;


@WebServlet("/CustomerLoginController")
public class CustomerLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerDBControl customerDBControl=null;
	RequestDispatcher dispatcher = null;

    public CustomerLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		int accountNumber= Integer.parseInt(request.getParameter("accountNumber"));
		
		customerDBControl=new CustomerDBControl();
		customerDBControl.connectToDb();
		
		Customer customer =customerDBControl.ValidatesCustomers2(email, password,accountNumber);
		CustomerDetails customerDetails = customerDBControl.getCustomersDetails(email, accountNumber);
		
		if(customer!=null)
		{   request.getSession().setAttribute("emailSession", email);
			request.setAttribute("customerDetails", customerDetails);
			dispatcher=request.getRequestDispatcher("CustomerPortal/CustomerHome.jsp");	
		}
		else
		{
			
			dispatcher=request.getRequestDispatcher("Home.jsp");
		}
		
//		if(customerDBControl.ValidatesCustomers(email, password))
//		{   
//			request.setAttribute("email", email);
//			dispatcher=request.getRequestDispatcher("CustomerPortal/CustomerHome.jsp");
//		}
		
		
		dispatcher.forward(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
