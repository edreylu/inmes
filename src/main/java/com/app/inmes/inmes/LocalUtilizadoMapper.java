package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.LocalUtilizado;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class LocalUtilizadoMapper {

    public LocalUtilizadoDTO toLocalUtilizadoDTO(LocalUtilizado localUtilizado) {
        if (Objects.isNull(localUtilizado)) {
            return null;
        }

        LocalUtilizadoDTO localUtilizadoDTO = new LocalUtilizadoDTO();

        localUtilizadoDTO.setFolioInmes(localUtilizado.getFolioInmes());
        localUtilizadoDTO.setNoCentro(localUtilizado.getNoCentro());
        localUtilizadoDTO.setAulas(localUtilizado.getAulas());
        localUtilizadoDTO.setLaboratorios(localUtilizado.getLaboratorios());
        localUtilizadoDTO.setTalleres(localUtilizado.getTalleres());
        
        return localUtilizadoDTO;
    }

    public List<LocalUtilizadoDTO> toLocalUtilizadoDTOs(List<LocalUtilizado> localUtilizados) {
        if (Objects.isNull(localUtilizados)) {
            return null;
        }

        List<LocalUtilizadoDTO> list = new ArrayList<>(localUtilizados.size());
        for (LocalUtilizado localUtilizado : localUtilizados) {
            list.add(toLocalUtilizadoDTO(localUtilizado));
        }

        return list;
    }

    public LocalUtilizado toLocalUtilizado(LocalUtilizadoDTO localUtilizadoDTO) {
        if (Objects.isNull(localUtilizadoDTO)) {
            return null;
        }

        LocalUtilizado localUtilizado = new LocalUtilizado();

        localUtilizado.setFolioInmes(localUtilizadoDTO.getFolioInmes());
        localUtilizado.setNoCentro(localUtilizadoDTO.getNoCentro());
        localUtilizado.setAulas(localUtilizadoDTO.getAulas());
        localUtilizado.setLaboratorios(localUtilizadoDTO.getLaboratorios());
        localUtilizado.setTalleres(localUtilizadoDTO.getTalleres());

        return localUtilizado;
    }

}
