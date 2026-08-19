<%-- 
    Document   : CookiesDemo
    Created on : 19 Aug, 2026, 2:03:32 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cookies Demo</title>
    </head>
    <body>
        <h1>Cookies</h1>
        
        <%
            Cookie c1 = new Cookie("Username","abc123@gmail.com");
            Cookie c2 = new Cookie("Product","Laptop");
            
            c1.setMaxAge(60*60*60*24*30);
            c2.setMaxAge(60*60*60*24*30);
            
            response.addCookie(c1);
            response.addCookie(c2);
            
            response.sendRedirect("ViewCookies.jsp");
        %>
    </body>
</html>
