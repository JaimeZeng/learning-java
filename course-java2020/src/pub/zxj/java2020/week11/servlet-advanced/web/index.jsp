<%--
  Created by IntelliJ IDEA.
  User: Jaime
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Servlet 与 JSP 进阶</title>
</head>
<body>
<ul>
    <li><a href="ua">请求头 UserAgent</a></li>
    <li><a href="ct">内容类型 ContentType</a></li>
    <li><a href="direct/check">请求转发 request.getRequestDispatcher().forward()</a></li>
    <li><a href="direct/check_resp">响应重定向 response.sendRedirect</a></li>
    <li><a href="cookies/login">设置浏览器 Cookie - login</a></li>
    <li><a href="cookies/index">获取浏览器 Cookie - index</a></li>
    <li><a href="session/login">用户会话 HttpSession 对象 - login</a></li>
    <li><a href="session/index">用户会话 HttpSession 对象 - index</a></li>
    <li><a href="servlet_context/init">Web 应用全局对象 ServletContext - init</a></li>
    <li><a href="servlet_context/default">Web 应用全局对象 ServletContext - default</a></li>
    <li><a href="charset_form_post.html">Post 请求中文乱码问题</a></li>
    <li><a href="charset_form_get.html">Get 请求中文乱码问题</a></li>
    <li>url 模式匹配
        <ul>
            <li><a href="pattern/1">1 - Jaime</a></li>
            <li><a href="pattern/6">6 - RyanJie</a></li>
            <li><a href="pattern/8">8 - Other</a></li>
        </ul>
    </li>
    <li><a href="built_in_objects.jsp">JSP 内置对象</a></li>
</ul>
</body>
</html>
