/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.objectHtml;

import com.app.inmes.catalogos.CatalogosService;
import com.app.inmes.inmes.InmesDTO;
import com.app.inmes.inmes.InmesMapper;
import com.app.inmes.inmes.InmesService;
import com.app.inmes.persistence.entity.Inmes;
import com.app.inmes.pregunta.PreguntaDTO;
import com.app.inmes.usuario.UsuarioDTO;
import com.app.inmes.usuario.UsuarioService;
import com.app.inmes.utils.WebUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

/**
 *
 * @author Edward Reyes
 */
@Component
public class HtmlComponent {
    
    private final CatalogosService catalogosService;
    private final UsuarioService usuarioService;
    private final InmesService inmesService;
    private final InmesMapper inmesMapper;
    private PreguntaDTO pregunta;
    private ObjectHtml objectHtml;

    public HtmlComponent(CatalogosService catalogosService, UsuarioService usuarioService, InmesService inmesService, InmesMapper inmesMapper) {
        this.catalogosService = catalogosService;
        this.usuarioService = usuarioService;
        this.inmesService = inmesService;
        this.inmesMapper = inmesMapper;
    }
    
    public List<String> getPreguntasHtml() {
        StringBuilder htmlPreguntas = new StringBuilder();
        List<String> listForms = new ArrayList<>();        
        UsuarioDTO usuario = usuarioService.findByUserName(WebUtils.getUserName());
        System.out.println("usuario inmueble: "+usuario.getNoInmueble());
        
        Inmes inmes = inmesService.findByNoInmueble(usuario.getNoInmueble());
        htmlPreguntas.append(FormBody.capitulo("CUESTIONARIO INMUEBLE", "PRIMERA PARTE", 1));
        htmlPreguntas.append(FormBody.subCapitulo("Subcapitulo"));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(1);
        pregunta.setPregunta("Si una escuela no tiene inmueble marque si funciona en:");
        pregunta.setCatalogoTabla("SIN_INMUEBLE");
        pregunta.setCatalogoColumna("SIN_INMUEBLE");
        pregunta.setRespuesta(inmes.getSinInmuebles().getSinInmueble().toString());
        pregunta.setRespuestaEspecifica(inmes.getSinInmuebles().getOtro());
        objectHtml = new ListaDesplegableEspecificarOtro(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(2);
        pregunta.setPregunta("Se construyo el inmueble para uso educativo o no:");
        pregunta.setCatalogoTabla("INMES");
        pregunta.setCatalogoColumna("USO_EDUCATIVO");
        pregunta.setRespuesta(inmes.getUsoEducativo().toString());
        objectHtml = new ListaDesplegableSinEspecificar(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(3);
        pregunta.setPregunta("En caso de que la respuesta anterior sea NO elige el tipo de inmueble que es:");
        pregunta.setCatalogoTabla("TIPO_INMUEBLE");
        pregunta.setCatalogoColumna("TIPO_INMUEBLE");
        String respuesta = inmes.getTiposInmuebles()
                        .stream()
                        .map(tipoInmueble -> String.valueOf(tipoInmueble.getTipoInmueble()))
                        .collect(Collectors.joining("|"));
        String respuestaOtro = inmes.getTiposInmuebles()
                        .stream()
                        .map(tipoInmueble -> String.valueOf(tipoInmueble.getOtro()))
                        .collect(Collectors.joining("|"));
        System.out.println("res: "+respuesta);
        System.out.println("otro: "+respuestaOtro);
        pregunta.setRespuesta(respuesta);
        pregunta.setRespuestaEspecifica(respuestaOtro);
        objectHtml = new OpcionMultipleEspecificarOtro(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(4);
        pregunta.setPregunta("Propietario de la construcción o responsable del mantenimiento del inmueble:");
        pregunta.setCatalogoTabla("INMES");
        pregunta.setCatalogoColumna("USO_EDUCATIVO");
        pregunta.setRespuesta("");
        objectHtml = new ListaDesplegableSinEspecificar(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(5);
        pregunta.setPregunta("Cuantos años tiene la Escuela:");
        pregunta.setCatalogoTabla("INMES");
        pregunta.setCatalogoColumna("ANIOS_ESCUELA");
        pregunta.setInmes(inmes);
        pregunta.setRespuesta(inmes.getAniosEscuela().toString());
        objectHtml = new ListaDesplegableSinEspecificar(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(6);
        pregunta.setPregunta("La escuela posee el documento de donacion:");
        pregunta.setCatalogoTabla("INMES");
        pregunta.setCatalogoColumna("DOCTO_DONACION");
        pregunta.setRespuesta(inmes.getDoctoDonacion().toString());
        objectHtml = new ListaDesplegableSinEspecificar(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(7);
        pregunta.setPregunta("La escuela cuenta con la documentación de Protección Civil:");
        pregunta.setCatalogoTabla("INMES");
        pregunta.setCatalogoColumna("DOCTO_PROTEC_CIVIL");
        pregunta.setRespuesta(inmes.getDoctoProtecCivil().toString());
        objectHtml = new ListaDesplegableSinEspecificar(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(8);
        pregunta.setPregunta("Superficie total de terreno (en metros cuadrados):");
        pregunta.setTipoDeDatoOtro("NUMBER");
        pregunta.setRespuesta(inmes.getSuperfTotTerreno().toString());
        objectHtml = new OpcionTextoLibre();
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(9);
        pregunta.setPregunta("Superficie total construida (en metros cuadrados):");
        pregunta.setTipoDeDatoOtro("NUMBER");
        pregunta.setRespuesta(inmes.getSuperfTotContruida().toString());
        objectHtml = new OpcionTextoLibre();
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(10);
        pregunta.setPregunta("Superficie total construida para aulas (en metros cuadrados):");
        pregunta.setTipoDeDatoOtro("NUMBER");
        pregunta.setRespuesta(inmes.getSuperfTotConstAulas().toString());
        objectHtml = new OpcionTextoLibre();
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(11);
        pregunta.setPregunta("Numero de edificios existentes:");
        pregunta.setTipoDeDatoOtro("NUMBER");
        pregunta.setRespuesta(inmes.getEdificios().toString());
        objectHtml = new OpcionTextoLibre();
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(12);
        pregunta.setPregunta("las instalaciones de la escuela han funcionado como albergue en situaciones de contingencia:");
        pregunta.setCatalogoTabla("INMES");
        pregunta.setCatalogoColumna("ESCUELA_COMO_ALBERGUE");
        pregunta.setRespuesta(inmes.getEscuelaComoAlbergue().toString());
        objectHtml = new ListaDesplegableSinEspecificar(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(13);
        pregunta.setPregunta("En caso de contingencia, escriba cuantos alumnos estaría en condición de aceptar la escuela:");
        pregunta.setTipoDeDatoOtro("NUMBER");
        pregunta.setRespuesta(inmes.getAlumnosEnContigencia().toString());
        objectHtml = new OpcionTextoLibre();
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(14);
        pregunta.setPregunta("La escuela dispone con servicio de luz eléctrica:");
        pregunta.setCatalogoTabla("INMES");
        pregunta.setCatalogoColumna("LUZ_ELECTRICA");
        pregunta.setRespuesta(inmes.getLuzElectrica().toString());
        objectHtml = new ListaDesplegableSinEspecificar(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(15);
        pregunta.setPregunta("Indique que tipo de servicio de luz eléctrica cuenta:");
        pregunta.setCatalogoTabla("INMES");
        pregunta.setCatalogoColumna("TIPO_LUZ_ELECTRICA");
        pregunta.setRespuesta(inmes.getTipoLuzElectrica().toString());
        objectHtml = new ListaDesplegableSinEspecificar(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        htmlPreguntas.append(FormBody.siguiente());
        listForms.add(htmlPreguntas.toString());
        
        htmlPreguntas = new StringBuilder();
        htmlPreguntas.append(FormBody.capitulo("CUESTIONARIO INMUEBLE", "LOCALES DE LA CONSTRUCCION Y ESTADO FISICO", 2));
        htmlPreguntas.append(FormBody.subCapitulo("Subcapitulo"));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(16);
        pregunta.setPregunta("TABLAS:");
        pregunta.setInmes(inmes);
        objectHtml = new TablaEstadoFisico(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        htmlPreguntas.append(FormBody.siguiente());
        listForms.add(htmlPreguntas.toString());
        
        htmlPreguntas = new StringBuilder();
        htmlPreguntas.append(FormBody.capitulo("CUESTIONARIO INMUEBLE", "TIPOS DE ANEXO", 3));
        htmlPreguntas.append(FormBody.subCapitulo("Subcapitulo"));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(17);
        pregunta.setPregunta("ANEXOS:");
        pregunta.setInmes(inmes);
        objectHtml = new TablaAnexo(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        htmlPreguntas.append(FormBody.siguiente());
        listForms.add(htmlPreguntas.toString());
        
        htmlPreguntas = new StringBuilder();
        htmlPreguntas.append(FormBody.capitulo("CUESTIONARIO INMUEBLE", "SERVICIOS EN LA LOCALIDAD Y EN EL INMUEBLE", 4));
        htmlPreguntas.append(FormBody.subCapitulo("Subcapitulo"));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(18);
        pregunta.setPregunta("SERVICIOS:");
        pregunta.setInmes(inmes);
        objectHtml = new OpcionMultipleServicios(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        htmlPreguntas.append(FormBody.siguiente());
        listForms.add(htmlPreguntas.toString());
        
        htmlPreguntas = new StringBuilder();
        htmlPreguntas.append(FormBody.capitulo("CUESTIONARIO INMUEBLE", "PROBLEMATICA QUE PRESENTA EL INMUEBLE", 5));
        htmlPreguntas.append(FormBody.subCapitulo("Subcapitulo"));
        
        pregunta = new PreguntaDTO();
        pregunta.setNoPregunta(21);
        pregunta.setPregunta("Problemas que presenta la escuela:");
        pregunta.setCatalogoTabla("PROBLEMÁTICA");
        pregunta.setCatalogoColumna("TIPO_PROBLEMATICA");
        pregunta.setInmes(inmes);
        objectHtml = new OpcionMultipleEspecificarOtro(catalogosService);
        htmlPreguntas.append(FormBody.headerAndOther(pregunta));
        htmlPreguntas.append(objectHtml.create(pregunta));
        
        htmlPreguntas.append(FormBody.siguiente());
        listForms.add(htmlPreguntas.toString());
        return listForms;
    }
}
