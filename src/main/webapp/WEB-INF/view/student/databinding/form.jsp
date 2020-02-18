<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration (Binding)</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>
    <!-- modelAttribute must match the key given in model.addAttribute
         See showDataBindingForm() method in StudentDataBindingController class -->
    <c:url value="/student/databinding/processForm" var="actionUrl"/>
    <form:form action="${actionUrl}" modelAttribute="bindingStudent">

        <!-- path attribute matches the field in the Student class -->
        <!-- When the form is loaded, Spring will call bindingStudent.getFirstName() -->
        <!-- When the form is submitted, Spring will call bindingStudent.setFirstName(...) -->
        First name: <form:input path="firstName" />
        <br/>
        <br/>
        Last name: <form:input path="lastName" />
        <br/>
        <br/>
        <input type="submit" value="Register (Binding)"/>
    </form:form>
</body>
</html>
