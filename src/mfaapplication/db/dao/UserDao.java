/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfaapplication.db.dao;

import mfaapplication.model.User;

/**
 *
 * @author jeeva
 */
public interface UserDao {
    public User login(String username, String password);   
    public User register(User user);   
}
