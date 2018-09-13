<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hola JSP</h1>

<a href='<c:url value="/about" />'>Acerca de</a> <br />
<a href='<c:url value="admins" />'>Crear Administrador</a> <br />
<c:out value="${adminForm}"></c:out> <br />

<c:out value="${adminForm.names}"></c:out> <br />
</body>
</html>