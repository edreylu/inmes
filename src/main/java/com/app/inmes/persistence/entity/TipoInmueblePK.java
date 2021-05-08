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
public class TipoInmueblePK implements Serializable{
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "TIPO_INMUEBLE", nullable = false, insertable = false, updatable = false)
    private Integer tipoInmueble;
    @Column(name = "OTRO")
    private String otro;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }

    public Integer getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(Integer tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
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
