<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Producto</title>
</head>
<body>
	<div>
		<form:form action="/producto/crear" method="post" modelAttribute="producto">
			<form:label path="nombreProducto">nombre:</form:label>
			<form:input type="text" path="nombreProducto"/><br>
			
			<form:label path="descripcionProducto">descripcion:</form:label>
			<form:input type="text" path="descripcionProducto"/><br>
			
			<form:label path="valorProducto">valor:</form:label>
			<form:input type="text" path="valorProducto"/><br>
			
			<input type="submit" value="Ingresar Producto"></input><br>
		</form:form>
		<br>
		<h1>Lista productos</h1>
		<table>
			<thead>
				<tr>
					<th>#</th>
					<th>Nombre</th>
					<th>Descripcion</th>
					<th>Valor</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="producto" items="${lista_productos}" >
					<tr>
						<td><c:out value="${producto.idProducto}" /> </td>
						<td><c:out value="${producto.nombreProducto}" /> </td>
						<td><c:out value="${producto.descripcionProducto}" /> </td>
						<td><c:out value="${producto.valorProducto}" /> </td>
						<td>
							<a href="/producto/actualizar/${producto.idProducto}">Editar</a>
							
							<form action="/producto/eliminar" method="POST">
							<input type="hidden" name="id" value="<c:out value="${producto.idProducto}" />" >
							<input type="submit" value="Eliminar">
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>