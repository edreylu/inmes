/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.persistence.repository;

import com.app.inmes.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Edward Reyes
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    Usuario findByUserName(String userName);
    Usuario findByNoUsuario(Integer noUsuario);
    Usuario findByCorreo(String correo);
    Usuario findByResetPasswordToken(String token);
    boolean existsUsuarioByNoInmuebleAndNoUsuarioNot(Integer noInmueble, Integer noUsuario);
}
