/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.persistence.repository;

import com.app.inmes.persistence.entity.NivelEducativoAsociado;
import com.app.inmes.persistence.entity.NivelEducativoAsociadoPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Edward Reyes
 */
public interface NivelEducativoAsociadoRepository extends JpaRepository<NivelEducativoAsociado, NivelEducativoAsociadoPK>{
    
}
