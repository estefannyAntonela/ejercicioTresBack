/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servicio.jdbc.bean;

import com.google.gson.annotations.Expose;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author esalcedo
 */
@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class EmpresaPK {
    @Expose
    @Basic(optional = false)
    @Column(name = "EMP_ID", nullable = false)
    private int id;
    
}
