package controller;

import dbutil.KSR;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;

public class RequestAndResponse extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String uname = request.getParameter("txtusr");
            String password = request.getParameter("txtpass");
            String gender = request.getParameter("gender");
            String[] tech = request.getParameterValues("tech");
            String country = request.getParameter("ctry");
            String date1 = request.getParameter("txtdate");
            String date_time = request.getParameter("datetime");
            String month = request.getParameter("txtmonth");
            String number = request.getParameter("txtnum");
            String color = request.getParameter("txtcolor");
            String range = request.getParameter("txtrange");
            String emailid = request.getParameter("txtemail");           
            String technologies = "";
            for(int i=0; i<tech.length; i++) {
                technologies = technologies + tech[i] +",";            
            }
            technologies = technologies.substring(0, technologies.length()-1);
            
            Student st = new Student();
            st.setColor(color);
            st.setCtry(country);
            st.setDate1(date1);
            st.setDate_time(date_time);
            st.setEmailid(emailid);
            st.setGender(gender);
            st.setMonth(month);
            st.setNumber(number);
            st.setPassword(password);
            st.setRange(range);
            st.setTech(technologies);
            st.setUsername(uname);
            
            KSR.getContext().storeData(st);
            
            out.println("<h1>Registered Successfully </h1>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
