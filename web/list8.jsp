<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2018/8/16
  Time: 下午 04:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>調查表</h2>
<form action="book/list8" method="post">
    愛好:<input type="checkbox" value="購物" name="hobby"/>購物
    <input type="checkbox" value="上網" name="hobby"/>上網
    <input type="checkbox" value="電影" name="hobby"/>電影
    <input type="submit" value="提交">
</form>
</body>
</html>
