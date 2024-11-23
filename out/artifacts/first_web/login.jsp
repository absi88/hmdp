<%--
  Created by IntelliJ IDEA.
  User: zwb
  Date: 2023/2/2
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>
<form action="login" method="post">
    <input name="username">
    <input name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>
