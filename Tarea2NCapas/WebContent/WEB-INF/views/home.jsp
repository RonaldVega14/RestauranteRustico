<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<meta charset="UTF-8">
<meta charset="UTF-8">
<title>Rústico Restaurante</title>
</head>
<body>
<div class="container">
<div class="row col-md-6 col-md-offset-2">
<h1>${message}</h1>
</div>
	    <div class="row col-md-6 col-md-offset-2">
		    <table class="table table-hover">
			    <thead>
				    <tr>
				    	<th class="text-center">Nombre de la sucursal</th>
				        <th class="text-center">Ubicacion</th>
				        <th class="text-center">Opciones</th>
				    </tr>
				</thead>
			    <c:forEach items="${sucursales}" var="sucursales">
			    <tr>
			        <td class="text-center"><b>${sucursales.sNombre}</b></td>
			        <td class="text-center">${sucursales.sUbicacion}</td>
			        <td class="text-center">
			        	<button class='btn btn-info btn-xs' type="button" onclick="window.location.href = '${pageContext.request.contextPath}/verPerfil?id=${sucursales.sId}'">Ver perfil</button>
			        	<button class='btn btn-info btn-xs' type="button" onclick="window.location.href = '${pageContext.request.contextPath}/editar?id=${sucursales.sId}'">Editar</button>
			        	<button class="btn btn-danger btn-xs" type="button" onclick="window.location.href = '${pageContext.request.contextPath}/eliminar?id=${sucursales.sId}'">Eliminar</button>
			        </td>
			    </tr>
			    </c:forEach>
		    </table>
		    <form:form action = "${pageContext.request.contextPath}/agregar" method = "POST">
			<input type = "submit" value = "Agregar Sucursal">
		</form:form>
	    </div>
	    
	</div>

</body>
</html>