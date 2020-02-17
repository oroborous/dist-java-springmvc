<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration (Manual)</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>
<form action="processForm">
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
