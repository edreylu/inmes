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
@Table(name = "LOCAL_UTILIZADO")
public class LocalUtilizado {
    
    @EmbeddedId
    private LocalUtilizadoPK localUtilizadoPK;
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "NO_CENTRO", nullable = false, insertable = false, updatable = false)
    private Integer noCentro;
    @Column(name = "AULAS")
    private Integer aulas;
    @Column(name = "LABORATORIOS")
    private Integer laboratorios;
    @Column(name = "TALLERES")
    private Integer talleres;

    
    @ManyToOne
    @JoinColumn(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Inmes inmes;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }
    
    public LocalUtilizadoPK getLocalUtilizadoPK() {
        return localUtilizadoPK;
    }

    public void setLocalUtilizadoPK(LocalUtilizadoPK localUtilizadoPK) {
        this.localUtilizadoPK = localUtilizadoPK;
    }

    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
    }

    public Integer getNoCentro() {
        return noCentro;
    }

    public void setNoCentro(Integer noCentro) {
        this.noCentro = noCentro;
    }

    public Integer getAulas() {
        return aulas;
    }

    public void setAulas(Integer aulas) {
        this.aulas = aulas;
    }

    public Integer getLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(Integer laboratorios) {
        this.laboratorios = laboratorios;
    }

    public Integer getTalleres() {
        return talleres;
    }

    public void setTalleres(Integer talleres) {
        this.talleres = talleres;
    }
    
    
}
