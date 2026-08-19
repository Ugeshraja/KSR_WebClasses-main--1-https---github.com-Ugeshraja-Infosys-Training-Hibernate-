<%-- 
    Document   : welcomejsp
    Created on : 18 Aug, 2026, 3:08:37 PM
    Author     : DELL
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%! Date d = new Date();  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><% out.println(d.toLocaleString()); %></title>
    </head>
    <body>
        <h1><% out.println("Hello World!"); %></h1>
        
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ksr", "root","");
            String location="A://classes//ksr//images//img1.jpg";
        %>
        
        <img src="<%= location%>"/>
        
        <%@include file="Login.html" %>
        
        
    </body>
</html>
