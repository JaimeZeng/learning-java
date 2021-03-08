<%--
  Created by IntelliJ IDEA.
  User: Jaime
  Date: 2021/3/8
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<%
    response.setContentType("text/html;charset=UTF-8");
    out.println("<h4 style='color: blue;'>" + request.getAttribute("value") + "</h4>");
    // out.println("<h4 style='color: blue;'>" + request.getParameter("value") + "</h4>");
%>
</body>
</html>
