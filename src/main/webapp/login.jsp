<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Login"/>
    </jsp:include>
    <link type="text/css" rel="stylesheet" href="<c:url value="./resources/css/global.css"></c:url>">
</head>
<body>
    <jsp:include page="partials/navbar.jsp"></jsp:include>

    <h1>Login Form</h1>
    <form method="POST" action="/login.jsp">
        <div>
            <label for="username">Username</label>
            <input type="text" name="username" id="username">
        </div>
        <div>
            <label for="password">Password</label>
            <input type="password" name="password" id="password">
        </div>
        <input type="submit" value="Sign In">
    </form>

</body>
</html>
