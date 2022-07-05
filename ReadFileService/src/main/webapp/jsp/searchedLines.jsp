<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>searched lines</title>
</head>

<%

	ArrayList<String> searched = (ArrayList<String>)session.getAttribute("searchedLines");	

%>


<body>


<%
	for(String str : searched){
%>
	
	<h4> <%=str %> </h4>
<%
	}
	
%>

</body>
</html>