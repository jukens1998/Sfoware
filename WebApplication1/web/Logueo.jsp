<%-- 
    Document   : Logueo
    Created on : 2/04/2018, 05:16:50 PM
    Author     : THEYAN
--%>
<%@page import="Utils.Conexion"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Logueo de Usuarios</h1>
        
        <form action="servletLogueo" method="post">
            
            
            <table border="0" width="300" align="center">
                <tr>
                    <td>Codigo usuario</td>
                    <td><input type="text" name="txtUsu"></td>
                </tr>
                
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="txtPas"></td>
                </tr>
                  <tr>
                    <th colspan="2"><input type="submit" name="btn" value="Iniciar sesión"></th>
                </tr>
                
            </table>
            
        </form>
                
    </body>
</html>
