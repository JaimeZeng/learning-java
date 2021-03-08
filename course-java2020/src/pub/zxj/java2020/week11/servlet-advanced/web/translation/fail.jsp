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
    <title>Fail</title>
</head>
<body>
<%
    response.setContentType("text/html;charset=UTF-8");
    out.println("<h4 style='color: red;'>" + session.getAttribute("msg") + "</h4>");
    // response.getWriter().println();
%>
</body>
</html>
