<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cliente</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/estilos.css"  />
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/img/objetivo.png" type="image/png">
    	
	</head>
	<body>
		<div class="agregar">
			<input type="submit" value="Agregar Cliente" onclick="window.location.href='agregar'; return false;"/>
		</div>
		<div class="cuerpo">
			<div id="tabla">
				<table>
					<thead>
						<tr>
							<th>Nombre</th>
							<th>Apellido</th>
							<th>Correo</th>
							<th>Acciones</th>
						</tr>
					</thead>
					<tbody>
						<!-- Link para modificar -->
						<c:forEach items="${clientes}" var="cliente">
							<c:url var="actualizarCliente" value="/cliente/buscarCliente">
								<c:param name="cltId" value="${cliente.cltId}" />
							</c:url>
							<!-- Link para eliminar -->
							<c:url var="eliminarCliente" value="/cliente/eliminarCliente">
								<c:param name="cltId" value="${cliente.cltId }"></c:param>
							</c:url>
						<tr>
							<td>${cliente.cltNombre }</td>
							<td>${cliente.cltApellido }</td>
							<td>${cliente.cltEmail }</td>
							<td><a href="${actualizarCliente}">
									<input type="button" value="Modificar Persona">
								</a>
								<a href="${eliminarCliente}">
									<input type="button" value="Eliminar Persona" onclick="if(!(confirm('Eliminacion de usuario','¿Desea eliminar el cliente seleccionado?'))) return false"/>
								</a>
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>