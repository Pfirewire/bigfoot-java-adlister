<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Guess: Incorrect" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

    <h1>Your guess of ${guess} was wrong :(</h1>
    <h1>The correct answer was ${randomNumber}</h1>

    <form method="GET" action="/guess">
        <input type="submit" value="Guess Again!">
    </form>

</body>
</html>
