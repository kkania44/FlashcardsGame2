<%--
  Created by IntelliJ IDEA.
  User: krzysiu
  Date: 21.10.2020
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flashcards Game</title>
</head>
<body>
<div class="qst_container" style="font-size: 15px; padding-left: 50px; padding-top: 50px">
    <p>Pytanie:
        <br>
        ${sessionScope.card.definition}</p>
    <form action="${pageContext.request.contextPath}/game" method="post">
        <input type="text" name="answer">
        <br>
        <button type="submit">Zatwierdź</button>
    </form>
    <form action="${pageContext.request.contextPath}/exit" method="get">
        <button type="submit">Koniec gry</button>
    </form>
</div>
</body>
</html>
