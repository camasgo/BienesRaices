/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.domain;

import java.util.LinkedList;

/**
 *
 * @author Equipo
 */
public class Propiedad {
    
    private int codPropiedad;
    private String descripcion;
    private String direccion;
    private float precioVenta;
    private boolean electricidad;
    private Propietario propietario;
    private LinkedList<CompradorPotencial> compradores;

    public Propiedad() {
        compradores = new LinkedList<CompradorPotencial>();
        propietario = new Propietario();
    }
    
    

    public Propiedad(int codPropiedad, String descripcion, String direccion, float precioVenta, boolean electricidad,
            Propietario propietario, LinkedList<CompradorPotencial> compradores) {
        this.codPropiedad = codPropiedad;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.precioVenta = precioVenta;
        this.electricidad = electricidad;
        this.propietario = propietario;
        this.compradores = compradores;
    }

    public int getCodPropiedad() {
        return codPropiedad;
    }

    public void setCodPropiedad(int codPropiedad) {
        this.codPropiedad = codPropiedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public boolean isElectricidad() {
        return electricidad;
    }

    public void setElectricidad(boolean electricidad) {
        this.electricidad = electricidad;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public LinkedList<CompradorPotencial> getCompradores() {
        return compradores;
    }

    public void setCompradores(LinkedList<CompradorPotencial> compradores) {
        this.compradores = compradores;
    }
        
}
