/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.objectHtml;

import com.app.inmes.catalogos.CatalogosDTO;
import com.app.inmes.catalogos.CatalogosService;
import com.app.inmes.persistence.entity.Catalogos;
import com.app.inmes.pregunta.PreguntaDTO;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Edward Reyes
 */
public class OpcionMultipleEspecificarOtro implements ObjectHtml {

    private final CatalogosService catalogosService;
    
    @Autowired
    public OpcionMultipleEspecificarOtro(CatalogosService catalogosService) {
        this.catalogosService = catalogosService;
    }

    @Override
    public String create(PreguntaDTO pregunta) {
        StringBuilder part = new StringBuilder();
        List<Catalogos> catalogos = catalogosService.findByTablaAndColumna(pregunta.getCatalogoTabla(),pregunta.getCatalogoColumna());
        String respuestaNormal = Objects.isNull(pregunta.getRespuesta()) ? "" : pregunta.getRespuesta();
        String respuestaEspecifica = Objects.isNull(pregunta.getRespuestaEspecifica()) ? ""
                : pregunta.getRespuestaEspecifica();
        String display = pregunta.getIdPreguntaRef() == 0 ? "block" : "none";
        int maxLenght = 0;
        String validaNumericos = "";
        //condicionaes para valores de tipo de dato y maxlenght
        if (Objects.nonNull(pregunta.getTipoDeDatoOtro())) {
                 validaNumericos = !pregunta.getTipoDeDatoOtro()
                    .equalsIgnoreCase("VARCHAR2") ? "onkeypress='return validaNumericos(event)'" : "";
        }
        if (Objects.nonNull(pregunta.getLongitudMaximaOtro())) {
            maxLenght = pregunta.getLongitudMaximaOtro() == 0
                    ? 10 : pregunta.getLongitudMaximaOtro();
        } else {
            maxLenght = 10;
        }
        
        String fragmentoPregunta = " <div id=\"preguntas[" + pregunta.getNoPregunta() + "].idPregunta_omeo\" "
                + " style=\"display:" + display + "\">";
        part.append(fragmentoPregunta);
        
        for (Catalogos catalogo : catalogos) {
            String checked = respuestaNormal.contains(catalogo.getValor().toString()) ? "checked" : "";
            fragmentoPregunta = " <section class=\"row\">\n"
                    + " <div class=\"col-md-8\">\n"
                    + " <div class=\"form-group\">\n"
                    + " <input type=\"checkbox\" "
                    + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " onclick=\"getOmeo(\'" 
                    + catalogo.getDescripcion() + "'," 
                    + pregunta.getNoPregunta() + ")\" "
                    + " value=\"" + catalogo.getValor()+ "\" "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " aria-label=\"Checkbox for following text input\" " 
                    + checked + ">\n"
                    + " <label for=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\">"
                    + catalogo.getDescripcion() 
                    + "</label>\n"
                    + " </div>\n"
                    + " </div>\n"
                    + " </section>";
            part.append(fragmentoPregunta);
        }
        
        display = !respuestaEspecifica.equals("") ? "block" : "none";
        fragmentoPregunta = " <div class=\"col-md-8\">\n"
                + " <div class=\"form-group\">\n"
                + " <input type=\"text\" "
                + " style=\"display:" + display + "\" "
                + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                + " class=\"form-control\" "
                + " maxlength=\"" + maxLenght + "\" " + validaNumericos
                + " value=\"" + respuestaEspecifica + "\" "
                + " placeholder=\"Especificar\">"
                + "</div></div></div></div><br/></div>";
        part.append(fragmentoPregunta);
        
        return part.toString();
    }

}
