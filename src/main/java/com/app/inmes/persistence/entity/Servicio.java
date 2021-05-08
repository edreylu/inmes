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
@Table(name = "SERVICIO")
public class Servicio {
    
    @EmbeddedId
    private ServicioPK servicioPK;
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "TIPO_SERVICIO", nullable = false, insertable = false, updatable = false)
    private Integer tipoServicio;
    @Column(name = "SUBTIPO_SERVICIO", nullable = false, insertable = false, updatable = false)
    private Integer subTipoServicio;
    @Column(name = "LOCALIDAD")
    private Integer localidad;
    @Column(name = "INMUEBLE")
    private Integer inmueble;
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

    public ServicioPK getServicioPK() {
        return servicioPK;
    }

    public void setServicioPK(ServicioPK servicioPK) {
        this.servicioPK = servicioPK;
    }

    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
    }

    public Integer getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(Integer tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Integer getSubTipoServicio() {
        return subTipoServicio;
    }

    public void setSubTipoServicio(Integer subTipoServicio) {
        this.subTipoServicio = subTipoServicio;
    }

    public Integer getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Integer localidad) {
        this.localidad = localidad;
    }

    public Integer getInmueble() {
        return inmueble;
    }

    public void setInmueble(Integer inmueble) {
        this.inmueble = inmueble;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }
    
    
}
