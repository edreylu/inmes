/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.persistence.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Edward Reyes
 */
@Entity
@Table(name = "INMES")
public class Inmes {
    
    @Id
    @GeneratedValue
    @Column(name = "FOLIO_INMES")
    private Integer folioInmes;
    @Column(name = "NO_INMUEBLE")
    private Integer noInmueble;
    @Column(name = "NO_CENTRO_RESPONSABLE")
    private Integer noCentroResponsable;
    @Column(name = "FECHA_INICIO_REGISTRO")
    private Date fechaInicioRegistro;
    @Column(name = "FECHA_ACTUALIZACION")
    private Date fechaActualizacion;
    @Column(name = "FECHA_FINAL_REGISTRO")
    private Date fechaFinalRegistro;
    @Column(name = "USO_EDUCATIVO")
    private Integer usoEducativo;
    @Column(name = "ANIOS_ESCUELA")
    private Integer aniosEscuela;
    @Column(name = "DOCTO_DONACION")
    private Integer doctoDonacion;
    @Column(name = "DOCTO_PROTEC_CIVIL")
    private Integer doctoProtecCivil;
    @Column(name = "SUPERF_TOT_TERRENO")
    private Integer superfTotTerreno;
    @Column(name = "SUPERF_TOT_CONSTRUIDA")
    private Integer superfTotContruida;
    @Column(name = "SUPERF_TOT_CONST_AULAS")
    private Integer superfTotConstAulas;
    @Column(name = "EDIFICIOS")
    private Integer edificios;
    @Column(name = "ESCUELA_COMO_ALBERGUE")
    private Integer escuelaComoAlbergue;
    @Column(name = "ALUMNOS_EN_CONTINGENCIA")
    private Integer alumnosEnContigencia;
    @Column(name = "LUZ_ELECTRICA")
    private Integer luzElectrica;
    @Column(name = "TIPO_LUZ_ELECTRICA")
    private Integer tipoLuzElectrica;
    @Column(name = "DISTANCIA")
    private Integer distancia;
    @Column(name = "TIEMPO_HORAS")
    private Integer tiempoHoras;
    @Column(name = "TIEMPO_MINUTOS")
    private Integer tiempoMinutos;
    @Column(name = "TIPO_TRANSPORTE")
    private Integer tiempoTransporte;

    
    @OneToMany(mappedBy = "inmes")
    private List<Anexo> anexos;
    
    @OneToMany(mappedBy = "inmes")
    private List<EstadoFisicoConstruc> estadosFisicosConstruc;
    
    @OneToMany(mappedBy = "inmes")
    private List<LocalUtilizado> localesUtilizados;
    
    @OneToMany(mappedBy = "inmes")
    private List<MaterialPredominante> materialesPredominantes;
    
    @OneToMany(mappedBy = "inmes")
    private List<NivelEducativoAsociado> nivelesEduactivosAsociado;
    
    @OneToMany(mappedBy = "inmes")
    private List<ObraExterior> obrasExteriores;
    
    @OneToMany(mappedBy = "inmes")
    private List<Problematica> problematicas;
    
    @OneToMany(mappedBy = "inmes")
    private List<Servicio> servicios;
    
    @OneToMany(mappedBy = "inmes")
    private List<TipoInmueble> tiposInmuebles;
    
    @OneToOne(mappedBy = "inmes")
    private SinInmueble sinInmuebles;
    
    public Integer getFolioInmes() {
        return folioInmes;
    }

    public void setFolioInmes(Integer folioInmes) {
        this.folioInmes = folioInmes;
    }

    public Integer getNoInmueble() {
        return noInmueble;
    }

    public void setNoInmueble(Integer noInmueble) {
        this.noInmueble = noInmueble;
    }

    public Integer getNoCentroResponsable() {
        return noCentroResponsable;
    }

    public void setNoCentroResponsable(Integer noCentroResponsable) {
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

    public Integer getUsoEducativo() {
        return usoEducativo;
    }

    public void setUsoEducativo(Integer usoEducativo) {
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

    public List<Anexo> getAnexos() {
        return anexos;
    }

    public void setAnexos(List<Anexo> anexos) {
        this.anexos = anexos;
    }

    public List<EstadoFisicoConstruc> getEstadosFisicosConstruc() {
        return estadosFisicosConstruc;
    }

    public void setEstadosFisicosConstruc(List<EstadoFisicoConstruc> estadosFisicosConstruc) {
        this.estadosFisicosConstruc = estadosFisicosConstruc;
    }

    public List<LocalUtilizado> getLocalesUtilizados() {
        return localesUtilizados;
    }

    public void setLocalesUtilizados(List<LocalUtilizado> localesUtilizados) {
        this.localesUtilizados = localesUtilizados;
    }

    public List<MaterialPredominante> getMaterialesPredominantes() {
        return materialesPredominantes;
    }

    public void setMaterialesPredominantes(List<MaterialPredominante> materialesPredominantes) {
        this.materialesPredominantes = materialesPredominantes;
    }

    public List<NivelEducativoAsociado> getNivelesEduactivosAsociado() {
        return nivelesEduactivosAsociado;
    }

    public void setNivelesEduactivosAsociado(List<NivelEducativoAsociado> nivelesEduactivosAsociado) {
        this.nivelesEduactivosAsociado = nivelesEduactivosAsociado;
    }

    public List<ObraExterior> getObrasExteriores() {
        return obrasExteriores;
    }

    public void setObrasExteriores(List<ObraExterior> obrasExteriores) {
        this.obrasExteriores = obrasExteriores;
    }

    public List<Problematica> getProblematicas() {
        return problematicas;
    }

    public void setProblematicas(List<Problematica> problematicas) {
        this.problematicas = problematicas;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<TipoInmueble> getTiposInmuebles() {
        return tiposInmuebles;
    }

    public void setTiposInmuebles(List<TipoInmueble> tiposInmuebles) {
        this.tiposInmuebles = tiposInmuebles;
    }

    public SinInmueble getSinInmuebles() {
        return sinInmuebles;
    }

    public void setSinInmuebles(SinInmueble sinInmuebles) {
        this.sinInmuebles = sinInmuebles;
    }


    
    
}
