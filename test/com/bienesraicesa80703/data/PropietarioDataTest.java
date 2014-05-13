/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.data;

import com.bienesraicesa80703.domain.Propietario;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Equipo
 */
public class PropietarioDataTest {
    private PropietarioData pd;
    
    @Before
    public void setUp() {
        pd = new PropietarioData();
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void test() {
        try {
            LinkedList<Propietario> propietarios = pd.getPropietarios();
            System.out.println(propietarios.getFirst().getNombrePropietario());
        } catch (SQLException ex) {
            Logger.getLogger(PropietarioDataTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
