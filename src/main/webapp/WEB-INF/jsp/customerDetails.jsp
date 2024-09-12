<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Customer Details</title>
<!-- Include Font Awesome -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 20px;
        background-color: #f0f0f0; /* Grey background color */
        color: #333; /* Default text color */
    }

    h1 {
        text-align: center;
        color: #333; /* Dark grey color for text */
        text-shadow: 1px 1px 2px #ccc; /* Light shadow for better readability */
    }

    .content {
        background-color: #ffffff; /* White background for content area */
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .top-bar {
        display: flex;
        justify-content: center;
        align-items: center;
        gap: 20px;
        margin-bottom: 20px;
    }

    .top-bar form, .top-bar a {
        display: flex;
        align-items: center;
    }

    input[type="text"] {
        padding: 10px;
        margin-right: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        background-color: #fff; /* White background for input */
        color: #333; /* Dark text color */
    }

    input[type="submit"] {
        padding: 10px 20px;
        background-color: #007BFF;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        display: flex;
        align-items: center;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }

    a {
        text-decoration: none;
        color: #007BFF;
        font-weight: bold;
        display: flex;
        align-items: center;
    }

    a:hover {
        color: #0056b3;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin: 20px 0;
        background-color: #fff; /* White background for the table */
    }

    th, td {
        border: 1px solid #ddd;
        padding: 12px;
        text-align: left;
    }

    th {
        background-color: #007BFF;
        color: white;
    }

    td {
        background-color: #f9f9f9;
        color: #333;
    }

    tr:nth-child(even) td {
        background-color: #f1f1f1;
    }

    tr:hover td {
        background-color: #e9e9e9;
    }

    .action-links a {
        margin-right: 10px;
    }

    .icon {
        margin-right: 5px;
    }
</style>
</head>
<body>
    <div class="content">
        <h1>Customer Details</h1>
        <div class="top-bar">
            <form action="selectid" method="get">
                <input type="text" id="id" name="id" placeholder="Enter customer Id">
                <input type="submit" value="Search">
            </form>
            <form action="selectname" method="get">
                <input type="text" id="name" name="name" placeholder="Enter customer Name">
                <input type="submit" value="Search">
            </form>
            <a href="customer.jsp"><i class="fas fa-user-plus icon"></i>Add customer</a>
        </div>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Contact</th>
                    <th>Address</th>
                    <th>Payment</th>
                    <th>Paid Amount</th>
                    <th>Pending Amount</th>
                    <th>Status</th>
                    <th>Email</th>
                    <th>Action</th>
                    <th>Measurement Details</th>
                    <th>History</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="customer" items="${emplist}">
                    <tr>
                        <td>${customer.id}</td>
                        <td>${customer.name}</td>
                        <td>${customer.contact}</td>
                        <td>${customer.address}</td>
                        <td>${customer.payment}</td>
                        <td>${customer.payment_paid}</td>
                        <td>${customer.payment_pending}</td>
                        <td>${customer.status}</td>
                        <td>${customer.email}</td>
                        <td class="action-links">
                            <a href="update.jsp?id=${customer.id}&name=${customer.name}&contact=${customer.contact}&address=${customer.address}&payment=${customer.payment}&payment_paid=${customer.payment_paid}&payment_pending=${customer.payment_pending}&status=${customer.status}&email=${customer.email}"><i class="fas fa-edit icon"></i>Edit</a>
                            <a href="deleteid?id=${customer.id}"><i class="fas fa-trash icon"></i>Delete</a>
                        </td>
                        <td>
                            <a href="measurement.jsp?id=${customer.id}"><i class="fas fa-ruler icon"></i>Measurements</a>
                            <a href="bill?id=${customer.id}"><i class="fas fa-receipt icon"></i>Receipt</a>
                        </td>
                        <td>
                            <a href="recieptAll?id=${customer.id}"><i class="fas fa-file-invoice-dollar icon"></i>Generate All Receipts</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    
</body>
</html>
