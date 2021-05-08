package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.TipoInmueble;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class TipoInmuebleMapper {

    public TipoInmuebleDTO toTipoInmuebleDTO(TipoInmueble tipoInmueble) {
        if (Objects.isNull(tipoInmueble)) {
            return null;
        }

        TipoInmuebleDTO tipoInmuebleDTO = new TipoInmuebleDTO();

        tipoInmuebleDTO.setFolioInmes(tipoInmueble.getFolioInmes());
        tipoInmuebleDTO.setTipoInmueble(tipoInmueble.getTipoInmueble());
        tipoInmuebleDTO.setOtro(tipoInmueble.getOtro());
        
        return tipoInmuebleDTO;
    }

    public List<TipoInmuebleDTO> toTipoInmuebleDTOs(List<TipoInmueble> tipoInmuebles) {
        if (Objects.isNull(tipoInmuebles)) {
            return null;
        }

        List<TipoInmuebleDTO> list = new ArrayList<>(tipoInmuebles.size());
        for (TipoInmueble tipoInmueble : tipoInmuebles) {
            list.add(toTipoInmuebleDTO(tipoInmueble));
        }

        return list;
    }

    public TipoInmueble toTipoInmueble(TipoInmuebleDTO tipoInmuebleDTO) {
        if (Objects.isNull(tipoInmuebleDTO)) {
            return null;
        }

        TipoInmueble tipoInmueble = new TipoInmueble();

        tipoInmueble.setFolioInmes(tipoInmuebleDTO.getFolioInmes());
        tipoInmueble.setTipoInmueble(tipoInmuebleDTO.getTipoInmueble());
        tipoInmueble.setOtro(tipoInmuebleDTO.getOtro());

        return tipoInmueble;
    }

}
