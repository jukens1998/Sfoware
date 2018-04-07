/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import UsuarioBEANS.VotoDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author oscar
 */
@WebServlet(name = "Voto", urlPatterns = {"/Voto"})
public class Voto extends HttpServlet {

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

        String accion = request.getParameter("candidato");
        if (accion.equals("1")) {
            String usu = request.getParameter("usuario");
            VotoDB.Insertar(usu, accion);
            response.sendRedirect(request.getContextPath() + "/indexII.jsp?men=Gracias por votar");
        }
        if (accion.equals("2")) {
            String usu = request.getParameter("usuario");
            VotoDB.Insertar(usu, accion);
            response.sendRedirect(request.getContextPath() + "/indexII.jsp?men=Gracias por votar");
        }
        if (accion.equals("3")) {
            String usu = request.getParameter("usuario");
            VotoDB.Insertar(usu, accion);
            response.sendRedirect(request.getContextPath() + "/indexII.jsp?men=Gracias por votar");
        }
        if (accion.equals("4")) {
            String usu = request.getParameter("usuario");
            VotoDB.Insertar(usu, accion);
            response.sendRedirect(request.getContextPath() + "/indexII.jsp?men=Gracias por votar");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
