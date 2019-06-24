<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edite un empleado de Rústico</title>
</head>
<body>
	<h3>${message}</h3>
	<form:form method = "POST" action = "${pageContext.request.contextPath}/actualizarEmpleado" ModelAttribute = "empleado">
		<table>
			<thead>
				<tr>
					<th>Valor a editar</th>
					<th>Valor actual</th>
					<th>Nuevo valor</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Nombre del empleado:</td>
					<td>${empleado.eNombre}</td>
					<td><input type = "text" name = "eNombre" path = "eNombre" value = "${empleado.eNombre}"></td>
				</tr>
				<tr>
					<td>Edad del empleado:</td>
					<td>${empleado.eEdad}</td>
					<td><input type = "text" name = "eEdad" path = "eEdad" value = "${empleado.eEdad}"></td>
				</tr>
				<tr>
					<td>Genero del empleado:</td>
					<td>${empleado.eGenero}</td>
					<td><input type = "text" name = "eGenero" path = "eGenero" value = "${empleado.eGenero}"></td>
				</tr>
				<tr>
					<td>Estado del empleado:</td>
					<td>${empleado.estadoMod}</td>
					<td><input type = "text" name = "estadoMod" path = "estadoMod" value = "${empleado.estadoMod}"></td>
				</tr>
			</tbody>
		</table>
		<input type = "submit" name = "editarEmpleado" value = "Editar">
	</form:form>
</body>
</html>