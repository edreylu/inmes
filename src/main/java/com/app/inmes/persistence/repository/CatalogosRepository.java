/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.persistence.repository;

import com.app.inmes.persistence.entity.Catalogos;
import com.app.inmes.persistence.entity.CatalogosPK;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Edward Reyes
 */
public interface CatalogosRepository extends JpaRepository<Catalogos, CatalogosPK>{
    
    List<Catalogos> findByTablaAndColumna(String tabla, String columna);
    
}
