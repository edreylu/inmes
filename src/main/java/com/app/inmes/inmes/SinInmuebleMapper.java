package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.SinInmueble;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class SinInmuebleMapper {

    public SinInmuebleDTO toSinInmuebleDTO(SinInmueble sinInmueble) {
        if (Objects.isNull(sinInmueble)) {
            return null;
        }

        SinInmuebleDTO sinInmuebleDTO = new SinInmuebleDTO();

        sinInmuebleDTO.setFolioInmes(sinInmueble.getFolioInmes());
        sinInmuebleDTO.setSinInmueble(sinInmueble.getSinInmueble());
        sinInmuebleDTO.setOtro(sinInmueble.getOtro());
        
        return sinInmuebleDTO;
    }

    public List<SinInmuebleDTO> toSinInmuebleDTOs(List<SinInmueble> sinInmuebles) {
        if (Objects.isNull(sinInmuebles)) {
            return null;
        }

        List<SinInmuebleDTO> list = new ArrayList<>(sinInmuebles.size());
        for (SinInmueble sinInmueble : sinInmuebles) {
            list.add(toSinInmuebleDTO(sinInmueble));
        }

        return list;
    }

    public SinInmueble toSinInmueble(SinInmuebleDTO sinInmuebleDTO) {
        if (Objects.isNull(sinInmuebleDTO)) {
            return null;
        }

        SinInmueble sinInmueble = new SinInmueble();

        sinInmueble.setFolioInmes(sinInmuebleDTO.getFolioInmes());
        sinInmueble.setSinInmueble(sinInmuebleDTO.getSinInmueble());
        sinInmueble.setOtro(sinInmuebleDTO.getOtro());

        return sinInmueble;
    }

}
