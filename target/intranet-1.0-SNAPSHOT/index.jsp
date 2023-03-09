<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<h1 Intranet for 2. semester hold B:  ${requestScope.login} </h1>

<c:if test="${sessionScope.user ==null}">
    <p>Du kan logge på her: <a href="login.jsp">Login</a> </p>

</c:if>
Status: ${requestScope.message}

<c:if test="${sessionScope.user != null}">

    <p>${sessionScope.user.login} ${sessionScope.user.password} ${sessionScope.user.role}</p>
    <ul>
        <li><a href="participateredirect">Tilmed dig en SchoolHack Workshop</a> </li>
        <li><a href="classlist">Se klasseliste</a></li>
    </ul>

</c:if>

<br/>
<ul>
    <li><a href="signup.jsp">Opret ny bruger</a></li>
    <li><a href="hello-servlet">Hello Servlet</a></li>
</ul>
</body>
</html>