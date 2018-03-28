<%--
  Created by IntelliJ IDEA.
  User: alexanderbous
  Date: 3/28/18
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/pickcolor" method="POST">
    <h1><label for="pickcolor">Pick Color</label></h1>
        <input type="color" id="pickcolor" name="pickcolor">
        <input type="color" id="picktextcolor" name="picktextcolor">
        <input type="submit" class="btn btn-primary btn-block" value="submit">
</form>
</body>
</html>
