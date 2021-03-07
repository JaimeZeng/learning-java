<%--
  Created by IntelliJ IDEA.
  User: Jaime
  Date: 2021/3/7
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Built In Objects</title>
</head>
<body>
<%--
request 请求对象 HttpServletRequest
response 响应对象 HttpServletResponse
session 用户会话 HttpSession
application 应用全局对象 ServletContext
out 输出对象 PrintWrite
page 当前页面对象 this
pageContext 页面上下文对象 PageContext
config 应用配置对象 ServletConfig
exception 应用异常对象 Throwable

request(Javax.servlet.ServletRequest)：它包含了有关浏览器请求的信息，通过该对象可以获得请求中的头信息、Cookie和请求参数。
response(Javax.servlet.ServletResponse)：作为JSP页面处理结果返回给用户的响应存储在该对象中。并提供了设置响应内容、响应头以及重定向的方法（如cookies、头信息等）
out(Javax.servlet.jsp.JspWriter)：用于将内容写入JSP页面实例的输出流中，提供了几个方法使你能用于向浏览器回送输出结果。
pageContext(Javax.servlet.jsp.PageContext)：描述了当前JSP页面的运行环境。可以返回JSP页面的其他隐式对象及其属性的访问。另外，它还实现将控制权从当前页面传输至其他页面的方法。
session(javax.servlet.http.HttpSession)：会话对象存储有关此会话的信息，也可以将属性赋给一个会话，每个属性都有名称和值。会话对象主要用于存储和检索属性值。
application(javax.servle.ServletContext)：存储了运行JSP页面的servlet以及在同一应用程序中的任何Web组件的上下文信息。
page(Java.lang.Object)：表示当前JSP页面的servlet实例
config(javax.servlet.ServletConfig)：该对象用于存取servlet实例的初始化参数。
exception(Javax.lang.Throwable)：在某个页面抛出异常时，将转发至JSP错误页面，提供此对象是为了在JSP中处理错误。只有在错误页面中才可使用<%@page isErrorPage="true"%>
--%>
<%
    String url = request.getRequestURI();
    response.getWriter().println(url + "<br/>");
    session.setAttribute("username", "Jaime");
    // PrintWriter out = response.getWriter();
    out.println(String.valueOf(session.getAttribute("username")));
    out.println("<br/><br/><hr/><br/>" + application.getInitParameter("copyright"));
    out.println(pageContext.getRequest());
    out.println(pageContext.getResponse());
    out.println(pageContext.getSession());
    out.println(pageContext.getServletContext());
%>
</body>
</html>
