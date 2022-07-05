<%@page import="java.util.ArrayList"%>
<%@page import="ApplicationDao.ApplicationFunctions"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Service Read file</title>
</head>
<%
ArrayList<String> file = (ArrayList<String>)session.getAttribute("file");
%>


<body>

	<%
	
			
			for(String str : file){
	%>
	
			<h4>  <%=str %>  </h4>
					
	<%
			}
	
	%>
	
</body>
</html>