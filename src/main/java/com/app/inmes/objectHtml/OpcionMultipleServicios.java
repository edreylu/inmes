/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.objectHtml;

import com.app.inmes.catalogos.CatalogosService;
import com.app.inmes.persistence.entity.Catalogos;
import com.app.inmes.pregunta.PreguntaDTO;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Edward Reyes
 */
public class OpcionMultipleServicios implements ObjectHtml{
    
    private final CatalogosService catalogosService;
    
    @Autowired
    public OpcionMultipleServicios(CatalogosService catalogosService) {
        this.catalogosService = catalogosService;
    }

    @Override
    public String create(PreguntaDTO pregunta) {
        StringBuilder part = new StringBuilder();
        List<Catalogos> catalogosTipoServicio = catalogosService.findByTablaAndColumna("SERVICIO","TIPO_SERVICIO");
        String respuestaNormal = "";
        String respuestaEspecifica = "";
        String display = "block";
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
        
        String checked = "";
        String fragmentoPregunta = " <div id=\"preguntas[" + pregunta.getNoPregunta() + "].idPregunta_omeo\" "
                + " style=\"display:" + display + "\">"
                + "</br><table class=\"table table-bordered \">\n" +
"                    <thead>\n" +
"                        <tr>\n" +
"                            <th style=\"width:40%\">  </th>\n" +
"                            <th style=\"width:30%\">LOCALIDAD</th>\n" +
"                            <th style=\"width:30%\">INMUEBLE</th>\n" +
"                        </tr>\n" +
"                    </thead><tbody>\n";
        part.append(fragmentoPregunta);
        for (Catalogos catalogo : catalogosTipoServicio) {
            
        List<Catalogos> catalogosSubTipoServicio = catalogosService.findByTablaAndColumna("SERVICIO","SUBTIPO_SERVICIO")
                .stream()
                .filter((t) ->  t.getValor() > catalogo.getValor() && t.getValor() < catalogo.getValor()+10)
                    .collect(Collectors.toList());
        if(catalogosSubTipoServicio.isEmpty()){
            fragmentoPregunta = "<tr> <td style=\"width:40%\">\n"
                    + " <b style=\"font-weight: bold;\">" + catalogo.getDescripcion() + "</b></td>"
                    + "<td style=\"width:30%\"> <input type=\"checkbox\" "
                    + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " onclick=\"getOmeo(\'" 
                    + catalogo.getDescripcion() + "'," 
                    + pregunta.getNoPregunta() + ")\" "
                    + " value=\"" + catalogo.getDescripcion() + " "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " aria-label=\"Checkbox for following text input\" " 
                    + checked + ">\n"
                    + " <label for=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\">"
                    + "LOCALIDAD"
                    + "</label></td>\n"
                     + " <td style=\"width:30%\"> <input type=\"checkbox\" "
                    + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " onclick=\"getOmeo(\'" 
                    + catalogo.getDescripcion() + "'," 
                    + pregunta.getNoPregunta() + ")\" "
                    + " value=\"" + catalogo.getDescripcion() + " "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " aria-label=\"Checkbox for following text input\" " 
                    + checked + ">\n"
                    + " <label for=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\">"
                    + "INMUEBLE"
                    + "</label></td>\n"
                    + " </tr>";
            part.append(fragmentoPregunta);
        }else{
        fragmentoPregunta = "<tr> <td style=\"width:40%\"> <b style=\"font-weight: bold;\">" + catalogo.getDescripcion() + "</b></td><td style=\"width:30%\"></td><td style=\"width:30%\"></td></tr>";
        part.append(fragmentoPregunta);
        for (Catalogos catalogoSubtipo : catalogosSubTipoServicio) {
            fragmentoPregunta = " <tr> <td style=\"width:40%\">\n"
                    + " " + catalogoSubtipo.getDescripcion() + "</td>"
                    + " <td style=\"width:30%\"><input type=\"checkbox\" "
                    + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " onclick=\"getOmeo(\'" 
                    + catalogoSubtipo.getDescripcion() + "'," 
                    + pregunta.getNoPregunta() + ")\" "
                    + " value=\"" + catalogoSubtipo.getDescripcion() + " "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " aria-label=\"Checkbox for following text input\" " 
                    + checked + ">\n"
                    + " <label for=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\">"
                    + " LOCALIDAD</label></td>\n"
                    + " <td style=\"width:30%\"><input type=\"checkbox\" "
                    + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " onclick=\"getOmeo(\'" 
                    + catalogoSubtipo.getDescripcion() + "'," 
                    + pregunta.getNoPregunta() + ")\" "
                    + " value=\"" + catalogoSubtipo.getDescripcion() + " "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" "
                    + " aria-label=\"Checkbox for following text input\" " 
                    + checked + ">\n"
                    + " <label for=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\">"
                    + " INMUEBLE</label></td>\n"
                    + " </tr>";
            part.append(fragmentoPregunta);
        }
        }
        
        
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
                + "  </div></div> </tbody>\n"
                + "  </table></br> "
                + "</div></div><br/></div>";
        part.append(fragmentoPregunta);
        
        return part.toString();
    }
    
}
