<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration (Binding)</title>
</head>
<body>
    <!-- modelAttribute must match the key given in model.addAttribute
         See showFormBinding() method in StudentController class -->
    <form:form action="processBinding" modelAttribute="bindingStudent">

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
