/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.domain;

/**
 *
 * @author Equipo
 */
public class CompradorPotencial {
    
    private int idComprador;
    private String nombreComprador;
    private String apellidosComrpador;
    private String telefono;

    public CompradorPotencial() {
    }
        
    public CompradorPotencial(int idComprador, String nombreComprador, String apellidosComrpador, String telefono) {
        this.idComprador = idComprador;
        this.nombreComprador = nombreComprador;
        this.apellidosComrpador = apellidosComrpador;
        this.telefono = telefono;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getApellidosComrpador() {
        return apellidosComrpador;
    }

    public void setApellidosComrpador(String apellidosComrpador) {
        this.apellidosComrpador = apellidosComrpador;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
    
}
