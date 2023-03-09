<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: freed
  Date: 10/03/2023
  Time: 00:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Participate</title>
</head>
<body>
<h1>Tilmed dig ugens SchoolHacks workshop</h1>

<form action="participate" method="post">

    Kommentar: <input type="text" name="comment"/><br/><br/>

    <button type="submit">Tilmeld</button>
    <br/>
</form>

<h2>Tilmeldte</h2>
<ol>
<c:forEach var="participant" items="${requestScope.participantList}">
    <li>${participant.user.login}. Kommentar: ${participant.comment} </li>

</c:forEach>
</ol>
<a href="index.jsp">Tilbage til forsiden</a>


</body>
</html>
