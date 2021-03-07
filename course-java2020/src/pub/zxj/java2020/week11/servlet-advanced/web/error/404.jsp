<%--
  Created by IntelliJ IDEA.
  User: Jaime
  Date: 2021/3/7
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" %>
<html>
<head>
    <title>404 Error</title>
</head>
<body>
<h4>404 Errors</h4>
<p>Error Message:</p>
<%
    out.println("<br/>" + exception.getClass().getSimpleName() + " : " + exception.getMessage());
%>
</body>
</html>
