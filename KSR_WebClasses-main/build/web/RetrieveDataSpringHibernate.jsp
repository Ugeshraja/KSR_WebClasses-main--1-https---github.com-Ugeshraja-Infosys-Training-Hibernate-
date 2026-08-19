<%-- 
    Document   : RetrieveDataSpringHibernate
    Created on : 19 Aug, 2026, 9:40:23 AM
    Author     : DELL
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page import="dbutil.KSR"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring With Hibernate</title>
    </head>
    <body>
        <h1>Student Information</h1>
        <table border="1" cellspacing="20px" cellpadding="20px" rules="all">
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
                    List<Student> lst = KSR.getContext().getData("from Student");
                    Iterator<Student> ite = lst.iterator();
                    while(ite.hasNext()) {
                        Student student = ite.next(); %>
                        <tr>
                            <td><% out.println(student.getUsername()); %></td>
                            <td><% out.println(student.getPassword());%></td>
                            <td><% out.println(student.getGender()); %></td>
                            <td><% out.println(student.getEmailid());%></td>
                            <td><% out.println(student.getDate1());%></td>
                            <td><a href="deletedata?uname=<%=student.getUsername()%>"><img src="images/deleteicon.jpg" height="30px" width="30px"/></a></td>
                            <td><a href="UpdateRecord.jsp?uname=<%=student.getUsername()%>"><img src="images/updateicon.png" height="30px" width="30px"/></a></td>
                        </tr>
                        <%
                            }
                        %>
            </tbody>
            
            
            
            
        </table>
    </body>
</html>
