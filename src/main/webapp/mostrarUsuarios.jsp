<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="logica.Usuario" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados</h1>
        <%
         List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
         
         int contador = 1;
         for (Usuario u : listaUsuarios) {
        %>
        
        <p><b>Usuario N° <%=contador++%></b></p>
        <p>Dni: <%=u.getDni()%></p>
        <p>Nombre: <%=u.getNombre()%></p>
        <p>Apellido: <%=u.getApellido()%></p>
        <p>Telefono: <%=u.getTelefono()%></p>
        <p>---------------------------------------</p>
        
        <%};%>
        
        
        
        
    </body>
</html>
