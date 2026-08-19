package controller;

import dbutil.KSR;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;

public class LoginFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;
        
        String usrname = req.getParameter("txtusr");
        String password = req.getParameter("txtpass");
        
        List<Student> lst = KSR.getContext().getData("from Student where username='"+usrname+"'");
        Iterator<Student> ite = lst.iterator();
        if(ite.hasNext()) {
            Student student = ite.next();
            String password_db = student.getPassword();
            if(password.equals(password_db)) {
                chain.doFilter(request, response);
            }else {
                res.sendRedirect("Login.html");
            }
        
        }else {
            res.sendRedirect("Login.html");
        }
    }

    @Override
    public void destroy() {
        
    }
    
}
