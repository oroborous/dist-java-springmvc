<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Processing</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>


<!-- Form v1, mapped to "shout" in SimpleFormController.java -->
<!-- Demonstrates model, view template, and controller -->
<h2>Be Shouted At</h2>
<form action="<c:url value="/shout"/>" method="GET">
    <input type="text" name="studentName" placeholder="Student Name">
    <br/>
    <input type="submit">
</form>

<!-- Form v2, mapped to "shoutAgain" in SimpleFormController.java -->
<!-- Demonstrates model, view template, controller, -->
<h2>Be Shouted At Using
    <br/>@RequestParam Binding</h2>
<form action="<c:url value="/shoutAgain"/>" method="GET">
    <input type="text" name="studentName" placeholder="Student Name">
    <br/>
    <input type="submit">
</form>
</body>
</html>
