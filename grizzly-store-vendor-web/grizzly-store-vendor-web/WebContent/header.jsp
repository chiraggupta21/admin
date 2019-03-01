<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div style="padding:10px;width:98%;background-color:#f2f2f2;height:3.7em;border-radius:5px;">
<table style="width:100%;">
<tr>
<td><img src="image/front.jpg"></td>
<td><input type="text" placeholder="Search" style="border-radius: 14px;text-align:right;border:none;padding:5px;width:17em;background-image:url('serach.png');background-repeat: no-repeat;"></td>
<td><img src="bell1.png"></td>
<td><h4><% HttpSession hs=request.getSession();
String str="CHIRAG GUPTA";
%>Welcome,Admin <%=str%></h4></td>
<td><a href="logout.jsp" style="background-color:#b3b3b3;color:black;border-radius:20px;border:none;padding:5px;width:7em; text-decoration:none;">Logout</a></td>
</tr>
</table>
</div>


</body>
</html>