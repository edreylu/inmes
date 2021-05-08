/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.usuario;

import com.app.inmes.usuarioRole.UsuarioRoleDTO;
import com.app.inmes.usuarioRole.UsuarioRoleService;
import com.app.inmes.centroTrabajo.CentroTrabajoDTO;
import com.app.inmes.centroTrabajo.CentroTrabajoService;
import com.app.inmes.utils.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Objects;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Edward Reyes
 */
@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final UsuarioRoleService usuarioRoleService;
    private final CentroTrabajoService centroTrabajoService;
    private List<UsuarioDTO> usuarios;
    private List<CentroTrabajoDTO> centrosTrabajo;
    private UsuarioRoleDTO usuarioRole;
    private final Mensaje msg = new Mensaje();

    @Autowired
    public UsuarioController(UsuarioService usuarioService, UsuarioRoleService usuarioRoleService, CentroTrabajoService centroTrabajoService) {
        this.usuarioService = usuarioService;
        this.usuarioRoleService = usuarioRoleService;
        this.centroTrabajoService = centroTrabajoService;
    }

    @GetMapping("admin/usuarios")
    public String listar(Model model) {
        usuarios = usuarioService.findAll();
        model.addAttribute("lista", usuarios);
        return "admin/usuarios/principal";
    }

    @GetMapping("admin/usuarios/agregar")
    public String agregar(Model model) {
        model.addAttribute("usuario", new UsuarioDTO());
        return "admin/usuarios/agregar";
    }

    @PostMapping("admin/usuarios/add")
    public String agregar(UsuarioDTO us, RedirectAttributes redirectAttrs) {
        msg.crearMensaje(usuarioService.save(us), redirectAttrs);
        return "redirect:/admin/usuarios";
    }

    @GetMapping("admin/usuarios/editar/{id}")
    public String editar(@PathVariable("id") int id, Model model) {
        UsuarioDTO usuario = usuarioService.findById(id);
        String validUrl = "redirect:/admin/usuarios";
        if (Objects.nonNull(usuario)) {
            model.addAttribute("usuario", usuario);
            validUrl = "admin/usuarios/editar";
        }
        return validUrl;
    }

    @PostMapping("admin/usuarios/update/{id}")
    public String editar(@PathVariable("id") int id, UsuarioDTO us, RedirectAttributes redirectAttrs) {
        msg.crearMensaje(usuarioService.update(us, id), redirectAttrs);
        return "redirect:/admin/usuarios";
    }

    @GetMapping("admin/usuarios/eliminar/{id}/{idestatus}")
    public String eliminar(@PathVariable("id") int id, @PathVariable("idestatus") int idestatus,
            RedirectAttributes redirectAttrs) {
        msg.crearMensaje(usuarioService.deleteById(id, idestatus), redirectAttrs);
        return "redirect:/admin/usuarios";
    }

    @GetMapping("admin/usuarios/asignarRoles/{id}")
    public String asignarRoles(@PathVariable("id") int id, Model model) {
        usuarioRole = usuarioRoleService.findByNoUsuario(id);
        model.addAttribute("noUsuario", id);
        model.addAttribute("usuarioRole", usuarioRole);
        return "admin/usuarios/asignarRoles";
    }

    @PostMapping("admin/usuarios/asignarRoles/{id}")
    public String asignarRoles(@PathVariable("id") int id, @ModelAttribute("userRoles") UsuarioRoleDTO userRole,
            RedirectAttributes redirectAttrs) {
        msg.crearMensaje(usuarioRoleService.assignRoleToUser(userRole, id), redirectAttrs);
        return "redirect:/admin/usuarios";
    }

    @GetMapping("admin/usuarios/asignarInmueble/{id}")
    public String asignarInmueble(@PathVariable("id") int id, Model model) {
        UsuarioDTO usuario = usuarioService.findById(id);
        model.addAttribute("username", usuario.getUserName());
        model.addAttribute("noUsuario", usuario.getNoUsuario());
        model.addAttribute("inmuebleAsignado", usuario.getNoInmueble());
        model.addAttribute("claveArea", "");
        return "admin/usuarios/asignarInmueble";
    }

    @PostMapping("admin/usuarios/asignarInmueble")
    public String asignarInmueble(@RequestParam(name = "noInmueble") int noInmueble, @RequestParam(name = "noUsuario") int noUsuario, RedirectAttributes redirectAttrs) {
        msg.crearMensaje(usuarioService.updateNoInmueble(noInmueble, noUsuario), redirectAttrs);
        return "redirect:/admin/usuarios";
    }

    @GetMapping("admin/usuarios/searchInmueble/{claveArea}/{noUsuario}")
    public String searchInmueble(@PathVariable("claveArea") String claveArea, @PathVariable("noUsuario") int noUsuario, Model model) {
        centrosTrabajo = centroTrabajoService.findByClaveArea(claveArea);
        model.addAttribute("claveArea", claveArea);
        model.addAttribute("noUsuario", noUsuario);
        model.addAttribute("centrosTrabajo", centrosTrabajo);
        return "admin/usuarios/asignarInmueble :: #datosInmuebles";
    }

    @GetMapping("admin/usuarios/listCentrosTrabajoInmueble/{inmuebleAsignado}")
    public String listCentrosTrabajoInmueble(@PathVariable("inmuebleAsignado") int inmuebleAsignado, Model model) {
        centrosTrabajo = centroTrabajoService.findByNoInmueble(inmuebleAsignado);
        model.addAttribute("inmuebleAsignado", inmuebleAsignado);
        model.addAttribute("centrosTrabajo", centrosTrabajo);
        return "admin/usuarios/asignarInmueble :: modalCentrosTrabajoDeInmueble";
    }

    @GetMapping("usuario/editarPerfil/{userName}")
    public String editarPerfil(@PathVariable("userName") String userName, Model model) {
        UsuarioDTO usuario = usuarioService.findByUserName(userName);
        model.addAttribute("usuario", usuario);
        return "layout :: modalPerfil";
    }

    @PostMapping("usuario/updatePerfil/{userName}")
    public String editarPerfil(@PathVariable("userName") String userName, UsuarioDTO us, RedirectAttributes redirectAttrs) {
        msg.crearMensaje(usuarioService.updatePerfil(us, userName), redirectAttrs);
        return "redirect:/menu";
    }
}
