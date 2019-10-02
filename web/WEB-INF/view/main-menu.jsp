<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <link href="resources/css/default.css" rel="stylesheet" type="text/css">
</head>
<body>

<h1>Welcome to my home page</h1>

<p>
    <a href="showForm">Go to form</a>
</p>

<p>
    <h4>Reference static resources directly</h4>
    <img src="resources/img/hellokitty.gif" alt="Hello Kitty typing" width="480" height="480">
</p>

<p>
    <h4>Use Spring tag library to build URL for static resources</h4>
    <img src="<spring:url value="/resources/img/hellokitty.gif"/>" alt="Hello Kitty typing" width="480" height="480">
</p>

<p>
    <h4>Use JSP expression language to build URL for static resource</h4>
    <img src="${pageContext.request.contextPath}/resources/img/hellokitty.gif" alt="Hello Kitty typing" width="480" height="480">
</p>

</body>
</html>
