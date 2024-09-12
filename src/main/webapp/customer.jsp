<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Information Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f7f7f7;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    form {
        background: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        max-width: 400px;
        width: 100%;
    }
    label {
        font-weight: bold;
        margin-bottom: 5px;
        display: block;
        color: #007BFF; /* Blue color for labels */
    }
    input[type="text"],
    input[type="submit"] {
        width: calc(100% - 22px);
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }
    input[type="text"]:focus {
        border-color: #007BFF; /* Blue border color on focus */
        box-shadow: 0 0 5px rgba(0, 123, 255, 0.5); /* Blue shadow on focus */
    }
    input[type="submit"] {
        background-color: #007BFF; /* Blue background for submit button */
        color: white;
        border: none;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #0056b3; /* Darker blue on hover */
    }
</style>
</head>
<body>
    <form action="customer" method="post">
        <label>Customer Name</label>
        <input type="text" id="name" name="name" placeholder="Enter customer name">
        
        <label>Customer Contact</label>
        <input type="text" id="contact" name="contact" placeholder="Enter customer contact">
        
        <label>Customer Address</label>
        <input type="text" id="address" name="address" placeholder="Enter customer address">
        
        <label>Customer Status</label>
        <input type="text" id="status" name="status" placeholder="Enter customer status">
        
        <label>Customer Email</label>
        <input type="text" id="email" name="email" placeholder="Enter customer email">
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
