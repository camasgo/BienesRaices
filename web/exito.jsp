<%-- 
    Document   : exito
    Created on : 13-may-2014, 10:36:39
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información almacenada</title>
    </head>
    <body>        
        <h1>La informaci&oacute;n ha sido almacenada con &eacute;xito</h1>        
        <br>
        <%--Muestra el codigo pero desde la capa de datos el codigo generado por la identidad no es capturado --%>
        C&oacute;digo: ${propiedad.codPropiedad}
        <br>
        Descripci&oacute;n: ${propiedad.descripcion}
        <br>
        <%--No muestra el nombre completo--%>
        Nombre del propietario: ${propietario.nombrePropietario} ${propietario.apellidosPropietario}
    </body>
</html>
