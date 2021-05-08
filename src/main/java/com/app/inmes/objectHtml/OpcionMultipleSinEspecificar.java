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
public class OpcionMultipleSinEspecificar implements ObjectHtml {

    private final CatalogosService catalogosService;
    
    @Autowired
    public OpcionMultipleSinEspecificar(CatalogosService catalogosService) {
        this.catalogosService = catalogosService;
    }

    @Override
    public String create(PreguntaDTO pregunta) {
        StringBuilder part = new StringBuilder();
        List<Catalogos> catalogos = catalogosService.findByTablaAndColumna(pregunta.getCatalogoTabla(), pregunta.getCatalogoColumna());
        String respuestaNormal = Objects.isNull(pregunta.getRespuesta()) ? "" : pregunta.getRespuesta();
        
        String fragmentoPregunta;
        
        for (Catalogos catalogo : catalogos) {
            String checked = respuestaNormal.contains(catalogo.getDescripcion()) ? "checked" : "";
            fragmentoPregunta = " <section class=\"row\">\n"
                    + " <div class=\"col-md-8\">\n"
                    + " <div class=\"form-group\">\n"
                    + " <input type=\"checkbox\" "
                    + "id=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " value=\"" + catalogo.getDescripcion() + "\" "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " maxlength=\"" + pregunta.getLongitudMaximaxCatalogo() + "\" "
                    + " aria-label=\"Checkbox for following text input\" " 
                    + checked + ">\n"
                    + " <label for=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\">"
                    + catalogo.getDescripcion() 
                    + " </label>\n"
                    + " </div>\n"
                    + " </div>\n"
                    + " </section>";
            part.append(fragmentoPregunta);
        }
        
        fragmentoPregunta = "</div></div><br/>";
        part.append(fragmentoPregunta);
        
        return part.toString();
    }

}
