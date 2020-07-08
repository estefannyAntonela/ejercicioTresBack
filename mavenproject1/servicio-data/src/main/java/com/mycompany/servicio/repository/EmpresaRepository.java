/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servicio.repository;

import com.mycompany.servicio.jdbc.bean.Empresa;
import com.mycompany.servicio.jdbc.bean.EmpresaPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author esalcedo
 */
@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, EmpresaPK> {

}
