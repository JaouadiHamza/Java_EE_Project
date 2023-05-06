<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border='1px' >
<tr>
<td>Full name :  </td><td><%= 
 session.getAttribute("fname")
 %></td>
</tr>
<tr>
<td>budget :  </td><td><%= 
 session.getAttribute("budget")
 %>  DT</td>
</tr>
<tr>
<td>Chest :  </td><td><%= 
 session.getAttribute("Chest")
 %>  cm</td>
</tr>
<tr>
<td>Waist :  </td><td><%= 
 session.getAttribute("Waist")
 %>  cm</td>
</tr>
<tr>
<td>Hip :  </td><td><%= 
 session.getAttribute("Hip")
 %>  cm</td>
</tr>
<tr>
<td>Stomach :  </td><td><%= 
 session.getAttribute("Stomach")
 %>  cm</td>
</tr>
<tr>
<td>Length :  </td><td><%= 
 session.getAttribute("Length")
 %>  cm</td>
</tr>
<tr>
<td>Shoulder :  </td><td><%= 
 session.getAttribute("Shoulder")
 %>  cm</td>
</tr>




</table>


<h1 style="color: red ">THE ESTIMATED PRICE IS : 
<%= 
 session.getAttribute("priceTot")
 %> DT
 </h1>
</body>
</html>