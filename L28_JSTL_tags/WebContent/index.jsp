<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL tag </h1>

<c:out value="Subodh"> </c:out>
<c:set var="name" value="setSubodh"></c:set>
<c:out value="${name}"></c:out>

<c:set var="number" value="6"></c:set>
<br>

<c:if test="${number%2==0}"> <h1>Even number </h1></c:if>

<c:import var="data" url="info.jsp"/>  
<c:out value="${data}"/> 
</body>
</html>