<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h3>${spitter.name}</h3>

    <c:forEach var="spittle" items="${spittleList}">
        <c:out value="${spittle.name}"/>
    </c:forEach>
</body>
</html>
