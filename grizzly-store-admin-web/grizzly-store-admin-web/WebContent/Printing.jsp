<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.details"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Style.css" type="text/css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>grizzly store</title>
</head>
<style>
#navigation
{
 overflow: hidden;
  background-color: #e6e6e6;
  width:47%;
  margin-top:-42.5em;
  margin-left:2.5em;
}
#navigation a {
  float: left;
  color: #a2a2a2;
  text-align: left;
  padding: 12px 16px;
  text-decoration: none;
  font-size: 17px;
  width:40%;
  
}
#navigation a.active {
  background-color:#cdcdcd;
  color: #4d4d4d;
  border-bottom:3px solid #9a9a9a;
}
.product
{
width:49%;
text-align:left;



}</style>
<body>
<jsp:include page="header.jsp" />
<jsp:include page="Sidebar.jsp" />
<center>
<div id="navigation">
<a class="active" href="#">PRODUCTS</a>
<a  href="#">VENDORS</a>
</div>
<br>
<div style="width:45%;">
<table>
<tr>
<td><select name="action" style="border:none;padding:3px;border-radius:15px;color:#d5d5d5;height:2.3em;background-color:#f2f2f2;width:11em;">
<option value="Choose Action">Choose Action</option>
  <option value="">Personal Care</option>
  <option value="Laptops">Laptops</option>
  <option value="Art Supplies">Art Supplies</option>
  <option value="Desktops">Desktops</option>
</select></td>
<td><input type="text" placeholder="Company Name" name="cn" style="width:15em;background-color:#f2f2f2;height:2.3em;color:#7f7f7f;border:none;border-radius:15px;"required></td>
<td>
<select name="sort" style="border:none;padding:3px;border-radius:15px;color:#717171;height:2.3em;background-color:#f2f2f2;width:9em;">
<option value="Sort">Sort by</option>
  <option value="personal">Personal Care</option>
  <option value="Laptops">Laptops</option>
  <option value="Art Supplies">Art Supplies</option>
  <option value="Desktops">Desktops</option>
</select>
</td>
<td style="position:absolute;margin-left:5em;"><a style="background-color:#e6e6e6;color:#d0d0d0;border:none;width:7em;padding:8px;border-radius:17px;" href="add">Add the list</a></td>
</tr>
</table>
</div>
<div style="width:80%;margin-left:19em;">
<table style="width:100%; border-collapse: collapse; margin-bottom: -38em" cellspacing="10";>
<tr>
<th style="color:#c7c7c7;margin:50px;font-size:1.2em;">Id</th>
<th style="color:#c7c7c7;height:50px;font-size:1.2em;">Category</th>
<th style="color:#c7c7c7;height:50px;font-size:1.2em;">Product List</th>
<th style="color:#c7c7c7;height:50px;font-size:1.2em;">Description</th>
<th style="color:#c7c7c7;height:50px;font-size:1.2em;">Price</th>
</tr>

<% 
List<details> list = new ArrayList<details>();
list = (ArrayList<details>)request.getAttribute("mybooklist");
Iterator<details> it=list.iterator();
while(it.hasNext())
{details book=it.next(); %>

<tr>
<td style="font-size:1.2em;text-align:center;"><%=book.getId()%> </td>
<td style="font-size:1.2em;text-align:center;"><%=book.getCategory()%> </td>
<td style="font-size:1.2em;text-align:center;"><%=book.getName()%></td>
<td style="font-size:1.2em;text-align:center;"><%=book.getdesciption()%> </td>
<td style="font-size:1.2em;text-align:center;"><%=book.getPrice()%> </td>

<td> <a  type="button" style="background-color:#e6e6e6;color:#d0d0d0;border:none;width:7em;padding:8px;border-radius:17px;"  href="view?id=<%=book.getId()%>">View</a> </td>
<td> <a  type="button" style="background-color:#e6e6e6;color:#d0d0d0;border:none;width:7em;padding:8px;border-radius:17px;"  href="delete?id=<%=book.getId()%>">DELETE</a> </td>
</tr>
<%}%>
</table>

</div>
<br>
</center>


</body>
</html>