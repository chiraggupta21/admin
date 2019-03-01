<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="Style.css" type="text/css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<% HttpSession hs=request.getSession();
String str="CHIRAG GUPTA";
%>
<div style="width:90%;">
<div style="width:22%;background-color:#f2f2f2;height:40em;margin:35px;">
<div style="background-color:#cdcdcd;width:95%;margin:7px;heigth:1em;">
<table style="width:100%;">
<tr>
<td><p style="color:white;margin:3px;">PROFILE</p></td>
<td><a href="#">Edit</a></td>
</tr>
</table>
</div>
<center>
<div style="width:50%;background-color:#cdcdcd;margin:1em;">
<iframe style="width:8em;border:none;border-radius:4px;"></iframe></div>
<h4><%=str%></h4>

<p>ID</p>
<p>768775</p>

<p>Office</p>
<p>Cognizant Phase 3</p>

<p>Designation</p>
<p>Intern </p>
</center>
</div>
</body>
</html>