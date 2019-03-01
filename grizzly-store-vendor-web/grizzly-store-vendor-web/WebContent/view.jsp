<%@page import="com.dao.details"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
details b=(details)request.getAttribute("listit");
out.println("ID = "+b.getId()+" \nNAME = "+b.getName()+"\n Category ="+b.getCategory()+" \nDesciption ="+b.getdesciption()+" \nprice ="+b.getPrice());%>
</body>
</html>