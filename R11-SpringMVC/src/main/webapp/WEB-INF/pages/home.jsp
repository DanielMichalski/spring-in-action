<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Spittles</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/style.css"/>"/>
</head>

<body>
    <div>
        <h2>Globalna społeczność znajomych i nieznajomych,
            uzewnętrzniająca swoje najskrytsze przemyślenia dla dobra ogółu</h2>

        <h3>Oto lista...</h3>

        <ol class="spittle-list">
            <c:forEach var="spittle" items="${spittles}">
                <li><c:out value="${spittle.name}"/></li>
            </c:forEach>
        </ol>
    </div>

    <img id="img" src="<s:url value="/resources/img/ipad.jpg"/>"/>

</body>
</html>