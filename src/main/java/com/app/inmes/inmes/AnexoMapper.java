package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.Anexo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class AnexoMapper {

    public AnexoDTO toAnexoDTO(Anexo anexo) {
        if (Objects.isNull(anexo)) {
            return null;
        }

        AnexoDTO anexoDTO = new AnexoDTO();

        anexoDTO.setFolioInmes(anexo.getFolioInmes());
        anexoDTO.setTipoAnexo(anexo.getTipoAnexo());
        anexoDTO.setSubTipoAnexo(anexo.getSubTipoAnexo());
        anexoDTO.setSuperficieBueno(anexo.getSuperficieBueno());
        anexoDTO.setSuperficieRegular(anexo.getSuperficieRegular());
        anexoDTO.setSuperficieMalo(anexo.getSuperficieMalo());
        anexoDTO.setSuperficieNoApto(anexo.getSuperficieNoApto());
        anexoDTO.setOtrosCts(anexo.getOtrosCts());
        
        return anexoDTO;
    }

    public List<AnexoDTO> toAnexoDTOs(List<Anexo> anexos) {
        if (Objects.isNull(anexos)) {
            return null;
        }

        List<AnexoDTO> list = new ArrayList<>(anexos.size());
        for (Anexo anexo : anexos) {
            list.add(toAnexoDTO(anexo));
        }

        return list;
    }

    public Anexo toAnexo(AnexoDTO anexoDTO) {
        if (Objects.isNull(anexoDTO)) {
            return null;
        }

        Anexo anexo = new Anexo();

        anexo.setFolioInmes(anexoDTO.getFolioInmes());
        anexo.setTipoAnexo(anexoDTO.getTipoAnexo());
        anexo.setSubTipoAnexo(anexoDTO.getSubTipoAnexo());
        anexo.setSuperficieBueno(anexoDTO.getSuperficieBueno());
        anexo.setSuperficieRegular(anexoDTO.getSuperficieRegular());
        anexo.setSuperficieMalo(anexoDTO.getSuperficieMalo());
        anexo.setSuperficieNoApto(anexoDTO.getSuperficieNoApto());
        anexo.setOtrosCts(anexoDTO.getOtrosCts());

        return anexo;
    }

}
