<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: freed
  Date: 08/03/2023
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>classList</title>
</head>
<body>

<h1>classList for hold B</h1>

<c:forEach var="student" items="${requestScope.studentlist}">
    ${student.name},${student.email} <br/>

</c:forEach>

</body>
</html>
