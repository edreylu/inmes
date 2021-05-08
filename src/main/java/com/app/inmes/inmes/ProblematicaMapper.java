package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.Problematica;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class ProblematicaMapper {

    public ProblematicaDTO toProblematicaDTO(Problematica problematica) {
        if (Objects.isNull(problematica)) {
            return null;
        }

        ProblematicaDTO problematicaDTO = new ProblematicaDTO();

        problematicaDTO.setFolioInmes(problematica.getFolioInmes());
        problematicaDTO.setTipoProblematica(problematica.getTipoProblematica());
        problematicaDTO.setOtro(problematica.getOtro());
        
        return problematicaDTO;
    }

    public List<ProblematicaDTO> toProblematicaDTOs(List<Problematica> problematicas) {
        if (Objects.isNull(problematicas)) {
            return null;
        }

        List<ProblematicaDTO> list = new ArrayList<>(problematicas.size());
        for (Problematica problematica : problematicas) {
            list.add(toProblematicaDTO(problematica));
        }

        return list;
    }

    public Problematica toProblematica(ProblematicaDTO problematicaDTO) {
        if (Objects.isNull(problematicaDTO)) {
            return null;
        }

        Problematica problematica = new Problematica();

        problematica.setFolioInmes(problematicaDTO.getFolioInmes());
        problematica.setTipoProblematica(problematicaDTO.getTipoProblematica());
        problematica.setOtro(problematicaDTO.getOtro());

        return problematica;
    }

}
