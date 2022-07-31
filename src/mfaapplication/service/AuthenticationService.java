/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfaapplication.service;

import mfaapplication.model.User;

/**
 *
 * @author jeeva
 */
public class AuthenticationService {
    
    private static AuthenticationService authenticationService;
    
    private AuthenticationService(){}
    
    public static AuthenticationService getInstance(){
        if(authenticationService == null){
            authenticationService = new AuthenticationService();
        }
        return authenticationService;
    }
    
    private User user;

    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public void logout() {
        this.user = null;
    }
    
}
