<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <title>Contact Page</title>
    <meta charset="ISO-8859-1">
</head>
<body>
        <h1>Contact List</h1>
        <h1>Current System Time <%=new Date()%></h1>
        <table border="3">
            <thead>
            <tr>
            <th>Phone</th>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Address</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${contacts}" var="customer">
                <tr>
                    <td><c:out value="${customer.phone}"/></td>
                    <td><c:out value="${customer.name}"/></td>
                    <td><c:out value="${customer.age}"/></td>
                    <td><c:out value="${customer.gender}"/></td>
                    <td><c:out value="${customer.address}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
</body>
</html>