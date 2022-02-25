<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Agregar Cliente</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/formulario.css"  />
	</head>
	<body>
		<div class="cuerpo">
			<div id="formulario">
				<form:form action="insertarCliente" modelAttribute="clienteNew" METHOD="POST">
					<form:label path="">Nombre:
						<form:input path="cltNombre" placeholder="Ingrese Nombre" />
					</form:label>
					<br />
					<br />
					<form:label path="">Apellido:
						<form:input path="cltApellido" placeholder="Ingrese Apellido" />
					</form:label>
					<br />
					<br />		
					<form:label path="">Correo:
						<form:input path="cltEmail" placeholder="Ingrese Email"/>
					</form:label>	
					<br />
					<br />
					<input type="submit" value="Agregar"/>
				</form:form>		
			</div>
		</div>
	</body>
</html>