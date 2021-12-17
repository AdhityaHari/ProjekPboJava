/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class Register extends BaseModel {
    public Register() throws SQLException {
        super();
    }

    public int addPelanggan(int id, String username, String password, String nama, String no_hp, String alamat) throws SQLException {
        String query = "INSERT INTO pelanggan " +
                        "(id, username, password, nama, no_hp, alamat) VALUES " +
                        "(?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, password);
        preparedStatement.setString(4, nama);
        preparedStatement.setString(5, no_hp);
        preparedStatement.setString(6, alamat);

        return preparedStatement.executeUpdate();
        
    }
}
