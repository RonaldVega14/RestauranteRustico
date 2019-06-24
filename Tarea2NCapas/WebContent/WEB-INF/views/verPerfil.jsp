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
	<link rel="stylesheet" href="./resources/css/home.css">
	<meta charset="UTF-8">
	<title>Ver perfil del restaurante</title>
</head>
<body>
	<h2 class="text-center"><b>Perfil de sucursal: ${sucursal.sNombre}</b></h2>
	<h4 class="text-center">Ubicacion de la sucursal: ${sucursal.sUbicacion}</h4>
	<h4 class="text-center">Horarios de la sucursal: ${sucursal.sHorarios}</h4>
	<h4 class="text-center">Numero de mesas: ${sucursal.sNMesas}</h4>
	<h4 class="text-center">Nombre del gerente: ${sucursal.sNomGerente}</h4>
	<div class="container">
	    <div class="row col-md-6 col-md-offset-2 custyle">
		    <table class="table table-striped custab">
			    <thead>
				    <tr>
				    	<th class="text-center">Nombre del empleado</th>
				        <th class="text-center">Edad</th>
				        <th class="text-center">Genero</th>
				        <th class="text-center">Estado</th>
				        <th class="text-center">Acciones</th>
				    </tr>
				</thead>
			    <c:forEach items="${empleados}" var="empleados">
			    <tr>
			        <td class="text-center"><b>${empleados.eNombre}</b></td>
			        <td class="text-center">${empleados.eEdad}</td>
			        <td class="text-center">${empleados.eGenero}</td>
			        <td class="text-center">${empleados.estadoMod}</td>
			        <td class="text-center">
			        	<button class='btn btn-info btn-xs' type="button" onclick="window.location.href = '${pageContext.request.contextPath}/editarEmpleado?id=${sucursal.sId}&eid=${empleados.eId}'"><span class="glyphicon glyphicon-edit"></span>Editar</button>
			        	<button class="btn btn-danger btn-xs" type="button" onclick="window.location.href = '${pageContext.request.contextPath}/borrarEmpleado?id=${sucursal.sId}&eid=${empleados.eId}'"><span class="glyphicon glyphicon-remove"></span>Borrar</button>
			        </td>
			    </tr>
			    </c:forEach>
		    </table>  
	    </div>
	</div>
	<button class="btn btn-primary btn-xs pull-center" type="button" onclick="window.location.href = '${pageContext.request.contextPath}/home'">Regresar</button>
</body>
</html>