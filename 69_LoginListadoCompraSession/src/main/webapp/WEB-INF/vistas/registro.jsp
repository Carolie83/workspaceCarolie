<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body background="fondoAltaLoginRedimension.png">

		
		<form action="procesarRegistro">
			<div style="text-align: center">
						<br/>
						<br/>
					
				<h3 style="color: #9e0091">RELLENA LOS SIGUIENTES DATOS PARA DARTE DE ALTA COMO CLIENTE: </h3>
				<br/>
				<br/>
				
			<table style="width: 100%">
					<tr><td>		
				Usuario: <input type="text" name="usuario"  required="required"/>
					<br/>
					<br/>
				Email: <input type="email" name="email"  required="required"/>
				
					<br/>
					<br/>
				Password: <input type="password" name="password"  required="required"/>
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
	</body>
</body>
</html>