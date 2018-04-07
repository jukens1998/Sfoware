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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String usu = request.getParameter("txtCel");
        String pas = request.getParameter("txtPas");

        if (HayUsuario(usu, pas) == true) {
            if (Yavoto(usu) == false) {
                request.setAttribute("usu", usu);
                request.getRequestDispatcher("tarjeton.jsp").forward(request, response);
            } else {
                request.setAttribute("error", "Ya ha votado, no puede hacerlo dos veces");
                request.getRequestDispatcher("jurado.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("error", "Usuario incorrecto");
            request.getRequestDispatcher("jurado.jsp").forward(request, response);
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

    private boolean HayUsuario(String cedula, String pass) {

        boolean HayUsuario = false;

        try {
            Connection cnx = Conexion.obtenerConexion();
            Statement sp = cnx.createStatement();
            ResultSet rs = sp.executeQuery("SELECT * FROM persona where Cedula = '" + cedula + "' and Contraseña ='" + pass + "' ;");
            if (rs.next()) {
                HayUsuario = true;
            }
        } catch (Exception e) {
            System.out.print("Error " + e);
        }
        return HayUsuario;
    }

    private boolean Yavoto(String cedula) {

        boolean HayUsuario = false;

        try {
            Connection cnx = Conexion.obtenerConexion();
            Statement sp = cnx.createStatement();
            ResultSet rs = sp.executeQuery("SELECT * FROM voto where Cedula = '" + cedula + "' ;");
            if (rs.next()) {
                HayUsuario = true;
            }
        } catch (Exception e) {
            System.out.print("Error " + e);
        }
        return HayUsuario;
    }
}
