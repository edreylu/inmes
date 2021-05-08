/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.persistence.repository;

import com.app.inmes.persistence.entity.Inmes;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Edward Reyes
 */
public interface InmesRepository extends JpaRepository<Inmes, Integer>{
    
    Optional<Inmes> findByNoInmueble(Integer noInmueble);
    
}
