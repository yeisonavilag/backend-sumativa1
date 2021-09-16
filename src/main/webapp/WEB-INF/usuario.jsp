<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuario</title>
</head>
<body>
	<div>
		<form:form action="/usuario/crear" method="post" modelAttribute="usuario">
			<form:label path="rutUsuario">rut:</form:label>
			<form:input type="text" path="rutUsuario"/><br>
			
			<form:label path="dvUsuario">dv:</form:label>
			<form:input type="text" path="dvUsuario"/><br>
			
			<form:label path="nombreUsuario">nombre:</form:label>
			<form:input type="text" path="nombreUsuario"/><br>
			
			<form:label path="apellidoUsuario">apellido:</form:label>
			<form:input type="text" path="apellidoUsuario"/><br>
			
			<form:label path="correoUsuario">correo:</form:label>
			<form:input type="text" path="correoUsuario"/><br>
			
			<form:label path="tipoUsuario">tipo:</form:label>
			<form:input type="text" path="tipoUsuario"/><br>
			
			<input type="submit" value="Ingresar Usuario"></input><br>
		</form:form>
		<br>
		<h1>Lista usuarios</h1>
		<table>
			<thead>
				<tr>
					<th>#</th>
					<th>Rut</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Correo</th>
					<th>Tipo</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="usuario" items="${lista_usuarios}" >
					<tr>
						<td><c:out value="${usuario.idUsuario}" /> </td>
						<td><c:out value="${usuario.rutUsuario}" /> - <c:out value="${usuario.dvUsuario}" /> </td>
						<td><c:out value="${usuario.nombreUsuario}" /> </td>
						<td><c:out value="${usuario.apellidoUsuario}" /> </td>
						<td><c:out value="${usuario.correoUsuario}" /> </td>
						<td><c:out value="${usuario.tipoUsuario}" /> </td>
						<td>
							<a href="/usuario/actualizar/${usuario.idUsuario}">Editar</a>
							
							<form action="/usuario/eliminar" method="POST">
							<input type="hidden" name="id" value="<c:out value="${usuario.idUsuario}" />" >
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