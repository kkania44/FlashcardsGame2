<%--
  Created by IntelliJ IDEA.
  User: krzysiu
  Date: 22.10.2020
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flashcards Game</title>
</head>
<body>
    <p>Jesteś już graczem?</p>
    <form action="${pageContext.request.contextPath}/game">
    <button type="submit">Dalej</button>
    </form>
    <p>Pierwszy raz? Zapisz się i graj!</p>
    <form action="${pageContext.request.contextPath}/start" method="post">
        <p>Nazwa gracza: </p><input type="text" name="playername">
        <button type="submit">Dalej</button>
    </form>
    <%
    String message = (String) request.getAttribute("message");
    if (message != null) {
        out.println(message);
    }
    %>
</body>
</html>
