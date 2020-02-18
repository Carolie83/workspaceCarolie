<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>web de supermercado</title>
<style type="text/css">
  table{
    margin-left:auto; 
    margin-right:auto;
  }
</style>
</head>
<body>
	<div style="text-align: center;">
		<h1>Bienvenidos a nuestro supermercado</h1>
		<form action="altaProducto">
			<table>
				<tr>
					<td>Nombre del producto:</td>
					<td><input type="text" name="nombre"/></td>
					<td style="color:red">${param.error1 }</td>
				</tr>
				<tr>
					<td>Precio del producto:</td>
					<td><input type="number" name="precio"/></td>
					<td style="color:red">${param.error2 }</td>
				</tr>
				<tr>
				<td>Categoría del producto:</td>
					<td><input type="text" name="categoria"/></td>
					<td style="color:red">${param.error3 }</td>
			</table>
			
			<br/>
			<input type="submit" value="altaProducto"/>
			<br>
		</form>
		
		<br/>
		<table STYLE="BORDER: RIDGE 7PX Purple;width: 100%">
			<tr>
				<th>ID</th>
				<th>Nombre del producto</th>
				<th>Precio del producto</th>
				<th>Categoría del producto</th>
						
			</tr>
			<c:forEach items="${listaProductos}" var="producto">
				<tr>
					<td><c:out value="${producto.id}"></c:out></td>
					<td><c:out value="${producto.nombre}"></c:out></td>
					<td><c:out value="${producto.precio}"></c:out></td>
					<td><c:out value="${producto.categoria}"></c:out></td>
					
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>