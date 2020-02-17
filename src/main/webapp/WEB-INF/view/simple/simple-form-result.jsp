<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shout Hello</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>

<p>
    <!-- Read data from Spring model -->
    <!-- "msg" is the key name that was used when data
         was added to the model in the controller -->
    <!-- Refer to the shout() and shoutAgain() methods in SimpleFormController.java -->
    Our message to you: ${msg}
</p>
</body>
</html>
