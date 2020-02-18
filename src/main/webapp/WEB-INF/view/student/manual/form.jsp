<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration (Manual)</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>
<c:url value="/student/databinding/processForm" var="actionUrl"/>
<form action="${actionUrl}">
    First name: <input type="text" name="firstName">
    <br/>
    <br/>
    Last name: <input type="text" name="lastName">
    <br/>
    <br/>
    <input type="submit" value="Register (Manual)">
</form>
</body>
</html>
