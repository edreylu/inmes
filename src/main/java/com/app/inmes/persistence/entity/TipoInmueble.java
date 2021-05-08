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
@Table(name = "TIPO_INMUEBLE")
public class TipoInmueble {
    
    @EmbeddedId
    private TipoInmueblePK tipoInmueblePK;
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "TIPO_INMUEBLE", nullable = false, insertable = false, updatable = false)
    private Integer tipoInmueble;
    @Column(name = "OTRO", nullable = false, insertable = false, updatable = false)
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

    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
    }

    public Integer getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(Integer tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    public TipoInmueblePK getTipoInmueblePK() {
        return tipoInmueblePK;
    }

    public void setTipoInmueblePK(TipoInmueblePK tipoInmueblePK) {
        this.tipoInmueblePK = tipoInmueblePK;
    }

    
    
}
