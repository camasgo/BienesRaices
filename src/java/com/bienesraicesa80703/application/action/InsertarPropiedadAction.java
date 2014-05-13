/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bienesraicesa80703.application.action;

import com.bienesraicesa80703.business.PropiedadBusiness;
import com.bienesraicesa80703.business.PropietarioBusiness;
import com.bienesraicesa80703.domain.Propiedad;
import com.bienesraicesa80703.domain.Propietario;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo
 */
public class InsertarPropiedadAction extends ActionSupport implements Preparable, ModelDriven<Propiedad>{
    
    private Propiedad propiedad;
    private LinkedList<Propietario> propietarios;

    public String insertar(){
        try {
            PropiedadBusiness pb = new PropiedadBusiness();
            System.out.println(propiedad.getDescripcion());
            pb.insertar(propiedad);
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPropiedadAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }
    
    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    @Override
    public void prepare() throws Exception {
        propiedad = new Propiedad();
        PropietarioBusiness pb = new PropietarioBusiness();
        propietarios = pb.getPropietarios();
    }

    @Override
    public void validate() {
        if(propiedad.getDescripcion().equals("")){
            this.addFieldError("descripcion", "Debe de ingresar una descripcion para la propiedad");
        }
        
        if(propiedad.getDireccion().equals("")){
            this.addFieldError("direccion", "Debe de ingresar una dirección para la propiedad");
        }
        
        if(propiedad.getPrecioVenta() <= 0){
            this.addFieldError("precioVenta", "Debe de ingresar un valor precio mayor a 0");
        }
        
        if(propiedad.getPropietario().getIdPropietario() == 0){
            this.addFieldError("propietario", "Debe de ingresar un propietario para la propiedad");
        }
        
        
    }
    
    @Override
    public Propiedad getModel() {
        return propiedad;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public LinkedList<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(LinkedList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }
    
}
