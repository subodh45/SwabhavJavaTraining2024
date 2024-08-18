package com.aurionpro.jsp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/usernameController")
public class usernameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public usernameController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String username= request.getParameter("username");
		
		request.getSession().setAttribute("username",username);
		//Cookie cookie = new Cookie("username",username);
		//response.addCookie(cookie);
		
		writer.print("Password Page<form action='passwordController' method='get'> password <input type='password' name='password'> ");
		writer.print("<input type='submit' value='Go'> </form>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
