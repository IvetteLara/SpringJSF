package com.aerolinea.control;

import com.aerolinea.service.ServiceHolaSpring;

//Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//----------------------------------------------------------

//Spring
@Controller
public class ControlIndex3 {

    @Autowired
    private ServiceHolaSpring hola;
    
    /**
     * Creates a new instance of ControlIndex
     */
    public ControlIndex3() {
    }
    
    public String Saludar() {
        return hola.test();
    }
  
    
}
