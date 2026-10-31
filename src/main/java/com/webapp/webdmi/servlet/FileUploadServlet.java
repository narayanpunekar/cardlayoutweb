/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.webdmi.servlet;

import com.webapp.webdmi.platform.clsXmlTraverser;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.logging.Logger;
import javax.servlet.http.Part;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
//import java.util.Scanner;
import javax.servlet.annotation.MultipartConfig;
import org.w3c.dom.Document;

/**
 *
 * @author narayan.punekar@yahoo.com
 */
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
    private static final Logger log = Logger.getLogger(FileUploadServlet.class.getName());

    private String getFileName(Part filePart) {
        String strPartHeader = filePart.getHeader("content-disposition");
        log.info("Part Header = " + strPartHeader);
        for (String content : filePart.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                    content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        */
            /* TODO output your page here. You may use following sample code. */
        /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        */

        OutputStream out = null;
        InputStream fileContent = null;
        PrintWriter writer = null;
        Scanner s = null;
        DataInputStream in = null;
        try {
            Part filePart = request.getPart("file");
            String strFilename = getFileName(filePart);
            log.info("Part strFilename=" + strFilename);

            s = new Scanner(new BufferedReader(new FileReader(strFilename)));
            s.useDelimiter("(/><)(><)");
            while (s.hasNext()) {
                log.info("Scanner strFilename=" + s.next());
            }

            in = new DataInputStream(new BufferedInputStream(new FileInputStream(strFilename)));
            String strLine;
            while ((strLine = in.readLine())!=null) {
                log.info("strLine=" + strLine);
            }
           
            Document xmlDocument = clsXmlTraverser.fnLoadXml(strFilename);
            log.info(xmlDocument.getFirstChild().getNodeName() + " FirstChild ");
            clsXmlTraverser.fnTraverseNode(xmlDocument.getFirstChild());
            clsXmlTraverser.fnIterator();
        
            writer = response.getWriter();
            fileContent = filePart.getInputStream();
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = fileContent.read(bytes)) != -1) {
                String strByteString = new String(bytes, StandardCharsets.UTF_8);
                log.info("read=" + read + " bytes=" + strByteString);
            }

            HttpSession session = request.getSession();
            //String strUsername = request.getParameter("txtEmail");
            //String strPassword = request.getParameter("txtPassword");

            //log.info("Login " + strUsername + " " + strPassword);
            //webdmiDao.fnLogin(strUsername, strPassword);
            //session.setAttribute("employee", null);

            request.getRequestDispatcher("/SolutionsDepartment_1.jsp").forward(request, response);
        } catch (FileNotFoundException fne) {
            log.info("ERROR: " + fne.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
            if (fileContent != null) {
                fileContent.close();
            }
            if (writer != null) {
                writer.close();
            }
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
