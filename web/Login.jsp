<%--
  Created by IntelliJ IDEA.
  User: PurushothA
  Date: 7/2/2019
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log-in</title>
</head>
<body>

<h1>Welcome to MFS</h1>

<form action="/login" method="post">
    login-name: <input type="text" name="loginname" width="30"/><br>
    password: <input type="password" name="password" width="10"/><br>
    <input type="submit" value="Login"/>
</form>

<p style="color: red;">$(errorMessage)</p>

</body>
</html>
