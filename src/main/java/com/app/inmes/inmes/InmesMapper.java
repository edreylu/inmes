package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.Inmes;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class InmesMapper {

    public InmesDTO toInmesDTO(Inmes inmes) {
        if (Objects.isNull(inmes)) {
            return null;
        }

        InmesDTO inmesDTO = new InmesDTO();

        inmesDTO.setFolioInmes(inmes.getFolioInmes());
        inmesDTO.setNoInmueble(inmes.getNoInmueble());
        inmesDTO.setNoCentroResponsable(inmes.getNoCentroResponsable());
        inmesDTO.setFechaInicioRegistro(inmes.getFechaInicioRegistro());
        inmesDTO.setFechaActualizacion(inmes.getFechaActualizacion());
        inmesDTO.setFechaFinalRegistro(inmes.getFechaFinalRegistro());
        inmesDTO.setUsoEducativo(inmes.getUsoEducativo());
        inmesDTO.setAniosEscuela(inmes.getAniosEscuela());
        inmesDTO.setDoctoDonacion(inmes.getDoctoDonacion());
        inmesDTO.setDoctoProtecCivil(inmes.getDoctoProtecCivil());
        inmesDTO.setSuperfTotTerreno(inmes.getSuperfTotTerreno());
        inmesDTO.setSuperfTotContruida(inmes.getSuperfTotContruida());
        inmesDTO.setSuperfTotConstAulas(inmes.getSuperfTotConstAulas());
        inmesDTO.setEdificios(inmes.getEdificios());
        inmesDTO.setEscuelaComoAlbergue(inmes.getEscuelaComoAlbergue());
        inmesDTO.setAlumnosEnContigencia(inmes.getAlumnosEnContigencia());
        inmesDTO.setLuzElectrica(inmes.getLuzElectrica());
        inmesDTO.setTipoLuzElectrica(inmes.getTipoLuzElectrica());
        inmesDTO.setDistancia(inmes.getDistancia());
        inmesDTO.setTiempoHoras(inmes.getTiempoHoras());
        inmesDTO.setTiempoMinutos(inmes.getTiempoMinutos());
        inmesDTO.setTiempoTransporte(inmes.getTiempoTransporte());
        
        return inmesDTO;
    }

    public List<InmesDTO> toInmesDTOs(List<Inmes> inmess) {
        if (Objects.isNull(inmess)) {
            return null;
        }

        List<InmesDTO> list = new ArrayList<>(inmess.size());
        for (Inmes inmes : inmess) {
            list.add(toInmesDTO(inmes));
        }

        return list;
    }

    public Inmes toInmes(InmesDTO inmesDTO) {
        if (Objects.isNull(inmesDTO)) {
            return null;
        }

        Inmes inmes = new Inmes();

        inmes.setFolioInmes(inmesDTO.getFolioInmes());
        inmes.setNoInmueble(inmesDTO.getNoInmueble());
        inmes.setNoCentroResponsable(inmesDTO.getNoCentroResponsable());
        inmes.setFechaInicioRegistro(inmesDTO.getFechaInicioRegistro());
        inmes.setFechaActualizacion(inmesDTO.getFechaActualizacion());
        inmes.setFechaFinalRegistro(inmesDTO.getFechaFinalRegistro());
        inmes.setUsoEducativo(inmesDTO.getUsoEducativo());
        inmes.setAniosEscuela(inmesDTO.getAniosEscuela());
        inmes.setDoctoDonacion(inmesDTO.getDoctoDonacion());
        inmes.setDoctoProtecCivil(inmesDTO.getDoctoProtecCivil());
        inmes.setSuperfTotTerreno(inmesDTO.getSuperfTotTerreno());
        inmes.setSuperfTotContruida(inmesDTO.getSuperfTotContruida());
        inmes.setSuperfTotConstAulas(inmesDTO.getSuperfTotConstAulas());
        inmes.setEdificios(inmesDTO.getEdificios());
        inmes.setEscuelaComoAlbergue(inmesDTO.getEscuelaComoAlbergue());
        inmes.setAlumnosEnContigencia(inmesDTO.getAlumnosEnContigencia());
        inmes.setLuzElectrica(inmesDTO.getLuzElectrica());
        inmes.setTipoLuzElectrica(inmesDTO.getTipoLuzElectrica());
        inmes.setDistancia(inmesDTO.getDistancia());
        inmes.setTiempoHoras(inmesDTO.getTiempoHoras());
        inmes.setTiempoMinutos(inmesDTO.getTiempoMinutos());
        inmes.setTiempoTransporte(inmesDTO.getTiempoTransporte());

        return inmes;
    }

}
