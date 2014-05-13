/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.data;

import com.bienesraicesa80703.domain.Propiedad;
import com.bienesraicesa80703.domain.Propietario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Equipo
 */
public class PropiedadDataTest {
    
    private PropiedadData pd;
    
    
    @Before
    public void setUp() {
        pd = new PropiedadData();
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void test() {
        try {
            Propiedad propiedad = new Propiedad();
            propiedad.setDescripcion("Precioso lote, todos los servicios, 1000 m2");
            propiedad.setDireccion("Miramar");
            propiedad.setPrecioVenta(30000000);
            Propietario p = new Propietario();
            p.setIdPropietario(100);
            propiedad.setPropietario(p);
            propiedad.setElectricidad(false);
            pd.insertar(propiedad);
                        
            pd.eliminar(1);
           
        } catch (SQLException ex) {
            Logger.getLogger(PropiedadDataTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
