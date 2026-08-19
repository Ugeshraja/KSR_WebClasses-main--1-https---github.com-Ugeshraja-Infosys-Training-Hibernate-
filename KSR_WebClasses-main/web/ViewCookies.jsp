<%-- 
    Document   : ViewCookies
    Created on : 19 Aug, 2026, 2:12:06 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cookies</h1>
        
        <%
            Cookie[] ch = request.getCookies();
            
            //Default Cookie
            // Key : JSESSIONID
            // value: Random value
            
            for(int i=0; i<ch.length; i++) {
                out.println("Cookie Name : " + ch[i].getName() + "<br>");
                out.println("Cookie Value : " + ch[i].getValue() + "<br>");
                out.println("*******************************<br>");
            }
        %>
    </body>
</html>
