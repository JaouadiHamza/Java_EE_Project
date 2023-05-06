<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="0" >
<tr>
<td>Full name :  </td><td><%= 
 session.getAttribute("fname")
 %></td>
</tr>
<tr>
<td>budget :  </td><td><%= 
 session.getAttribute("budget")
 %></td>
</tr>
<tr>
<td>Chest :  </td><td><%= 
 session.getAttribute("Chest")
 %></td>
</tr>
<tr>
<td>Waist :  </td><td><%= 
 session.getAttribute("Waist")
 %></td>
</tr>
<tr>
<td>Hip :  </td><td><%= 
 session.getAttribute("Hip")
 %></td>
</tr>
<tr>
<td>Stomach :  </td><td><%= 
 session.getAttribute("Stomach")
 %></td>
</tr>
<tr>
<td>Length :  </td><td><%= 
 session.getAttribute("Length")
 %></td>
</tr>
<tr>
<td>budget :  </td><td><%= 
 session.getAttribute("budget")
 %></td>
</tr>
<tr>
<td>Shoulder :  </td><td><%= 
 session.getAttribute("Shoulder")
 %></td>
</tr>




</table>


<h1 style="color: red ">THE ESTIMATED PRICE IS : 
<%= 
 session.getAttribute("priceTot")
 %> DT
 </h1>
</body>
</html>