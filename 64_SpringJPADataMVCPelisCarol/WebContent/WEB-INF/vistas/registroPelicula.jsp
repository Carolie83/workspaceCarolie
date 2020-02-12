<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de la película</title>
<style type="text/css">
h1{
	text-align: center;
	color: blue;}
	</style>
</head>
<body>

		
		<form action="procesoAltaPelicula">
			<div style="text-align: center">
						<br/>
						<br/>
					
				<h3 style="color: #9e0091">Rellene los siguientes datos de la película: </h3>
				<br/>
				<br/>
				
			<table style="width: 100%">
					<tr><td>		
				Título: <input type="text" name="titulo"  required="required"/>
					<br/>
					<br/>
				Director: <input type="text" name="director"/>
					<br/>
					<br/>	
				Genero: <input type="text" name="genero"/>
					<br/>
					<br/>
				Año: <input type="number" name="year"/>
					<br/>
					<br/>
			</td></tr>	
				</table>
					<br/>
					<br/>
					<br/>
					<br/>
				<input type="submit" value="Alta"><!-- el boton me lleva a donde indica action -->		
			</div>	
		</form>
					<a href="mostrarMenuInicio">Pinche aquí, para volver al menú</a> <%-- va a controlador --%>
	</body>
</body>
</html>