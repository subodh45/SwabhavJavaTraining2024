package com.aurionpro.jsp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/passwordController")
public class passwordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public passwordController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
		//Cookie cookies[] = request.getCookies();
		//String username= cookies[1].getValue();
		
		String username = (String) request.getSession().getAttribute("username");
		String password = request.getParameter("password");
		
		writer.println("username is "+ username );
		writer.println("password is "+ password);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
