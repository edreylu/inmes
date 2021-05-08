package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.Servicio;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class ServicioMapper {

    public ServicioDTO toServicioDTO(Servicio servicio) {
        if (Objects.isNull(servicio)) {
            return null;
        }

        ServicioDTO servicioDTO = new ServicioDTO();

        servicioDTO.setFolioInmes(servicio.getFolioInmes());
        servicioDTO.setTipoServicio(servicio.getTipoServicio());
        servicioDTO.setSubTipoServicio(servicio.getSubTipoServicio());
        servicioDTO.setLocalidad(servicio.getLocalidad());
        servicioDTO.setInmueble(servicio.getInmueble());
        servicioDTO.setOtro(servicio.getOtro());
        
        return servicioDTO;
    }

    public List<ServicioDTO> toServicioDTOs(List<Servicio> servicios) {
        if (Objects.isNull(servicios)) {
            return null;
        }

        List<ServicioDTO> list = new ArrayList<>(servicios.size());
        for (Servicio servicio : servicios) {
            list.add(toServicioDTO(servicio));
        }

        return list;
    }

    public Servicio toServicio(ServicioDTO servicioDTO) {
        if (Objects.isNull(servicioDTO)) {
            return null;
        }

        Servicio servicio = new Servicio();

        servicio.setFolioInmes(servicioDTO.getFolioInmes());
        servicio.setTipoServicio(servicioDTO.getTipoServicio());
        servicio.setSubTipoServicio(servicioDTO.getSubTipoServicio());
        servicio.setLocalidad(servicioDTO.getLocalidad());
        servicio.setInmueble(servicioDTO.getInmueble());
        servicio.setOtro(servicioDTO.getOtro());

        return servicio;
    }

}
