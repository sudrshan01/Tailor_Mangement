<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <style type="text/css">
    body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

form {
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 300px;
    display: flex;
    flex-direction: column;
}

input[type="text"],
input[type="password"] {
    width: 100%;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 3px;
    box-sizing: border-box;
}

input[type="submit"] {
    background-color: #007bff;
    color: white;
    padding: 10px;
    border: none;
    border-radius: 3px;
    cursor: pointer;
    font-size: 16px;
    margin-top: 20px;
}

input[type="submit"]:hover {
    background-color: #0056b3;
}

h2 {
    text-align: center;
    margin-bottom: 20px;
}
    
    </style>
</head>
<body>
<form action="register">

<input type="text" name="username" placeholder="Enter username">
    <input type="password" name="password" placeholder="Enter password">
    <input type="submit" value="Create Account">




</form>
</body>
</html>