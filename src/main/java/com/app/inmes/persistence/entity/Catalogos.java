/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.persistence.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Edward Reyes
 */
@Entity
@Table(name = "CATALOGOS")
public class Catalogos{
    
    @EmbeddedId
    private CatalogosPK catalogosPK;
    
    @Column(name = "TABLA", nullable = false, insertable = false, updatable = false)
    private String tabla;
    @Column(name = "COLUMNA", nullable = false, insertable = false, updatable = false)
    private String columna;
    @Column(name = "VALOR", nullable = false, insertable = false, updatable = false)
    private Integer valor;
    
    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;
    
    @Column(name = "ID_ESTATUS")
    private Integer idEstatus;

    public CatalogosPK getCatalogosPK() {
        return catalogosPK;
    }

    public void setCatalogosPK(CatalogosPK catalogosPK) {
        this.catalogosPK = catalogosPK;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    
    
}
