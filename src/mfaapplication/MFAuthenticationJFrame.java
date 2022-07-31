/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfaapplication;

import mfaapplication.method.MFAuthenticationMethod;

/**
 *
 * @author jeeva
 */
public class MFAuthenticationJFrame extends javax.swing.JFrame implements MFAuthentication{

    
   
    @Override
    public void sendCode(MFAuthenticationMethod method) {
        method.send();
    }

    @Override
    public void verifyCode() {
        
    }
    
    
    
}
