<%-- 
    Document   : RetrieveDataJDBC
    Created on : 19 Aug, 2026, 9:29:47 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Record</title>
    </head>
    <body>
        <h1>Student Information</h1>
        <table border="1" cellspacing="30px" cellpaddding="30px" rules="all">
            <thead>
                <tr>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Gender</th>
                    <th>Email ID</th>
                    <th>Date</th>
                </tr>
            </thead>
            
            <tbody>
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ksr","root","");
                    PreparedStatement ps = con.prepareStatement("select * from student");
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()) {  %>
                    <tr>
                        <td><% out.println(rs.getString("usrname")); %></td>
                        <td><% out.println(rs.getString("password")); %></td>
                        <td><% out.println(rs.getString("gender")); %></td>
                        <td><% out.println(rs.getString("emailid")); %></td>
                        <td><% out.println(rs.getString("dte")); %></td>
                    </tr>
                    
                    <%
                    }                           
                %>
            </tbody>
            
            
            
            
            
        </table>
    </body>
</html>
