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

Atributo usando el modelo: <c:out value="${mensaje }"></c:out> <br />
Atributo usando Session: <c:out value="${sessionScope.resultado }"></c:out> <br />

</body>
</html>