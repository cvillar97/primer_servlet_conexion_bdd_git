package com.mycompany.primerservlet.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logica.ControladorLogica;

import java.io.IOException;

@WebServlet(name = "SvDeleteUsuario", urlPatterns = {"/SvDeleteUsuario"})
public class SvDeleteUsuario extends HttpServlet {

    ControladorLogica controladorLogica = new ControladorLogica();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idUsuario = Integer.parseInt(request.getParameter("id_usuario"));

        controladorLogica.deleteUser(idUsuario);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
