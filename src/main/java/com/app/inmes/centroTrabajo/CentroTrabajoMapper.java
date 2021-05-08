package com.app.inmes.centroTrabajo;

import com.app.inmes.persistence.entity.CentroTrabajo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class CentroTrabajoMapper {

    public CentroTrabajoDTO toCentroDeTrabajoDTO(CentroTrabajo centroTrabajo) {
        if (Objects.isNull(centroTrabajo)) {
            return null;
        }

        CentroTrabajoDTO centroTrabajoDTO = new CentroTrabajoDTO();

        centroTrabajoDTO.setNoInmueble(centroTrabajo.getNoInmueble());
        centroTrabajoDTO.setClaveInmueble(centroTrabajo.getClaveInmueble());
        centroTrabajoDTO.setNoCentro(centroTrabajo.getNoCentro());
        centroTrabajoDTO.setClaveArea(centroTrabajo.getClaveArea());
        centroTrabajoDTO.setNombreCt(centroTrabajo.getNombreCt());
        centroTrabajoDTO.setEstatus(centroTrabajo.getEstatus());
        centroTrabajoDTO.setEstatusDesc(centroTrabajo.getEstatusDesc());
        centroTrabajoDTO.setNoTurno(centroTrabajo.getNoTurno());
        centroTrabajoDTO.setTurno(centroTrabajo.getTurno());
        centroTrabajoDTO.setHorarioInicio(centroTrabajo.getHorarioInicio());
        centroTrabajoDTO.setHorarioFinal(centroTrabajo.getHorarioFinal());
        centroTrabajoDTO.setNoTipoArea(centroTrabajo.getNoTipoArea());
        centroTrabajoDTO.setTipoArea(centroTrabajo.getTipoArea());
        centroTrabajoDTO.setNoNivel(centroTrabajo.getNoNivel());
        centroTrabajoDTO.setNivel(centroTrabajo.getNivel());
        centroTrabajoDTO.setNoSubNivel(centroTrabajo.getNoSubNivel());
        centroTrabajoDTO.setSubNivel(centroTrabajo.getSubNivel());
        centroTrabajoDTO.setExpedienteResponsableCt(centroTrabajo.getExpedienteResponsableCt());
        centroTrabajoDTO.setNombreResponsableCt(centroTrabajo.getNombreResponsableCt());
        centroTrabajoDTO.setClavePais(centroTrabajo.getClavePais());
        centroTrabajoDTO.setClaveEntidad(centroTrabajo.getClaveEntidad());
        centroTrabajoDTO.setEntidad(centroTrabajo.getEntidad());
        centroTrabajoDTO.setClaveMunicipio(centroTrabajo.getClaveMunicipio());
        centroTrabajoDTO.setMunicipio(centroTrabajo.getMunicipio());
        centroTrabajoDTO.setClaveLocalidad(centroTrabajo.getClaveLocalidad());
        centroTrabajoDTO.setLocalidad(centroTrabajo.getLocalidad());
        centroTrabajoDTO.setNoAsentamiento(centroTrabajo.getNoAsentamiento());
        centroTrabajoDTO.setAsentamientoDesc(centroTrabajo.getAsentamientoDesc());
        centroTrabajoDTO.setCodigoPostal(centroTrabajo.getCodigoPostal());
        centroTrabajoDTO.setTipoAsentamiento(centroTrabajo.getTipoAsentamiento());
        centroTrabajoDTO.setTipoAsentamientoDesc(centroTrabajo.getTipoAsentamientoDesc());
        centroTrabajoDTO.setCalle(centroTrabajo.getCalle());
        centroTrabajoDTO.setNoInterior(centroTrabajo.getNoInterior());
        centroTrabajoDTO.setNoExterior(centroTrabajo.getNoExterior());
        centroTrabajoDTO.setEntreCalle(centroTrabajo.getEntreCalle());
        centroTrabajoDTO.setyCalle(centroTrabajo.getyCalle());
        centroTrabajoDTO.setCallePosterior(centroTrabajo.getCallePosterior());
        centroTrabajoDTO.setLongitud(centroTrabajo.getLongitud());
        centroTrabajoDTO.setLatitud(centroTrabajo.getLatitud());
        centroTrabajoDTO.setAltitud(centroTrabajo.getAltitud());
        centroTrabajoDTO.setTelefono1(centroTrabajo.getTelefono1());
        centroTrabajoDTO.setTelefono2(centroTrabajo.getTelefono2());
        centroTrabajoDTO.setTelMovil(centroTrabajo.getTelMovil());
        centroTrabajoDTO.setCorreoElectronico(centroTrabajo.getCorreoElectronico());
        centroTrabajoDTO.setZonaVolcanica(centroTrabajo.getZonaVolcanica());
        centroTrabajoDTO.setObservaciones(centroTrabajo.getObservaciones());
        return centroTrabajoDTO;
    }

    public List<CentroTrabajoDTO> toCentroDeTrabajoDTOs(List<CentroTrabajo> centrosTrabajo) {
        if (Objects.isNull(centrosTrabajo)) {
            return null;
        }

        List<CentroTrabajoDTO> list = new ArrayList<>(centrosTrabajo.size());
        for (CentroTrabajo centroTrabajo : centrosTrabajo) {
            list.add(toCentroDeTrabajoDTO(centroTrabajo));
        }

        return list;
    }

    public CentroTrabajo toCentroDeTrabajo(CentroTrabajoDTO centroTrabajoDTO) {
        if (Objects.isNull(centroTrabajoDTO)) {
            return null;
        }

        CentroTrabajo centroTrabajo = new CentroTrabajo();

        centroTrabajo.setNoInmueble(centroTrabajoDTO.getNoInmueble());
        centroTrabajo.setClaveInmueble(centroTrabajoDTO.getClaveInmueble());
        centroTrabajo.setNoCentro(centroTrabajoDTO.getNoCentro());
        centroTrabajo.setClaveArea(centroTrabajoDTO.getClaveArea());
        centroTrabajo.setNombreCt(centroTrabajoDTO.getNombreCt());
        centroTrabajo.setEstatus(centroTrabajoDTO.getEstatus());
        centroTrabajo.setEstatusDesc(centroTrabajoDTO.getEstatusDesc());
        centroTrabajo.setNoTurno(centroTrabajoDTO.getNoTurno());
        centroTrabajo.setTurno(centroTrabajoDTO.getTurno());
        centroTrabajo.setHorarioInicio(centroTrabajoDTO.getHorarioInicio());
        centroTrabajo.setHorarioFinal(centroTrabajoDTO.getHorarioFinal());
        centroTrabajo.setNoTipoArea(centroTrabajoDTO.getNoTipoArea());
        centroTrabajo.setTipoArea(centroTrabajoDTO.getTipoArea());
        centroTrabajo.setNoNivel(centroTrabajoDTO.getNoNivel());
        centroTrabajo.setNivel(centroTrabajoDTO.getNivel());
        centroTrabajo.setNoSubNivel(centroTrabajoDTO.getNoSubNivel());
        centroTrabajo.setSubNivel(centroTrabajoDTO.getSubNivel());
        centroTrabajo.setExpedienteResponsableCt(centroTrabajoDTO.getExpedienteResponsableCt());
        centroTrabajo.setNombreResponsableCt(centroTrabajoDTO.getNombreResponsableCt());
        centroTrabajo.setClavePais(centroTrabajoDTO.getClavePais());
        centroTrabajo.setClaveEntidad(centroTrabajoDTO.getClaveEntidad());
        centroTrabajo.setEntidad(centroTrabajoDTO.getEntidad());
        centroTrabajo.setClaveMunicipio(centroTrabajoDTO.getClaveMunicipio());
        centroTrabajo.setMunicipio(centroTrabajoDTO.getMunicipio());
        centroTrabajo.setClaveLocalidad(centroTrabajoDTO.getClaveLocalidad());
        centroTrabajo.setLocalidad(centroTrabajoDTO.getLocalidad());
        centroTrabajo.setNoAsentamiento(centroTrabajoDTO.getNoAsentamiento());
        centroTrabajo.setAsentamientoDesc(centroTrabajoDTO.getAsentamientoDesc());
        centroTrabajo.setCodigoPostal(centroTrabajoDTO.getCodigoPostal());
        centroTrabajo.setTipoAsentamiento(centroTrabajoDTO.getTipoAsentamiento());
        centroTrabajo.setTipoAsentamientoDesc(centroTrabajoDTO.getTipoAsentamientoDesc());
        centroTrabajo.setCalle(centroTrabajoDTO.getCalle());
        centroTrabajo.setNoInterior(centroTrabajoDTO.getNoInterior());
        centroTrabajo.setNoExterior(centroTrabajoDTO.getNoExterior());
        centroTrabajo.setEntreCalle(centroTrabajoDTO.getEntreCalle());
        centroTrabajo.setyCalle(centroTrabajoDTO.getyCalle());
        centroTrabajo.setCallePosterior(centroTrabajoDTO.getCallePosterior());
        centroTrabajo.setLongitud(centroTrabajoDTO.getLongitud());
        centroTrabajo.setLatitud(centroTrabajoDTO.getLatitud());
        centroTrabajo.setAltitud(centroTrabajoDTO.getAltitud());
        centroTrabajo.setTelefono1(centroTrabajoDTO.getTelefono1());
        centroTrabajo.setTelefono2(centroTrabajoDTO.getTelefono2());
        centroTrabajo.setTelMovil(centroTrabajoDTO.getTelMovil());
        centroTrabajo.setCorreoElectronico(centroTrabajoDTO.getCorreoElectronico());
        centroTrabajo.setZonaVolcanica(centroTrabajoDTO.getZonaVolcanica());
        centroTrabajo.setObservaciones(centroTrabajoDTO.getObservaciones());

        return centroTrabajo;
    }

}
