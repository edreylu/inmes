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
@Table(name = "ANEXO")
public class Anexo {
    
    @EmbeddedId
    private AnexoPK anexoPK;
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "TIPO_ANEXO", nullable = false, insertable = false, updatable = false)
    private Integer tipoAnexo;
    @Column(name = "SUBTIPO_ANEXO", nullable = false, insertable = false, updatable = false)
    private Integer subTipoAnexo;
    @Column(name = "SUPERFICIE_BUENO")
    private Integer superficieBueno;
    @Column(name = "SUPERFICIE_REGULAR")
    private Integer superficieRegular;
    @Column(name = "SUPERFICIE_MALO")
    private Integer superficieMalo;
    @Column(name = "SUPERFICIE_NO_APTO")
    private Integer superficieNoApto;
    @Column(name = "OTROS_CTS")
    private Integer otrosCts;

    @ManyToOne
    @JoinColumn(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Inmes inmes;
    
    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
    }
    
    public AnexoPK getAnexoPK() {
        return anexoPK;
    }

    public void setAnexoPK(AnexoPK anexoPK) {
        this.anexoPK = anexoPK;
    }

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

    public Integer getSuperficieBueno() {
        return superficieBueno;
    }

    public void setSuperficieBueno(Integer superficieBueno) {
        this.superficieBueno = superficieBueno;
    }

    public Integer getSuperficieRegular() {
        return superficieRegular;
    }

    public void setSuperficieRegular(Integer superficieRgular) {
        this.superficieRegular = superficieRgular;
    }

    public Integer getSuperficieMalo() {
        return superficieMalo;
    }

    public void setSuperficieMalo(Integer superficieMalo) {
        this.superficieMalo = superficieMalo;
    }

    public Integer getSuperficieNoApto() {
        return superficieNoApto;
    }

    public void setSuperficieNoApto(Integer superficieNoApto) {
        this.superficieNoApto = superficieNoApto;
    }

    public Integer getOtrosCts() {
        return otrosCts;
    }

    public void setOtrosCts(Integer otrosCts) {
        this.otrosCts = otrosCts;
    }

    
}
