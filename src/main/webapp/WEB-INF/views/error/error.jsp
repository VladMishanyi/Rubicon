<%--
  Created by IntelliJ IDEA.
  User: KIP-PC99
  Date: 26.09.2018
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Error</title>
    <link href="<c:url value="/resources/img/favicons.png"/>" rel="icon" type="image/png" >
    <link href="<c:url value="/resources/css/error/error.css"/>" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="clouds">
    <div class="cloud x1"></div>
    <div class="cloud x1_5"></div>
    <div class="cloud x2"></div>
    <div class="cloud x3"></div>
    <div class="cloud x4"></div>
    <div class="cloud x5"></div>
</div>
<div class='c'>
    <div class='_404'><c:out value="${value}"/></div>
    <hr>
    <div class='_1'>ERROR</div>
    <div class='_2'><c:out value="${message}"/></div>
    <a class='btn' href="/login">BACK TO MAIN</a>
</div>
</body>
</html>
