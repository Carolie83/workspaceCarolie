<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido usuario</title>
<style type="text/css">
h1{
	text-align: center;
	color: darkBlue;}
h2{
	text-align: left;
	color: blue;
	}

body  {
  background-image: url("https://thumbs.dreamstime.com/z/fondo-del-cine-con-la-tira-de-pel%C3%ADcula-estrella-de-oro-taza-clapperboard-69765449.jpg");
   background-repeat: no-repeat;
  background-color: #cccccc;
}
	<%-- https://www.w3schools.com/cssref/pr_background-image.asp 
	    COSITAS PARA REVISAR, LA IMAGEN NO TIENE EL TAMAÑO Q QUIERO, COMO REDIMENSIONAR....  --%>

</style>
</head>
<body>
	
		<h1>Bienvenido a nuestra web de cine, ${param.nombre}</h1>
		<br/>
		<br/>
		<h2>Elija la opción que desea realizar:
			<br/>
			<br/>
		
		<br/>
		<br/>
			<a href="mostrarListadoPeliculas"> Ver listado de películas</a> <%-- va a controlador --%>
			<br/>
		<br/>
	
		<br/>
		<br/>
			<a href="mostrarAltaPelicula"> Dar de alta una película</a> <%-- va a controlador --%>
		</h2>
</body>
</html>