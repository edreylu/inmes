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
public class TipoInmuebleDTO {
    private int folioInmes;
    private Integer tipoInmueble;
    private String otro;

    public int getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(int folioInmes) {
        this.folioInmes = folioInmes;
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
    
    
}