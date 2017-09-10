package com.aerolinea.control;

import com.aerolinea.service.ServiceHolaSpring;
import javax.annotation.ManagedBean;

//JSF Managed Bean
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
//----------------------------------------------------------

//JSF Managed Bean
@ManagedBean
@RequestScoped


public class ControlIndex2 {

    @ManagedProperty("#{SpringHolaSpring}")
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
