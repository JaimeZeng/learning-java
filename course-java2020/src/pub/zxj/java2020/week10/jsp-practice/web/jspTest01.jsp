<%--
  Created by IntelliJ IDEA.
  User: Jaime
  Date: 2021/3/4
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>JspTest01</title>
</head>
<body>
<%
    int x = -5, y;
    String operator;
    if (x < 0) {
        y = -1;
        operator = "<";
    } else if (x == 0) {
        y = 0;
        operator = "=";
    } else {
        y = 1;
        operator = ">";
    }
%>
<div style="text-align: center">
    <p>
        当 x <%=operator%> 0 时，输出<br/> x = <%=x%><br/> y = <%=y%>
    </p>
</div>
</body>
</html>
