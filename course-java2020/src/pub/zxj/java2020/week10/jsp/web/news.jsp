<%--
  Created by IntelliJ IDEA.
  User: Jaime
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>新闻 news</title>
</head>
<body>
<%@include file="WEB-INF/include/header.jsp" %>
<%--要闻 | 推荐 | 财经 | 娱乐--%>
<%
    out.println("<h1>新闻标题</h1>");
    out.println("<p>新闻正文</p>");
%>
<%@include file="WEB-INF/include/footer.jsp" %>
<%--<hr/>--%>
<%--Copyright &copy; 2017 - 2020 Jaime. All rights reserved.--%>
</body>
</html>
