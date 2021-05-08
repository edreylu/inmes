/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.objectHtml;

import com.app.inmes.catalogos.CatalogosService;
import com.app.inmes.persistence.entity.Catalogos;
import com.app.inmes.persistence.entity.EstadoFisicoConstruc;
import com.app.inmes.persistence.entity.MaterialPredominante;
import com.app.inmes.persistence.repository.EstadoFisicoConstrucRepository;
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
public class TablaEstadoFisico implements ObjectHtml {

    private final CatalogosService catalogosService;

    @Autowired
    public TablaEstadoFisico(CatalogosService catalogosService) {
        this.catalogosService = catalogosService;
    }

    @Override
    public String create(PreguntaDTO pregunta) {

        StringBuilder part = new StringBuilder();
        List<Catalogos> catalogos = catalogosService.findByTablaAndColumna("ESTADO_FISICO_CONSTRUC", "TIPO_CONSTRUCCION");
        List<Catalogos> catalogosMaterialConstruccion = catalogosService.findByTablaAndColumna("MATERIAL_PREDOMINANTE", "TIPO_MATERIAL");
        
        String fragmentoPregunta = "";
        fragmentoPregunta
                = " <section class=\"row\">\n"
                + "  <div class=\"col-md-12\">\n"
                + "  <div class=\"form-group\">\n"
                + "  <div id=\"accordion\">";
        part.append(fragmentoPregunta);
        for (Catalogos catalogo : catalogos) {
            List<EstadoFisicoConstruc> estadoFisicoConstrucs = Objects.isNull(pregunta.getInmes().getEstadosFisicosConstruc()) ? new ArrayList<>() : pregunta.getInmes().getEstadosFisicosConstruc();
            estadoFisicoConstrucs = estadoFisicoConstrucs.stream().filter((t) -> {
                return t.getTipoConstruccion() == catalogo.getValor(); 
            }).collect(Collectors.toList());
            
            String buenoEducativo = "";
            String regularEducativo= "";
            String maloEducativo= "";
            String naEducativo= "";
            String buenoProvisionales= "";
            String regularProvisionales= "";
            String maloProvisionales= "";
            String naProvisionales= "";
            String buenoAdaptados = "";
            String regularAdaptados= "";
            String maloAdaptados= "";
            String naAdaptados= "";
            String buenoFueraInmueble = "";
            String regularFueraInmueble= "";
            String maloFueraInmueble= "";
            String naFueraInmueble= "";
            for(EstadoFisicoConstruc esf : estadoFisicoConstrucs){
             if(esf.getSubTipoConstruccion()==1){
             buenoEducativo = Objects.isNull(esf.getBueno()) ? "" : esf.getBueno().toString();
             regularEducativo= Objects.isNull(esf.getRegular().toString()) ? "" : esf.getRegular().toString();
             maloEducativo= Objects.isNull(esf.getMalo()) ? "" : esf.getMalo().toString();
             naEducativo= Objects.isNull(esf.getNoApto()) ? "" : esf.getNoApto().toString();
            }
            if(esf.getSubTipoConstruccion()==2){
             buenoProvisionales= Objects.isNull(esf.getBueno()) ? "" : esf.getBueno().toString();
             regularProvisionales= Objects.isNull(esf.getRegular()) ? "" : esf.getRegular().toString();
             maloProvisionales= Objects.isNull(esf.getMalo()) ? "" : esf.getMalo().toString();
             naProvisionales= Objects.isNull(esf.getNoApto()) ? "" : esf.getNoApto().toString();
            }
            if(esf.getSubTipoConstruccion()==3){
             buenoAdaptados = Objects.isNull(esf.getBueno()) ? "" : esf.getBueno().toString();
             regularAdaptados= Objects.isNull(esf.getRegular()) ? "" : esf.getRegular().toString();
             maloAdaptados= Objects.isNull(esf.getMalo()) ? "" : esf.getMalo().toString();
             naAdaptados= Objects.isNull(esf.getNoApto()) ? "" : esf.getNoApto().toString();
            }
            if(esf.getSubTipoConstruccion()==4){
             buenoFueraInmueble = Objects.isNull(esf.getBueno()) ? "" : esf.getBueno().toString();
             regularFueraInmueble= Objects.isNull(esf.getRegular()) ? "" : esf.getRegular().toString();
             maloFueraInmueble= Objects.isNull(esf.getMalo()) ? "" : esf.getMalo().toString();
             naFueraInmueble= Objects.isNull(esf.getNoApto()) ? "" : esf.getNoApto().toString();
            }
            }
            
            int val = catalogo.getValor();
            fragmentoPregunta = " <div class=\"card\">\n"
                    + "        <div class=\"card-header\" id=\"heading" + val + "\">\n"
                    + "        <h5 class=\"mb-0\">\n"
                    + "        <button type=\"button\" style=\"color: transparent; -webkit-text-stroke: 1.5px black;\" class=\"btn btn-link collapsed\" data-toggle=\"collapse\" data-target=\"#collapse" + val + "\" aria-expanded=\"true\" aria-controls=\"collapse" + val + "\">\n"
                    + "          " + catalogo.getDescripcion()
                    + "        </button>\n"
                    + "        </h5>\n"
                    + "        </div><div id=\"collapse" + val + "\" class=\"collapse\" aria-labelledby=\"heading" + val+ "\" data-parent=\"#accordion\">\n"
                    + "      <div class=\"card-body\">"
                    + "<center><b class=\"tituloPrincipal\">" + catalogo.getDescripcion() + "</b></center> "
                    + "</br><table class=\"table table-bordered tablaEstadoFisico\">\n"
                    + "                    <thead>\n"
                    + "                        <tr>\n"
                    + "                            <th style=\"width:40%\">  </th>\n"
                    + "                            <th style=\"width:12%\">BUENO</th>\n"
                    + "                            <th style=\"width:12%\">MALO</th>\n"
                    + "                            <th style=\"width:12%\">REGULAR</th>\n"
                    + "                            <th style=\"width:12%\">N/A</th>\n"
                    + "                            <th style=\"width:12%\">TOTAL</th>\n"
                    + "                        </tr>\n"
                    + "                    </thead>\n"
                    + "                    <tbody>\n"
                    + "                        <tr>\n"
                    + "                            <td style=\"width:40%\">\n"
                    + "                                CONSTRUIDOS PARA USO EDUCATIVO\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +buenoEducativo+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"buenoEducativo_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\"  class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +regularEducativo+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"regularEducativo_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +maloEducativo+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"maloEducativo_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +naEducativo+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"naEducativo_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input id=\"totalEducativo_" + val + "\" type=\"number\" disabled=\"true\" class=\"form-control\" required/>\n"
                    + "                            </td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td style=\"width:40%\">\n"
                    + "                                PROVISIONALES\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +buenoProvisionales+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"buenoProvisionales_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +regularProvisionales+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"regularProvisionales_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +maloProvisionales+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"maloProvisionales_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +naProvisionales+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"naProvisionales_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input id=\"totalProvisionales_" + val + "\" type=\"number\" disabled=\"true\" class=\"form-control\" required/>\n"
                    + "                            </td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td style=\"width:40%\">\n"
                    + "                                ADAPTADOS\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +buenoAdaptados+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"buenoAdaptados_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +regularAdaptados+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"regularAdaptados_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +maloAdaptados+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"maloAdaptados_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +naAdaptados+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"naAdaptados_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input id=\"totalAdaptados_" + val + "\" type=\"number\" disabled=\"true\" class=\"form-control\" required/>\n"
                    + "                            </td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td style=\"width:40%\">\n"
                    + "                                LOCALES FUERA DEL INMUEBLE PRINCIPAL\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +buenoFueraInmueble+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"buenoFueraInmueble_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +regularFueraInmueble+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"regularFueraInmueble_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +maloFueraInmueble+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"maloFueraInmueble_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input value=\"" +naFueraInmueble+ "\" name=\"respuestas[" + pregunta.getNoPregunta() + "].respuesta\" id=\"naFueraInmueble_" + val + "\" onchange=\"sumartotal(" + val + ")\" type=\"number\" min=\"0\" max=\"99\" class=\"form-control\" />\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input id=\"totalFueraInmueble_" + val + "\" type=\"number\" disabled=\"true\" class=\"form-control\" required/>\n"
                    + "                            </td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td style=\"width:40%\">\n"
                    + "                                TOTAL\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input id=\"totalBuenos_" + val + "\" type=\"number\" disabled=\"true\" class=\"form-control\" required/>\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input id=\"totalRegulares_" + val + "\" type=\"number\" disabled=\"true\" class=\"form-control\" required/>\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input id=\"totalmalos_" + val + "\" type=\"number\" disabled=\"true\" class=\"form-control\" required/>\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input id=\"totalNas_" + val + "\" type=\"number\" disabled=\"true\" class=\"form-control\" required/>\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:12%\">\n"
                    + "                                <input id=\"totalTotal_" + val + "\" type=\"number\" disabled=\"true\" class=\"form-control\" required/>\n"
                    + "                            </td>\n"
                    + "                        </tr>\n"
                    + "                    </tbody>\n"
                    + "                </table>\n"
                    + "            \n"
                    + "            <table>\n"
                    + "                <thead>\n"
                    + "                    <tr>\n"
                    + "                            <th style=\"width:40%\">  </th>\n"
                    + "                            <th style=\"width:20%\">MUROS</th>\n"
                    + "                            <th style=\"width:20%\">TECHOS</th>\n"
                    + "                            <th style=\"width:20%\">PISOS</th>\n"
                    + "                        </tr>\n"
                    + "                </thead>\n"
                    + "                <tbody>\n"
                    + "                    <tr>\n"
                    + "                            <td style=\"width:40%\">\n"
                    + "                                MATERIAL PREDOMINANTE DE LA CONSTRUCCION\n"
                    + "                            </td>\n"
                    + "                            <td style=\"width:20%\">\n"
                    + " <select class=\"form-control\" "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                    + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                    + " value=\"" + 1
                    + "\" required>\n";
            part.append(fragmentoPregunta);
            List<MaterialPredominante> materialPredominantes = Objects.isNull(pregunta.getInmes().getMaterialesPredominantes()) ? new ArrayList<>() : pregunta.getInmes().getMaterialesPredominantes();
        
            materialPredominantes = materialPredominantes.stream().filter((t) -> {
                return t.getTipoConstruccion() == catalogo.getValor(); 
            }).collect(Collectors.toList());
            
            List<String> aulas = new ArrayList<>();
            List<String> laboratorios = new ArrayList<>();
            List<String> talleres = new ArrayList<>();
            
        if(materialPredominantes.size()>0){
            for (MaterialPredominante mp : materialPredominantes){
            if(mp.getTipoConstruccion()==1){
                aulas.add(mp.getTipoMaterial().toString());
            }
            if(mp.getTipoConstruccion()==2){
             laboratorios.add(mp.getTipoMaterial().toString());
            }
            if(mp.getTipoConstruccion()==3){
             talleres.add(mp.getTipoMaterial().toString());
            }
        }
        }

            for (Catalogos catalogoMaterial : catalogosMaterialConstruccion) {
                String selected = aulas.stream().anyMatch((au) -> au.equals(catalogoMaterial.getValor().toString())) ? "selected" : "";
                fragmentoPregunta = " <option value=\"" + catalogoMaterial.getValor() + "\" "
                        + selected + ">"
                        + catalogoMaterial.getDescripcion()
                        + "</option>\n";
                part.append(fragmentoPregunta);
            }

            fragmentoPregunta = " </select> "
                    + "  <div class=\"invalid-feedback\">La opcion es requerida</div>"
                    + "                            </td>\n"
                    + "                            <td style=\"width:20%\">\n"
                    + " <select class=\"form-control\" "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                    + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                    + " value=\"" + 1
                    + "\" required>\n";
            part.append(fragmentoPregunta);

            for (Catalogos catalogoMaterial : catalogosMaterialConstruccion) {
                String selected = laboratorios.stream().anyMatch((la) -> la.equals(catalogoMaterial.getValor().toString())) ? "selected" : "";
                fragmentoPregunta = " <option value=\"" + catalogoMaterial.getValor() + "\" "
                        + selected + ">"
                        + catalogoMaterial.getDescripcion()
                        + "</option>\n";
                part.append(fragmentoPregunta);
            }

            fragmentoPregunta = " </select> "
                    + "  <div class=\"invalid-feedback\">La opcion es requerida</div>"
                    + "                            </td>\n"
                    + "                            <td style=\"width:20%\">\n"
                    + " <select class=\"form-control\" "
                    + " name=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                    + " id=\"respuestas[" + pregunta.getNoPregunta() + "].respuestaEspecifica\" "
                    + " value=\"" + 1
                    + "\" required>\n";
            part.append(fragmentoPregunta);

            for (Catalogos catalogoMaterial : catalogosMaterialConstruccion) {
                String selected = talleres.stream().anyMatch((ta) -> ta.equals(catalogoMaterial.getValor().toString())) ? "selected" : "";
                fragmentoPregunta = " <option value=\"" + catalogoMaterial.getValor() + "\" "
                        + selected + ">"
                        + catalogoMaterial.getDescripcion()
                        + "</option>\n";
                part.append(fragmentoPregunta);
            }

            fragmentoPregunta = " </select> "
                    + "  <div class=\"invalid-feedback\">La opcion es requerida</div>"
                    + "                            </td>\n"
                    + "                        </tr>\n"
                    + "                </tbody>\n"
                    + "            </table></br>"
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
