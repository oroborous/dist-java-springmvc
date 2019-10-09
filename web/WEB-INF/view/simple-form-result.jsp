<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Say Hello</title>
</head>
<body>

<h4>Using JSP Expression Language (EL)</h4>
<p>
    <!-- JSP expression language
         Contains an implicit object "param" with all parameters
         "studentName" is form field's name -->
    Hello, ${param.studentName}!
</p>

</body>
</html>
