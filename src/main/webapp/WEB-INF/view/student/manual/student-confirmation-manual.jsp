<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation (Manual)</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>
<h3>Manual</h3>
<!-- ${manualStudent.firstName} calls manualStudent.getFirstName() -->
The student is confirmed: ${manualStudent.firstName} ${manualStudent.lastName}
</body>
</html>
