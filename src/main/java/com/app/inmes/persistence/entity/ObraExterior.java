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
@Table(name = "OBRA_EXTERIOR")
public class ObraExterior {
    
    @EmbeddedId
    private ObraExteriorPK obraExteriorPK;
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "TIPO_OBRA", nullable = false, insertable = false, updatable = false)
    private Integer tipoObra;
    @Column(name = "TIPO_ESTADO_FISICO")
    private Integer tipoEstadoFisico;
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
    
    public ObraExteriorPK getObraExteriorPK() {
        return obraExteriorPK;
    }

    public void setObraExteriorPK(ObraExteriorPK obraExteriorPK) {
        this.obraExteriorPK = obraExteriorPK;
    }

    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
    }

    public Integer getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(Integer tipoObra) {
        this.tipoObra = tipoObra;
    }

    public Integer getTipoEstadoFisico() {
        return tipoEstadoFisico;
    }

    public void setTipoEstadoFisico(Integer tipoEstadoFisico) {
        this.tipoEstadoFisico = tipoEstadoFisico;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }
    
    
}
