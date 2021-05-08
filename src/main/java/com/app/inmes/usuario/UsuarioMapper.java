package com.app.inmes.usuario;

import com.app.inmes.persistence.entity.Usuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class UsuarioMapper {

    public UsuarioDTO toUsuarioDTO(Usuario usuario) {
        if (Objects.isNull(usuario)) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setNoUsuario(usuario.getNoUsuario());
        usuarioDTO.setUserName(usuario.getUserName());
        usuarioDTO.setEncrytedPassword(usuario.getEncrytedPassword());
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setApellidoPaterno(usuario.getApellidoPaterno());
        usuarioDTO.setApellidoMaterno(usuario.getApellidoMaterno());
        usuarioDTO.setNombreCompleto(String.format("%s %s %s", usuario.getNombre(), usuario.getApellidoPaterno(), usuario.getApellidoMaterno()));
        usuarioDTO.setCorreo(usuario.getCorreo());
        usuarioDTO.setTelefono(usuario.getTelefono());
        usuarioDTO.setTelefono2(usuario.getTelefono2());
        usuarioDTO.setFechaAuditoria(usuario.getFechaAuditoria());
        usuarioDTO.setNoInmueble(Objects.isNull(usuario.getNoInmueble()) ? 0 : usuario.getNoInmueble());
        usuarioDTO.setIdEstatus(usuario.getIdEstatus());
        usuarioDTO.setEnabled(usuario.getEnabled());

        return usuarioDTO;
    }

    public List<UsuarioDTO> toUsuariosDTOs(List<Usuario> usuarios) {
        if (Objects.isNull(usuarios)) {
            return null;
        }

        List<UsuarioDTO> list = new ArrayList<>(usuarios.size());
        for (Usuario usuario : usuarios) {
            list.add(toUsuarioDTO(usuario));
        }

        return list;
    }

    public Usuario toUsuario(UsuarioDTO usuarioDTO) {
        if (Objects.isNull(usuarioDTO)) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setNoUsuario(usuarioDTO.getNoUsuario());
        usuario.setUserName(usuarioDTO.getUserName());
        usuario.setEncrytedPassword(usuarioDTO.getEncrytedPassword());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellidoPaterno(usuarioDTO.getApellidoPaterno());
        usuario.setApellidoMaterno(usuarioDTO.getApellidoMaterno());
        usuario.setCorreo(usuarioDTO.getCorreo());
        usuario.setTelefono(usuarioDTO.getTelefono());
        usuario.setTelefono2(usuarioDTO.getTelefono2());
        usuario.setFechaAuditoria(usuarioDTO.getFechaAuditoria());
        usuario.setNoInmueble(usuarioDTO.getNoInmueble());
        usuario.setIdEstatus(usuarioDTO.getIdEstatus());
        usuario.setEnabled(usuarioDTO.getEnabled());

        return usuario;
    }

    public Usuario setToUpdate(Usuario usuarioFound, UsuarioDTO usuarioDTO) {
        usuarioFound.setUserName(usuarioDTO.getUserName());
        usuarioFound.setNombre(usuarioDTO.getNombre());
        usuarioFound.setApellidoPaterno(usuarioDTO.getApellidoPaterno());
        usuarioFound.setApellidoMaterno(usuarioDTO.getApellidoMaterno());
        usuarioFound.setTelefono(usuarioDTO.getTelefono());
        usuarioFound.setTelefono2(usuarioDTO.getTelefono2());
        usuarioFound.setCorreo(usuarioDTO.getCorreo());
        return usuarioFound;
    }

    public Usuario setToUpdatePerfil(Usuario usuarioFound, UsuarioDTO usuarioDTO) {
        usuarioFound.setNombre(usuarioDTO.getNombre());
        usuarioFound.setApellidoPaterno(usuarioDTO.getApellidoPaterno());
        usuarioFound.setApellidoMaterno(usuarioDTO.getApellidoMaterno());
        usuarioFound.setTelefono(usuarioDTO.getTelefono());
        usuarioFound.setTelefono2(usuarioDTO.getTelefono2());
        usuarioFound.setCorreo(usuarioDTO.getCorreo());
        return usuarioFound;
    }
}
