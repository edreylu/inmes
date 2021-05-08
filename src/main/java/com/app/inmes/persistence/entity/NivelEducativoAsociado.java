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
@Table(name = "NIVEL_EDUCATIVO_ASOCIADO")
public class NivelEducativoAsociado {
    
    @EmbeddedId
    private NivelEducativoAsociadoPK nivelEduactivoAsociadoPK;
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "TIPO_AREA", nullable = false, insertable = false, updatable = false)
    private Integer tipoArea;
    @Column(name = "NIVEL", nullable = false, insertable = false, updatable = false)
    private Integer nivel;

    
    @ManyToOne
    @JoinColumn(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Inmes inmes;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }
    
    public NivelEducativoAsociadoPK getNivelEduactivoAsociadoPK() {
        return nivelEduactivoAsociadoPK;
    }

    public void setNivelEduactivoAsociadoPK(NivelEducativoAsociadoPK nivelEduactivoAsociadoPK) {
        this.nivelEduactivoAsociadoPK = nivelEduactivoAsociadoPK;
    }

    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
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
    
    
    
}
