<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Processed Form</title>
</head>
<body>

<p>
    <!-- Standard JSP expression element
         Uses implicit object "request" to access parameters
         If not recognized, add Tomcat library to project's dependencies -->
    Hello, <%= request.getParameter("studentName") %>!
</p>

<p>
    <!-- JSP expression language
         Contains an implicit object "param" with all parameters
         "studentName" is form field's name -->
    Hello, ${param.studentName}!
</p>

<p>
    <!-- Read data from Spring model -->
    <!-- "msg" is the key name that was used when data
         was added to the model in the controller -->
    <!-- Refer to the shout() method in HelloWorldController.java -->
    Our message to you: ${msg}
</p>
</body>
</html>
