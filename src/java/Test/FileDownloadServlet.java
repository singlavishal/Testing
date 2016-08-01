/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vishu
 */
public class FileDownloadServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int file_size=0;
        response.setContentType("text/html;charset=UTF-8");
        try {
            /* TODO output your page here. You may use following sample code. */
            String fname = request.getParameter("path").toString();//which file u want to download e.g D://abc.txt
            String nfile = request.getParameter("file").toString();//abc.txt
            nfile=nfile.replaceAll(" ", "_");

        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=" + nfile);
        
        File file = new File(fname);
        FileInputStream fileIn = new FileInputStream(file);
        ServletOutputStream out1 = response.getOutputStream();
        
        File f = new File(fname);
        if (f.exists()) {
            file_size = (int) f.length();
            System.out.println("Size of the file : " + file_size);
        }
                
        byte[] outputByte = new byte[file_size];
        //copy binary contect to output stream
        while (fileIn.read(outputByte, 0, file_size) != -1) {
            out1.write(outputByte, 0, file_size);
        }
        fileIn.close();
        out1.flush();
        out1.close();
        } finally {            
            //out1.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
