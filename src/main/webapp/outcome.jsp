<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Guess Outcome" />
  </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<c:choose>
  <c:when test="${isCorrect}">
    <h1>Your guess of ${guess} was correct!</h1>
  </c:when>
  <c:otherwise>
    <h1>Your guess of ${guess} was wrong :(</h1>
    <h1>The correct answer was ${randomNumber}</h1>
  </c:otherwise>

</c:choose>

<form method="POST" action="/guess">
  <label for="guess">Guess: </label>
  <input type="number" name="guess" id="guess">
  <input type="submit" value="Guess Again">
</form>

</body>
</html>
