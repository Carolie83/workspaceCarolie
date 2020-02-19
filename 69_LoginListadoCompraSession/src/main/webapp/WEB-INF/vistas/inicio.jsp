<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido cliente a la lista de productos de nuestro supermercado</title>
<style type="text/css">
  table{
    margin-left:auto; 
    margin-right:auto;
  }
</style>
</head>
<body>
		<h1>${cliente.usuario} Bienvenido a la lista de productos de nuestro supermercado</h1>
			<h3> Seleccione los productos que desea comprar</h3>

	<div style="text-align: center;">
		<h1>Listado de productos de nuestro supermercado</h1>


		
		<br/>
		<table STYLE="BORDER: RIDGE 7PX Purple;width: 100%">
			<tr>
				<th>ID</th>
				<th>Producto</th>
				<th>Precio</th>
				<th>Categoría</th>
				<th>Comprar</th>
					
			</tr>
			<c:forEach items="${listaProductos}" var="producto">
				<tr>
					<td><c:out value="${producto.id}"></c:out></td>
					<td><c:out value="${producto.nombre}"></c:out></td>
					<td><c:out value="${producto.precio}"></c:out></td>
					<td><c:out value="${producto.categoria}"></c:out></td>
					<td><a href="addProductoLista?id=${producto.id}"> Añadir producto</a> <%-- va a controlador --%>
					</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Lista añadida a carrito"/>
		
		<div style="text-align: center;">
		<h1>Listado de productos elegidos</h1>
		<table STYLE="BORDER: RIDGE 7PX Purple;width: 100%">
			<tr>
				<th>ID</th>
				<th>Producto</th>
				<th>Precio</th>
				<th>Categoría</th>					
			</tr>
			<c:forEach items="${listaProductosSeleccionados}" var="producto">
				<tr>
					<td><c:out value="${producto.id}"></c:out></td>
					<td><c:out value="${producto.nombre}"></c:out></td>
					<td><c:out value="${producto.precio}"></c:out></td>
					<td><c:out value="${producto.categoria}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
		</div>
		<form action="mostrarSeleccion">
		<a href="mostrarSeleccion"> Ir a pagar</a>
		
			<br/>
			<br>
		</form>
	</div>
</body>
</html>
