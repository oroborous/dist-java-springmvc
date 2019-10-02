<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Input Form</title>
</head>
<body>

<!-- Form v1, mapped to "processForm" in HelloWorldController.java -->
<!-- Demonstrates controller and view template only, no model -->
<h2>Be Welcomed</h2>
<form action="processForm" method="GET">
    <input type="text" name="studentName" placeholder="Student Name">
    <br/>
    <input type="submit">
</form>

<br/>
<br/>

<!-- Form v2, mapped to "shoutHello" in HelloWorldController.java -->
<!-- Demonstrates model, view template, and controller -->
<h2>Be Shouted At</h2>
<form action="shoutHello" method="GET">
    <input type="text" name="studentName" placeholder="Student Name">
    <br/>
    <input type="submit">
</form>
</body>
</html>
