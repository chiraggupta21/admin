<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="Style.css" type="text/css" rel="stylesheet">
<title>Insert title here</title>
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
<form action="data">
 <br>
  <input type="text" name="id" placeholder="ID" style="border:none;font-size:1em;color:#818181;padding:12px;"><br>
 <br>
  <input type="text" name="category" placeholder="Category" style="border:none;font-size:1em;color:#818181;padding:12px;"><br>
<br>
  <input type="text" name="name" placeholder="Name" style="border:none;font-size:1em;color:#818181;padding:12px;"><br>
  <br>
  <input type="text" name="description" placeholder="Description" style="border:none;font-size:1em;color:#818181;padding:12px;"><br>
 <br>
  <input type="text" name="price" placeholder="Price" style="border:none;font-size:1em;color:#818181;padding:12px;"><br>
 <br>
    <input type="submit" value="Submit" style="border:none;font-size:1em;color:white;padding:10px;background-color:#343434;border-radius:17px;width:22%;float:right;">

<input type="reset" value="Cancel" style="border:none;font-size:1em;color:#888888;padding:10px;background-color:#cdcdcd;border-radius:17px;width:22%;float:right;" >
</form>

</center>
</body>
</html>