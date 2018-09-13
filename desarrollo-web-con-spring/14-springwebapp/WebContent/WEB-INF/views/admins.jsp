<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sf:form action="${pageContext.request.contextPath }/admin/save" method="post" commandName="admin">

	<table>
		<tr>
			<td>Nombre</td>
			<td> <sf:input path="names" type="text" /> </td>
		</tr>
		<tr>
			<td>Cargo</td>
			<td> <sf:input path="role" type="text"/> </td>
		</tr>
		<tr>
			<td> <input type="submit" value="Guardar Cambios">  </td>
		</tr>
		<tr>
			<td>estado</td>
			<td> <input name="status" type="text" /> </td>
		</tr>
	</table>
</sf:form>

<c:out value="${resultado }"></c:out>


</body>
</html>