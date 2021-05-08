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
public class ServicioDTO {
    
    private int folioInmes;
    private int tipoServicio;
    private int subTipoServicio;
    private Integer localidad;
    private Integer inmueble;
    private String otro;

    public int getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(int folioInmes) {
        this.folioInmes = folioInmes;
    }

    public int getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(int tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public int getSubTipoServicio() {
        return subTipoServicio;
    }

    public void setSubTipoServicio(int subTipoServicio) {
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