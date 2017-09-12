package com.aerolinea.control;

import com.aerolinea.service.ServiceHolaSpring;

//JSF Managed Bean

import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
//----------------------------------------------------------

//JSF Managed Bean
@ManagedBean
@RequestScoped

public class ControlIndex2 {

    @ManagedProperty("#{ServiceHolaSpring}")
    private ServiceHolaSpring hola;
    
    /**
     * Creates a new instance of ControlIndex
     */
    public ControlIndex2() {
    }
    
    public String Saludar() {
        return hola.test();
    }

    public ServiceHolaSpring getHola() {
        return hola;
    }

    public void setHola(ServiceHolaSpring hola) {
        this.hola = hola;
    }
    
    
    
}
