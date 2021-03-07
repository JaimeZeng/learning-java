<%--
  Created by IntelliJ IDEA.
  User: Jaime
  Date: 2021/3/7
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>500 Pages</title>
</head>
<body>
<h4>500 Error~</h4>
Error Message:
<%
    out.println(exception.getClass().getSimpleName() + " : " + exception.getMessage());
%>
</body>
</html>
