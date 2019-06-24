<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edite una sucursal de Rústico</title>
</head>
<body>
	<h3>${message}</h3>
	<form:form method = "POST" action = "${pageContext.request.contextPath}/actualizar" ModelAttribute = "sucursal">
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
					<td>Id de la sucursal:</td>
					<td>${sucursal.sId}</td>
					<td><input type = "text" name = "sId" path = "sId" value = "${sucursal.sId}"></td>
				</tr>
				<tr>
					<td>Nombre de la sucursal:</td>
					<td>${sucursal.sNombre}</td>
					<td><input type = "text" name = "sNombre" path = "sNombre" value = "${sucursal.sNombre}"></td>
				</tr>
				<tr>
					<td>Ubicacion de la sucursal:</td>
					<td>${sucursal.sUbicacion}</td>
					<td><input type = "text" name = "sUbicacion" path = "sUbicacion" value = "${sucursal.sUbicacion}"></td>
				</tr>
				<tr>
					<td>Horario de la sucursal:</td>
					<td>${sucursal.sHorarios}</td>
					<td><input type = "text" name = "sHorarios" path = "sHorarios" value = "${sucursal.sHorarios}"></td>
				</tr>
				<tr>
					<td>Numero de mesas de la sucursal:</td>
					<td>${sucursal.sNMesas}</td>
					<td><input type = "text" name = "sNMesas" path = "sNMesas" value = "${sucursal.sNMesas}"></td>
				</tr>
				<tr>
					<td>Nombre del gerente de la sucursal:</td>
					<td>${sucursal.sNomGerente}</td>
					<td><input type = "text" name = "sNomGerente" path = "sNomGerente" value = "${sucursal.sNomGerente}"></td>
				</tr>
			</tbody>
		</table>
		<input type = "submit" name = "editar" value = "editar">
	</form:form>
</body>
</html>