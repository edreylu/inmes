/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.inmes;

import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author Edward Reyes
 */
public class CroquisDTO {
    
    private int idCroquis;
    private int folioInmes;
    private Blob documento;
    private Date fechaActualizacion;

    public int getIdCroquis() {
        return idCroquis;
    }

    public void setIdCroquis(int idCroquis) {
        this.idCroquis = idCroquis;
    }

    public int getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(int folioInmes) {
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
