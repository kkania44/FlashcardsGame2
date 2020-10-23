<%--
  Created by IntelliJ IDEA.
  User: krzysiu
  Date: 21.10.2020
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flashcards Game</title>
</head>
<body>
    <p>${message}</p>
    <% String points = session.getAttribute("points").toString();
        out.println("Punkty: " +points);
    %>
    <br>
    <form action="${pageContext.request.contextPath}/game" method="get">
        <button type="submit" class="btn btn-default">Kolejna próba</button>
    </form>
    <form action="${pageContext.request.contextPath}/exit" method="get">
        <button type="submit">Koniec gry</button>
    </form>
</body>
</html>
