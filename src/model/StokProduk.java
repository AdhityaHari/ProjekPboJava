/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class StokProduk extends BaseModel{
    public StokProduk() throws SQLException {
        super();
    }
    
    public ResultSet getProduk() throws SQLException {
        String query = "SELECT * FROM stokproduk";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        return preparedStatement.executeQuery();
    }
}
