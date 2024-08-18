package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServelet")
public class FirstServelet extends HttpServlet {
	
    public FirstServelet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
//		String color1 = request.getParameter("color1");
//		String color2 = request.getParameter("color2");
//		String color3 = request.getParameter("color3");
//		String color4 = request.getParameter("color4");
//		
//		writer.print("selected color is ");
//		if(color1 != null)
//			writer.print(" "+ color1);
//		if(color2 != null)
//			writer.print(" "+color2);
//		if(color3 != null)
//			writer.print(" "+ color3);
//		if(color3 != null)
//			writer.print(" "+color4);
		
		
		String[] values = request.getParameterValues("color");
		
		writer.print("selected color ");
		
		for(int i=0; i<values.length ;i++)
		{
			writer.println("<li>"+ values[i] + "</li>");
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
