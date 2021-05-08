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
@Table(name = "MATERIAL_PREDOMINANTE")
public class MaterialPredominante {
    
    @EmbeddedId
    private MaterialPredominantePK materialPredominantePK;
    
    @Column(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Integer folioInmes;
    @Column(name = "TIPO_CONSTRUCCION", nullable = false, insertable = false, updatable = false)
    private Integer tipoConstruccion;
    @Column(name = "TIPO_ESTRUCTURA", nullable = false, insertable = false, updatable = false)
    private Integer tipoEstructura;
    @Column(name = "TIPO_MATERIAL", nullable = false, insertable = false, updatable = false)
    private Integer tipoMaterial;
    
    @ManyToOne
    @JoinColumn(name = "FOLIO_INMES", nullable = false, insertable = false, updatable = false)
    private Inmes inmes;

    public MaterialPredominantePK getMaterialPredominantePK() {
        return materialPredominantePK;
    }

    public void setMaterialPredominantePK(MaterialPredominantePK materialPredominantePK) {
        this.materialPredominantePK = materialPredominantePK;
    }

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }

    public Integer getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(Integer tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public Integer getTipoEstructura() {
        return tipoEstructura;
    }

    public void setTipoEstructura(Integer tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public Integer getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(Integer tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
    }

    
    
}
