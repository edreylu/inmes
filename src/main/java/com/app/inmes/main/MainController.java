/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.main;

import com.app.inmes.catalogos.CatalogosService;
import com.app.inmes.persistence.entity.Catalogos;
import com.app.inmes.usuario.UsuarioDTO;
import com.app.inmes.usuario.UsuarioService;
import com.app.inmes.utils.Mensaje;
import java.security.Principal;
import java.util.Objects;
import com.app.inmes.utils.WebUtils;
import java.util.List;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Edward Reyes
 */

@Controller
public class MainController {

    private final UsuarioService usuarioService;
    private final CatalogosService catalogosService;
    private final Mensaje msg = new Mensaje();
    @Value("${google.recaptcha.sitio}")
    private String key;

    @Autowired
    public MainController(UsuarioService usuarioService, CatalogosService catalogosService) {
        this.usuarioService = usuarioService;
        this.catalogosService = catalogosService;
    }

    @GetMapping("/")
    public String welcomePage() {
        return "index";
    }
    
    @GetMapping("/table")
    public String table(Model model) {
        model.addAttribute("tipoConstruccion","AULAS");
        return "table";
    }
 
    @GetMapping("/login")
    public String login(Model model, Principal principal) {
        String url = Objects.nonNull(principal) ? "redirect:/menu" : "login";
        model.addAttribute("key", key);
        return url;
    }
    
    @GetMapping("/menu")
    public String menu(Model model, Principal principal) {
        UsuarioDTO usuario = usuarioService.findByUserName(principal.getName());
        model.addAttribute("usuario", usuario);
        return "menu";
    }
    
    @PostMapping("/loginProcess")
    public String process() {
        return "menu";
    }

    @GetMapping("/logout")
    public String logoutSuccessfulPage(Model model) {
        return "redirect:/";
    }

    @GetMapping("/reiniciar_password")
    public String reiniciarPassword() {
        return "reiniciar_password";
    }

    @PostMapping("/reiniciar_password")
    public String reiniciarPassword(HttpServletRequest request, Model model, RedirectAttributes redirectAttrs) {
        String email = request.getParameter("email");
        String token = RandomString.make(30);
        String resetPasswordLink = WebUtils.getSiteURL(request) + "/cambiar_password?token=" + token;
        msg.crearMensaje(usuarioService.updateResetPasswordToken(token, email, resetPasswordLink), redirectAttrs);
        return "redirect:/login";
    }

    @GetMapping("/cambiar_password")
    public String cambiarPassword(@Param(value = "token") String token, Model model) {
        Mensaje mensaje = usuarioService.getByResetPasswordToken(token);
        int errorToken = mensaje.getResult() == 1 ? 0 : 1;
        model.addAttribute("token", token);
        model.addAttribute("errorToken", errorToken);
        return "cambiar_password";

    }

    @PostMapping("/cambiar_password")
    public String cambiarPassword(HttpServletRequest request, Model model, RedirectAttributes redirectAttrs) {
        String token = request.getParameter("token");
        String password = request.getParameter("password");
        Mensaje mensaje = usuarioService.getByResetPasswordToken(token);
        model.addAttribute("title", "Reinicie su password");
        if (mensaje.getResult() == 1) {
            msg.crearMensaje(usuarioService.updatePassword(token, password), redirectAttrs);
        } else {
            model.addAttribute("errorToken", 1);
            return "cambiar_password";
        }
        return "redirect:/login";
    }


}
