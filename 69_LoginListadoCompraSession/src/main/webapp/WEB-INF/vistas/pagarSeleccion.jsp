<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Pago</title>
</head>
<body>

<h2>Estos son los productos seleccionados a pagar</h2>
<table STYLE="BORDER: RIDGE 7PX Purple;width: 100%">
			<tr>
				<th>ID</th>
				<th>Producto</th>
				<th>Precio</th>
				<th>Categoría</th>
</tr>
			<c:forEach items="${listaProductosSeleccionados.lista}" var="producto">
				<tr>
					<td><c:out value="${producto.id}"></c:out></td>
					<td><c:out value="${producto.nombre}"></c:out></td>
					<td><c:out value="${producto.precio}"></c:out></td>
					<td><c:out value="${producto.categoria}"></c:out></td>
					
				</tr>
			</c:forEach>
		</table>
		
		<h2>Total: ${listaProductosSeleccionados.costeTotal }</h2>
</body>
</html>