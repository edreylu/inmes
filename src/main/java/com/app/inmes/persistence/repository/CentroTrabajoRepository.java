package com.app.inmes.persistence.repository;

import com.app.inmes.persistence.entity.CentroTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CentroTrabajoRepository extends JpaRepository<CentroTrabajo, Integer> {

    List<CentroTrabajo> findByClaveAreaContainingIgnoreCase(String claveArea);
    List<CentroTrabajo> findByNoInmueble(Integer noInmueble);

}
