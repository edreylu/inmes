/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.inmes;

/**
 *
 * @author Edward Reyes
 */
public class ObraExteriorDTO {
    
    private int folioInmes;
    private int tipoObra;
    private int tipoEstadoFisico;
    private String otro;

    public int getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(int folioInmes) {
        this.folioInmes = folioInmes;
    }

    public int getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(int tipoObra) {
        this.tipoObra = tipoObra;
    }

    public int getTipoEstadoFisico() {
        return tipoEstadoFisico;
    }

    public void setTipoEstadoFisico(int tipoEstadoFisico) {
        this.tipoEstadoFisico = tipoEstadoFisico;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }
    
    
}