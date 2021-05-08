/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.inmes;

import java.util.Date;

/**
 *
 * @author Edward Reyes
 */
public class InmesDTO {
    
    private int folioInmes;
    private int noInmueble;
    private int noCentroResponsable;
    private Date fechaInicioRegistro;
    private Date fechaActualizacion;
    private Date fechaFinalRegistro;
    private int usoEducativo;
    private Integer aniosEscuela;
    private Integer doctoDonacion;
    private Integer doctoProtecCivil;
    private Integer superfTotTerreno;
    private Integer superfTotContruida;
    private Integer superfTotConstAulas;
    private Integer edificios;
    private Integer escuelaComoAlbergue;
    private Integer alumnosEnContigencia;
    private Integer luzElectrica;
    private Integer tipoLuzElectrica;
    private Integer distancia;
    private Integer tiempoHoras;
    private Integer tiempoMinutos;
    private Integer tiempoTransporte;

    public InmesDTO() {
    }

    
    public InmesDTO(int folioInmes, int noInmueble, int noCentroResponsable, int usoEducativo) {
        this.folioInmes = folioInmes;
        this.noInmueble = noInmueble;
        this.noCentroResponsable = noCentroResponsable;
        this.usoEducativo = usoEducativo;
    }
    
    public int getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(int folioInmes) {
        this.folioInmes = folioInmes;
    }

    public int getNoInmueble() {
        return noInmueble;
    }

    public void setNoInmueble(int noInmueble) {
        this.noInmueble = noInmueble;
    }

    public int getNoCentroResponsable() {
        return noCentroResponsable;
    }

    public void setNoCentroResponsable(int noCentroResponsable) {
        this.noCentroResponsable = noCentroResponsable;
    }

    public Date getFechaInicioRegistro() {
        return fechaInicioRegistro;
    }

    public void setFechaInicioRegistro(Date fechaInicioRegistro) {
        this.fechaInicioRegistro = fechaInicioRegistro;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaFinalRegistro() {
        return fechaFinalRegistro;
    }

    public void setFechaFinalRegistro(Date fechaFinalRegistro) {
        this.fechaFinalRegistro = fechaFinalRegistro;
    }

    public int getUsoEducativo() {
        return usoEducativo;
    }

    public void setUsoEducativo(int usoEducativo) {
        this.usoEducativo = usoEducativo;
    }

    public Integer getAniosEscuela() {
        return aniosEscuela;
    }

    public void setAniosEscuela(Integer aniosEscuela) {
        this.aniosEscuela = aniosEscuela;
    }

    public Integer getDoctoDonacion() {
        return doctoDonacion;
    }

    public void setDoctoDonacion(Integer doctoDonacion) {
        this.doctoDonacion = doctoDonacion;
    }

    public Integer getDoctoProtecCivil() {
        return doctoProtecCivil;
    }

    public void setDoctoProtecCivil(Integer doctoProtecCivil) {
        this.doctoProtecCivil = doctoProtecCivil;
    }

    public Integer getSuperfTotTerreno() {
        return superfTotTerreno;
    }

    public void setSuperfTotTerreno(Integer superfTotTerreno) {
        this.superfTotTerreno = superfTotTerreno;
    }

    public Integer getSuperfTotContruida() {
        return superfTotContruida;
    }

    public void setSuperfTotContruida(Integer superfTotContruida) {
        this.superfTotContruida = superfTotContruida;
    }

    public Integer getSuperfTotConstAulas() {
        return superfTotConstAulas;
    }

    public void setSuperfTotConstAulas(Integer superfTotConstAulas) {
        this.superfTotConstAulas = superfTotConstAulas;
    }

    public Integer getEdificios() {
        return edificios;
    }

    public void setEdificios(Integer edificios) {
        this.edificios = edificios;
    }

    public Integer getEscuelaComoAlbergue() {
        return escuelaComoAlbergue;
    }

    public void setEscuelaComoAlbergue(Integer escuelaComoAlbergue) {
        this.escuelaComoAlbergue = escuelaComoAlbergue;
    }

    public Integer getAlumnosEnContigencia() {
        return alumnosEnContigencia;
    }

    public void setAlumnosEnContigencia(Integer alumnosEnContigencia) {
        this.alumnosEnContigencia = alumnosEnContigencia;
    }

    public Integer getLuzElectrica() {
        return luzElectrica;
    }

    public void setLuzElectrica(Integer luzElectrica) {
        this.luzElectrica = luzElectrica;
    }

    public Integer getTipoLuzElectrica() {
        return tipoLuzElectrica;
    }

    public void setTipoLuzElectrica(Integer tipoLuzElectrica) {
        this.tipoLuzElectrica = tipoLuzElectrica;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Integer getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(Integer tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    public Integer getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(Integer tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }

    public Integer getTiempoTransporte() {
        return tiempoTransporte;
    }

    public void setTiempoTransporte(Integer tiempoTransporte) {
        this.tiempoTransporte = tiempoTransporte;
    }
    
    
    
}