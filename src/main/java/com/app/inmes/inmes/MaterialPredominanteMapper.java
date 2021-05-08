package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.MaterialPredominante;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class MaterialPredominanteMapper {

    public MaterialPredominanteDTO toMaterialPredominanteDTO(MaterialPredominante materialPredominante) {
        if (Objects.isNull(materialPredominante)) {
            return null;
        }

        MaterialPredominanteDTO materialPredominanteDTO = new MaterialPredominanteDTO();

        materialPredominanteDTO.setFolioInmes(materialPredominante.getFolioInmes());
        materialPredominanteDTO.setTipoConstruccion(materialPredominante.getTipoConstruccion());
        materialPredominanteDTO.setTipoEstructura(materialPredominante.getTipoEstructura());
        materialPredominanteDTO.setTipoMaterial(materialPredominante.getTipoMaterial());
        
        return materialPredominanteDTO;
    }

    public List<MaterialPredominanteDTO> toMaterialPredominanteDTOs(List<MaterialPredominante> materialPredominantes) {
        if (Objects.isNull(materialPredominantes)) {
            return null;
        }

        List<MaterialPredominanteDTO> list = new ArrayList<>(materialPredominantes.size());
        for (MaterialPredominante materialPredominante : materialPredominantes) {
            list.add(toMaterialPredominanteDTO(materialPredominante));
        }

        return list;
    }

    public MaterialPredominante toMaterialPredominante(MaterialPredominanteDTO materialPredominanteDTO) {
        if (Objects.isNull(materialPredominanteDTO)) {
            return null;
        }

        MaterialPredominante materialPredominante = new MaterialPredominante();

        materialPredominante.setFolioInmes(materialPredominanteDTO.getFolioInmes());
        materialPredominante.setTipoConstruccion(materialPredominanteDTO.getTipoConstruccion());
        materialPredominante.setTipoEstructura(materialPredominanteDTO.getTipoEstructura());
        materialPredominante.setTipoMaterial(materialPredominanteDTO.getTipoMaterial());

        return materialPredominante;
    }

}
