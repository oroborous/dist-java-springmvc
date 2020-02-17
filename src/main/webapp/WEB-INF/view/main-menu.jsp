<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Examples</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>

<h1>Distributed Java: Spring MVC Examples</h1>

<h3>A Simple Form</h3>
<p>
    <a href="<c:url value="/showForm"/>">Go to form</a>
</p>

<h3>Controller-Level Request Mapping</h3>
<ul>
    <li><a href="<c:url value="/registrar/home"/>">Registrar</a></li>
    <li><a href="<c:url value="/finaid/home"/>">Financial Aid</a></li>
</ul>

<h3>Using the Spring MVC Model: Student Forms</h3>
<ul>
    <li><a href="<c:url value="/student/manual/showForm"/>">Manual form processing using HttpServletRequest</a></li>
    <li><a href="<c:url value="/student/databinding/showForm"/>">Form processing using data binding</a></li>
</ul>

<h3>Dropdown Boxes, Checkboxes, and Radio Buttons</h3>
<p>
    <a href="<c:url value="/travel/showForm"/>">Foreign Exchange Student Application</a>
</p>

<h3>Validation</h3>
<p>
    <a href="<c:url value="/validation/showForm"/>">Customer Information</a>
</p>

<p>
    <h3>Reference Static Resources (Images, Stylesheets, etc.)</h3>
    <img src="<c:url value="/resources/img/hellokitty.gif"/>" alt="Hello Kitty typing" width="480" height="480">
</p>



</body>
</html>
