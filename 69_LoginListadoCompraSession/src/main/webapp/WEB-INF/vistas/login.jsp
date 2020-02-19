<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body background="fondoAltaLoginRedimension.png">

		<h1>Login del cliente</h1>
		
		<h3 style="color:red">${param.error}</h3>
		<form action="doLogin"> <%-- va a controlador --%>
			Usuario: <input type="text" name="usuario"/>
			<br/>
			Password: <input type="password" name="password"/>
			
			<br/>
			<input type="submit" value="Enviar"/>
		</form>

</body>
</html>