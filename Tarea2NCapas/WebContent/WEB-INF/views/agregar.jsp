<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregue una sucursal de Rústico</title>
</head>
<body>
<h1>${message }</h1>
<form:form action="${pageContext.request.contextPath}/guardar" method="POST" modelAttribute="sucursal">
		<label>Ingrese el nombre de la sucursal: </label>
		<form:input type='text' path='sNombre' value='${sucursal.sNombre}'/>
		<label>Ingrese la ubicacion de la sucursal: </label>
		<form:input type='text' path='sUbicacion' value='${sucursal.sUbicacion}'/>
		<label>Ingrese los horarios de la sucursal: </label>
		<form:input type='text' path='sHorarios' value='${sucursal.sHorarios}'/>
		<label>Ingrese el numero de mesas de la sucursal: </label>
		<form:input type='text' path='sNMesas' value='${sucursal.sNMesas}'/>
		<label>Ingrese el nombre del gerente de la sucursal: </label>
		<form:input type='text' path='sNomGerente' value='${sucursal.sNomGerente}'/>
		<button onclick="window.location.href = '${pageContext.request.contextPath}/guardar'">Insertar</button>
	</form:form>
</body>
</html>