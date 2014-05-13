/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.business;

import com.bienesraicesa80703.data.PropiedadData;
import com.bienesraicesa80703.domain.Propiedad;
import java.sql.SQLException;

/**
 *
 * @author Equipo
 */
public class PropiedadBusiness {
    
    private PropiedadData propiedadData;

    public PropiedadBusiness() {
        propiedadData = new PropiedadData();
    }
    
   public Propiedad insertar(Propiedad propiedad) throws SQLException {
       return propiedadData.insertar(propiedad);
   } 
    
   public void eliminar(int codPropiedad) throws SQLException {
       propiedadData.eliminar(codPropiedad);
   }
   
}
