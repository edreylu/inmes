/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.objectHtml;

import com.app.inmes.catalogos.CatalogosService;
import com.app.inmes.inmes.EstadoFisicoConstrucDTO;
import com.app.inmes.inmes.EstadoFisicoConstrucService;
import com.app.inmes.persistence.entity.Anexo;
import com.app.inmes.persistence.entity.Catalogos;
import com.app.inmes.persistence.entity.EstadoFisicoConstruc;
import com.app.inmes.persistence.entity.Inmes;
import com.app.inmes.pregunta.PreguntaDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Edward Reyes
 */
public class TablaAnexo implements ObjectHtml{

    private final CatalogosService catalogosService;
    @Autowired
    private EstadoFisicoConstrucService  estadoFisicoConstrucService;

    @Autowired
    public TablaAnexo(CatalogosService catalogosService) {
        this.catalogosService = catalogosService;
    }
    
    @Override
    public String create(PreguntaDTO pregunta) {
        
        StringBuilder part = new StringBuilder();
        List<Catalogos> catalogosTipoAnexo = catalogosService.findByTablaAndColumna("ANEXO", "TIPO_ANEXO");
        List<Anexo> anexos = Objects.isNull(pregunta.getInmes().getAnexos()) ? new ArrayList<>() : pregunta.getInmes().getAnexos();
        System.out.println("numero de Anexos: "+anexos.size());
        String fragmentoPregunta = "";
        fragmentoPregunta
                = " <section class=\"row\">\n"
                + "  <div class=\"col-md-12\">\n"
                + "  <div class=\"form-group\">\n"
                + "  <div id=\"accordion\">";
        part.append(fragmentoPregunta);
        for (Catalogos catalogo : catalogosTipoAnexo) {
            List<Catalogos> catalogosSubTipoAnexo = catalogosService.findByTablaAndColumna("ANEXO", "SUBTIPO_ANEXO")
                    .stream()
                    .filter((cat) -> cat.getValor() > catalogo.getValor() && cat.getValor() < catalogo.getValor()+100)
                    .collect(Collectors.toList());
            int val = catalogo.getValor();
        
        fragmentoPregunta = " <div class=\"card\">\n"
                    + "        <div class=\"card-header\" id=\"heading" + val + "\">\n"
                    + "        <h5 class=\"mb-0\">\n"
                    + "        <button type=\"button\" style=\"color: transparent; -webkit-text-stroke: 1.5px black;\" class=\"btn btn-link collapsed\" data-toggle=\"collapse\" data-target=\"#collapse" + val + "\" aria-expanded=\"true\" aria-controls=\"collapse" + val + "\">\n"
                    + "          " + catalogo.getDescripcion()
                    + "        </button>\n"
                    + "        </h5>\n"
                    + "        </div><div id=\"collapse" + val+ "\" class=\"collapse\" aria-labelledby=\"heading" + val + "\" data-parent=\"#accordion\">\n"
                    + "      <div class=\"card-body\">"
                    + "<center><b class=\"tituloPrincipal\">" + catalogo.getDescripcion() + "</b></center> "
                    + "</br><table class=\"table table-bordered tablaAnexo\">\n" +
"                    <thead>\n" +
"                        <tr>\n" +
"                            <th style=\"width:20%\">  </th>\n" +
"                            <th style=\"width:15%\">BUENO</th>\n" +
"                            <th style=\"width:15%\">MALO</th>\n" +
"                            <th style=\"width:15%\">REGULAR</th>\n" +
"                            <th style=\"width:15%\">N/A</th>\n" +
"                            <th style=\"width:20%\">UTILIZADOS POR TODOS LOS C.T.</th>\n" +
"                        </tr>\n" +
"                    </thead>\n" +
"                    <tbody>\n";
                
                part.append(fragmentoPregunta);
                for(Catalogos catalogoSubTipo : catalogosSubTipoAnexo){
                    
fragmentoPregunta = "<tr><td style=\"width:20%\">\n" +
"                                "+catalogoSubTipo.getDescripcion()+"\n" +
"                            </td>\n" +
"                            <td style=\"width:15%\">\n" +
"                                <input id=\"bueno"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\" type=\"number\" min=\"0\" class=\"form-control\" required/>\n" +
"                            </td>\n" +
"                            <td style=\"width:15%\">\n" +
"                                <input id=\"regular"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\" type=\"number\" min=\"0\" class=\"form-control\" required/>\n" +
"                            </td>\n" +
"                            <td style=\"width:15%\">\n" +
"                                <input id=\"malo"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\" type=\"number\" min=\"0\" class=\"form-control\" required/>\n" +
"                            </td>\n" +
"                            <td style=\"width:15%\">\n" +
"                                <input id=\"na"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\" type=\"number\" min=\"0\" class=\"form-control\" required/>\n" +
"                            </td>\n" +
"                            <td style=\"width:20%\">\n" +
"                                <div class=\"custom-control custom-switch\">\n" +
"                                    <center>\n" +
"                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"utilizadosTodosCt"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\">\n" +
"                                    <label class=\"custom-control-label\" for=\"utilizadosTodosCt"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\"></label>\n" +
"                                    </center>\n" +
"                                  </div>\n" +
"                            </td> </tr> \n"+
"                            <tr>\n" +
"                            <td style=\"width:20%\">\n" +
"                                SUPERFICIE (Mts2)\n" +
"                            </td>\n" +
"                            <td style=\"width:15%\">\n" +
"                                <input id=\"superficieBueno"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\" type=\"number\" min=\"0\" class=\"form-control\" required/>\n" +
"                            </td>\n" +
"                            <td style=\"width:15%\">\n" +
"                                <input id=\"superficieRegular"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\" type=\"number\" min=\"0\" class=\"form-control\" required/>\n" +
"                            </td>\n" +
"                            <td style=\"width:15%\">\n" +
"                                <input id=\"superficieMalo"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\" type=\"number\" min=\"0\" class=\"form-control\" required/>\n" +
"                            </td>\n" +
"                            <td style=\"width:15%\">\n" +
"                                <input id=\"superficieNa"+catalogoSubTipo.getDescripcion()+""+catalogoSubTipo.getValor()+"\" type=\"number\" min=\"0\" class=\"form-control\" required/>\n" +
"                            </td>\n" +
"                            <td style=\"width:20%\">\n" +
"                            </td>\n" +
"                        </tr>\n";
        part.append(fragmentoPregunta);
        }
                
fragmentoPregunta = "   </tbody>\n"
                    + "  </table></br> "
                    + "            </div>\n"
                    + "            </div>\n"
                    + "            </div>";
        
        part.append(fragmentoPregunta);
            fragmentoPregunta = "";
         }
        
        fragmentoPregunta = "</div></div>\n"
                + " </div>\n"
                + " </section></div></div><br/>";
        part.append(fragmentoPregunta);
        return part.toString();
    }
    
}
