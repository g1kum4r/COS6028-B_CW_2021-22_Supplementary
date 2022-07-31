/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfaapplication.model;

/**
 *
 * @author jeeva
 */
public class User {
    
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String contactNo;

    public User() {
    }

    public User(Integer id, String username, String password, String email, String contactNo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.contactNo = contactNo;
    }
    
    public User(String username, String password) {
        this(null, username, password, null, null);
    }
    
    public User(String username, String password, String email, String contactNo) {
        this(null, username, password, email, contactNo);
    }
        

    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
    
}
