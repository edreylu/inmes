package com.app.inmes.centroTrabajo;

import com.app.inmes.persistence.repository.CentroTrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CentroTrabajoService {

    private final CentroTrabajoMapper centroTrabajoMapper;
    private final CentroTrabajoRepository centroTrabajoRepository;

    @Autowired
    public CentroTrabajoService(CentroTrabajoMapper centroTrabajoMapper, CentroTrabajoRepository centroTrabajoRepository) {
        this.centroTrabajoMapper = centroTrabajoMapper;
        this.centroTrabajoRepository = centroTrabajoRepository;
    }

    public List<CentroTrabajoDTO> findAll() {
        return centroTrabajoMapper.toCentroDeTrabajoDTOs(centroTrabajoRepository.findAll());
    }

    public List<CentroTrabajoDTO> findByClaveArea(String claveArea) {
        String claveAreaUpper = Objects.nonNull(claveArea) ? claveArea.toUpperCase() : "";
        System.out.println(claveAreaUpper);
        return centroTrabajoMapper.toCentroDeTrabajoDTOs(centroTrabajoRepository.findByClaveAreaContainingIgnoreCase(claveAreaUpper));
    }

    public List<CentroTrabajoDTO> findByNoInmueble(int noInmueble) {
        return centroTrabajoMapper.toCentroDeTrabajoDTOs(centroTrabajoRepository.findByNoInmueble(noInmueble));
    }
    
}
