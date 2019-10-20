<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Examples</title>
    <link href="resources/css/default.css" rel="stylesheet" type="text/css">
</head>
<body>

<h1>Distributed Java: Spring MVC Examples</h1>

<h3>A Simple Form</h3>
<p>
    <a href="showForm">Go to form</a>
</p>

<h3>Controller-Level Request Mapping</h3>
<ul>
    <li><a href="registrar/home">Registrar</a></li>
    <li><a href="finaid/home">Financial Aid</a></li>
</ul>

<h3>Using the Spring MVC Model: Student Forms</h3>
<ul>
    <li><a href="${pageContext.request.contextPath}/student/manual/showForm">Manual form processing using HttpServletRequest</a></li>
    <li><a href="${pageContext.request.contextPath}/student/databinding/showForm">Form processing using data binding</a></li>
</ul>

<p>
    <h3>Reference Static Resources (Images, Stylesheets, etc.)</h3>
    <img src="${pageContext.request.contextPath}/resources/img/hellokitty.gif" alt="Hello Kitty typing" width="480" height="480">
</p>


</body>
</html>
