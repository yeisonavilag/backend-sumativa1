<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Producto</title>
</head>
<body>
	<div>
		<form:form action="/producto/modificar" method="post" modelAttribute="producto">
	        <input type="hidden" name="_method" value="put">
            <form:hidden path="idProducto"/>
            
			<form:label path="nombreProducto">nombre:</form:label>
			<form:input type="text" path="nombreProducto"/><br>
			
			<form:label path="descripcionProducto">descripcion:</form:label>
			<form:input type="text" path="descripcionProducto"/><br>
			
			<form:label path="valorProducto">valor:</form:label>
			<form:input type="text" path="valorProducto"/><br>
			
			<input type="submit" value="Modificar Producto"></input><br>
		</form:form>

	</div>
</body>
</html>