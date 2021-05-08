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
public class LocalUtilizadoPK implements Serializable{
    
    @Column(name = "FOLIO_INMES")
    private Integer folioInmes;
    @Column(name = "NO_CENTRO")
    private Integer noCentro;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }

    public Integer getNoCentro() {
        return noCentro;
    }

    public void setNoCentro(Integer noCentro) {
        this.noCentro = noCentro;
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
