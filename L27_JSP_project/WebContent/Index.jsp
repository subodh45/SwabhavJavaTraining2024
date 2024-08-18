<%@page import="java.util.Date"%>
<%@page import="java.util.Scanner" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- scriplet tag  --%>

<%
%>
<h1>java Implicit Object</h1>
<h2>1.Out</h2>
<% 
  out.print(new Date());  
%>
<h2>2.Request</h2>

<form >  
<input type="text" name="uname">  
<input type="submit" value="Go"><br/>  
</form>  

<%
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>

<h2>3.Response</h2>
<form >  
<input type="text" name="uname">  
<input type="submit" value="go" name="go"><br/>  
</form> 

<%   if(request.getParameter("go")!= null)
{
response.sendRedirect("insert.jsp");  
}
%>  



</body>
</html>