<%-- 
    Document   : listar
    Created on : 2/07/2019, 05:21:15 PM
    Author     : faber
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cliente"%>
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDao.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Clientes</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRES</th>
                        <th>APELLIDOS</th>
                        <th>DIRECCION</th>
                        <th>CELULAR</th>
                        <th>EMAIL</th>
                        <th>SEXO</th>
                        <th>FECHA NACIMIENTO</th>
                        <th>CIUDAD</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    ClienteDAO gestor = new ClienteDAO();
                    ArrayList<Cliente> clientes = gestor.listar();
                    Iterator<Cliente> iter = clientes.iterator();
                    Cliente cliente = null;
                    while(iter.hasNext()){
                        cliente = iter.next();
                    }
                    
                
                %>
                <tbody>
                    <tr>
                        <td><%= cliente.getId()%></td>
                        <td><%= cliente.getNombres()%></td>
                        <td><%= cliente.getApellidos()%></td>
                        <td><%= cliente.getDireccion()%></td>
                        <td><%= cliente.getCelular()%></td>
                        <td><%= cliente.getEmail()%></td>
                        <td><%= cliente.getSexo()%></td
                        <td><%= cliente.getFec_Nac()%></td
                        <td><%= cliente.getCiudad()%></td
                        <td>
                            <a>Editar</a>
                            <a>Eliminar</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
