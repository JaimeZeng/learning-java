<%--
Created by IntelliJ IDEA.
User: Jaime
Date: 2021/3/4
Time: 19:11
To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>JspTest02</title>
</head>
<body>
<%--
1. 导入 java.util.List 和 java.util.ArrayList 包；
2. 在 List 中添加多条字符串数据；
3. 将 List 内的数据遍历取出，并打印到页面上。
4. 数据分行显示，同时注意前面的标号。
--%>
<%

    ArrayList<String> jspList = new ArrayList<>();
    jspList.add("JSP 基础入门");
    jspList.add("Servlet 视频详解");
    jspList.add("EL 表达式初识");
    jspList.add("JSTL 标签库初识");
    for (int i = 0; i < jspList.size(); i++) {
        out.println("第 " + (i + 1) + " 条:&emsp;&emsp;&emsp;&emsp;" + jspList.get(i) + "<br/>");
    }
%>
</body>
</html>