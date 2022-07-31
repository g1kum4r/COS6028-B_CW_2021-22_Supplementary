/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfaapplication.db.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import mfaapplication.db.DBConnection;
import mfaapplication.db.dao.UserDao;
import mfaapplication.model.User;

/**
 *
 * @author jeeva
 */
public class UserDaoJdbcImpl implements UserDao {
    
    private static final Logger LOGGER = Logger.getLogger(UserDaoJdbcImpl.class.getName());

    private final String GET_USER_BY_USERNAME_AND_PASSWORD = "select * from user where (username = ? or email = ?) and password = ?";
    private final String INSERT_INTO_USER = "insert into user(username, email, contactno, password) values (?, ?, ?, ?)";
        
       
    @Override
    public User login(String username, String password) {
        User user = null;
        try {
            PreparedStatement prepareStatement = DBConnection.getConnection().prepareStatement(GET_USER_BY_USERNAME_AND_PASSWORD);
            prepareStatement.setString(1, username);
            prepareStatement.setString(2, username);
            prepareStatement.setString(3, password);
            ResultSet resultSet = prepareStatement.executeQuery();
            if(resultSet.next()){
                user = new User(
                    resultSet.getInt("ID"),
                    resultSet.getString("Username"),
                    resultSet.getString("Password"),
                    resultSet.getString("Email"),
                    resultSet.getString("ContactNo")
                );
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    @Override
    public User register(User user) {
        try {
            PreparedStatement prepareStatement = DBConnection.getConnection().prepareStatement(INSERT_INTO_USER, Statement.RETURN_GENERATED_KEYS);
            prepareStatement.setString(1, user.getUsername());
            prepareStatement.setString(2, user.getEmail());
            prepareStatement.setString(3, user.getContactNo());
            prepareStatement.setString(4, user.getPassword());
            int generatedKey = prepareStatement.executeUpdate();
            LOGGER.log(Level.INFO, "register  user - sql insert response code: {0}", generatedKey);
            user.setId(generatedKey);
            return user;
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
}
