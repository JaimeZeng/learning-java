<%--
  Created by IntelliJ IDEA.
  User: Jaime
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--公司薪资制度--%>
<%--新入职员工：基本工资 1500 元--%>
<%--工作 5 年内员工： 每年工资上浮基本工资的 10%--%>
<%--工作 5 - 10 年内员工： 每年工资上浮基本工资的 20%--%>
<%--工作 10 年以上员工： 每年工资上浮基本工资的 25%--%>
<html>
<head>
    <title>公司薪资制度</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>year</th>
        <th>salary</th>
    </tr>
    <%
        for (int i = 0; i <= 50; i++) {
            out.println("<tr>");
            out.println("<td>" + i + "</td>");
            int sal;
            if (i <= 5) {
                sal = 1500 + i * 150;
            } else if (i <= 10) {
                sal = 1500 + 5 * 150 + (i - 5) * 300;
            } else {
                sal = 1500 + 5 * 150 + 5 * 300 + (i - 10) * 375;
            }
            out.println("<td>" + sal + "</td>");
            out.println("</tr>");
        }
    %>
</table>
</body>
</html>
