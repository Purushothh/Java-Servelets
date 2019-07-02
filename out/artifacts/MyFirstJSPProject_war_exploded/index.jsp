<%--
  Created by IntelliJ IDEA.
  User: PurushothA
  Date: 7/2/2019
  Time: 10:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web Application Learning
    </title>
</head>
<body>

<h1>Hi there</h1>
<p>This is the first home page of the JSP Page...</p>

<%
    Date date = new Date();
    out.print("<h2>" + date.toString() + "</h2");
%>>

</body>
</html>
