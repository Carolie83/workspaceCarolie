<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla de multiplicación</title>
</head>
<body>
 <% int n = Integer.parseInt(request.getParameter("numero")); %> 
    <h1>Tabla de multiplicar de ${param.numero }</h1>
    <table>
      <%
        for(int i = 0; i < 11; i++) {
          out.println("<tr><td>" + i + " x " + n + "</td><td> = </td><td>" + i * n + "</td></tr>");
        }
      %>
    </table>
  </body>
</html>
