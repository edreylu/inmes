/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.inmes;

import com.app.inmes.objectHtml.HtmlComponent;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Edward Reyes
 */
@Controller
public class InmesController {
    
    private final InmesService inmesService;
    private final HtmlComponent htmlComponent;
    private List<String> forms = new ArrayList<>();
    private ObjectRespuestas objectRespuestas;
    private String html;
    private int idCapitulo;

    public InmesController(InmesService inmesService, HtmlComponent htmlComponent) {
        this.inmesService = inmesService;
        this.htmlComponent = htmlComponent;
    }
    
    @GetMapping(value = "usuario/cuestionario/responder/{id}")
    public String responder(@PathVariable("id") int id, Model model) {
        idCapitulo = 0;
        forms = htmlComponent.getPreguntasHtml();
        return "redirect:/usuario/cuestionario/respuestas";
    }
    
    @PostMapping(value = "usuario/cuestionario/updateEncuesta/{idCapitulo}")
    public String responder(@PathVariable("idCapitulo") int idCap,
            @ModelAttribute("preguntasRespuestas") ObjectRespuestas respuestasEnTurno) {
        if(idCap==1){
        inmesService.saveCapitulo1(respuestasEnTurno);
        }
        if(idCap==2){
        inmesService.saveCapitulo2(respuestasEnTurno);
        }
        if(idCap==3){
        inmesService.saveCapitulo1(respuestasEnTurno);
        }
        if(idCap==4){
        inmesService.saveCapitulo1(respuestasEnTurno);
        }
        if(idCap==5){
        inmesService.saveCapitulo1(respuestasEnTurno);
        }
        idCapitulo = idCap;
        return "redirect:/usuario/cuestionario/respuestas";
    }
    
    @GetMapping(value = "usuario/cuestionario/respuestas")
    public String siguiente(Model model) {
        objectRespuestas = new ObjectRespuestas();
        html = forms.get(idCapitulo);
        model.addAttribute("htmlEncuesta", html);
        model.addAttribute("objectRespuestas", objectRespuestas);
        
        return "usuario/cuestionario/responder";
        
    }

    
}
