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
public class AnexoPK implements Serializable{
    
    @Column(name = "FOLIO_INMES")
    private Integer folioInmes;
    @Column(name = "TIPO_ANEXO")
    private Integer tipoAnexo;
    @Column(name = "SUBTIPO_ANEXO")
    private Integer subTipoAnexo;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }

    public Integer getTipoAnexo() {
        return tipoAnexo;
    }

    public void setTipoAnexo(Integer tipoAnexo) {
        this.tipoAnexo = tipoAnexo;
    }

    public Integer getSubTipoAnexo() {
        return subTipoAnexo;
    }

    public void setSubTipoAnexo(Integer subTipoAnexo) {
        this.subTipoAnexo = subTipoAnexo;
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
