<%--
  Created by IntelliJ IDEA.
  User: cjswo
  Date: 2019-01-28
  Time: 오전 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html>
<head>
  <title>test</title>
</head>
<body>
<h1>test</h1>
<img src="/github.gif">
<br><br data-tomark-pass>

<c:forEach items="${users}" var="user">
  name : ${user.name}, email : ${user.email}<br data-tomark-pass>
</c:forEach>
</body>
</html>
