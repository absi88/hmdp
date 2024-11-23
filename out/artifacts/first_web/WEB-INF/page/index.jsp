<%--
  Created by IntelliJ IDEA.
  User: zwb
  Date: 2023/2/2
  Time: 15:04
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
${sessionScope.user}已成功登录
访问次数: ${applicationScope.visitcount}
</body>
</html>
