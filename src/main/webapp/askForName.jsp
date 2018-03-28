<%--
  Created by IntelliJ IDEA.
  User: alexanderbous
  Date: 3/28/18
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>askForName</title>
</head>
<body>

    <h1>Please tell me your name</h1>
    <form action="/name" method="POST">
        <div class="form-group">
            <label for="name">Name</label>
            <input id="name" name="name" class="form-control" type="text">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Print Name">
    </form>

</body>
</html>
