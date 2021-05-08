/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.persistence.entity;

import java.sql.Blob;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Edward Reyes
 */
@Entity
@Table(name = "CROQUIS")
public class Croquis {
    
    @Id
    @GeneratedValue
    @Column(name = "ID_CROQUIS")
    private Integer idCroquis;
    @Column(name = "FOLIO_INMES")
    private Integer folioInmes;
    @Column(name = "DOCUMENTO")
    private Blob documento;
    @Column(name = "FECHA_ACTUALIZACION")
    private Date fechaActualizacion;

    public Integer getIdCroquis() {
        return idCroquis;
    }

    public void setIdCroquis(Integer idCroquis) {
        this.idCroquis = idCroquis;
    }

    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }

    public Blob getDocumento() {
        return documento;
    }

    public void setDocumento(Blob documento) {
        this.documento = documento;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    
}
