package com.app.inmes.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "VM_CENTROS_DE_TRABAJO")
public class CentroTrabajo {

    @Id
    @Column(name = "NO_INMUEBLE", nullable = false)
    private Integer noInmueble;

    @Column(name = "CLAVE_INMUEBLE")
    private String claveInmueble;

    @Column(name = "NO_CENTRO")
    private Integer noCentro;

    @Column(name = "CLAVE_AREA")
    private String claveArea;

    @Column(name = "NOMBRE_CT")
    private String nombreCt;

    @Column(name = "ESTATUS")
    private Integer estatus;

    @Column(name = "ESTATUS_DESC")
    private String estatusDesc;

    @Column(name = "NO_TURNO")
    private Integer noTurno;

    @Column(name = "TURNO")
    private String turno;

    @Column(name = "HORARIO_INICIO")
    private String horarioInicio;

    @Column(name = "HORARIO_FINAL")
    private String horarioFinal;

    @Column(name = "NO_TIPOAREA")
    private Integer noTipoArea;

    @Column(name = "TIPO_AREA")
    private String tipoArea;

    @Column(name = "NO_NIVEL")
    private Integer noNivel;

    @Column(name = "NIVEL")
    private String nivel;

    @Column(name = "NO_SUBNIVEL")
    private Integer noSubNivel;

    @Column(name = "SUBNIVEL")
    private String subNivel;

    @Column(name = "EXPEDIENTE_RESPONSABLE_CT")
    private Integer expedienteResponsableCt;

    @Column(name = "NOMBRE_RESPONSABLE_CT")
    private String nombreResponsableCt;

    @Column(name = "CLAVE_PAIS")
    private Integer clavePais;

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "CLAVE_ENTIDAD")
    private Integer claveEntidad;

    @Column(name = "ENTIDAD")
    private String entidad;

    @Column(name = "CLAVE_MUNICIPIO")
    private Integer claveMunicipio;

    @Column(name = "MUNICIPIO")
    private String municipio;

    @Column(name = "CLAVE_LOCALIDAD")
    private Integer claveLocalidad;

    @Column(name = "LOCALIDAD")
    private String localidad;

    @Column(name = "NO_ASENTAMIENTO")
    private Integer noAsentamiento;

    @Column(name = "ASENTAMIENTO_DESC")
    private String asentamientoDesc;

    @Column(name = "CODIGO_POSTAL")
    private String codigoPostal;

    @Column(name = "TIPO_ASENTAMIENTO")
    private String tipoAsentamiento;

    @Column(name = "TIPO_ASENTAMIENTO_DESC")
    private String tipoAsentamientoDesc;

    @Column(name = "CALLE")
    private String calle;

    @Column(name = "NO_INTERIOR")
    private String noInterior;

    @Column(name = "NO_EXTERIOR")
    private String noExterior;

    @Column(name = "ENTRE_CALLE")
    private String entreCalle;

    @Column(name = "Y_CALLE")
    private String yCalle;

    @Column(name = "CALLE_POSTERIOR")
    private String callePosterior;

    @Column(name = "LONGITUD")
    private String longitud;

    @Column(name = "LATITUD")
    private String latitud;

    @Column(name = "ALTITUD")
    private Integer altitud;

    @Column(name = "TELEFONO1")
    private String telefono1;

    @Column(name = "TELEFONO2")
    private String telefono2;

    @Column(name = "TEL_MOVIL")
    private String telMovil;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @Column(name = "ZONA_VOLCANICA")
    private String zonaVolcanica;

    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public Integer getNoInmueble() {
        return noInmueble;
    }

    public void setNoInmueble(Integer noInmueble) {
        this.noInmueble = noInmueble;
    }

    public String getClaveInmueble() {
        return claveInmueble;
    }

    public void setClaveInmueble(String claveInmueble) {
        this.claveInmueble = claveInmueble;
    }

    public Integer getNoCentro() {
        return noCentro;
    }

    public void setNoCentro(Integer noCentro) {
        this.noCentro = noCentro;
    }

    public String getClaveArea() {
        return claveArea;
    }

    public void setClaveArea(String claveArea) {
        this.claveArea = claveArea;
    }

    public String getNombreCt() {
        return nombreCt;
    }

    public void setNombreCt(String nombreCt) {
        this.nombreCt = nombreCt;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public String getEstatusDesc() {
        return estatusDesc;
    }

    public void setEstatusDesc(String estatusDesc) {
        this.estatusDesc = estatusDesc;
    }

    public Integer getNoTurno() {
        return noTurno;
    }

    public void setNoTurno(Integer noTurno) {
        this.noTurno = noTurno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public Integer getNoTipoArea() {
        return noTipoArea;
    }

    public void setNoTipoArea(Integer noTipoArea) {
        this.noTipoArea = noTipoArea;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    public Integer getNoNivel() {
        return noNivel;
    }

    public void setNoNivel(Integer noNivel) {
        this.noNivel = noNivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Integer getNoSubNivel() {
        return noSubNivel;
    }

    public void setNoSubNivel(Integer noSubNivel) {
        this.noSubNivel = noSubNivel;
    }

    public String getSubNivel() {
        return subNivel;
    }

    public void setSubNivel(String subNivel) {
        this.subNivel = subNivel;
    }

    public Integer getExpedienteResponsableCt() {
        return expedienteResponsableCt;
    }

    public void setExpedienteResponsableCt(Integer expedienteResponsableCt) {
        this.expedienteResponsableCt = expedienteResponsableCt;
    }

    public String getNombreResponsableCt() {
        return nombreResponsableCt;
    }

    public void setNombreResponsableCt(String nombreResponsableCt) {
        this.nombreResponsableCt = nombreResponsableCt;
    }

    public Integer getClavePais() {
        return clavePais;
    }

    public void setClavePais(Integer clavePais) {
        this.clavePais = clavePais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getClaveEntidad() {
        return claveEntidad;
    }

    public void setClaveEntidad(Integer claveEntidad) {
        this.claveEntidad = claveEntidad;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Integer getClaveMunicipio() {
        return claveMunicipio;
    }

    public void setClaveMunicipio(Integer claveMunicipio) {
        this.claveMunicipio = claveMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Integer getClaveLocalidad() {
        return claveLocalidad;
    }

    public void setClaveLocalidad(Integer claveLocalidad) {
        this.claveLocalidad = claveLocalidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Integer getNoAsentamiento() {
        return noAsentamiento;
    }

    public void setNoAsentamiento(Integer noAsentamiento) {
        this.noAsentamiento = noAsentamiento;
    }

    public String getAsentamientoDesc() {
        return asentamientoDesc;
    }

    public void setAsentamientoDesc(String asentamientoDesc) {
        this.asentamientoDesc = asentamientoDesc;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTipoAsentamiento() {
        return tipoAsentamiento;
    }

    public void setTipoAsentamiento(String tipoAsentamiento) {
        this.tipoAsentamiento = tipoAsentamiento;
    }

    public String getTipoAsentamientoDesc() {
        return tipoAsentamientoDesc;
    }

    public void setTipoAsentamientoDesc(String tipoAsentamientoDesc) {
        this.tipoAsentamientoDesc = tipoAsentamientoDesc;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoInterior() {
        return noInterior;
    }

    public void setNoInterior(String noInterior) {
        this.noInterior = noInterior;
    }

    public String getNoExterior() {
        return noExterior;
    }

    public void setNoExterior(String noExterior) {
        this.noExterior = noExterior;
    }

    public String getEntreCalle() {
        return entreCalle;
    }

    public void setEntreCalle(String entreCalle) {
        this.entreCalle = entreCalle;
    }

    public String getyCalle() {
        return yCalle;
    }

    public void setyCalle(String yCalle) {
        this.yCalle = yCalle;
    }

    public String getCallePosterior() {
        return callePosterior;
    }

    public void setCallePosterior(String callePosterior) {
        this.callePosterior = callePosterior;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public Integer getAltitud() {
        return altitud;
    }

    public void setAltitud(Integer altitud) {
        this.altitud = altitud;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getTelMovil() {
        return telMovil;
    }

    public void setTelMovil(String telMovil) {
        this.telMovil = telMovil;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getZonaVolcanica() {
        return zonaVolcanica;
    }

    public void setZonaVolcanica(String zonaVolcanica) {
        this.zonaVolcanica = zonaVolcanica;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}