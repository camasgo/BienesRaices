<%-- 
    Document   : ListarPropietariosServlet
    Created on : 13-may-2014, 10:38:57
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="%{!empty propietarios}">
        <table border="1">
            <thead>
                <tr>
                    <th>Identificaci&oacute;n</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="propietario" items="${propietarios}">
                    <tr>
                        <td><c:out value="propietario.idPropietario"/></td>
                        <td><c:out value="propietario.nombrePropietario"/></td>
                        <td><c:out value="propietario.apellidosPropietario"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        </c:if>
    </body>
</html>
