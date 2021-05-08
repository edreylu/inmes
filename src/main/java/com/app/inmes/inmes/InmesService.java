/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.inmes;

import com.app.inmes.catalogos.CatalogosService;
import com.app.inmes.objectHtml.HtmlComponent;
import com.app.inmes.persistence.entity.Catalogos;
import com.app.inmes.persistence.entity.EstadoFisicoConstruc;
import com.app.inmes.persistence.entity.EstadoFisicoConstrucPK;
import com.app.inmes.persistence.entity.Inmes;
import com.app.inmes.persistence.entity.MaterialPredominante;
import com.app.inmes.persistence.entity.MaterialPredominantePK;
import com.app.inmes.persistence.entity.SinInmueble;
import com.app.inmes.persistence.entity.TipoInmueble;
import com.app.inmes.persistence.repository.EstadoFisicoConstrucRepository;
import com.app.inmes.persistence.repository.InmesRepository;
import com.app.inmes.persistence.repository.MaterialPredominanteRepository;
import com.app.inmes.persistence.repository.SinInmuebleRepository;
import com.app.inmes.persistence.repository.TipoInmuebleRepository;
import com.app.inmes.usuario.UsuarioDTO;
import com.app.inmes.usuario.UsuarioService;
import com.app.inmes.utils.Mensaje;
import com.app.inmes.utils.WebUtils;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Edward Reyes
 */
@Service
public class InmesService {

    @Autowired
    private CatalogosService catalogosService;
    @Autowired
    public InmesRepository inmesRepository;
    @Autowired
    public SinInmuebleRepository sinInmesRepository;
    @Autowired
    public TipoInmuebleRepository tipoInmuebleRepository;
    @Autowired
    public EstadoFisicoConstrucRepository estadoFisicoConstrucRepository;
    @Autowired
    public MaterialPredominanteRepository materialPredominanteRepository;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private InmesMapper inmesMapper;
    @Autowired
    private HtmlComponent htmlComponent;
    private Mensaje msg;

    public List<String> getForms() {

        return htmlComponent.getPreguntasHtml();
    }

    public Inmes findByNoInmueble(int noInmueble) {
        Inmes inmes = inmesRepository.findByNoInmueble(noInmueble).orElse(new Inmes());
        return inmes;
    }

    public Mensaje saveCapitulo1(ObjectRespuestas objectRespuestas) {

        objectRespuestas.respuestas.forEach((t) -> {
            System.out.println("com.app.inmes.inmes.InmesController.responder()" + t.getRespuesta() + " especifica: " + t.getRespuestaEspecifica());
        });
        UsuarioDTO usuario = usuarioService.findByUserName(WebUtils.getUserName());
        String escuelaFuncionaEn = objectRespuestas.respuestas.get(1).getRespuesta();
        String escuelaFuncionaEnOtro = escuelaFuncionaEn.equals("99") ? objectRespuestas.respuestas.get(1).getRespuestaEspecifica() : null;
        Integer usoEducativo = objectRespuestas.respuestas.get(2).getRespuesta().equals("SI") ? 1 : 2;
        String tipoInm = objectRespuestas.respuestas.get(3).getRespuesta();
        String tipoInmOtro = objectRespuestas.respuestas.get(3).getRespuestaEspecifica();

        Inmes inmes = inmesRepository.findByNoInmueble(usuario.getNoInmueble()).orElse(new Inmes());
        inmes.setNoCentroResponsable(1);
        inmes.setUsoEducativo(usoEducativo);
        inmes.setNoInmueble(usuario.getNoInmueble());
        inmes.setFechaInicioRegistro(Date.valueOf(LocalDate.now()));
        inmes.setFechaActualizacion(Date.valueOf(LocalDate.now()));
        inmes.setAniosEscuela(Integer.parseInt(objectRespuestas.respuestas.get(5).getRespuesta()));
        inmes.setDoctoDonacion(Integer.parseInt(objectRespuestas.respuestas.get(6).getRespuesta()));
        inmes.setDoctoProtecCivil(Integer.parseInt(objectRespuestas.respuestas.get(7).getRespuesta()));
        inmes.setSuperfTotTerreno(Integer.parseInt(objectRespuestas.respuestas.get(8).getRespuesta()));
        inmes.setSuperfTotContruida(Integer.parseInt(objectRespuestas.respuestas.get(9).getRespuesta()));
        inmes.setSuperfTotConstAulas(Integer.parseInt(objectRespuestas.respuestas.get(10).getRespuesta()));
        inmes.setEdificios(Integer.parseInt(objectRespuestas.respuestas.get(11).getRespuesta()));
        inmes.setEscuelaComoAlbergue(Integer.parseInt(objectRespuestas.respuestas.get(12).getRespuesta()));
        inmes.setAlumnosEnContigencia(Integer.parseInt(objectRespuestas.respuestas.get(13).getRespuesta()));
        inmes.setLuzElectrica(Integer.parseInt(objectRespuestas.respuestas.get(14).getRespuesta()));
        inmes.setTipoLuzElectrica(Integer.parseInt(objectRespuestas.respuestas.get(15).getRespuesta()));

        try {
            inmesRepository.save(inmes);
            inmes = inmesRepository.findByNoInmueble(usuario.getNoInmueble()).orElse(new Inmes());
            if (Objects.nonNull(inmes.getFolioInmes())) {
                if (escuelaFuncionaEn != null) {
                    SinInmueble sinInmueble = new SinInmueble();
                    sinInmueble.setFolioInmes(inmes.getFolioInmes());
                    sinInmueble.setSinInmueble(Integer.valueOf(escuelaFuncionaEn));
                    sinInmueble.setOtro(escuelaFuncionaEnOtro);
                    sinInmesRepository.save(sinInmueble);

                }
                if (usoEducativo == 2) {
                    String[] tipoInmuebleSplit = tipoInm.split(",");
                    for (String value : tipoInmuebleSplit) {
                        TipoInmueble tipoInmueble = new TipoInmueble();
                        tipoInmueble.setFolioInmes(inmes.getFolioInmes());
                        tipoInmueble.setTipoInmueble(Integer.valueOf(value));
                        tipoInmueble.setOtro(tipoInmOtro);
                        tipoInmuebleRepository.save(tipoInmueble);
                    }
                }
            }
            msg = Mensaje.CREATE("Agregado correctamente", 1);
        } catch (Exception e) {
            msg = Mensaje.CREATE("No se pudo agregar por: " + e.getMessage(), 2);
        }
        return msg;
    }

    public Mensaje saveCapitulo2(ObjectRespuestas objectRespuestas) {
        UsuarioDTO usuario = usuarioService.findByUserName(WebUtils.getUserName());
        Inmes inmes = inmesRepository.findByNoInmueble(usuario.getNoInmueble()).orElse(new Inmes());
        String respuestas = objectRespuestas.respuestas.get(16).getRespuesta();
        String respuestasOtras = objectRespuestas.respuestas.get(16).getRespuestaEspecifica();
        String[] respuestasSplit = respuestas.split(",");
        String[] respuestasOtrasSplit = respuestasOtras.split(",");
        int add = 0, addMaterial = 0;
        for (int tipo = 0; tipo < 3; tipo++) {
            for (int subtipo = 0; subtipo < 4; subtipo++) {
                Integer tipoConstruccion = tipo + 1;
                Integer subTipoConstruccion = subtipo +1;
                Integer bueno = respuestasSplit[0 + add].equals("") ? null: Integer.valueOf(respuestasSplit[0 + add]);
                Integer regular = respuestasSplit[1 + add].equals("") ? null: Integer.valueOf(respuestasSplit[1 + add]);
                Integer malo =  respuestasSplit[2 + add].equals("") ? null: Integer.valueOf(respuestasSplit[2 + add]);
                Integer noApto =  respuestasSplit[3 + add].equals("") ? null: Integer.valueOf(respuestasSplit[3 + add]);
                EstadoFisicoConstruc estadoFisicoConstruc = new EstadoFisicoConstruc();
                EstadoFisicoConstrucPK estadoFisicoConstrucPK = new EstadoFisicoConstrucPK();
                estadoFisicoConstrucPK.setFolioInmes(inmes.getFolioInmes());
                estadoFisicoConstrucPK.setTipoConstruccion(tipoConstruccion);
                estadoFisicoConstrucPK.setSubTipoConstruccion(subTipoConstruccion);
                
                estadoFisicoConstruc.setEstadoFisicoConstrucPK(estadoFisicoConstrucPK);
                estadoFisicoConstruc.setFolioInmes(inmes.getFolioInmes());
                estadoFisicoConstruc.setTipoConstruccion(tipoConstruccion);
                estadoFisicoConstruc.setSubTipoConstruccion(subTipoConstruccion);
                estadoFisicoConstruc.setBueno(bueno);
                estadoFisicoConstruc.setRegular(regular);
                estadoFisicoConstruc.setMalo(malo);
                estadoFisicoConstruc.setNoApto(noApto);
                estadoFisicoConstrucRepository.save(estadoFisicoConstruc);
                add = add + 4;
            }

            for (int tipoEstructura = 0; tipoEstructura < 3; tipoEstructura++) {
                MaterialPredominante materialPredominante = new MaterialPredominante();
                MaterialPredominantePK materialPredominantePK = new MaterialPredominantePK();
                materialPredominantePK.setFolioInmes(inmes.getFolioInmes());
                materialPredominantePK.setTipoConstruccion(tipo + 1);
                materialPredominantePK.setTipoEstructura(tipoEstructura + 1);
                materialPredominantePK.setTipoMaterial(Integer.valueOf(respuestasOtrasSplit[addMaterial]));
                
                materialPredominante.setMaterialPredominantePK(materialPredominantePK);
                materialPredominante.setFolioInmes(inmes.getFolioInmes());
                materialPredominante.setTipoConstruccion(tipo + 1);
                materialPredominante.setTipoEstructura(tipoEstructura + 1);
                materialPredominante.setTipoMaterial(Integer.valueOf(respuestasOtrasSplit[addMaterial]));
                materialPredominanteRepository.save(materialPredominante);
                addMaterial = addMaterial + 1;
            }
        }

        return msg;
    }

    public Mensaje saveCapitulo3(ObjectRespuestas objectRespuestas) {

        return msg;
    }

    public Mensaje saveCapitulo4(ObjectRespuestas objectRespuestas) {

        return msg;
    }

    public Mensaje saveCapitulo5(ObjectRespuestas objectRespuestas) {

        return msg;
    }

    private String replaceCaracter(String caracter, int opcion) {
        Objects.nonNull(caracter);
        return opcion == 1 ? caracter.replaceAll(",", "\\|") : caracter.replaceAll("\\|", ",");
    }
}
