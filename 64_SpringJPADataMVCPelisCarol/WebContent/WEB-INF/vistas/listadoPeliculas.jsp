<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Películas</title>
<style type="text/css">
h1 {
	text-align: center;
	color: darkBlue;
}

h2 {
	text-align: left;
	color: blue;
}
</style>
</head>
<body>
		<h1>LISTADO DE PELICULAS</h1>
	<TABLE STYLE="BORDER: RIDGE 7PX Purple;">
			<tr>
			<th>Id</th>
			<th>Titulo</th>
			<th>Año</th>
			<th>Detalle</th>
			</tr>
			<c:forEach items="${listaPeliculas}" <%-- LO HEMOS LLAMADO ASÍ EN EL CONTROLADOR--%>
			 	var="pelicula">
             	<tr>
             		<td>${pelicula.id}</td>
                	<td>${pelicula.titulo}</td>
                	<td>${pelicula.year}</td>
                	<td><a href="mostrarDetallesExtendidos?id=${pelicula.id }">Pinche aquí para mas información</a></td>
                </tr>
             </c:forEach>
		</table>
		</br>
			</br>
		<a href="mostrarMenuInicio">Pinche aquí, para volver al menú</a> <%-- va a controlador --%>
</body>
</html>