 <!-- <html>
<body>
<a href="customer.jsp">Add customer </a>
<a href="shirt.jsp"> shirt</a>
<a href="pant.jsp"> Pant</a>
<a href="reciept.jsp"> Reciept</a>
<a href="detail"> Details</a>

</body>
</html> -->

   <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<style type="text/css">
body {
  font-family: Arial, sans-serif;
  background-color: #f0f0f0;
  margin: 0;
  padding: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.login-container {
  background-color: #ffffff;
  width: 300px;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.login-container h2 {
  text-align: center;
  color: red;
}

.login-container form {
  margin-bottom: 15px;
}

.login-container input[type="text"],
.login-container input[type="password"],
.login-container input[type="submit"] {
  width: 100%;
  padding: 10px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  font-size: 14px;
}

.login-container input[type="submit"] {
  background-color: #007bff;
  color: white;
  border: none;
  cursor: pointer;
}

.login-container input[type="submit"]:hover {
  background-color: #0056b3;
}

.login-container a {
  display: block;
  text-align: center;
  font-size: 17px;
  color: red;
  text-decoration: none;
}

.login-container a:hover {
  color: #333;
}
.login-container span {
  color: blue;
}

</style>
</head>
<body>

<div class="login-container">
  <!-- Display success or error message -->
  <h2 style="color: red">${msg}</h2>
  <h2 style="color: green">${smsg}</h2>

  <form action="login" method="post">
    <input type="text" name="username" placeholder="Enter username" required>
    <input type="password" name="password" placeholder="Enter password" required>
    <input type="submit" value="Login">
  </form>
  
  <!-- Link to registration page -->
  <a href="register.jsp">Create an account, <span>sign up</span></a>
</div>

</body>
</html>
