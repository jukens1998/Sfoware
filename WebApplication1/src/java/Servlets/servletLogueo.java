/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Utils.Conexion;
import java.sql.*;
import javax.servlet.http.HttpSession;


/**
 *
 * @author THEYAN
 */
@WebServlet(name = "servletLogueo", urlPatterns = {"/servletLogueo"})
public class servletLogueo extends HttpServlet {

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
        
        
        String usu=request.getParameter("txtUsu");
        String pas=request.getParameter("txtPas");
        
        Connection cnx=Conexion.getConexion();
        try{
            PreparedStatement sta=cnx.prepareStatement("select * from usuarios where codUsu=? ans passUsu=?");
            sta.setString(1, usu);
            sta.setString(2, pas);
            
            ResultSet rs=sta.executeQuery();
            if(rs.next()){
                HttpSession sesionOK=request.getSession();
                sesionOK.setAttribute("usuario", usu);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                     
            }else{
                request.setAttribute("msg", "Error de Usu o Pas");
                 request.getRequestDispatcher("Logueo.jsp").forward(request, response);
            }
        }catch(Exception e){System.out.print(e);}{
            
        }
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
