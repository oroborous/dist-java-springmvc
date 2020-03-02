<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Confirmation</title>
    <jsp:include page="/WEB-INF/view/includes/header.jsp"/>
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Free Passes</th>
        <th>Postal Code</th>
        <th>Event Code</th>
    </tr>
    <c:forEach items="${allCustomers}" var="aCustomer">
        <tr>
            <td>${aCustomer.firstName} ${aCustomer.lastName}</td>
            <td>${aCustomer.freePasses}</td>
            <td>${aCustomer.postalCode}</td>
            <td>${aCustomer.eventCode}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
