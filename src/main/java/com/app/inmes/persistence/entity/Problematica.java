/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.persistence.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Edward Reyes
 */
@Entity
@Table(name = "PROBLEMATICA")
public class Problematica {
    
    @EmbeddedId
    private ProblematicaPK problematicaPK;
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "TIPO_PROBLEMATICA", nullable = false, insertable = false, updatable = false)
    private Integer tipoProblematica;
    @Column(name = "OTRO")
    private String otro;

    
    @ManyToOne
    @JoinColumn(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Inmes inmes;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }
    
    public ProblematicaPK getProblematicaPK() {
        return problematicaPK;
    }

    public void setProblematicaPK(ProblematicaPK problematicaPK) {
        this.problematicaPK = problematicaPK;
    }

    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
    }

    public Integer getTipoProblematica() {
        return tipoProblematica;
    }

    public void setTipoProblematica(Integer tipoProblematica) {
        this.tipoProblematica = tipoProblematica;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }
    
    
}
