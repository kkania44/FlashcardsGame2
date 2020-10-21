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
    <div class="qst_container" style="font-size: medium; padding-left: 100px; padding-top: 100px">
        <p>Pytanie:
            <br>
            ${sessionScope.card.definition}</p>
    </div>
</body>
</html>
