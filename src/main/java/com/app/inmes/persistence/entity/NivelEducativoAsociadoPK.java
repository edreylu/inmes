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
public class NivelEducativoAsociadoPK implements Serializable{
    
    @Column(name = "FOLIO_INMES")
    private Integer folioInmes;
    @Column(name = "TIPO_AREA")
    private Integer tipoArea;
    @Column(name = "NIVEL")
    private Integer nivel;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }

    public Integer getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(Integer tipoArea) {
        this.tipoArea = tipoArea;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
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
