<%--
  Created by IntelliJ IDEA.
  User: Jaime
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>求和运算 sum</title>
</head>
<body>
<%!
    /**
     * 1 - n 内数字求和运算
     * @param num 求和运算范围
     * @return 1 - n 内数字和
     */
    int sum(int num) {
        return num * (num + 1) / 2;
    }
%>
<p>sum = <%=sum(100)%>
</p>
</body>
</html>
