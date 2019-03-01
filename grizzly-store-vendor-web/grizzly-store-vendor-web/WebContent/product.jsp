<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Style.css" type="text/css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grizzly Store</title>
</head>
<body>
<jsp:include page="header.jsp" />
<jsp:include page="Sidebar.jsp" />
<center>
<div id="navigation">
<a  href="#">PRODUCTS</a>
<a class="active" href="#">INVENTORY</a>
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
<td style="position:absolute;margin-left:5em;"><input type="submit" style="background-color:#676767;color:white;border:none;border-radius:17px;height:2em;width:10em;font-size:1em;" value="Add Product"></td>
</tr>
</table>
</div>
<br><br><br><br>
<div style="width:80%;margin-left:19em;">
<table style="width:100%; border-collapse: collapse;" cellspacing="10">
<tr>
<th style="color:#c7c7c7;margin:50px;font-size:1.2em;">Product List</th>
<th style="color:#c7c7c7;height:50px;font-size:1.2em;">Brand</th>
<th style="color:#c7c7c7;height:50px;font-size:1.2em;">Category</th>
<th style="color:#c7c7c7;height:50px;font-size:1.2em;">Rating</th>
</tr>
<tr>

<td style="font-size:1.2em;text-align:center;">Trimmer</td>
<td style="font-size:1.2em;text-align:center;">Phillips</td>
<td style="font-size:1.2em;text-align:center;">Personal Care</td>
<td style="font-size:1.2em;text-align:center;">4.5</td>
<td><button type="button" style="background-color:#e6e6e6;color:#d0d0d0;border:none;width:7em;padding:8px;border-radius:17px;" onclick="#">View</button></td>
<td><button type="button" style="background-color:#e6e6e6;color:#d0d0d0;border:none;width:7em;padding:8px;border-radius:17px;"  onclick="#">Block</button></td>
<td><button type="button" style="background-color:#e6e6e6;color:#d0d0d0;border:none;width:7em;padding:8px;border-radius:17px;"  onclick="#">Remove</button></td>
</tr>
</table>





