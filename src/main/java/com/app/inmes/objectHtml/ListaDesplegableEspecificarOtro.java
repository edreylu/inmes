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
public class ListaDesplegableEspecificarOtro implements ObjectHtml {

    private final CatalogosService catalogosService;

    @Autowired
    public ListaDesplegableEspecificarOtro(CatalogosService catalogosService) {
        this.catalogosService = catalogosService;
    }
    

    @Override
    public String create(PreguntaDTO pregunta) {
        StringBuilder part = new StringBuilder();
        List<Catalogos> catalogos = catalogosService.findByTablaAndColumna(pregunta.getCatalogoTabla(), pregunta.getCatalogoColumna());
        String respuestaNormal = Objects.isNull(pregunta.getRespuesta()) ? "" : pregunta.getRespuesta();
        String respuestaEspecifica = Objects.isNull(pregunta.getRespuestaEspecifica()) ? ""
                : pregunta.getRespuestaEspecifica();

        String fragmentoPregunta = 
                  " <section class=\"row\">\n"
                + " <div class=\"col-md-8\">\n"
                + " <select class=\"form-control\" "
                + " onchange=\"getOtroEspecificar(this," + pregunta.getNoPregunta() + ")\" "
                + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                + " value=\"" + respuestaNormal
                + "\" required>\n";
        part.append(fragmentoPregunta);

        for (Catalogos catalogo : catalogos) {
            String selected = respuestaNormal.equals(catalogo.getValor().toString()) ? "selected" : "";
            fragmentoPregunta = " <option value=\"" + catalogo.getValor()+ "\" "
                    + selected + ">"
                    + catalogo.getDescripcion()
                    + "</option>\n";
            part.append(fragmentoPregunta);
        }

        String display = !respuestaEspecifica.equals("") ? "block" : "none";

        fragmentoPregunta = " </select>"
                + " <div class=\"invalid-feedback\">La opcion es requerida</div> \n"
                + " <input type=\"text\" "
                + " style=\"display:" + display + "\" "
                + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                + " class=\"form-control\" "
                + " maxlength=\"128\" "
                + " value=\"" + respuestaEspecifica + "\""
                + " placeholder=\"Especificar\" >\n"
                + " </div>\n"
                + " </section></div></div><br/>";
        part.append(fragmentoPregunta);

        return part.toString();
    }


}
