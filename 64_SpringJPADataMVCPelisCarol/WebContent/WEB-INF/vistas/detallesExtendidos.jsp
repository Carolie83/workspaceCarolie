<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalles Extendidos</title>
<style type="text/css">
h1 {
	text-align: center;
	color: darkBlue;
}
</style>
</head>
<body>
	<h1>Detalles extendidos de la película ${pelicula.titulo}</h1>
	<TABLE STYLE="BORDER: RIDGE 7PX Purple;">
			<tr style=" test-align: center">
		
			<th>Detalle</th>
			</tr>
			<tr>
			<td style=" test-align: center">${pelicula.director} ${pelicula.genero}</td>
		</tr>
		</table>
		</br>
		<a href="mostrarMenuInicio">Pinche aquí, para volver al menú</a> <%-- va a controlador --%>
</body>
</html>