<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Salut</h1>
<c:forEach items="${users}" var="user">
            <p>${user.userName} - ${user.userFirstname}</p>
</c:forEach>
</body>
</html>
