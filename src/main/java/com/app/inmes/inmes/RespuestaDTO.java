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
public class RespuestaDTO {
    
    
    private String respuesta;
    private String respuestaEspecifica;
    private InmesDTO inmes;
    private AnexoDTO anexo;
    private EstadoFisicoConstrucDTO estadoFisicoConstruc;
    private LocalUtilizadoDTO localUtilizado;
    private MaterialPredominanteDTO materialPredominante;
    private NivelEducativoAsociadoDTO nivelEducativoAsociado;
    private ObraExteriorDTO obraExterior;
    private ProblematicaDTO problematica;
    private ServicioDTO servicio;
    private SinInmuebleDTO sinInmueble;
    private TipoInmuebleDTO tipoInmueble;

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuestaEspecifica() {
        return respuestaEspecifica;
    }

    public void setRespuestaEspecifica(String respuestaEspecifica) {
        this.respuestaEspecifica = respuestaEspecifica;
    }

    public InmesDTO getInmes() {
        return inmes;
    }

    public void setInmes(InmesDTO inmes) {
        this.inmes = inmes;
    }

    public AnexoDTO getAnexo() {
        return anexo;
    }

    public void setAnexo(AnexoDTO anexo) {
        this.anexo = anexo;
    }

    public EstadoFisicoConstrucDTO getEstadoFisicoConstruc() {
        return estadoFisicoConstruc;
    }

    public void setEstadoFisicoConstruc(EstadoFisicoConstrucDTO estadoFisicoConstruc) {
        this.estadoFisicoConstruc = estadoFisicoConstruc;
    }

    public LocalUtilizadoDTO getLocalUtilizado() {
        return localUtilizado;
    }

    public void setLocalUtilizado(LocalUtilizadoDTO localUtilizado) {
        this.localUtilizado = localUtilizado;
    }

    public MaterialPredominanteDTO getMaterialPredominante() {
        return materialPredominante;
    }

    public void setMaterialPredominante(MaterialPredominanteDTO materialPredominante) {
        this.materialPredominante = materialPredominante;
    }

    public NivelEducativoAsociadoDTO getNivelEducativoAsociado() {
        return nivelEducativoAsociado;
    }

    public void setNivelEducativoAsociado(NivelEducativoAsociadoDTO nivelEducativoAsociado) {
        this.nivelEducativoAsociado = nivelEducativoAsociado;
    }

    public ObraExteriorDTO getObraExterior() {
        return obraExterior;
    }

    public void setObraExterior(ObraExteriorDTO obraExterior) {
        this.obraExterior = obraExterior;
    }

    public ProblematicaDTO getProblematica() {
        return problematica;
    }

    public void setProblematica(ProblematicaDTO problematica) {
        this.problematica = problematica;
    }

    public ServicioDTO getServicio() {
        return servicio;
    }

    public void setServicio(ServicioDTO servicio) {
        this.servicio = servicio;
    }

    public SinInmuebleDTO getSinInmueble() {
        return sinInmueble;
    }

    public void setSinInmueble(SinInmuebleDTO sinInmueble) {
        this.sinInmueble = sinInmueble;
    }

    public TipoInmuebleDTO getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(TipoInmuebleDTO tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }
    
}
