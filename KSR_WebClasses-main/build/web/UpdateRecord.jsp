<%-- 
    Document   : UpdateRecord
    Created on : 19 Aug, 2026, 11:17:03 AM
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
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username = request.getParameter("uname");
            //String query = "from Student where username="+username;
            
            List<Student> lst = KSR.getContext().getData("from Student where username='"+username+"'");
            Iterator<Student> ite = lst.iterator();
            String password="", date1="", emailid=""; 
            while(ite.hasNext()) {
                Student st = ite.next();
                password = st.getPassword();
                date1 = st.getDate1();
                emailid = st.getEmailid();
            }
                    
            
        %>
        
        
        
        <h1>Student Data</h1>
        <form name="updatedata" method="post" action="UpdateData">
            Username: <input type="text" name="txtusr" value="<%=username %>" readonly="readonly"/> <br><br>
            Password: <input type="password" name="txtpass" value="<%= password %>"/> <br><br>
            Gender: <input type="radio" name="gender" value="m"/> Male
            <input type="radio" name="gender" value="f"/> Female <br><br>
            Date: <input type="date" name="txtdate" value="<%= date1%>"/> <br><br>
            Email ID: <input type="email" name="txtemail" value="<%= emailid%>"/> <br><br>
            <input type="submit" value="Update"/>
        </form
    </body>
</html>
