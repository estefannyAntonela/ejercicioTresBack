/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servicio.war.controller;

import com.mycompany.servicio.bean.EmpresaBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author esalcedo
 */
@RestController
public class Controller {

    @PostMapping(value = "/ejercicio")
    public ResponseEntity<String> createEmpresa(@RequestBody EmpresaBean empresa) {
        
        
        
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/ejercicio")
    public ResponseEntity<String> consultarEmpresa(@RequestParam(value = "id", defaultValue = "") String id) {
        
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
