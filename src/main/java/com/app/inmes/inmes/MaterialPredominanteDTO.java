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
public class MaterialPredominanteDTO {
    
    private int folioInmes;
    private int tipoConstruccion;
    private int tipoEstructura;
    private int tipoMaterial;

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

    public int getTipoEstructura() {
        return tipoEstructura;
    }

    public void setTipoEstructura(int tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public int getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    
    
}