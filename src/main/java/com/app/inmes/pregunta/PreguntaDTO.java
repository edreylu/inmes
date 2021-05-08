/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.pregunta;

import com.app.inmes.inmes.InmesDTO;
import com.app.inmes.persistence.entity.Inmes;
import java.util.List;

/**
 *
 * @author Edward Reyes
 */
public class PreguntaDTO {
    
    private int noPregunta;
    private String pregunta;
    private String respuesta;
    private String respuestaEspecifica;
    private String tipoDeDatoxCatalogo;
    private int longitudMaximaxCatalogo;
    private int idPreguntaRef;
    private String tipoDeDatoOtro;
    private int longitudMaximaOtro;
    private String catalogoTabla;
    private String catalogoColumna;
    private Inmes inmes;

    public int getNoPregunta() {
        return noPregunta;
    }

    public void setNoPregunta(int noPregunta) {
        this.noPregunta = noPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
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

    public String getTipoDeDatoxCatalogo() {
        return tipoDeDatoxCatalogo;
    }

    public void setTipoDeDatoxCatalogo(String tipoDeDatoxCatalogo) {
        this.tipoDeDatoxCatalogo = tipoDeDatoxCatalogo;
    }

    public int getLongitudMaximaxCatalogo() {
        return longitudMaximaxCatalogo;
    }

    public void setLongitudMaximaxCatalogo(int longitudMaximaxCatalogo) {
        this.longitudMaximaxCatalogo = longitudMaximaxCatalogo;
    }

    public int getIdPreguntaRef() {
        return idPreguntaRef;
    }

    public void setIdPreguntaRef(int idPreguntaRef) {
        this.idPreguntaRef = idPreguntaRef;
    }

    public String getTipoDeDatoOtro() {
        return tipoDeDatoOtro;
    }

    public void setTipoDeDatoOtro(String tipoDeDatoOtro) {
        this.tipoDeDatoOtro = tipoDeDatoOtro;
    }

    public int getLongitudMaximaOtro() {
        return longitudMaximaOtro;
    }

    public void setLongitudMaximaOtro(int longitudMaximaOtro) {
        this.longitudMaximaOtro = longitudMaximaOtro;
    }

    public String getCatalogoTabla() {
        return catalogoTabla;
    }

    public void setCatalogoTabla(String catalogoTabla) {
        this.catalogoTabla = catalogoTabla;
    }

    public String getCatalogoColumna() {
        return catalogoColumna;
    }

    public void setCatalogoColumna(String catalogoColumna) {
        this.catalogoColumna = catalogoColumna;
    }

    public Inmes getInmes() {
        return inmes;
    }

    public void setInmes(Inmes inmes) {
        this.inmes = inmes;
    }

    
}
