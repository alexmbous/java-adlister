<%--
  Created by IntelliJ IDEA.
  User: alexanderbous
  Date: 3/27/18
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%--href="/profile.jsp"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username == null){
    }
    else if(username.equals("Admin") && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    } else {
        response.sendRedirect("/login.jsp");
    }
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Login Form</h1>

    <div>
    <form method="post">
        Username: <input type="text" name="username"><br/>
        Password: <input type="text" name="password"><br/>
        <input type="submit" value="submit"/>



    </form>
    </div>
</body>
</html>
