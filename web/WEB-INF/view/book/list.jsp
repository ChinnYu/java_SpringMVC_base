<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2018/8/15
  Time: 上午 02:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8"/>
</head>
<body>
<h1 style="color: red">${msg}</h1>
<img src="<c:url value="/image/8.jpg"></c:url>">
<p>
    <c:url value="/image/8.jpg"></c:url>
</p>
</body>
</html>
