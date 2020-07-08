/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servicio.jdbc.bean;

import com.google.gson.annotations.Expose;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author esalcedo
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "EMPRESA")
public class Empresa {

    @EmbeddedId
    @Expose
    private EmpresaPK empresaPk;
    @Column(name = "EMP_NOMB")
    private String nombre;
    @Column(name = "EMP_NIT", nullable = true)
    private int numeroNit;
    @Column(name = "EMP_FECH", nullable = true)
    private Date fechaFundacion;
    @Column(name = "EMP_DIR", nullable = true)
    private String direccion;
}
