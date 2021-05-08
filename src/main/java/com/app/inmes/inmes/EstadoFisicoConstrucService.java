/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.inmes;

import com.app.inmes.persistence.entity.EstadoFisicoConstruc;
import com.app.inmes.persistence.repository.EstadoFisicoConstrucRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Edward Reyes
 */
public class EstadoFisicoConstrucService {
    
    @Autowired
    private EstadoFisicoConstrucRepository estadoFisicoConstrucRepository;
    @Autowired
    private EstadoFisicoConstrucMapper estadoFisicoConstrucMapper;
    
    public List<EstadoFisicoConstruc> findByFolioInmes(int folioInmes){
        
      return estadoFisicoConstrucRepository.findByFolioInmes(folioInmes);
    }
    
}
