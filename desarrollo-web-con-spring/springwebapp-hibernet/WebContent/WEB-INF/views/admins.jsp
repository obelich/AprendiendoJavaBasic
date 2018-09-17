<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src='<c:url value="/res/javascript/jquery-3.3.1.min.js" />   '></script>

<title>Insert title here</title>
<script>
$(document).ready(function() {
	$(".confirm").on("click", function() {
		return confirm("Estas seguro de eliminar?");
	});
});
</script>

</head>
<body>

<sf:form action="${pageContext.request.contextPath }/admin/save" method="post" commandName="administrator">

	<table>
		<c:if test="${administrator.id ne 0} }"> 
			<sf:input path="id" type="hidden" />
			<sf:input path="created_at" type="hidden" />
		</c:if>
		
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

	</table>
</sf:form>



<c:forEach items="${administrators}" var="administrator">
	
	<c:out value="${administrator }"></c:out> 
		<a href='<c:url value="/admin/${administrator.id}/edit" />'>Edit administration</a>
		<a class="confirm" href='<c:url value="/admin/${administrator.id}/delete" />'>Eliminar administration</a>
	 <br />
</c:forEach>


</body>
</html>