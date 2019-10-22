<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Info</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/validation.css">
</head>
<body>
<form:form modelAttribute="theCustomer" action="processForm">
    First name*:
    <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br/>
    <br/>
    Last name*:
    <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br/>
    <br/>
    <input type="submit">
</form:form>
</body>
</html>
