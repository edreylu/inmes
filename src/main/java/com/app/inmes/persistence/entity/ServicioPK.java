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
public class ServicioPK implements Serializable{
    
    @Column(name = "FOLIO_INMES")
    private Integer folioInmes;
    @Column(name = "TIPO_SERVICIO")
    private Integer tipoServicio;
    @Column(name = "SUBTIPO_SERVICIO")
    private Integer subTipoServicio;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }
    
    public Integer getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(Integer tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Integer getSubTipoServicio() {
        return subTipoServicio;
    }

    public void setSubTipoServicio(Integer subTipoServicio) {
        this.subTipoServicio = subTipoServicio;
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
