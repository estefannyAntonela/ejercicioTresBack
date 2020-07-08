/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servicio.bean;

import com.google.gson.annotations.Expose;
import java.util.Date;

/**
 *
 * @author esalcedo
 */
public class EmpresaBean {

    @Expose
    private String id;
    @Expose
    private String nombre;
    @Expose
    private int numeroNit;
    @Expose
    private Date fechaFundacion;
    @Expose
    private String direccion;
}
