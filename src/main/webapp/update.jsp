<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Information Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    form {
        background-color: #fff;
        padding: 30px; /* Increased padding for more space */
        border: 1px solid #ddd;
        border-radius: 8px; /* Slightly more rounded corners */
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* More pronounced shadow */
        width: 100%;
        max-width: 1200px; /* Increased max-width for more space */
        height: auto; /* Adjusts height based on content */
        box-sizing: border-box;
    }

    .form-row {
        display: flex;
        flex-wrap: wrap;
        margin-bottom: 20px; /* Increased margin for spacing */
    }

    .form-row > div {
        flex: 1;
        min-width: 220px; /* Increased minimum width for better layout */
        margin-right: 20px; /* Increased margin between fields */
    }

    .form-row > div:last-child {
        margin-right: 0;
    }

    label {
        display: block;
        margin-bottom: 8px;
        font-weight: bold;
        color: #495057;
    }

    input[type="text"], input[type="email"] {
        width: 100%;
        padding: 12px; /* Increased padding for larger fields */
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        width: 100%;
        padding: 15px; /* Increased padding for the submit button */
        background-color: #007bff;
        border: none;
        border-radius: 4px;
        color: white;
        font-size: 18px; /* Larger font size for the submit button */
        cursor: pointer;
        transition: background-color 0.3s, transform 0.3s;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
        transform: translateY(-2px);
        
    }
</style>
</head>
<body>
    <form action="update" method="post">
        <div class="form-row">
                    <div>
                <label >Customer Id</label>
                <input type="text" id="id" name="id" placeholder="Enter customer id" value="${param.id}" readonly>
            </div>
            <div>
                <label >Customer Name</label>
                <input type="text" id="name" name="name" placeholder="Enter customer name" value="${param.name}">
            </div>
            <div>
                <label >Customer Contact</label>
                <input type="text" id="contact" name="contact" placeholder="Enter customer contact" value="${param.contact}">
            </div>
            <div>
                <label >Customer Address</label>
                <input type="text" id="address" name="address" placeholder="Enter customer address" value="${param.address}">
            </div>
            <div>
                <label >Customer Payment</label>
                <input type="text" id="payment" name="payment" placeholder="Enter customer payment" value="${param.payment}" readonly>
            </div>
        </div>
        <div class="form-row">
            <div>
                <label >Customer Payment Paid</label>
                <input type="text" id="payment_paid" name="payment_paid" placeholder="Enter customer payment paid" value="${param.payment_paid}" readonly>
            </div>
            <div>
                <label >Customer Payment Pending</label>
                <input type="text" id="payment_pending" name="payment_pending" placeholder="Enter customer payment pending" value="${param.payment_pending}" readonly>
            </div>
            <div>
                <label >Customer Status</label>
                <input type="text" id="status" name="status" placeholder="Enter customer status" value="${param.status}">
            </div>
            <div>
                <label >Customer Email</label>
                <input type="text" id="email" name="email" placeholder="Enter customer email" value="${param.email}">
            </div>
        </div>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
