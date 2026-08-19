package controller;

import com.oreilly.servlet.MultipartRequest;
import dbutil.KSR;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FileInfo;

public class FileUpload extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            MultipartRequest req = new MultipartRequest(request, "A:/Classes/KSR/server_location/");
            
            String fileid = req.getParameter("txtid");
            File f = req.getFile("fileup");
            String file_name = f.getName();
            String location = f.getAbsolutePath();
            String dateuploaded = req.getParameter("txtdate");
            String owner = req.getParameter("txtowner");
            
            FileInfo finfo = new FileInfo();
            finfo.setDate_uploaded(dateuploaded);
            finfo.setFile_location(location);
            finfo.setFile_name(file_name);
            finfo.setFileid(fileid);
            finfo.setOwner(owner);
            
            KSR.getContext().storeData(finfo);
            
            out.println("<h1>File Uploaded</h1>");
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
