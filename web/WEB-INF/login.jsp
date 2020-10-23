<%--
  Created by IntelliJ IDEA.
  User: krzysiu
  Date: 21.10.2020
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/join" method="post">
        Nazwa gracza: <input type="text" name="name">
        <button type="submit">Rozpocznij grę</button>
    </form>
    <%
    String message = (String)request.getAttribute("message");
    if(message != null) {
        out.println(message);
    };
    %>
    <br>
    <a href="${pageContext.request.contextPath}/start">Nowy gracz</a>
</body>
</html>
