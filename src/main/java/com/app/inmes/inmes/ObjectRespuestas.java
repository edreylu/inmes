/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.inmes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObjectRespuestas {
List<RespuestaDTO> respuestas = new ArrayList<>();

    public ObjectRespuestas() {
        respuestas = new ArrayList<>();
    }

    public List<RespuestaDTO> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<RespuestaDTO> respuestas) {
        this.respuestas = respuestas;
    }

    

}
