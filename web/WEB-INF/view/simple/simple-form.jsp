<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Processing</title>
</head>
<body>


<!-- Form v1, mapped to "shout" in SimpleFormController.java -->
<!-- Demonstrates model, view template, and controller -->
<h2>Be Shouted At</h2>
<form action="shout" method="GET">
    <input type="text" name="studentName" placeholder="Student Name">
    <br/>
    <input type="submit">
</form>

<!-- Form v2, mapped to "shoutAgain" in SimpleFormController.java -->
<!-- Demonstrates model, view template, controller, -->
<h2>Be Shouted At Using @RequestParam Binding</h2>
<form action="shoutAgain" method="GET">
    <input type="text" name="studentName" placeholder="Student Name">
    <br/>
    <input type="submit">
</form>
</body>
</html>
