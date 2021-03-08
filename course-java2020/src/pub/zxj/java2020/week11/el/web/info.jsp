<%@ page import="pub.zxj.el.Student" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Stu Info</title>
</head>
<body>
<%
    Student stu = (Student) request.getAttribute("student");
    String grade = String.valueOf(request.getAttribute("grade"));
    response.setContentType("text/html;charset=UTF-8");
    response.getWriter().println("<ul><li>stuName = " +
            stu.getName() + "</li><li>stuMobile = " +
            stu.getMobile() + "</li><li>grade = " +
            grade + "</li></ul>");
%>
</body>
</html>
