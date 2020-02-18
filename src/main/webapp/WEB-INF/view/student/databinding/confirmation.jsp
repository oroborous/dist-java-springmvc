<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>
<h3>Binding</h3>
<!-- ${bindingStudent.firstName} calls bindingStudent.getFirstName() -->
The student is confirmed: ${bindingStudent.firstName} ${bindingStudent.lastName}
</body>
</html>
