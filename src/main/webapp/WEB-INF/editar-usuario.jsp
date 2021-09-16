<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar Usuario</title>
</head>
<body>
	<div>
		<form:form action="/usuario/modificar" method="post" modelAttribute="usuario">
			<input type="hidden" name="_method" value="put">
            <form:hidden path="idUsuario"/>
            
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
			
			<form:label path="tipoUsuario">tipo Usuario:</form:label>
			<form:input type="text" path="tipoUsuario"/><br>
			
			<input type="submit" value="Modificar Usuario"></input><br>
		</form:form>
		<br>

	</div>
</body>
</html>