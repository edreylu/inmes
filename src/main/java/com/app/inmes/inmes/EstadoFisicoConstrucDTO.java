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
public class EstadoFisicoConstrucDTO {
    
    private int folioInmes;
    private int tipoConstruccion;
    private int subTipoConstruccion;
    private Integer bueno;
    private Integer regular;
    private Integer malo;
    private Integer noApto;

    public int getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(int folioInmes) {
        this.folioInmes = folioInmes;
    }

    public int getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(int tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public int getSubTipoConstruccion() {
        return subTipoConstruccion;
    }

    public void setSubTipoConstruccion(int subTipoConstruccion) {
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