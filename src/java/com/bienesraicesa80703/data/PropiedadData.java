/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bienesraicesa80703.data;

import com.bienesraicesa80703.domain.Propiedad;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author Equipo
 */
public class PropiedadData extends BaseData {

    public PropiedadData() {
    }//PropiedadData

    public Propiedad insertar(Propiedad propiedad) throws SQLException {
        String sqlInsert = "{CALL sp_insertar_propiedad(?,?,?,?,?,?)}";
        Connection con = this.getConexion();
        CallableStatement stmt = con.prepareCall(sqlInsert);
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setString(2, propiedad.getDescripcion());
        stmt.setString(3, propiedad.getDireccion());
        stmt.setFloat(4, propiedad.getPrecioVenta());
        stmt.setBoolean(5, propiedad.isElectricidad());
        stmt.setInt(6, propiedad.getPropietario().getIdPropietario());

        stmt.execute();
//        ResultSet rs = stmt.getResultSet();
        propiedad.setCodPropiedad(stmt.getInt(1));//no retorna el codigo generado por la identidad
        con.close();
        return propiedad;
    }//insertar

    public void eliminar(int codPropiedad) throws SQLException {
        Connection con = this.getConexion();
        con.setAutoCommit(false);
        try {

            String dltCompradores = "DELETE FROM Propiedad_CompradorPotencial "
                    + " WHERE cod_propiedad=?";
            PreparedStatement stmtCompradores = con.prepareStatement(dltCompradores);
            stmtCompradores.setInt(1, codPropiedad);
            stmtCompradores.executeUpdate();

            String dltPropiedad = "DELETE FROM Propiedad "
                    + " WHERE cod_propiedad=?";
            PreparedStatement stmtPropiedad = con.prepareStatement(dltPropiedad);
            stmtPropiedad.setInt(1, codPropiedad);
            
            stmtPropiedad.executeUpdate();
            con.commit();
        } catch (SQLException e) {
            con.rollback();
        } finally{
            con.close();
        }
    }//eliminar
}//PropiedadData
;
