<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.aurionpro.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Home Page</title>
<style>
body {
    background-color: #f8f9fa; /* Light gray background */
}

.navbar {
    background-color: #2c3e50; /* Dark navy background for the navbar */
    padding: 10px 20px; /* Padding for spacing */
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */
    display: flex; /* Use flexbox for alignment */
    justify-content: space-between; /* Space between the brand and the links */
    align-items: center; /* Center items vertically */
}

.navbar .brand {
    color: #f39c12; /* Gold color for the brand name */
    font-size: 26px; /* Font size similar to admin pages */
    font-weight: bold;
}

.navbar .links {
    display: flex; /* Align items in a row */
    align-items: center; /* Center items vertically */
}

.navbar .links a {
    color: #ecf0f1; /* Light gray color for the links */
    font-size: 18px; /* Font size similar to admin pages */
    text-decoration: none; /* Remove underline */
    margin: 0 15px; /* Space between links */
}

.navbar .links a:hover {
    color: #f39c12; /* Gold color on hover */
}

.navbar .actions {
    display: flex;
    align-items: center;
}

.navbar .actions form {
    margin: 0;
}

.navbar .actions input[type="submit"],
.navbar .actions button {
    background-color: #2c3e50; /* Dark navy background */
    color: white;
    font-size: 18px; /* Font size similar to admin pages */
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    margin-left: 10px; /* Space between buttons */
}

.navbar .actions input[type="submit"]:hover,
.navbar .actions button:hover {
    background-color: #f39c12; /* Gold color on hover */
}

.container {
    max-width: 800px;
    margin-top:50px;
    margin: 0 auto; /* Center align the container */
    padding: 20px;
    background-color: #ffffff;
    box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
    border-radius: 10px;
    text-align: center;
    
}

.container h2 {
    margin-bottom: 20px;
    color: #2c3e50; /* Dark navy for headers */
}

.container h4 {
    color: #34495e; /* Slightly lighter navy */
    margin-bottom: 10px;
}

.button {
   width: 50%;
    height: 50px;
    font-size: 20px;
    border-radius: 5px;
    font-weight: bold;
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: #1e2a38; /* Dark slate background */
    color: white;
    border: none;
    cursor: pointer;
    
    margin: 15px auto 0 auto;
    transition: background-color 0.3s, transform 0.3s;
}

.button:hover {
    background-color: #2c3e50; /* Slightly lighter shade on hover */
}
</style>
</head>
<body>

<%
 if(session.getAttribute("emailSession") != null) {
     String emailSession = (String)session.getAttribute("emailSession");
 } else {
     response.sendRedirect("../Home.jsp");
 }
%>

<div class="navbar">
   <div class="brand">Aurionpro</div>
   
   <%
   if(request.getAttribute("customerDetails") != null) {
	  CustomerDetails customer = (CustomerDetails)request.getAttribute("customerDetails");
   %>
  
   <div class="actions">
       <form action="CustomerPortal/EditProfile.jsp" >
             <input type="hidden" name="firstName" value="<% out.print(customer.getFirstName()); %>">
              <input type="hidden" name="lastName" value="<% out.print(customer.getLastName()); %>">
               <input type="hidden" name="email" value="<% out.print(customer.getEmail()); %>">
           <button type="submit" name="editProfile">Edit Profile</button>
       </form>
       <form >
           <input type="submit" value="Logout" name="logout" />
       </form>
   </div>
</div>

<div class="container">
    <%
   //  if(request.getAttribute("customerDetails") != null) {
     //      CustomerDetails customer = (CustomerDetails)request.getAttribute("customerDetails"); %>
    <h2>Your Account Details</h2>
    <h4>Your CustomerId: <% out.print(customer.getCustomerId()); %></h4>
    <h4>FirstName: <% out.print(customer.getFirstName()); %></h4>
    <h4>LastName: <% out.print(customer.getLastName()); %></h4>
    <h4>AccountNumber: <% out.print(customer.getAccountNumber()); %></h4>
    <h4>AccountBalance: <% out.print(customer.getBalance()); %></h4>
    <hr>
    <form action="PassbookController" method="post">
        <input type="hidden" name="accountNumber" value="<% out.print(customer.getAccountNumber()); %>">
        <button class="button">Passbook</button>
    </form>
    <form action="CustomerPortal/Transaction.jsp" method="post">
        <input type="hidden" name="accountNumber" value="<% out.print(customer.getAccountNumber()); %>">
        <button class="button">New Transaction</button>
    </form>
    <% }
    %>
</div>

<%
if(request.getParameter("logout") != null) {
    request.getSession().invalidate();
    response.sendRedirect("http://localhost:8080/Bank_MVC_App/Home.jsp");
}

%>

</body>
</html>
