/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfaapplication.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author jeeva
 */
public class DBConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/Authentication?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static Connection connection = null;
    
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        if(connection == null || connection.isClosed()){
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }
    
}
