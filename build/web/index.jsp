<%-- 
    Document   : index
    Created on : 2/07/2019, 05:18:36 PM
    Author     : faber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action ="controlador">
            <table>
                <tr><td><h5>Ingrese id</h5></td><td><input type = "text" name="id"></td><td><input type="submit" name ="envio" value = "Enviar"></td></tr>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombres</th>
                            <th>Apellidos</th>
                            <th>Direccion</th>
                            <th>Celular</th>
                            <th>Email</th>
                            <th>Sexo</th>
                            <th>Fecha</th>
                            <th>Ciudad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><%=request.getParameter("id")%></td>
                            <td><%=request.getParameter("nombres")%></td>
                            <td><%=request.getParameter("apellidos")%></td>
                            <td><%=request.getParameter("direccion")%></td>
                            <td><%=request.getParameter("celular")%></td>
                            <td><%=request.getParameter("email")%></td>
                            <td><%=request.getParameter("sexo")%></td>
                            <td><%=request.getParameter("fec_nac")%></td>
                            <td><%=request.getParameter("ciudad")%></td>
                        </tr>
                    </tbody>
                </table>

            </table>
        
</html>
