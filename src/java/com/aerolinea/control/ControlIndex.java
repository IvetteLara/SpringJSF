package com.aerolinea.control;

import com.aerolinea.service.ServiceHolaSpring;

//CDI
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
//----------------------------------------------------------

//CDI
@Named(value = "controlIndex")
@RequestScoped


public class ControlIndex {

    @Inject
    private ServiceHolaSpring hola;
    
    /**
     * Creates a new instance of ControlIndex
     */
    public ControlIndex() {
    }
    
    public String Saludar() {
        return hola.test();
    }
    
}
