package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.NivelEducativoAsociado;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class NivelEducativoAsociadoMapper {

    public NivelEducativoAsociadoDTO toNivelEducativoAsociadoDTO(NivelEducativoAsociado nivelEducativoAsociado) {
        if (Objects.isNull(nivelEducativoAsociado)) {
            return null;
        }

        NivelEducativoAsociadoDTO nivelEducativoAsociadoDTO = new NivelEducativoAsociadoDTO();

        nivelEducativoAsociadoDTO.setFolioInmes(nivelEducativoAsociado.getFolioInmes());
        nivelEducativoAsociadoDTO.setTipoArea(nivelEducativoAsociado.getTipoArea());
        nivelEducativoAsociadoDTO.setNivel(nivelEducativoAsociado.getNivel());
        return nivelEducativoAsociadoDTO;
    }

    public List<NivelEducativoAsociadoDTO> toNivelEducativoAsociadoDTOs(List<NivelEducativoAsociado> nivelEducativoAsociados) {
        if (Objects.isNull(nivelEducativoAsociados)) {
            return null;
        }

        List<NivelEducativoAsociadoDTO> list = new ArrayList<>(nivelEducativoAsociados.size());
        for (NivelEducativoAsociado nivelEducativoAsociado : nivelEducativoAsociados) {
            list.add(toNivelEducativoAsociadoDTO(nivelEducativoAsociado));
        }

        return list;
    }

    public NivelEducativoAsociado toNivelEducativoAsociado(NivelEducativoAsociadoDTO nivelEducativoAsociadoDTO) {
        if (Objects.isNull(nivelEducativoAsociadoDTO)) {
            return null;
        }

        NivelEducativoAsociado nivelEducativoAsociado = new NivelEducativoAsociado();

        nivelEducativoAsociado.setFolioInmes(nivelEducativoAsociadoDTO.getFolioInmes());
        nivelEducativoAsociado.setTipoArea(nivelEducativoAsociadoDTO.getTipoArea());
        nivelEducativoAsociado.setNivel(nivelEducativoAsociadoDTO.getNivel());

        return nivelEducativoAsociado;
    }

}
