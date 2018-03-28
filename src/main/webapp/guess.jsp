<%--
  Created by IntelliJ IDEA.
  User: alexanderbous
  Date: 3/28/18
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/guess" method="POST">
    <h1><label for="guess">Guess a number between 1 and 100</label></h1>
    <input type="number" id="guess" name="number">
    <input type="submit" name="submit" value="Submit Number">

</form>


</body>
</html>
