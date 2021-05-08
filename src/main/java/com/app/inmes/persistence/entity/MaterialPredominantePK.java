/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.persistence.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Edward Reyes
 */
@Embeddable
public class MaterialPredominantePK implements Serializable{
    
    @Column(name = "FOLIO_INMES")
    private Integer folioInmes;
    @Column(name = "TIPO_CONSTRUCCION")
    private Integer tipoConstruccion;
    @Column(name = "TIPO_ESTRUCTURA")
    private Integer tipoEstructura;
    @Column(name = "TIPO_MATERIAL")
    private Integer tipoMaterial;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }

    public Integer getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(Integer tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public Integer getTipoEstructura() {
        return tipoEstructura;
    }

    public void setTipoEstructura(Integer tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public Integer getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(Integer tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
