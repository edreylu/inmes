package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.ObraExterior;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class ObraExteriorMapper {

    public ObraExteriorDTO toObraExteriorDTO(ObraExterior obraExterior) {
        if (Objects.isNull(obraExterior)) {
            return null;
        }

        ObraExteriorDTO obraExteriorDTO = new ObraExteriorDTO();

        obraExteriorDTO.setFolioInmes(obraExterior.getFolioInmes());
        obraExteriorDTO.setTipoObra(obraExterior.getTipoObra());
        obraExteriorDTO.setTipoEstadoFisico(obraExterior.getTipoEstadoFisico());
        obraExteriorDTO.setOtro(obraExterior.getOtro());
        
        return obraExteriorDTO;
    }

    public List<ObraExteriorDTO> toObraExteriorDTOs(List<ObraExterior> obraExteriors) {
        if (Objects.isNull(obraExteriors)) {
            return null;
        }

        List<ObraExteriorDTO> list = new ArrayList<>(obraExteriors.size());
        for (ObraExterior obraExterior : obraExteriors) {
            list.add(toObraExteriorDTO(obraExterior));
        }

        return list;
    }

    public ObraExterior toObraExterior(ObraExteriorDTO obraExteriorDTO) {
        if (Objects.isNull(obraExteriorDTO)) {
            return null;
        }

        ObraExterior obraExterior = new ObraExterior();

        obraExterior.setFolioInmes(obraExteriorDTO.getFolioInmes());
        obraExterior.setTipoObra(obraExteriorDTO.getTipoObra());
        obraExterior.setTipoEstadoFisico(obraExteriorDTO.getTipoEstadoFisico());
        obraExterior.setOtro(obraExteriorDTO.getOtro());

        return obraExterior;
    }

}
