/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servicio.war.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author esalcedo
 */
@EntityScan(basePackages = {"com.mycompany.servicio.jdbc.bean"})
@EnableJpaRepositories(basePackages = {"com.mycompany.servicio.repository"})
@ComponentScan(basePackages = {
    "com.mycompany.servicio.war.controller",
    "com.mycompany.servicio.data.service"
})
@SpringBootApplication
public class Applicattion extends SpringBootServletInitializer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Applicattion.class, args);
    }
    
    
    
}
