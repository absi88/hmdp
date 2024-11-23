<%--
  Created by IntelliJ IDEA.
  User: zwb
  Date: 2023/2/2
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set scope="request" var="name" value="request"></c:set>
${requestScope.name}
<c:set scope="session" var="name" value="session"></c:set>
${sessionScope.name}
<c:set scope="application" var="name" value="application"></c:set>
${applicationScope.name}
<c:set scope="page" var="name" value="page"></c:set>
${pageScope.name}
</body>
</html>
