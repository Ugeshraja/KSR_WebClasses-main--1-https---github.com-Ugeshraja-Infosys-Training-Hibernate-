<%-- 
    Document   : FileInfoemation
    Created on : 19 Aug, 2026, 12:10:14 PM
    Author     : DELL
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.FileInfo"%>
<%@page import="dbutil.KSR"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1" cellspacing="20px" cellpadding="20px" rules="all">
            <thead>
                <tr>
                    <th>File ID</th>
                    <th>File Name</th>
                    <th>Date Uploaded</th>
                    <th>Owner</th>
                    <th>Location</th>
                </tr>
            </thead>
            
            <tbody>
                <%
                    List<FileInfo> lst = KSR.getContext().getData("from FileInfo");
                    Iterator<FileInfo> ite = lst.iterator();
                    while(ite.hasNext()) {
                        FileInfo info = ite.next(); %>
                        <tr>
                            <td><%= info.getFileid()%></td>
                            <td><%= info.getFile_name()%></td>
                            <td><%= info.getDate_uploaded()%></td>
                            <td><%= info.getOwner()%></td>
                            <td><%= info.getFile_location()%></td>
                            <td><a href="DownloadData?fid=<%= info.getFileid()%>"><img src="images/download.png" height="30px" width="30px"/></a></td>
                        </tr>
                        
                <%}
                %>
            </tbody>
        </table>
    </body>
</html>
