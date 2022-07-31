/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfaapplication.method.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import mfaapplication.method.SecurityCode;
import mfaapplication.method.MFAuthenticationMethod;
import mfaapplication.service.AuthenticationService;

/**
 *
 * @author jeeva
 */
public class MFAuthenticationPhoneMethod extends SecurityCode implements MFAuthenticationMethod<Boolean, Integer>{

   
    private static final Logger LOGGER = Logger.getLogger(MFAuthenticationPhoneMethod.class.getName());
    
    
    @Override
    public Boolean send() {
        generateSecurityCode();
        LOGGER.log(Level.INFO, 
                "security code {0} to your cell number {1}", 
                new Object[]{securityCode, AuthenticationService.getInstance().getUser().getContactNo()});
        return true;
    }

    @Override
    public Boolean verify(Integer u) {
        return securityCode == u;
    }
    
}
