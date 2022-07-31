/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfaapplication.service;

import mfaapplication.db.dao.UserDao;
import mfaapplication.model.User;

/**
 *
 * @author jeeva
 */
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao user) {
        this.userDao = user;
    }

    public User login(String username, String password) {
        User user = userDao.login(username, password);
        AuthenticationService.getInstance().setUser(user);
        return user;
    }

    public User register(User user) {
        return userDao.register(user);
    }

}
