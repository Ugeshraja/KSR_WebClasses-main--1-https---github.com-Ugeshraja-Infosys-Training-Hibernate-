<%-- 
    Document   : JSTLDemo
    Created on : 19 Aug, 2026, 2:42:22 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><c:out value="Welcome to JSTL"></c:out></h1>
        <c:set var="stname" value="abc"></c:set>
        
            <h1>Welcome <c:out value="${stname}"></c:out></h1>
        
        <ul>
        <c:forEach begin="1" end="5" step="1" var="x">
            <li><c:out value="${x}"></c:out></li>
        </c:forEach> 
        </ul>
    </body>
</html>
