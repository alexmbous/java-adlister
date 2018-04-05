<%--
  Created by IntelliJ IDEA.
  User: alexanderbous
  Date: 4/4/18
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register for Site!" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <container>
        <form action="/register" method="POST">
            <h1>Please fill in your information.</h1>

            <div class="form-group">
                <h3>Choose a Username.</h3>
                <label for="username">Username</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>

            <div class="form-group">
                <h3>Your Email.</h3>
                <h6>We wont send you anything annoying... promise.</h6>
                <label for="email">Email</label>
                <input id="email" name="email" class="form-control" type="text">
            </div>

            <div class="form-group">
                <h3>Choose a Password.</h3>
                <label for="password">Password</label>
                <input id="password" name="password" class="form-control" type="password">
            </div>

            <div class="form-group">
                <h3>Choose a Password.</h3>
                <label for="confirmPassword">Confirm Password</label>
                <input id="confirmPassword" name="confirmPassword" class="form-control" type="password">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Submit">
        </form>
    </container>
</body>
</html>
