/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfaapplication.method;

import java.util.Random;

/**
 *
 * @author naozeb
 */
public class SecurityCode {

    protected int securityCode;

    public int generateSecurityCode() {
        //Generating security code
        Random rnd = new Random();
        int number = rnd.nextInt(99999);
        securityCode = number;
        return number;
    }
}
