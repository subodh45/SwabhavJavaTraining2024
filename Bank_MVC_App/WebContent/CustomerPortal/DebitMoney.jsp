<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Debit Money</title>
<style>
body {
    background-color: #ecf0f1; /* Light gray background */
    font-family: Arial, sans-serif;
}

.navbar {
    background-color: #2c3e50; /* Dark navy background */
    padding: 10px 20px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.navbar .brand {
    color: #f39c12; /* Gold color for the brand name */
    font-size: 26px;
    font-weight: bold;
}

.navbar a {
    color: #f39c12; /* Gold color */
    font-size: 18px;
    text-decoration: none;
    margin: 0 15px;
}

.navbar a:hover {
    color: #ecf0f1; /* Light gray on hover */
}

.navbar form input[type="submit"] {
    background-color: #2c3e50; /* Dark navy background */
    color: white;
    font-size: 18px;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    margin-left: 10px;
}

.navbar form input[type="submit"]:hover {
    background-color: #f39c12; /* Gold color on hover */
}

h1 {
    text-align: center;
    color: #2c3e50;
    margin-top: 30px;
}

.form {
    width: 40%;
    background-color: white;
    border: solid #2c3e50 2px; /* Dark navy border */
    border-radius: 10px;
    padding: 20px;
    margin: 40px auto;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */
}

.form label {
    font-size: 20px;
    color: #2c3e50;
    margin-bottom: 10px;
    display: block;
}

.form input[type="text"],
.form input[type="number"],
.form input[type="date"] {
     width: calc(100% - 22px); /* Full width minus padding */
    height: 40px;
    font-size: 18px;
    border: solid #bdc3c7 1px; /* Light gray border */
    border-radius: 5px;
    padding: 5px 10px;
    margin-bottom: 15px;
}

.form input[type="text"][readonly],
.form input[type="number"][readonly],
.form input[type="date"][readonly] {
    background-color: #ecf0f1; /* Light gray background for readonly fields */
}

.button {
    width: 100%;
    height: 45px;
    font-size: 20px;
    border-radius: 5px;
    font-weight: bold;
    background-color: #2c3e50; /* Dark navy background */
    color: white;
    border: none;
    cursor: pointer;
    display: flex;
    justify-content: center;
    align-items: center;
    transition: background-color 0.3s, transform 0.3s;
}

.button:hover {
    background-color: #f39c12; /* Gold color on hover */
    transform: translateY(-2px); /* Slight upward movement on hover */
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
   <a href="CustomerHome.jsp" class="brand">Aurionpro.Bank</a>
   
   
  <!--   <form method="post">
       <input type="submit" value="Logout" name="logout" />
   </form> -->
</div>

<%
if(request.getParameter("accountNumber") != null) {
    int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String todayDate = sdf.format(new Date());
%>
    <h1>Debit Transaction</h1>
    <div class="form">
        <form action="../DebitTransferController" method="post">
            <label>Transaction Type:</label>
            <input type="text" name="transactionType" value="Debit" readonly>
            
            <label>Account Number:</label>
            <input type="number" name="accountNumber" value="<%= accountNumber %>" readonly>
            
            <label>Date:</label>
            <input type="date" id="current-date" name="current-date" value="<%= todayDate %>" readonly>
            
            <label>Enter Amount to be Debited:</label>
            <input type="number" name="amount" min="1" required>
            
            <button class="button">Transfer</button>
        </form>
    </div>
<%
}
%>

</body>
</html>
