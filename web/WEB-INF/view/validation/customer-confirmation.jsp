<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
Thank you, ${theCustomer.firstName} ${theCustomer.lastName}
<br/>
You will receive ${theCustomer.freePasses} free passes to ${theCustomer.eventCode}
<br/>
Your postal code is ${theCustomer.postalCode}
</body>
</html>
