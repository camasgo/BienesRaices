/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.application.servlet;

import com.bienesraicesa80703.business.PropietarioBusiness;
import com.bienesraicesa80703.domain.Propietario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Equipo
 */
public class ListarPropietariosServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PropietarioBusiness pb = new PropietarioBusiness();
            LinkedList<Propietario> propietarios =pb.getPropietarios();
            request.setAttribute("propietarios", propietarios);
            RequestDispatcher rd = request.getRequestDispatcher("/listarPropietarios.jsp");
            rd.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ListarPropietariosServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
