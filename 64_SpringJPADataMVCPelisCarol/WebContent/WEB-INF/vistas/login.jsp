<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body background="${pageContext.request.contextPath}/recursos/fondoAltaLoginRedimension.png">

		<h1>Inicie su sesión para entrar a nuestra web de cine</h1>
		
		<h3 style="color:red">${param.error}</h3>
		<form action="mostrarInicio"> <%-- va a controlador --%>
			Usuario: <input type="text" name="nombre"/>
			<br/>
			Password: <input type="password" name="password"/>
			
			<br/>
			<input type="submit" value="Enviar"/>
			<a href="mostrarRegistro"> Regístrese aquí</a> <%-- va a controlador --%>
		</form>

</body>
</html>