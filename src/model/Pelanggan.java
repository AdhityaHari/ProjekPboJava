/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class Pelanggan extends BaseModel{
    public Pelanggan() throws SQLException {
        super();
    }
    public ResultSet getPelanggan() throws SQLException {
        String query = "SELECT * FROM pelanggan";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        return preparedStatement.executeQuery();
    }
}
