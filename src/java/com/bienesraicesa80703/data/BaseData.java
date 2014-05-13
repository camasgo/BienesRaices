/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alvaro
 */
public class BaseData {    

    public BaseData() {
    }

    public Connection getConexion() throws SQLException{
        Connection conexion;
        String className = "sun.jdbc.odbc.JdbcOdbcDriver";
        String url = "jdbc:odbc:BienesRaices";
        String userName = "lenguajes";
        String password = "lenguajes";
        conexion = DriverManager.getConnection(url, userName, password);
        return conexion;
    }//getConexion

}
