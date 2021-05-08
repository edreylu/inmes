/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.objectHtml;

import com.app.inmes.pregunta.PreguntaDTO;
import java.util.Objects;

/**
 *
 * @author Edward Reyes
 */
public class OpcionTextoLibre implements ObjectHtml {


    @Override
    public String create(PreguntaDTO pregunta) {
        String respuestaNormal = Objects.isNull(pregunta.getRespuesta()) ? "" : pregunta.getRespuesta();
        int maxLenght = 0;
        String numeric = "";
        //condicionaes para valores de tipo de dato y maxlenght
        if (Objects.nonNull(pregunta.getTipoDeDatoOtro())) {
            numeric = !pregunta.getTipoDeDatoOtro()
                    .equalsIgnoreCase("VARCHAR2") ? "number" : "text";
        }
        if (Objects.nonNull(pregunta.getLongitudMaximaOtro())) {
            maxLenght = pregunta.getLongitudMaximaOtro() == 0
                    ? 10 : pregunta.getLongitudMaximaOtro();
        } else {
            maxLenght = 10;
        }
        
        String fragmentoPregunta = 
                  " <section class=\"row\">\n"
                + " <div class=\"col-md-8\">\n"
                + " <div class=\"form-group\">\n"
                + " <input type=\""+ numeric +"\" "
                + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                + " class=\"form-control\" "
                + " maxlength=\"" + maxLenght + "\" "
                + " placeholder=\"ESCRIBE RESPUESTA\" "
                + " value=\"" + respuestaNormal + "\" "
                + " required>\n"
                + " <div class=\"invalid-feedback\">La opcion es requerida</div>"
                + " </div>\n"
                + " </div>\n"
                + " </section></div></div><br/> \n";
        return fragmentoPregunta;
    }

}
