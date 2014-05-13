/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.data;

import com.bienesraicesa80703.domain.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Equipo
 */
public class PropietarioData extends BaseData{

    public PropietarioData() {
    }
    
    public LinkedList<Propietario> getPropietarios() throws SQLException{
        String sqlSelect = "SELECT id_propietario, nombre_propietario, apellidos_propietario, telefono "
                            + " FROM Propietario";
        Connection con = this.getConexion();
        PreparedStatement stmt = con.prepareStatement(sqlSelect);
        ResultSet rs = stmt.executeQuery();
        LinkedList<Propietario> propietarios = new LinkedList<Propietario>();
        while(rs.next()){
            Propietario propietario = new Propietario();
            propietario.setIdPropietario(rs.getInt("id_propietario"));
            propietario.setNombrePropietario(rs.getString("nombre_propietario"));
            propietario.setApellidosPropietario(rs.getString("apellidos_propietario"));
            propietario.setTelefono(rs.getString("telefono"));
            
            propietarios.add(propietario);
        }
        con.close();
        return propietarios;
    }
    
}
