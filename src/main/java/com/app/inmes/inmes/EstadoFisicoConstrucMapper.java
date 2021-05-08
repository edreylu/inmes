package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.EstadoFisicoConstruc;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class EstadoFisicoConstrucMapper {

    public EstadoFisicoConstrucDTO toEstadoFisicoConstrucDTO(EstadoFisicoConstruc estadoFisicoConstruc) {
        if (Objects.isNull(estadoFisicoConstruc)) {
            return null;
        }

        EstadoFisicoConstrucDTO estadoFisicoConstrucDTO = new EstadoFisicoConstrucDTO();

        estadoFisicoConstrucDTO.setFolioInmes(estadoFisicoConstruc.getFolioInmes());
        estadoFisicoConstrucDTO.setTipoConstruccion(estadoFisicoConstruc.getTipoConstruccion());
        estadoFisicoConstrucDTO.setSubTipoConstruccion(estadoFisicoConstruc.getSubTipoConstruccion());
        estadoFisicoConstrucDTO.setBueno(estadoFisicoConstruc.getBueno());
        estadoFisicoConstrucDTO.setRegular(estadoFisicoConstruc.getRegular());
        estadoFisicoConstrucDTO.setMalo(estadoFisicoConstruc.getMalo());
        estadoFisicoConstrucDTO.setNoApto(estadoFisicoConstruc.getNoApto());
        
        return estadoFisicoConstrucDTO;
    }

    public List<EstadoFisicoConstrucDTO> toEstadoFisicoConstrucDTOs(List<EstadoFisicoConstruc> estadoFisicoConstrucs) {
        if (Objects.isNull(estadoFisicoConstrucs)) {
            return null;
        }

        List<EstadoFisicoConstrucDTO> list = new ArrayList<>(estadoFisicoConstrucs.size());
        for (EstadoFisicoConstruc estadoFisicoConstruc : estadoFisicoConstrucs) {
            list.add(toEstadoFisicoConstrucDTO(estadoFisicoConstruc));
        }

        return list;
    }

    public EstadoFisicoConstruc toEstadoFisicoConstruc(EstadoFisicoConstrucDTO estadoFisicoConstrucDTO) {
        if (Objects.isNull(estadoFisicoConstrucDTO)) {
            return null;
        }

        EstadoFisicoConstruc estadoFisicoConstruc = new EstadoFisicoConstruc();

        estadoFisicoConstruc.setFolioInmes(estadoFisicoConstrucDTO.getFolioInmes());
        estadoFisicoConstruc.setTipoConstruccion(estadoFisicoConstrucDTO.getTipoConstruccion());
        estadoFisicoConstruc.setSubTipoConstruccion(estadoFisicoConstrucDTO.getSubTipoConstruccion());
        estadoFisicoConstruc.setBueno(estadoFisicoConstrucDTO.getBueno());
        estadoFisicoConstruc.setRegular(estadoFisicoConstrucDTO.getRegular());
        estadoFisicoConstruc.setMalo(estadoFisicoConstrucDTO.getMalo());
        estadoFisicoConstruc.setNoApto(estadoFisicoConstrucDTO.getNoApto());

        return estadoFisicoConstruc;
    }

}
