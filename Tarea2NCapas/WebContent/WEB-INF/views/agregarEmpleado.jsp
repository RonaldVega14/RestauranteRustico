<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregue un empleado de Rústico</title>
</head>
<body>
<h1>${message }</h1>
<form:form action="${pageContext.request.contextPath}/guardarEmpleado" method="POST" modelAttribute="empleado">
		<label>Ingrese el nombre del empleado: </label>
		<form:input type='text' path='eNombre' value='${empleado.eNombre}'/>
		<label>Ingrese la edad del empleado: </label>
		<form:input type='text' path='eEdad' value='${empleado.eEdad}'/>
		<label>Ingrese el genero del empleado: </label>
		<form:input type='text' path='eGenero' value='${empleado.eGenero}'/>
		<label>Ingrese el estado del empleado: </label>
		<form:input type='text' path='eEstado' value='${empleado.eEstado}'/>
		<label>Ingrese el nombre de la sucursal para la que trabaja: </label>
		<form:input type='text' path='empleado_sucursal' value='${empleado.empleado_sucursal}'/>
		<button onclick="window.location.href = '${pageContext.request.contextPath}/guardarEmpleado'">Insertar</button>
	</form:form>
</body>
</html>