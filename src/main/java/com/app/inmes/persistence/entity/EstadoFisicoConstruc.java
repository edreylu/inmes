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
@Table(name = "ESTADO_FISICO_CONSTRUC")
public class EstadoFisicoConstruc {
    
    @EmbeddedId
    private EstadoFisicoConstrucPK estadoFisicoConstrucPK;
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "TIPO_CONSTRUCCION", nullable = false, insertable = false, updatable = false)
    private Integer tipoConstruccion;
    @Column(name = "SUBTIPO_CONSTRUCCION", nullable = false, insertable = false, updatable = false)
    private Integer subTipoConstruccion;
    @Column(name = "BUENO")
    private Integer bueno;
    @Column(name = "REGULAR")
    private Integer regular;
    @Column(name = "MALO")
    private Integer malo;
    @Column(name = "NO_APTO")
    private Integer noApto;
    
    
    @ManyToOne
    @JoinColumn(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Inmes inmes;

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }

    public EstadoFisicoConstrucPK getEstadoFisicoConstrucPK() {
        return estadoFisicoConstrucPK;
    }

    public void setEstadoFisicoConstrucPK(EstadoFisicoConstrucPK estadoFisicoConstrucPK) {
        this.estadoFisicoConstrucPK = estadoFisicoConstrucPK;
    }

    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
    }

    public Integer getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(Integer tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public Integer getSubTipoConstruccion() {
        return subTipoConstruccion;
    }

    public void setSubTipoConstruccion(Integer subTipoConstruccion) {
        this.subTipoConstruccion = subTipoConstruccion;
    }

    public Integer getBueno() {
        return bueno;
    }

    public void setBueno(Integer bueno) {
        this.bueno = bueno;
    }

    public Integer getRegular() {
        return regular;
    }

    public void setRegular(Integer regular) {
        this.regular = regular;
    }

    public Integer getMalo() {
        return malo;
    }

    public void setMalo(Integer malo) {
        this.malo = malo;
    }

    public Integer getNoApto() {
        return noApto;
    }

    public void setNoApto(Integer noApto) {
        this.noApto = noApto;
    }

    
}
