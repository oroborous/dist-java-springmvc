<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>
<h3>Binding</h3>
<!-- ${exchStudent.firstName} calls exchStudent.getFirstName() -->
Student name: ${exchStudent.firstName} ${exchStudent.lastName}
<br/>
Home country: ${exchStudent.homeCountry}
<br/>
Host country: ${exchStudent.hostCountry}
<br/>
School year: ${exchStudent.gradeLevel}
<br/>
Semester: ${exchStudent.semester}
<br/>
Travel method: ${exchStudent.travelMethod}
<br/>
<!-- Need to loop with JSTL -->
Spoken languages:
<ul>
    <c:forEach var="aLanguage" items="${exchStudent.spokenLanguages}">
        <li>${aLanguage}</li>
    </c:forEach>
</ul>
</body>
</html>
