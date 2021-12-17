/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public abstract class BaseModel {
    private String dbUrl;
    private String dbUser;
    private String dbPassword;

    public Connection connection;

    public BaseModel() throws SQLException {
        dbUrl = "jdbc:postgresql://localhost/Milkku";
        dbUser = "postgres";
        dbPassword = "12345";
        
        connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
       
    }
}
