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
public class AnexoDTO {
    
    private int folioInmes;
    private int tipoAnexo;
    private int subTipoAnexo;
    private Integer superficieBueno;
    private Integer superficieRegular;
    private Integer superficieMalo;
    private Integer superficieNoApto;
    private Integer otrosCts;

    public int getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(int folioInmes) {
        this.folioInmes = folioInmes;
    }

    public int getTipoAnexo() {
        return tipoAnexo;
    }

    public void setTipoAnexo(int tipoAnexo) {
        this.tipoAnexo = tipoAnexo;
    }

    public int getSubTipoAnexo() {
        return subTipoAnexo;
    }

    public void setSubTipoAnexo(int subTipoAnexo) {
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