/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.objectHtml;

import com.app.inmes.catalogos.CatalogosDTO;
import com.app.inmes.catalogos.CatalogosService;
import com.app.inmes.pregunta.PreguntaDTO;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Edward Reyes
 */
public class OpcionMultipleEspecificarCatalogo implements ObjectHtml {

    private final CatalogosService catalogosService;

    @Autowired
    public OpcionMultipleEspecificarCatalogo(CatalogosService catalogosService) {
        this.catalogosService = catalogosService;
    }

    @Override
    public String create(PreguntaDTO pregunta) {
        StringBuilder part = new StringBuilder();
        List<CatalogosDTO> catalogos = null;
        String respuestaNormal = Objects.isNull(pregunta.getRespuesta()) ? "" : pregunta.getRespuesta();
        String respuestaEspecifica = Objects.isNull(pregunta.getRespuestaEspecifica()) ? ""
                : pregunta.getRespuestaEspecifica();
        int maxLenght = 0;
        String validaNumericos = "";
        //condicionaes para valores de tipo de dato y maxlenght
        if (Objects.nonNull(pregunta.getTipoDeDatoxCatalogo())) {
            validaNumericos = !pregunta.getTipoDeDatoxCatalogo()
                    .equalsIgnoreCase("VARCHAR2") ? "onkeypress='return validaNumericos(event)'" : "";
        }
        if (Objects.nonNull(pregunta.getLongitudMaximaxCatalogo())) {
            maxLenght = pregunta.getLongitudMaximaxCatalogo() == 0
                    ? 10 : pregunta.getLongitudMaximaxCatalogo();
        } else {
            maxLenght = 10;
        }

        String fragmentoPregunta = 
                  " <section class=\"row\">\n"
                + "  <div class=\"col-md-8\">\n"
                + "  <div class=\"form-group\">\n";
        part.append(fragmentoPregunta);

        String[] elementsPipe = respuestaEspecifica.split("\\|", -1);
        int contador = 0;

        for (CatalogosDTO catalogo : catalogos) {
            String checked = respuestaNormal.contains(catalogo.getDescripcion()) ? "checked" : "";
            respuestaEspecifica = elementsPipe[contador];
            String display = !respuestaEspecifica.equals("") ? "block" : "none";
            String hasCase = catalogo.getDescripcion().equals("NO TIENE") ? "class=\"noTiene_"+pregunta.getNoPregunta()+"\" " 
                    : "class=\"case_"+pregunta.getNoPregunta()+"\" ";
            String hasCaseInput = catalogo.getDescripcion().equals("NO TIENE") ? "" : "caseIn_"+pregunta.getNoPregunta();
            fragmentoPregunta = " <div class=\"input-group mb-3\" id=\"check\">\n"
                    + " <div class=\"input-group-prepend\">\n"
                    + " <div class=\"input-group-text\">\n"
                    + " <input type=\"checkbox\" "
                    + " onclick=\"getOmec(\'"
                    + pregunta.getNoPregunta() + "',"
                    + " '" + catalogo.getColumna() + "','"
                    + catalogo.getDescripcion() + "')\" "
                    + " value=\"" + catalogo.getDescripcion() + "\" "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + hasCase
                    + " aria-label=\"Checkbox for following text input\" "
                    + checked + "> \n"
                    + " <div style=\"font: 12px Arial, Helvetica, sans-serif;\" >"
                    + catalogo.getDescripcion() + ": </div>\n"
                    + " </div>\n"
                    + " </div>\n"
                    + " <input type=\"text\" "
                    + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica_"
                    + catalogo.getColumna()+ "\" "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                    + " class=\"form-control "+ hasCaseInput+"\" "
                    + " maxlength=\"" + maxLenght + "\" "
                    + validaNumericos
                    + " value=\"" + respuestaEspecifica + "\" "
                    + " style=\"display:" + display + "\" "
                    + " aria-label=\"Text input with checkbox\">\n"
                    + " </div>\n";
            part.append(fragmentoPregunta);

            contador++;
        }
        fragmentoPregunta = " </div>\n"
                + " </div>\n"
                + " </section></div></div><br/>";
        part.append(fragmentoPregunta);

        return part.toString();
    }

}
