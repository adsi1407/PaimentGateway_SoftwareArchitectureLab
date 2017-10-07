/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author sebas
 */
@Named(value="transaccionMBean")
@SessionScoped
public class TransaccionMBean implements Serializable {

    @EJB
    private com.udea.session.TransaccionManagerLocal transaccionManager;

    
    
    /**
     * Creates a new instance of TransaccionMBean
     */
    public TransaccionMBean() {}
    
}
