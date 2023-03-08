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
    <p>Du kan logge på her: <a href="login.jsp"></a> </p>
    <p> <a href="classlist">See class list</a> </p>
</c:if>


<c:if test="${sessionScope.user !=null}">

</c:if>

<p>${sessionScope.user.login}${sessionScope.user.password}${sessionScope.user.role}</p>

<br/>
<a href="hello-servlet">Hello Servlet</a><br/>
<a href="login.jsp">Login</a>
</body>
</html>