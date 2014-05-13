<%-- 
    Document   : insertarPropiedad
    Created on : 13-may-2014, 9:24:29
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Propiedad</title>
    </head>
    <body>
        <h1>Informaci&oacute;n de la propiedad</h1>
        <s:form action="guardarPropiedad" method="get">
            <s:textfield name="descripcion" label="Descripción"/>
            <s:textfield name="direccion" label="Dirección"/>
            <s:textfield name="precioVenta" label="Precio"/>
            <s:select name="propietario.idPropietario" list="propietarios" listKey="idPropietario" listValue="%{apellidosPropietario+', '+nombrePropietario}"/>
            <s:checkbox name="electricidad" label="Electricidad"/>
            <s:submit value="Guardar" type="submit"/>
        </s:form>
    </body>
</html>
