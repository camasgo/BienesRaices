/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.business;

import com.bienesraicesa80703.data.PropietarioData;
import com.bienesraicesa80703.domain.Propietario;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Equipo
 */
public class PropietarioBusiness {
    private PropietarioData propietarioData;

    public PropietarioBusiness() {
        propietarioData = new PropietarioData();
    }
    
    public LinkedList<Propietario> getPropietarios() throws SQLException{
        return propietarioData.getPropietarios();
    }
    
    
}
