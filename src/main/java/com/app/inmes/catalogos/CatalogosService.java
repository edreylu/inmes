/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.catalogos;

import com.app.inmes.persistence.entity.Catalogos;
import com.app.inmes.persistence.repository.CatalogosRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Edward Reyes
 */
@Service
public class CatalogosService {
    
    private final CatalogosRepository catalogosRepository;

    public CatalogosService(CatalogosRepository catalogosRepository) {
        this.catalogosRepository = catalogosRepository;
    }
    
    public List<Catalogos> findAll() {
        return catalogosRepository.findAll();
    }

    public List<Catalogos> findByTablaAndColumna(String tabla, String columna) {
        List<Catalogos> catalogos = catalogosRepository.findByTablaAndColumna(tabla, columna);
        return catalogos;
    }
    
}
