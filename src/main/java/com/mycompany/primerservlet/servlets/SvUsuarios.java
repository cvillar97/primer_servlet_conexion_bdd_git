package com.mycompany.primerservlet.servlets;

import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import logica.Usuario;

/**
 *
 * @author criss
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet SvUsuarios</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet SvUsuarios at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");

/// Esto de arriba es otra forma en la cual podemos mostrar nuestro JSP en la
/// pagina web, pero buscamos separar el front-end del back-end entonces,
/// vamos a comentar estas lineas porque no las vamos a usar.
        }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("20665112", "Carlos", "Lopez", "265224485"));
        listaUsuarios.add(new Usuario("24665112", "Felipe", "Juarez", "545224485"));
        listaUsuarios.add(new Usuario("25665112", "Jorge", "Ubaldi", "635224485"));
        
        // Primero creamos una lista lógica y fuimos agregando manualmente
        // usuarios. Ahora vamos a traer a los usuarios de la DB.
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaUsuarios", listaUsuarios);
    
        // Lo que hacemos aca es traer la session del usuario que solicitó la 
        // y setear como atributo a la lista de usuarios. Luego haremos lo
        // mismo con una base de datos.
        
        // Despues de hacer esto tenemos que redireccionar al usuario a una
        // pagina nueva donde podamos mostrarle los datos solicitados, es decir
        // hacer la RESPONSE.
        
        response.sendRedirect("mostrarUsuarios.jsp");
    }

    // Vemos que tiene una request y una response:
    // request: hecha por el cliente, la vamos a recibir
    // response: la respuesta que vamos a devolver al cliente
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response); Esto no se usa

        String dni = request.getParameter("dni");        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        System.out.println("dni: " + dni);
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("telefono: " + telefono);
        
        // En un ejercicio anterior mostramos los valores mediante
        // System.out.println
        
        // Mismo ejemplo pero ahora usando la conexión a la base de
        // datos:
//        
//        Usuario user = new Usuario();
//        
//        user.setDni(dni);
//        user.setNombre(nombre);
//        user.setApellido(apellido);
//        user.setTelefono(telefono);
//        
//        control.crearUsuario(user);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
