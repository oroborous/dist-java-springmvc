<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration 2 (Binding)</title>
</head>
<body>
<!-- modelAttribute must match the key given in model.addAttribute
     See showForm() method in TravelController class -->
<form:form action="processForm" modelAttribute="exchStudent">

    <!-- path attribute matches the field in the ExchangeStudent class -->
    <!-- When the form is loaded, Spring will call exchStudent.getFirstName() -->
    <!-- When the form is submitted, Spring will call exchStudent.setFirstName(...) -->
    First name: <form:input path="firstName"/>
    <br/>
    <br/>
    Last name: <form:input path="lastName"/>
    <br/>
    <br/>
    Home Country:
    <!-- Fill a select box by hardcoding options in JSP -->
    <form:select path="homeCountry">
        <!-- label is what the user sees in the dropdown -->
        <!-- value is what is passed to exchStudent.setCountry(...) -->
        <form:option value="BR" label="Brazil"/>
        <form:option value="FR" label="France"/>
        <form:option value="DE" label="Germany"/>
        <form:option value="IN" label="India"/>
    </form:select>
    <br/>
    <br/>
    <!-- Fill a select box by hardcoding options in bean -->
    Host Country:
    <form:select path="hostCountry">
        <form:options items="${countries.countryOptions}"/>
    </form:select>
    <br/>
    <br/>
    <!-- Fill a select box by reading values from a properties file -->
    <!-- Map has been placed directly in the Spring MVC model -->
    School Year:
    <form:select path="gradeLevel">
        <form:options items="${gradeLevelAttr}"/>
    </form:select>
    <br/>
    <br/>
    Semester:
    <form:radiobutton path="semester" value="Spring" checked="true"/> Spring
    <form:radiobutton path="semester" value="Summer"/> Summer
    <form:radiobutton path="semester" value="Fall"/> Fall
    <br/>
    <br/>
    Travel Method:
    <form:radiobuttons path="travelMethod" items="${travelMethods}" />
    <br/>
    <br/>
Languages Spoken:
    <form:checkbox path="spokenLanguages" value="English"/> English
    <form:checkbox path="spokenLanguages" value="French"/> French
    <form:checkbox path="spokenLanguages" value="German"/> German
    <br/>
    <br/>
    <input type="submit" value="Register"/>
</form:form>
</body>
</html>
