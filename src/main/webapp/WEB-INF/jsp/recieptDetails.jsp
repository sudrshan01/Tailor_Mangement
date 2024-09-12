<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Receipt Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f4f4f9;
        }
        h2 {
            color: #2c3e50;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            background-color: #ffffff;
        }
        th, td {
            border: 1px solid #dddddd;
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #3498db;
            color: #ffffff;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #e1e1e1;
        }
        a {
            color: #2980b9;
            text-decoration: none;
            font-weight: bold;
        }
        a:hover {
            text-decoration: underline;
        }
        .error-message {
            color: #e74c3c;
            margin-top: 20px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <h2>Receipt Details</h2>
    <c:if test="${not empty emplist}">
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Current Date</th>
                    <th>Delivery Date</th>
                    <th>Customer</th>
                    <th>Status</th>
                    <th>Shirt ID</th>
                    <th>Pant ID</th>
                    <th>Amount</th>
                    <th>Paid Amount</th>
                    <th>Pending Amount</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${emplist}">
                    <tr>
                        <td><c:out value="${item.id}"/></td>
                        <td><c:out value="${item.curr_date}"/></td>
                        <td><c:out value="${item.delivery_date}"/></td>
                        <td><c:out value="${item.customer}"/></td>
                        <td><c:out value="${item.status}"/></td>
                        <td><c:out value="${item.shirt_id}"/></td>
                        <td><c:out value="${item.pant_id}"/></td>
                        <td><c:out value="${item.amount}"/></td>
                        <td><c:out value="${item.paid_amount}"/></td>
                        <td><c:out value="${item.pending_amount}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
    
    <c:if test="${not empty errorMsg}">
        <p class="error-message">${errorMsg}</p>
    </c:if>

    <a href="detail">Home</a>
</body>
</html>

