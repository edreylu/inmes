package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.Croquis;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class CroquisMapper {

    public CroquisDTO toCroquisDTO(Croquis croquis) {
        if (Objects.isNull(croquis)) {
            return null;
        }

        CroquisDTO croquisDTO = new CroquisDTO();

        croquisDTO.setIdCroquis(croquis.getIdCroquis());
        croquisDTO.setFolioInmes(croquis.getFolioInmes());
        croquisDTO.setDocumento(croquis.getDocumento());
        croquisDTO.setFechaActualizacion(croquis.getFechaActualizacion());
        
        return croquisDTO;
    }

    public List<CroquisDTO> toCroquisDTOs(List<Croquis> croquiss) {
        if (Objects.isNull(croquiss)) {
            return null;
        }

        List<CroquisDTO> list = new ArrayList<>(croquiss.size());
        for (Croquis croquis : croquiss) {
            list.add(toCroquisDTO(croquis));
        }

        return list;
    }

    public Croquis toCroquis(CroquisDTO croquisDTO) {
        if (Objects.isNull(croquisDTO)) {
            return null;
        }

        Croquis croquis = new Croquis();

        croquis.setIdCroquis(croquisDTO.getIdCroquis());
        croquis.setFolioInmes(croquisDTO.getFolioInmes());
        croquis.setDocumento(croquisDTO.getDocumento());
        croquis.setFechaActualizacion(croquisDTO.getFechaActualizacion());

        return croquis;
    }

}
